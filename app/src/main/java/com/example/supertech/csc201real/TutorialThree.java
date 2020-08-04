package com.example.supertech.csc201real;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class TutorialThree extends AppCompatActivity implements AdapterView.OnItemClickListener{

    GridView grid;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial_three);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        String contents[] = {"Qst 1a.","Qst 1b.","Qst 1c.","Qst 2a.","Qst 2b.","Qst 2c.","Qst 3.","Qst 4.","Qst 5.","Qst 6.","Qst 7.","Qst 8a.","Qst 8b."};
        grid =(GridView)findViewById(R.id.threegridview);
        ArrayAdapter<String> aa = new ArrayAdapter<String>(this, R.layout.simple_list_item_1,contents);
        grid.setAdapter(aa);

        grid.setOnItemClickListener(this);
        intent = null;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater inflate = getMenuInflater();


        inflate.inflate(R.menu.menumenu,menu);
        MenuItem item = menu.findItem(R.id.menututorialtwo);
        item.setVisible(false);
           //hide tutorial one from menu bar
        return true;
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

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        HomePage mainActivity = new HomePage(); //to get reference to TestFileRead method MainActivity class
        String[] t3rawqsts = {mainActivity.TestFileRead(getResources().openRawResource(R.raw.threeqst1araw)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.threeqst1braw)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.threeqst1craw)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.threeqst2araw)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.threeqst2braw)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.threeqst2craw)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.threeqst3raw)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.threeqst4raw)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.threeqst5raw)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.threeqst6raw)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.threeqst7raw)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.threeqst8araw)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.threeqst8braw))};
        String[] t3exqsts = {mainActivity.TestFileRead(getResources().openRawResource(R.raw.threeqst1aex)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.threeqst1bex)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.threeqst1cex)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.threeqst2aex)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.threeqst2bex)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.threeqst2cex)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.threeqst3ex)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.threeqst4ex)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.threeqst5ex)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.threeqst6ex)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.threeqst7ex)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.threeqst8aex)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.threeqst8bex))};
        int[] t3outputimages = {R.drawable.t3q1a,R.drawable.t3q1b,R.drawable.t3q1c,R.drawable.t3q2a,R.drawable.t3q2b,R.drawable.t3q2c,R.drawable.t3q3,R.drawable.t3q4,R.drawable.t3q5,R.drawable.t3q6,R.drawable.t3q7,R.drawable.t3q8a,R.drawable.t3q8b};
        String tutorialqstnum[] = {"Qst 1a.","Qst 1b.","Qst 1c.","Qst 2a.","Qst 2b.","Qst 2c.","Qst 3.","Qst 4.","Qst 5.","Qst 6.","Qst 7.","Qst 8a.","Qst 8b."};

        //represent each qst for each tutorial num
        String[] tutorial_3_qsts = {mainActivity.TestFileRead(getResources().openRawResource(R.raw.threeqst1a)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.threeqst1b)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.threeqst1c)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.threeqst2a)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.threeqst2b)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.threeqst2c)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.threeqst3)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.threeqst4)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.threeqst5)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.threeqst6)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.threeqst7)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.threeqst8a)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.threeqst8b))};
        int selected = position;

        intent = new Intent(this, SolutionActivity.class);
        intent.putExtra("raw",t3rawqsts);
        intent.putExtra("tutorial_qst",tutorial_3_qsts);
        intent.putExtra("ex",t3exqsts);
        intent.putExtra("outputimage",t3outputimages);
        intent.putExtra("gridcell",selected);
        intent.putExtra("title","Tutorial Two");
        intent.putExtra("tutorialqstnum",tutorialqstnum);

        this.startActivity(intent);


        /*

        HomePage mainActivity = new HomePage(); //to get reference to TestFileRead method MainActivity class
        String selected = grid.getItemAtPosition(position).toString();
        TextView tv = (TextView)findViewById(R.id.solutiontextview);
        String content ="";
        if(selected.equals("Qst 1a."))
        {
            content = mainActivity.TestFileRead(getResources().openRawResource(R.raw.threeqst1araw));
            intent = new Intent(this,SolutionActivity.class);
            intent.putExtra("content",content);
            intent.putExtra("tag","t3q1a");
            this.startActivity(intent);
        }

        if(selected.equals("Qst 1b."))
        {
            content = mainActivity.TestFileRead(getResources().openRawResource(R.raw.threeqst1braw));
            intent = new Intent(this,SolutionActivity.class);
            intent.putExtra("content",content);
            intent.putExtra("tag","t3q1b");
            this.startActivity(intent);
        }

        if(selected.equals("Qst 1c."))
        {
            content = mainActivity.TestFileRead(getResources().openRawResource(R.raw.threeqst1craw));
            intent = new Intent(this,SolutionActivity.class);
            intent.putExtra("content",content);
            intent.putExtra("tag","t3q1c");
            this.startActivity(intent);
        }

        if(selected.equals("Qst 2a."))
        {
            content = mainActivity.TestFileRead(getResources().openRawResource(R.raw.threeqst2araw));
            intent = new Intent(this,SolutionActivity.class);
            intent.putExtra("content",content);
            intent.putExtra("tag","t3q2a");
            this.startActivity(intent);
        }

        if(selected.equals("Qst 2b."))
        {
            content = mainActivity.TestFileRead(getResources().openRawResource(R.raw.threeqst2braw));
            intent = new Intent(this,SolutionActivity.class);
            intent.putExtra("content",content);
            intent.putExtra("tag","t3q2b");
            this.startActivity(intent);
        }

        if(selected.equals("Qst 2c."))
        {
            content = mainActivity.TestFileRead(getResources().openRawResource(R.raw.threeqst2craw));
            intent = new Intent(this,SolutionActivity.class);
            intent.putExtra("content",content);
            intent.putExtra("tag","t3q2c");
            this.startActivity(intent);
        }

        */
    }

}
