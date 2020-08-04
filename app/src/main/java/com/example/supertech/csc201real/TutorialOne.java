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
import android.widget.TextView;

public class TutorialOne extends AppCompatActivity implements AdapterView.OnItemClickListener{

    GridView grid;
    Intent intent = new Intent();
    MenuItem menuitem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial_one);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String contents[] = {"Qst 1.","Qst 2.","Qst 3.","Qst 4.","Qst 5.","Qst 6.","Qst 7.","Qst 8.","Qst 9.","Qst 10."};
        grid =(GridView)findViewById(R.id.onegridview);
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
        MenuItem item = menu.findItem(R.id.menututorialone);
        item.setVisible(false);     //hide tutorial one from menu bar
        return true;
    }



    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        HomePage mainActivity = new HomePage();


        String[] t1rawqsts = {mainActivity.TestFileRead(getResources().openRawResource(R.raw.oneqst1raw)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.oneqst2raw)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.oneqst3raw)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.oneqst4raw)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.oneqst5raw)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.oneqst6raw)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.oneqst7raw)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.oneqst8raw)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.oneqst9raw)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.oneqst10raw))};
        String[] t1exqsts = {mainActivity.TestFileRead(getResources().openRawResource(R.raw.oneqst1ex)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.oneqst2ex)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.oneqst3ex)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.oneqst4ex)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.oneqst5ex)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.oneqst6ex)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.oneqst7ex)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.oneqst8ex)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.oneqst9ex)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.oneqst10ex))};
        int[] t1outputimages = {R.drawable.t1q1,R.drawable.t1q2,R.drawable.t1q3,R.drawable.t1q4,R.drawable.t1q5,R.drawable.t1q6,R.drawable.t1q7,R.drawable.t1q8,R.drawable.t1q9,R.drawable.t1q10};
        String tutorialqstnum[] = {"Qst 1.","Qst 2.","Qst 3.","Qst 4.","Qst 5.","Qst 6.","Qst 7.","Qst 8.","Qst 9.","Qst 10."};
        //represent each qst for each tutorial num
        String[] tutorial_1_qsts = {mainActivity.TestFileRead(getResources().openRawResource(R.raw.oneqst1)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.oneqst2)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.oneqst3)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.oneqst4)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.oneqst5)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.oneqst6)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.oneqst7)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.oneqst8)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.oneqst9)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.oneqst10))};

        int selected = position;

        intent = new Intent(this, SolutionActivity.class);
        intent.putExtra("raw",t1rawqsts);
        intent.putExtra("tutorial_qst",tutorial_1_qsts);
        intent.putExtra("ex",t1exqsts);
        intent.putExtra("outputimage",t1outputimages);
        intent.putExtra("gridcell",selected);
        intent.putExtra("title","Tutorial One");
        intent.putExtra("tutorialqstnum",tutorialqstnum);


        this.startActivity(intent);

        /*

        HomePage mainActivity = new HomePage(); //to get reference to TestFileRead method MainActivity class
        String selected = grid.getItemAtPosition(position).toString();
        TextView tv = (TextView)findViewById(R.id.solutiontextview);
        String content ="";
        if(selected.equals("Qst 1."))
        {
            content = mainActivity.TestFileRead(getResources().openRawResource(R.raw.oneqst1raw));
            intent = new Intent(this,SolutionActivity.class);
            intent.putExtra("content",content);
            intent.putExtra("tag","t1q1");
            this.startActivity(intent);
        }

        if(selected.equals("Qst 2."))
        {
            content = mainActivity.TestFileRead(getResources().openRawResource(R.raw.oneqst2raw));
            intent = new Intent(this,SolutionActivity.class);
            intent.putExtra("content",content);
            intent.putExtra("tag","t1q2");
            this.startActivity(intent);
        }

        if(selected.equals("Qst 3."))
        {
            content = mainActivity.TestFileRead(getResources().openRawResource(R.raw.oneqst3raw));
            intent = new Intent(this,SolutionActivity.class);
            intent.putExtra("content",content);
            intent.putExtra("tag","t1q3");
            this.startActivity(intent);
        }

        if(selected.equals("Qst 4."))
        {
            content = mainActivity.TestFileRead(getResources().openRawResource(R.raw.oneqst4raw));
            intent = new Intent(this,SolutionActivity.class);
            intent.putExtra("content",content);
            intent.putExtra("tag","t1q4");
            this.startActivity(intent);
        }

        if(selected.equals("Qst 5."))
        {
            content = mainActivity.TestFileRead(getResources().openRawResource(R.raw.oneqst5raw));
            intent = new Intent(this,SolutionActivity.class);
            intent.putExtra("content",content);
            intent.putExtra("tag","t1q5");
            this.startActivity(intent);
        }

        if(selected.equals("Qst 6."))
        {
            content = mainActivity.TestFileRead(getResources().openRawResource(R.raw.oneqst6raw));
            intent = new Intent(this,SolutionActivity.class);
            intent.putExtra("content",content);
            intent.putExtra("tag","t1q6");
            this.startActivity(intent);
        }

        if(selected.equals("Qst 7."))
        {
            content = mainActivity.TestFileRead(getResources().openRawResource(R.raw.oneqst7raw));
            intent = new Intent(this,SolutionActivity.class);
            intent.putExtra("content",content);
            intent.putExtra("tag","t1q7");
            this.startActivity(intent);
        }

        if(selected.equals("Qst 8."))
        {
            content = mainActivity.TestFileRead(getResources().openRawResource(R.raw.oneqst8raw));
            intent = new Intent(this,SolutionActivity.class);
            intent.putExtra("content",content);
            intent.putExtra("tag","t1q8");
            this.startActivity(intent);
        }

        if(selected.equals("Qst 9."))
        {
            content = mainActivity.TestFileRead(getResources().openRawResource(R.raw.oneqst9raw));
            intent = new Intent(this,SolutionActivity.class);
            intent.putExtra("content",content);
            intent.putExtra("tag","t1q9");
            this.startActivity(intent);
        }

        if(selected.equals("Qst 10."))
        {
            content = mainActivity.TestFileRead(getResources().openRawResource(R.raw.oneqst10raw));
            intent = new Intent(this,SolutionActivity.class);
            intent.putExtra("content",content);
            intent.putExtra("tag","t1q10");
            this.startActivity(intent);
        }
        */
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
