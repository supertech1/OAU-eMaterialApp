package com.example.supertech.csc201real;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.method.ScrollingMovementMethod;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;


public class PQSolutions extends AppCompatActivity implements View.OnClickListener{

    TextView pq_question_textview,pq_solution_textview;
    ImageButton nextbutton, previousbutton;
    TextView tag_field;
    Button pq_check_solution_button;

    //zoom
    ScaleGestureDetector scaleGestureDetector;
    GestureDetector gestureDetector;

    int position_cursor;
    String qst_nos[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pqsolutions);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        pq_question_textview = (TextView)findViewById(R.id.pq_question_textview);
        pq_solution_textview = (TextView)findViewById(R.id.pq_solution_textview);

        //zoom
        scaleGestureDetector = new ScaleGestureDetector(this,new simpleOnScaleGestuteListener());
        gestureDetector = new GestureDetector(this, new gestureDetectorListener());






        nextbutton = (ImageButton)findViewById(R.id.nextbutton);
        nextbutton.setOnClickListener(this);
        previousbutton = (ImageButton) findViewById(R.id.previousbutton);
        previousbutton.setOnClickListener(this);
        tag_field = (TextView)findViewById(R.id.pqsolution_qsttag_field);

        pq_check_solution_button = (Button)findViewById(R.id.pq_check_solution_button);
        pq_check_solution_button.setOnClickListener(this);

        Bundle bundle = getIntent().getExtras();
        String title = bundle.getString("title");
        this.setTitle(title);
        String testqst = bundle.getString("testqst");  //holds the current text qst
        String testsolution = bundle.getString("testsolution");  //holds the current text solution
        position_cursor = bundle.getInt("position_from_grid");

        qst_nos = bundle.getStringArray("qst_nos");

        pq_question_textview.setText(testqst);
        pq_solution_textview.setText(testsolution);
        pq_solution_textview.setVisibility(View.INVISIBLE);
        tag_field.setText("Qst "+qst_nos[position_cursor - 1]);
    }

    //zoom
    @Override
    public boolean onTouchEvent(MotionEvent event) {

        scaleGestureDetector.onTouchEvent(event);
        return true;
    }

    //zoom
    private class simpleOnScaleGestuteListener extends ScaleGestureDetector.SimpleOnScaleGestureListener
    {
        @Override
        public boolean onScale(ScaleGestureDetector detector) {
            super.onScale(detector);
            float size = pq_question_textview.getTextSize();
            float factor = detector.getScaleFactor();
            float product = size * factor;
            if(product > 50)
            {
                product = 50;
            }
            if(product < 20)
            {
                product = 20;
            }
            pq_question_textview.setTextSize(TypedValue.COMPLEX_UNIT_PX, product);
            pq_solution_textview.setTextSize(TypedValue.COMPLEX_UNIT_PX, product);

            return true;
        }
    }
    //zoom
    private class gestureDetectorListener extends GestureDetector.SimpleOnGestureListener
    {
        @Override
        public boolean onDoubleTap(MotionEvent e) {
            /*
            if(tv.getTextSize() == 50) {
                tv.setTextSize(TypedValue.COMPLEX_UNIT_PX, 20);
            }
            else
            {
                tv.setTextSize(TypedValue.COMPLEX_UNIT_PX, 50);
            }*/
            return true;
        }


        @Override
        public boolean onDown(MotionEvent e) {
            return true;
        }
    }

    @Override  //zoom
    public boolean dispatchTouchEvent(MotionEvent ev) {
        super.dispatchTouchEvent(ev);
        scaleGestureDetector.onTouchEvent(ev);
        gestureDetector.onTouchEvent(ev);
        return true;
    }

    @Override
    public void onClick(View v) {

        Bundle bundle = getIntent().getExtras();
        String[] yeartestqst = bundle.getStringArray("yeartestqst");
        String[] yeartestsolution = bundle.getStringArray("yeartestsolution");
        String testqst ="";
        String testsolution = "";
        if(v.getId() == R.id.nextbutton)
        {
            if(position_cursor == (yeartestqst.length - 1))
            {
                position_cursor = 0; //reset cursor to the beginning
            }

            position_cursor++;
            testqst = yeartestqst[position_cursor] ;
            testsolution = yeartestsolution[position_cursor];
            pq_question_textview.setText(testqst);
            pq_solution_textview.setText(testsolution);
            pq_solution_textview.setVisibility(View.INVISIBLE);
            tag_field.setText("Qst "+qst_nos[position_cursor - 1]);  //"Qst "+position_cursor+"."
        }

        if(v.getId() == R.id.previousbutton)
        {
            if(position_cursor == 1)
            {
                position_cursor = (yeartestqst.length);
            }
            position_cursor--;
            testqst = yeartestqst[position_cursor] ;
            testsolution = yeartestsolution[position_cursor];
            pq_question_textview.setText(testqst);
            pq_solution_textview.setText(testsolution);
            pq_solution_textview.setVisibility(View.INVISIBLE);
            tag_field.setText("Qst "+qst_nos[position_cursor - 1]);
        }

        if(v.getId() == R.id.pq_check_solution_button)
        {
            pq_solution_textview.setVisibility(View.VISIBLE);
        }



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater inflate = getMenuInflater();

        inflate.inflate(R.menu.menumenu,menu);
        MenuItem item = menu.findItem(R.id.menupq);
        item.setVisible(false);     //hide tutorial one from menu bar
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
