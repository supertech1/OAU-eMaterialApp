package com.example.supertech.csc201real;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.concurrent.TimeUnit;

public class MBT_Exampage extends AppCompatActivity implements View.OnClickListener{

    TextView mbt_timer_textview, mbt_question_textview, mbt_index_textview;
    RadioButton mbt_radio_button_a, mbt_radio_button_b,mbt_radio_button_c,mbt_radio_button_d;
    RadioGroup mbt_option_radio_group;
    Button mbt_exampage_next_button, mbt_exampage_previous_button,mbt_finish_button;



    static int currentIndex;




    static String[] currentQuestions = {};
    static String[] currentSolutions = {};
    static String[][] currentOptions = {};
    static String[] users_selection;   //used to keep track of users selection
    static int time;  //to hold time from mode selected by the user
    static long current_time_reading_left; // to hold current time left


    static CountDown cd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mbt__exampage);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mbt_timer_textview = (TextView)findViewById(R.id.mbt_timer_textview);

        Bundle bundle = getIntent().getExtras();

        //get the time
        time = bundle.getInt("time");

        cd = new CountDown(time,1000);

        cd.start();


        currentIndex = 1; //keep track of the current question...by default 1;


        currentQuestions = bundle.getStringArray("questions");
        currentSolutions = bundle.getStringArray("solutions");

        users_selection = new String[currentQuestions.length];

        Object[] objects = (Object [])getIntent().getExtras().getSerializable("options");

        if(objects != null)
        {
            currentOptions = new String[objects.length][];
            for(int i = 0; i < objects.length; i++)
            {
                currentOptions[i] = (String[]) objects[i];
            }
        }



        mbt_index_textview = (TextView)findViewById(R.id.mbt_index_textview);
        mbt_index_textview.setText("Qst : "+currentIndex+" / "+currentQuestions.length);



        mbt_question_textview = (TextView)findViewById(R.id.mbt_question_textview);
        mbt_question_textview.setText(currentQuestions[currentIndex - 1]);

        mbt_option_radio_group = (RadioGroup)findViewById(R.id.mbt_option_radio_group);


        mbt_radio_button_a = (RadioButton)findViewById(R.id.mbt_radio_button_a);
        mbt_radio_button_a.setOnClickListener(this);

        mbt_radio_button_b = (RadioButton)findViewById(R.id.mbt_radio_button_b);
        mbt_radio_button_b.setOnClickListener(this);

        mbt_radio_button_c = (RadioButton)findViewById(R.id.mbt_radio_button_c);
        mbt_radio_button_c.setOnClickListener(this);

        mbt_radio_button_d = (RadioButton)findViewById(R.id.mbt_radio_button_d);
        mbt_radio_button_d.setOnClickListener(this);


        mbt_radio_button_a.setText("A.   "+currentOptions[(currentIndex - 1)][0]);
        mbt_radio_button_b.setText("B.   "+currentOptions[(currentIndex - 1)][1]);
        mbt_radio_button_c.setText("C.   "+currentOptions[(currentIndex - 1)][2]);
        mbt_radio_button_d.setText("D.   "+currentOptions[(currentIndex - 1)][3]);





        //set up buttons

        mbt_finish_button = (Button)findViewById(R.id.mbt_finish_button);
        mbt_finish_button.setOnClickListener(this);

        mbt_exampage_next_button = (Button)findViewById(R.id.mbt_exampage_next_button);
        mbt_exampage_next_button.setOnClickListener(this);
        mbt_exampage_previous_button = (Button)findViewById(R.id.mbt_exampage_previous_button);
        mbt_exampage_previous_button.setOnClickListener(this);

        //hide previous button by default
        if(currentIndex == 1)
            mbt_exampage_previous_button.setVisibility(View.INVISIBLE);




    }

    @Override
    public void onClick(View v) {


        if(v.getId() == R.id.mbt_exampage_next_button)
        {
            if((currentIndex < currentQuestions.length) && (currentIndex != currentQuestions.length))
            {


                currentIndex++;
                if(currentIndex == currentQuestions.length)
                {
                    mbt_exampage_next_button.setVisibility(View.INVISIBLE);
                }
                mbt_exampage_previous_button.setVisibility(View.VISIBLE);//make previous visible back
                mbt_index_textview.setText("Qst : "+currentIndex+" / "+currentQuestions.length);
                mbt_question_textview.setText(currentQuestions[currentIndex - 1]);
                mbt_radio_button_a.setText("A.   "+currentOptions[(currentIndex - 1)][0]);
                mbt_radio_button_b.setText("B.   "+currentOptions[(currentIndex - 1)][1]);
                mbt_radio_button_c.setText("C.   "+currentOptions[(currentIndex - 1)][2]);
                mbt_radio_button_d.setText("D.   "+currentOptions[(currentIndex - 1)][3]);

                //check if user has already made a selection here before

                if(users_selection[currentIndex - 1] != null)
                {
                    switch (users_selection[currentIndex - 1])
                    {
                        case "A":
                            mbt_radio_button_a.setChecked(true);
                            break;
                        case "B":
                            mbt_radio_button_b.setChecked(true);
                            break;
                        case "C":
                            mbt_radio_button_c.setChecked(true);
                            break;
                        case "D":
                            mbt_radio_button_d.setChecked(true);
                            break;

                    }
                }
                else
                {
                    mbt_option_radio_group.clearCheck();
                }


            }

        }



        if(v.getId() == R.id.mbt_exampage_previous_button)
        {
            if(currentIndex > 1)
            {


                currentIndex--;
                if(currentIndex == 1)
                {
                    mbt_exampage_previous_button.setVisibility(View.INVISIBLE);
                }
                mbt_exampage_next_button.setVisibility(View.VISIBLE);//make next visible back
                mbt_index_textview.setText("Qst : "+currentIndex+" / "+currentQuestions.length);
                mbt_question_textview.setText(currentQuestions[currentIndex - 1]);
                mbt_radio_button_a.setText("A.   "+currentOptions[(currentIndex - 1)][0]);
                mbt_radio_button_b.setText("B.   "+currentOptions[(currentIndex - 1)][1]);
                mbt_radio_button_c.setText("C.   "+currentOptions[(currentIndex - 1)][2]);
                mbt_radio_button_d.setText("D.   "+currentOptions[(currentIndex - 1)][3]);

                if(users_selection[currentIndex - 1] != null)
                {
                    switch (users_selection[currentIndex - 1])
                    {
                        case "A":
                            mbt_radio_button_a.setChecked(true);
                            break;
                        case "B":
                            mbt_radio_button_b.setChecked(true);
                            break;
                        case "C":
                            mbt_radio_button_c.setChecked(true);
                            break;
                        case "D":
                            mbt_radio_button_d.setChecked(true);
                            break;

                    }
                }
                else
                {
                    mbt_option_radio_group.clearCheck();
                }


            }

        }




        //listen to options pressed

        if(v.getId() == R.id.mbt_radio_button_a)
        {
            users_selection[currentIndex - 1] = "A";
        }

        if(v.getId() == R.id.mbt_radio_button_b)
        {
            users_selection[currentIndex - 1] = "B";
        }

        if(v.getId() == R.id.mbt_radio_button_c)
        {
            users_selection[currentIndex - 1] = "C";
        }

        if(v.getId() == R.id.mbt_radio_button_d)
        {
            users_selection[currentIndex - 1] = "D";

        }




        //listen to finish button

        if(v.getId() == R.id.mbt_finish_button)
        {
            sendIntentData();
        }




    }

    //to be called in finish button and when time reaches 0
    public void sendIntentData()
    {
        //calculate time used by user
        Long time_used = 2000 + (time - current_time_reading_left);
        String time_used_string = String.format("%d min: %d sec", TimeUnit.MILLISECONDS.toMinutes(time_used) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(time_used)), TimeUnit.MILLISECONDS.toSeconds(time_used) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(time_used)));



        Intent intent = new Intent(this,MBT_Result_Preview.class);
        intent.putExtra("users_selection",users_selection);
        intent.putExtra("currentQuestions",currentQuestions);
        intent.putExtra("currentSolutions",currentSolutions);
        intent.putExtra("time_used",time_used_string);
        Bundle mBundle = new Bundle();
        mBundle.putSerializable("currentOptions",currentOptions);
        intent.putExtras(mBundle);
        startActivity(intent);
        finish();
    }


    private class CountDown extends CountDownTimer
    {


        /**
         * @param millisInFuture    The number of millis in the future from the call
         *                          to {@link #start()} until the countdown is done and {@link #onFinish()}
         *                          is called.
         * @param countDownInterval The interval along the way to receive
         *                          {@link #onTick(long)} callbacks.
         */
        public CountDown(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onTick(long millisUntilFinished) {

            current_time_reading_left = millisUntilFinished;

            String time_left = String.format("%d : %d", TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(millisUntilFinished)), TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished)));

            mbt_timer_textview.setText(time_left);
        }

        @Override
        public void onFinish() {

            sendIntentData();

        }
    }

    @Override
    public void onBackPressed() {
        cd.cancel();  //stop the timer

        AlertDialog.Builder alert = new AlertDialog.Builder(this, android.R.style.Theme_Holo_Dialog_NoActionBar_MinWidth);
        alert.setTitle("Exit Test");
        alert.setMessage("Are you sure you want to quit this test? ");
        alert.setCancelable(false);

        //if user select yes
        alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                currentIndex = 1;   //reset index back to one
                //reset users_selection
                for(int i = 0; i < currentQuestions.length; i++)
                    users_selection[i] = null;


                MBT_Exampage.super.onBackPressed();

            }
        });


        alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                //continue the timer back
                cd = new CountDown(current_time_reading_left,1000);
                cd.start();


            }
        });

        alert.create().show();

    }



    @Override
    protected void onPause() {

        cd.cancel();
        super.onPause();

    }

    @Override
    protected void onRestart() {
        cd = new CountDown(current_time_reading_left,1000);
        cd.start();
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        cd.cancel();
        super.onDestroy();
    }
}
