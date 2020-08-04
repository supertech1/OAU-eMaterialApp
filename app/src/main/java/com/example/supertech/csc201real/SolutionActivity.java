package com.example.supertech.csc201real;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class SolutionActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener, View.OnClickListener {

    TextView tv;
    TextView tutorial_qst_textview;
    TextView solutionquestionnum;
    RadioGroup buttonGroup;
    RadioButton rawbutton;
    RadioButton explainbutton;
    Bundle bundle;
    ImageView image;
    Intent intent = new Intent();
    static int position_cursor;
    String[] raw;
    String[] tutorial_qst;
    String[] ex;
    String[] tutorialqstnum;
    String title;
    int[] outputimage;
    ImageButton nextbutton,previousbutton;

    ChangeTextColor changeTextColor;

    //zoom
    ScaleGestureDetector scaleGestureDetector;
    GestureDetector gestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solution);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);






        /*
        String getStatus =bundle.getString("setCheck");
        String tag = bundle.getString("tag");
        String content = bundle.getString("content");

        setScreenShot(tag);
        */
/*
        if(getStatus.equals("rawbutton"))
            rawbutton.setChecked(true);
        if(getStatus.equals("explainbutton"))
            rawbutton.setChecked(true);
*/
        //tv.setText(content);
    }

    @Override
    protected void onResume() {
        super.onResume();

        tv = (TextView)findViewById(R.id.solutiontextview);
        solutionquestionnum = (TextView)findViewById(R.id.solutionquestionnum);
        tutorial_qst_textview = (TextView)findViewById(R.id.tutorial_qst_textview);

        //zoom
        scaleGestureDetector = new ScaleGestureDetector(this,new simpleOnScaleGestuteListener());
        gestureDetector = new GestureDetector(this, new gestureDetectorListener());

        rawbutton = (RadioButton)findViewById(R.id.rawbutton);
        explainbutton = (RadioButton)findViewById(R.id.explainbutton);


        buttonGroup = (RadioGroup)findViewById(R.id.rawexplaingroup);
        buttonGroup.setOnCheckedChangeListener(this);

        image = (ImageView)findViewById(R.id.solutionscreenshot);

        nextbutton = (ImageButton)findViewById(R.id.tutorial_next_button);
        nextbutton.setOnClickListener(this);

        previousbutton = (ImageButton)findViewById(R.id.tutorial_previous_button);
        previousbutton.setOnClickListener(this);


        bundle = getIntent().getExtras();

        raw = bundle.getStringArray("raw");
        tutorial_qst = bundle.getStringArray("tutorial_qst");
        ex = bundle.getStringArray("ex");
        outputimage = bundle.getIntArray("outputimage");
        position_cursor = bundle.getInt("gridcell");
        title = bundle.getString("title");
        tutorialqstnum = bundle.getStringArray("tutorialqstnum");
        this.setTitle(title);

        changeTextColor = new ChangeTextColor();  //this class will be used to design the text color dynamically
        tutorial_qst_textview.setText(tutorial_qst[position_cursor]);
        SpannableStringBuilder ssb = changeTextColor.changeTextColor(raw[position_cursor]);
        tv.setText(ssb);  //deducting 1 since array index is from 0
        solutionquestionnum.setText(tutorialqstnum[position_cursor]);

        image.setImageResource(outputimage[position_cursor]);

    }

    @Override
    protected void onStart() {
        super.onStart();


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
            float size = tv.getTextSize();
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
            tv.setTextSize(TypedValue.COMPLEX_UNIT_PX, product);
            tutorial_qst_textview.setTextSize(TypedValue.COMPLEX_UNIT_PX,product);

            return true;
        }
    }

    //zoom
    private class gestureDetectorListener extends GestureDetector.SimpleOnGestureListener
    {
        @Override
        public boolean onDoubleTap(MotionEvent e) {

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
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        int selectedId = group.getCheckedRadioButtonId();
        TextView tv = (TextView)findViewById(R.id.solutiontextview);
        //String tag = bundle.getString("tag");
        //String content[] = getContent(tag);

        if(selectedId == R.id.rawbutton)
        {
            SpannableStringBuilder ssb = changeTextColor.changeTextColor(raw[position_cursor]);
            tv.setText(ssb);
        }

        if(selectedId == R.id.explainbutton)
        {
            SpannableStringBuilder ssb = changeTextColor.changeTextColor(ex[position_cursor]);
            tv.setText(ssb);
        }
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        super.onCreateOptionsMenu(menu);
        MenuInflater inflate = getMenuInflater();
        inflate.inflate(R.menu.menumenu,menu);

        if(title.equals("Tutorial One"))
        {
            MenuItem item = menu.findItem(R.id.menututorialone);
            item.setVisible(false);
        }

        if(title.equals("Tutorial Two"))
        {
            MenuItem item = menu.findItem(R.id.menututorialtwo);
            item.setVisible(false);
        }




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


    public String[] getContent(String tag)
    {

        String solution[] = new String[2]; //store content of raw and explanation in this array, stores raw in index 0 and explanation in index1
        HomePage mainActivity = new HomePage(); //to get reference to TestFileRead method MainActivity class
        switch(tag)
        {
            case "t1q1":
                solution[0] = mainActivity.TestFileRead(getResources().openRawResource(R.raw.oneqst1raw));
                solution[1] = mainActivity.TestFileRead(getResources().openRawResource(R.raw.oneqst1ex));
                break;
            case "t1q2":
                solution[0] = mainActivity.TestFileRead(getResources().openRawResource(R.raw.oneqst2raw));
                solution[1] = mainActivity.TestFileRead(getResources().openRawResource(R.raw.oneqst2ex));
                break;
            case "t1q3":
                solution[0] = mainActivity.TestFileRead(getResources().openRawResource(R.raw.oneqst3raw));
                solution[1] = mainActivity.TestFileRead(getResources().openRawResource(R.raw.oneqst3ex));
                break;
            case "t1q4":
                solution[0] = mainActivity.TestFileRead(getResources().openRawResource(R.raw.oneqst4raw));
                solution[1] = mainActivity.TestFileRead(getResources().openRawResource(R.raw.oneqst4ex));
                break;
            case "t1q5":
                solution[0] = mainActivity.TestFileRead(getResources().openRawResource(R.raw.oneqst5raw));
                solution[1] = mainActivity.TestFileRead(getResources().openRawResource(R.raw.oneqst5ex));
                break;
            case "t1q6":
                solution[0] = mainActivity.TestFileRead(getResources().openRawResource(R.raw.oneqst6raw));
                solution[1] = mainActivity.TestFileRead(getResources().openRawResource(R.raw.oneqst7ex));
                break;
            case "t1q7":
                solution[0] = mainActivity.TestFileRead(getResources().openRawResource(R.raw.oneqst7raw));
                solution[1] = mainActivity.TestFileRead(getResources().openRawResource(R.raw.oneqst7ex));
                break;
            case "t1q8":
                solution[0] = mainActivity.TestFileRead(getResources().openRawResource(R.raw.oneqst8raw));
                solution[1] = mainActivity.TestFileRead(getResources().openRawResource(R.raw.oneqst8ex));
                break;
            case "t1q9":
                solution[0] = mainActivity.TestFileRead(getResources().openRawResource(R.raw.oneqst9raw));
                solution[1] = mainActivity.TestFileRead(getResources().openRawResource(R.raw.oneqst9ex));
                break;
            case "t1q10":
                solution[0] = mainActivity.TestFileRead(getResources().openRawResource(R.raw.oneqst10raw));
                solution[1] = mainActivity.TestFileRead(getResources().openRawResource(R.raw.oneqst10ex));
                break;
            case "t3q1a":
                solution[0] = mainActivity.TestFileRead(getResources().openRawResource(R.raw.threeqst1araw));
                solution[1] = mainActivity.TestFileRead(getResources().openRawResource(R.raw.threeqst1aex));
                break;
            case "t3q1b":
                solution[0] = mainActivity.TestFileRead(getResources().openRawResource(R.raw.threeqst1braw));
                solution[1] = mainActivity.TestFileRead(getResources().openRawResource(R.raw.threeqst1bex));
                break;
            case "t3q1c":
                solution[0] = mainActivity.TestFileRead(getResources().openRawResource(R.raw.threeqst1craw));
                solution[1] = mainActivity.TestFileRead(getResources().openRawResource(R.raw.threeqst1cex));
                break;
            case "t3q2a":
                solution[0] = mainActivity.TestFileRead(getResources().openRawResource(R.raw.threeqst2araw));
                solution[1] = mainActivity.TestFileRead(getResources().openRawResource(R.raw.threeqst2aex));
                break;
            case "t3q2b":
                solution[0] = mainActivity.TestFileRead(getResources().openRawResource(R.raw.threeqst2braw));
                solution[1] = mainActivity.TestFileRead(getResources().openRawResource(R.raw.threeqst2bex));
                break;
            case "t3q2c":
                solution[0] = mainActivity.TestFileRead(getResources().openRawResource(R.raw.threeqst2craw));
                solution[1] = mainActivity.TestFileRead(getResources().openRawResource(R.raw.threeqst2cex));
                break;

        }

        return solution;
    }


    public void setScreenShot(String tag)
    {
        image = (ImageView)findViewById(R.id.solutionscreenshot);
        switch(tag)
        {
            case "t1q1":
                image.setImageResource(R.drawable.t1q1);
                break;
            case "t1q2":
                image.setImageResource(R.drawable.t1q2);
                break;
            case "t1q3":
                image.setImageResource(R.drawable.t1q3);
                break;
            case "t1q4":
                image.setImageResource(R.drawable.t1q4);
                break;
            case "t1q5":
                image.setImageResource(R.drawable.t1q5);
                break;
            case "t1q6":
                image.setImageResource(R.drawable.t1q6);
                break;
            case "t1q7":
                image.setImageResource(R.drawable.t1q7);
                break;
            case "t1q8":
                image.setImageResource(R.drawable.t1q8);
                break;
            case "t1q9":
                image.setImageResource(R.drawable.t1q9);
                break;
            case "t1q10":
                image.setImageResource(R.drawable.t1q10);
                break;
            case "t3q1a":
                image.setImageResource(R.drawable.t3q1a);
                break;
            case "t3q1b":
                image.setImageResource(R.drawable.t3q1b);
                break;
            case "t3q1c":
                image.setImageResource(R.drawable.t3q1c);
                break;
            case "t3q2a":
                image.setImageResource(R.drawable.t3q2a);
                break;
            case "t3q2b":
                image.setImageResource(R.drawable.t3q2b);
                break;
            case "t3q2c":
                image.setImageResource(R.drawable.t3q2c);
                break;
        }

    }


    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.tutorial_next_button)
        {
            position_cursor++;
            if(position_cursor == raw.length)
            {
                position_cursor = 0;
            }
            tutorial_qst_textview.setText(tutorial_qst[position_cursor]);
            SpannableStringBuilder ssb = changeTextColor.changeTextColor(raw[position_cursor]);
            tv.setText(ssb);
            solutionquestionnum.setText(tutorialqstnum[position_cursor]);
            image.setImageResource(outputimage[position_cursor]);
            rawbutton.setChecked(true);
        }

        if(v.getId() == R.id.tutorial_previous_button)
        {
            position_cursor--;
            if(position_cursor == -1)
            {
                position_cursor = (raw.length - 1);
            }
            tutorial_qst_textview.setText(tutorial_qst[position_cursor]);
            SpannableStringBuilder ssb = changeTextColor.changeTextColor(raw[position_cursor]);
            tv.setText(ssb);

            solutionquestionnum.setText(tutorialqstnum[position_cursor]);
            image.setImageResource(outputimage[position_cursor]);
            rawbutton.setChecked(true);
        }

    }

}
