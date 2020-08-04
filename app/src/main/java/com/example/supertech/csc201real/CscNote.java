package com.example.supertech.csc201real;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import expansion.src.com.github.aakira.expandablelayout.ExpandableRelativeLayout;

public class CscNote extends AppCompatActivity {

    ExpandableRelativeLayout course_outline_layout, introduction_layout, variable_layout, selections_layout, array_layout,repetition_layout,classes_layout,input_output_layout,exceptions_layout;

    TextView course_outline_textview, introduction_textview, variable_textview, selection_textview,array_textview, repetition_textview, classes_textview, input_output_textview,exception_textview;

    String content = "";
    HomePage homePage = new HomePage();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csc_note);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("  CSC201 Lecture Note");

        Bundle bundle = getIntent().getExtras();

        course_outline_textview = (TextView)findViewById(R.id.course_outline_textview);
        content  = bundle.getString("courseoutline");
        course_outline_textview.setText(Html.fromHtml(content));

        introduction_textview = (TextView)findViewById(R.id.introduction_textview);
        content  = bundle.getString("introduction");
        introduction_textview.setText(Html.fromHtml(content));

        variable_textview = (TextView)findViewById(R.id.varaible_textview);
        content  = bundle.getString("variable");
        variable_textview.setText(Html.fromHtml(content));


        selection_textview = (TextView)findViewById(R.id.selection_textview);
        content  = bundle.getString("selection");
        selection_textview.setText(Html.fromHtml(content));

        array_textview = (TextView)findViewById(R.id.array_textview);
        content  = bundle.getString("array");
        array_textview.setText(Html.fromHtml(content));

        repetition_textview = (TextView)findViewById(R.id.repetition_textview);
        content  = bundle.getString("repetition");
        repetition_textview.setText(Html.fromHtml(content));


        classes_textview = (TextView)findViewById(R.id.classes_textview);
        content  = bundle.getString("classes");
        classes_textview.setText(Html.fromHtml(content));

        input_output_textview = (TextView)findViewById(R.id.input_output_textview);
        content  = bundle.getString("inputoutput");
        input_output_textview.setText(Html.fromHtml(content));


        exception_textview = (TextView)findViewById(R.id.exception_textview);
        content  = bundle.getString("exception");
        exception_textview.setText(Html.fromHtml(content));



    }

    @Override
    protected void onStart() {
        super.onStart();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater inflate = getMenuInflater();

        inflate.inflate(R.menu.menumenu,menu);
        //MenuItem item = menu.findItem(R.id.menututorialone);
        //item.setVisible(false);     //hide tutorial one from menu bar
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



    public void courseOutline(View view) {
        course_outline_layout = (ExpandableRelativeLayout) findViewById(R.id.course_outline_layout);

        course_outline_layout.toggle(); // toggle expand and collapse
    }
    public void introduction(View view) {
        introduction_layout = (ExpandableRelativeLayout) findViewById(R.id.introduction_layout);
        introduction_layout.toggle(); // toggle expand and collapse
    }
    public void variables(View view) {
        variable_layout = (ExpandableRelativeLayout) findViewById(R.id.variable_layout);
        variable_layout.toggle(); // toggle expand and collapse
    }
    public void selections(View view) {
        selections_layout = (ExpandableRelativeLayout) findViewById(R.id.selections_layout);
        selections_layout.toggle(); // toggle expand and collapse
    }
    public void array(View view) {
        array_layout = (ExpandableRelativeLayout) findViewById(R.id.array_layout);
        array_layout.toggle(); // toggle expand and collapse
    }
    public void repetition(View view) {
        repetition_layout = (ExpandableRelativeLayout) findViewById(R.id.repetition_layout);
        repetition_layout.toggle(); // toggle expand and collapse
    }
    public void classes(View view) {
        classes_layout = (ExpandableRelativeLayout) findViewById(R.id.classes_layout);
        classes_layout.toggle(); // toggle expand and collapse
    }
    public void inputOutput(View view) {
        input_output_layout = (ExpandableRelativeLayout) findViewById(R.id.input_output_layout);
        input_output_layout.toggle(); // toggle expand and collapse
    }

    public void exceptions(View view) {
        exceptions_layout = (ExpandableRelativeLayout) findViewById(R.id.exceptions_layout);
        exceptions_layout.toggle(); // toggle expand and collapse
    }
}
