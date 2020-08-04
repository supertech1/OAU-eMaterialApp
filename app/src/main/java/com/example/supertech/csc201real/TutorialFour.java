package com.example.supertech.csc201real;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class TutorialFour extends AppCompatActivity {

    GridView grid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial_four);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        String contents[] = {"Qst 1.","Qst 2.","Qst 3.","Qst 4.","Qst 5.","Qst 6.","Qst 7."};
        grid =(GridView)findViewById(R.id.fourgridview);
        ArrayAdapter<String> aa = new ArrayAdapter<String>(this, R.layout.simple_list_item_1,contents);
        grid.setAdapter(aa);
    }

    @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            super.onCreateOptionsMenu(menu);
            MenuInflater inflate = getMenuInflater();

            inflate.inflate(R.menu.menumenu,menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            super.onOptionsItemSelected(item);
            AllMenuListen allMenuListen = new AllMenuListen(); //get a reference to AllMenuListen so as to access the utility method there
            allMenuListen.allMenuListen(item,this);
            if(item.getItemId() != R.id.about)
            {
                finish();
            }
            return true;
    }

}
