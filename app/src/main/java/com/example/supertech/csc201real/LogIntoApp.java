package com.example.supertech.csc201real;

import android.Manifest;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.telephony.TelephonyManager;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.security.Permission;

public class LogIntoApp extends AppCompatActivity implements View.OnClickListener {

    EditText username_edittext, phonenum_edittext,serial_edittext, pin_edittext;
    Button activate_button,clickhere_button;

    TextView status_textview;
    String username,phone,serial,pin,phone_id,status;

    ProgressDialog progressDialog;

    final int MY_PERMISSIONS_REQUEST_READ_PHONE_STATE = 1;

    String coursecode = "CSC201";

    HomePage homePage = new HomePage();


    String courseoutline,introduction,variable,selection,array,repetition,classes,inputoutput,exception;

    NetworkInfo networkInfo;
    ConnectivityManager connectivityManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_into_app);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        Bundle bundle = getIntent().getExtras();

        //get readed note

        courseoutline = bundle.getString("courseoutline");
        introduction = bundle.getString("introduction");
        variable = bundle.getString("variable");
        selection = bundle.getString("selection");
        array = bundle.getString("array");
        repetition =  bundle.getString("repetition");
        classes = bundle.getString("classes");
        inputoutput = bundle.getString("inputoutput");
        exception = bundle.getString("exception");

        username_edittext = (EditText)findViewById(R.id.username_edittext);
        phonenum_edittext = (EditText)findViewById(R.id.phonenum_edittext);
        serial_edittext = (EditText)findViewById(R.id.serial_edittext);
        pin_edittext = (EditText) findViewById(R.id.pin_edittext);


        activate_button = (Button) findViewById(R.id.activate_button);
        activate_button.setOnClickListener(this);


        status_textview = (TextView)findViewById(R.id.status_textview);

        connectivityManager= (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
        networkInfo = connectivityManager.getActiveNetworkInfo();

        if(networkInfo != null && networkInfo.isConnected())
        {
            activate_button.setEnabled(true);
        }

        else
        {
            //activate_button.setEnabled(false);
            status_textview.setText("Internet Connection not available, please check your connection");
        }


        progressDialog = new ProgressDialog(this);
        progressDialog.setTitle("Authenticating");
        progressDialog.setMessage("Please wait...");
        progressDialog.setCancelable(false);

    }


    public void onClick(View v) {

        username = username_edittext.getText().toString();
        phone = phonenum_edittext.getText().toString();
        serial = serial_edittext.getText().toString();
        pin = pin_edittext.getText().toString();



        TelephonyManager telephonyManager = (TelephonyManager)getSystemService(this.TELEPHONY_SERVICE);



        //get what is in the serial_edittext;
        String text = (serial_edittext.getText().toString());

        SharedPreferences pref = getApplicationContext().getSharedPreferences("pref_file", MODE_PRIVATE);
        String passcoded = pref.getString("undomepata", "");
        if (v.getId() == R.id.activate_button)
        {
            if (passcoded.equals(""))
            {
                //activate manually
                if(text.equals("0694"))
                {

                    SharedPreferences.Editor edit = pref.edit();
                    if ((pin_edittext.getText().toString()).equals("jollofattic"))
                    {
                        edit.putString("undomepata", "jollofattic");
                        edit.commit();
                        startHomePage();
                        finish();
                    }
                    else
                    {
                            serial_edittext.setText("");
                            pin_edittext.setText("");
                            Toast.makeText(this, "INVALID CODE", Toast.LENGTH_SHORT).show();

                    }
                }
                else
                {

                    if(networkInfo != null && networkInfo.isConnected())
                    {
                        //activate_button.setEnabled(true);
                        if (username.equals("") || phone.equals("") || serial.equals("") || pin.equals("")) {
                            if (username.equals("")) status = "Please enter username of your choice";
                            else if (phone.equals("")) status = "Please enter your phone number";
                            else if (serial.equals("")) status = "Please enter the s/n on your card";
                            else if (pin.equals("")) status = "Please enter the pin on your card";
                            status_textview.setText(status);
                        }
                        else {

                            int permissioncheck = ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.READ_PHONE_STATE);

                            if(permissioncheck != PackageManager.PERMISSION_GRANTED)
                            {

                                ActivityCompat.requestPermissions(this,
                                        new String[]{Manifest.permission.READ_PHONE_STATE},
                                        MY_PERMISSIONS_REQUEST_READ_PHONE_STATE);

                            }
                            else
                            {
                                phone_id = telephonyManager.getDeviceId();
                            }


                            if(phone_id != null) {
                                if (phone_id.length() > 1) {

                                    BackgroundTask backgroundTask = new BackgroundTask(getApplicationContext());
                                    backgroundTask.execute("activate", username, phone, serial, pin, phone_id, coursecode);
                                } else {
                                    status_textview.setText("PLease Allow permission to continue");
                                }

                                //String async_result = getAsyncResult();
                                // Toast.makeText(getApplicationContext(),async_result,Toast.LENGTH_LONG).show();
                            }




                        }

                    }
                    else
                    {
                        //activate_button.setEnabled(false);
                        Toast.makeText(getApplicationContext(),"Internet Connection not available",Toast.LENGTH_LONG);
                    }
                }
            }
            else
            {

            }

        }


    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch(requestCode)
        {
            case MY_PERMISSIONS_REQUEST_READ_PHONE_STATE :
                if(grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED)
                {
                    TelephonyManager telephonyManager = (TelephonyManager)getSystemService(this.TELEPHONY_SERVICE);
                    phone_id = telephonyManager.getDeviceId();
                    username = username_edittext.getText().toString();
                    phone = phonenum_edittext.getText().toString();
                    serial = serial_edittext.getText().toString();
                    pin = pin_edittext.getText().toString();
                    BackgroundTask backgroundTask = new BackgroundTask(getApplicationContext());
                    backgroundTask.execute("activate", username, phone, serial, pin, phone_id, coursecode);
                }
                else
                {
                    status_textview.setText("Please Allow Permission to continue");
                }
        }
    }

    class BackgroundTask extends AsyncTask<String,Void,String>
    {
        Context context;
        BackgroundTask(Context con)
        {
            context = con;
        }
        String username,phone,serial,pin,phone_id,coursecode;
        String login_url = "";

        @Override
        protected void onPreExecute() {

            login_url="http://www.tokielsolutions.com.ng/mobiletest_activate.php";
            progressDialog.show();
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {


                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {


                    }
                }
            });


        }

        @Override
        protected void onProgressUpdate(Void... values) {
            super.onProgressUpdate(values);
        }

        @Override
        protected String doInBackground(String... params) {




            String type = params[0];
            username = params[1];
            phone = params[2];
            serial = params[3];
            pin = params[4];
            phone_id = params[5];
            coursecode = params[6];
            if(type.equals("activate"))
            {
                try {
                    URL url = new URL(login_url);
                    HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setDoInput(true);
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream,"UTF-8"));
                    String post_data = URLEncoder.encode("username","UTF-8")+"="+URLEncoder.encode(username,"UTF-8")+"&"+
                            URLEncoder.encode("phone","UTF-8")+"="+URLEncoder.encode(phone,"UTF-8")+"&"+
                            URLEncoder.encode("serial","UTF-8")+"="+URLEncoder.encode(serial,"UTF-8")+"&"+
                            URLEncoder.encode("pin","UTF-8")+"="+URLEncoder.encode(pin,"UTF-8")+"&"+
                            URLEncoder.encode("phone_id","UTF-8")+"="+URLEncoder.encode(phone_id,"UTF-8")+"&"+
                            URLEncoder.encode("coursecode","UTF-8")+"="+URLEncoder.encode(coursecode,"UTF-8");

                    bufferedWriter.write(post_data);
                    bufferedWriter.flush();
                    bufferedWriter.close();
                    outputStream.close();


                    InputStream inputStream = httpURLConnection.getInputStream();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream,"ISO8859-1"));
                    String result = "";
                    String line = "";

                    while((line = bufferedReader.readLine()) != null) {
                        result += line;

                    }

                    bufferedReader.close();
                    inputStream.close();
                    httpURLConnection.disconnect();

                    return result;

                } catch (MalformedURLException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }



            }



            return null;
        }

        @Override
        protected void onPostExecute(String result) {
            //Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();
            super.onPostExecute(result);

            SharedPreferences pref = context.getSharedPreferences("pref_file", MODE_PRIVATE);

            if(result != null) {
                if (result.equals("success")) {
                    SharedPreferences.Editor edit = pref.edit();
                    edit.putString("undomepata", "jollofattic");
                    edit.commit();
                    startHomePage();
                    progressDialog.dismiss();
                    finish();
                } else {
                    status_textview.setText(result);
                    progressDialog.dismiss();
                }
            }


        }

    }

    public void startHomePage()
    {
        Intent intent = new Intent(LogIntoApp.this, HomePage.class);
        intent.putExtra("courseoutline",courseoutline);
        intent.putExtra("introduction", introduction);
        intent.putExtra("variable", variable);
        intent.putExtra("selection",selection);
        intent.putExtra("array",array);
        intent.putExtra("repetition",repetition);
        intent.putExtra("classes", classes);
        intent.putExtra("inputoutput",inputoutput);
        intent.putExtra("exception",exception);
        this.startActivity(intent);
    }


}
