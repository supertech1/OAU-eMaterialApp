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

public class TutorialTwo extends AppCompatActivity implements AdapterView.OnItemClickListener {

    GridView grid;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutoral_two);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String contents[] = {"Qst 1.","Qst 2.","Qst 3a.","Qst 3b.","Qst 3c.","Qst 4a.","Qst 4b.","Qst 5a.","Qst 5b.","Qst 6.","Qst 7a.","Qst 7b.","Qst 8a.","Qst 8b."};
        grid =(GridView)findViewById(R.id.twogridview);
        ArrayAdapter<String> aa = new ArrayAdapter<String>(this, R.layout.simple_list_item_1,contents);
        grid.setAdapter(aa);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater inflate = getMenuInflater();

        inflate.inflate(R.menu.menumenu,menu);
        MenuItem item = menu.findItem(R.id.menututorialtwo);
        item.setVisible(false);     //hide tutorial one from menu bar
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
        String[] t2rawqsts = {mainActivity.TestFileRead(getResources().openRawResource(R.raw.twoqst1raw)),

        };

        String[] t2exqsts = {mainActivity.TestFileRead(getResources().openRawResource(R.raw.noex)),


        };


        int[] t2outputimages = {R.drawable.none,R.drawable.none,


        };
        String tutorialqstnum[] = {"Qst 1.","Qst 2.","Qst 3a.","Qst 3b.","Qst 3c.","Qst 4a.","Qst 4b.","Qst 5a.","Qst 5b.","Qst 6.","Qst 7a.","Qst 7b.","Qst 8a.","Qst 8b."};
        //represent each qst for each tutorial num
        String[] tutorial_3_qsts = {mainActivity.TestFileRead(getResources().openRawResource(R.raw.twoqst1)),




        };
        int selected = position;

        intent = new Intent(this, SolutionActivity.class);
        intent.putExtra("raw",t2rawqsts);
        intent.putExtra("tutorial_qst",tutorial_3_qsts);
        intent.putExtra("ex",t2exqsts);
        intent.putExtra("outputimage",t2outputimages);
        intent.putExtra("gridcell",selected);
        intent.putExtra("title","Tutorial Three");
        intent.putExtra("tutorialqstnum",tutorialqstnum);

        this.startActivity(intent);



    }
}
