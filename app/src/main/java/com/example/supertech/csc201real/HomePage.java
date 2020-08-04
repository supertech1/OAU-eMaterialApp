package com.example.supertech.csc201real;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;

import java.io.InputStream;
import java.util.Scanner;

public class HomePage extends AppCompatActivity implements  View.OnClickListener, NavigationView.OnNavigationItemSelectedListener {

    private Intent intent;

    Button tutorial_one_button,tutorial_two_button,tutorial_three_button,oau_pq_button,java_mcqs_button,java_mbt_button,lecturenote_button;
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle abdt;
    NavigationView navigationView;

    TextView allrights;
    String courseoutline,introduction,variable,selection,array,repetition,classes,inputoutput,exception;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        navigationView = (NavigationView)findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setItemIconTintList(null);

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








        allrights = (TextView)this.findViewById(R.id.allrights);
        allrights.setSelected(true);


       // getSupportActionBar().setDisplayHomeAsUpEnabled(true);
       // getSupportActionBar().setIcon(R.drawable.small_company_logo);
        setTitle("      OAU CSC 201(JAVA)");

        drawerLayout = (DrawerLayout)this.findViewById(R.id.drawer_layout);

        abdt =new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.drawer_open,R.string.drawer_close);
        drawerLayout.setDrawerListener(abdt);




        tutorial_one_button = (Button)findViewById(R.id.tutorial_one_button);
        tutorial_one_button.setOnClickListener(this);

        tutorial_two_button = (Button)findViewById(R.id.tutorial_two_button);
        tutorial_two_button.setOnClickListener(this);


        oau_pq_button = (Button)findViewById(R.id.oau_pq_button);
        oau_pq_button.setOnClickListener(this);

        java_mcqs_button = (Button)findViewById(R.id.java_mcqs_button);
        java_mcqs_button.setOnClickListener(this);

        java_mbt_button = (Button)findViewById(R.id.java_mbt_button);
        java_mbt_button.setOnClickListener(this);

        lecturenote_button = (Button)findViewById(R.id.lecture_note_button);
        lecturenote_button.setOnClickListener(this);





    }






    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater inflate = getMenuInflater();

        inflate.inflate(R.menu.menumenu,menu);
        MenuItem item1 = menu.findItem(R.id.menututorialone);
        MenuItem item2 = menu.findItem(R.id.menututorialtwo);
        MenuItem item4 = menu.findItem(R.id.menumcqs);
        MenuItem item5 = menu.findItem(R.id.menupq);
        MenuItem item6 = menu.findItem(R.id.menupt);

        item1.setVisible(false);     //hide tutorial one from menu bar
        item2.setVisible(false);
        item4.setVisible(false);
        item5.setVisible(false);
        item6.setVisible(false);


        return true;
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        abdt.syncState();

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);
        AllMenuListen allMenuListen = new AllMenuListen(); //get a reference to homepage so as to access the utility method there
        allMenuListen.allMenuListen(item,this);
        if(item.getItemId() != R.id.about)
        {
            finish();
        }
        return true;
    }



    public void startTutorialOne()
    {
        intent = new Intent(this, TutorialOne.class);
        intent.putExtra("tutorialnumber","one"); //to keep track of the tutorial page we are
        this.startActivity(intent);
    }

    public void startTutorialTwo()
    {
        intent = new Intent(this, TutorialTwo.class);
        intent.putExtra("tutorialnumber","two");
        this.startActivity(intent);
    }

    public void startTutorialThree()
    {
        intent = new Intent(this, TutorialThree.class);
        intent.putExtra("tutorialnumber","three");
        this.startActivity(intent);
    }

    public void startJavaMCQs()
    {
        intent = new Intent(this, Practice.class);
        this.startActivity(intent);
    }


    public String TestFileRead(InputStream reader)
    {
        Scanner input;
        StringBuilder content = new StringBuilder();
        //getResources().openRawResource(R.raw.testdoc)
        input = new Scanner(reader);
        while(input.hasNextLine())
        {
            content.append(input.nextLine() +"\n");
        }
        input.close();
        return content.toString();
    }

    //;isten all menu item method    //to be called in the menuitem listener


    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.tutorial_one_button)
        {
            startTutorialOne();
        }

        if(v.getId() == R.id.tutorial_two_button)
        {
            startTutorialThree();
        }




        if(v.getId() == R.id.oau_pq_button)
        {
            intent = new Intent(HomePage.this, PastQuestion.class);
            this.startActivity(intent);
        }

        if(v.getId() == R.id.java_mcqs_button)
        {
            intent = new Intent(HomePage.this, Practice.class);
            this.startActivity(intent);
        }

        if(v.getId() == R.id.java_mbt_button)
        {
            intent = new Intent(HomePage.this, MBT_Hompage.class);
            this.startActivity(intent);
        }
        if(v.getId() == R.id.lecture_note_button)
        {
            intent = new Intent(HomePage.this, CscNote.class);
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



    //confirm if the user truly wanna exit the app


    @Override
    public void onBackPressed() {

        AlertDialog.Builder alert = new AlertDialog.Builder(this, android.R.style.Theme_Holo_Dialog_NoActionBar_MinWidth);
        alert.setTitle("Exit");
        alert.setMessage("Are you sure you want to exit? ");
        alert.setCancelable(false);

        alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                HomePage.super.onBackPressed();

            }
        });

        alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });


        alert.create().show();





    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.lecture) {

            intent = new Intent(HomePage.this, CscNote.class);
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
            item.setChecked(true);
            drawerLayout.closeDrawers();


        }
        else if(item.getItemId() == R.id.nav_pq)
        {
            intent = new Intent(HomePage.this, PastQuestion.class);
            this.startActivity(intent);

        }
        else if(item.getItemId() == R.id.nav_mbt)
        {
            intent = new Intent(HomePage.this, MBT_Hompage.class);
            this.startActivity(intent);

        }
        else if(item.getItemId() == R.id.nav_about)
        {
            intent = new Intent(HomePage.this, About.class);
            this.startActivity(intent);

        }
        return true;
    }
}
