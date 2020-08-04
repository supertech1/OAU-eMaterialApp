package com.example.supertech.csc201real;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MBT_Answers_Display extends AppCompatActivity implements View.OnClickListener{

    //declare needed variables

    RadioButton mbt_answers_display_radio_button_a, mbt_answers_display_radio_button_b, mbt_answers_display_radio_button_c, mbt_answers_display_radio_button_d;
    TextView mbt_answers_display_solution_textview, mbt_answers_display_question_textview, mbt_answers_index_textview, users_selection_textview;

    Button mbt_answers_display_next_button, mbt_answers_display_previous_button;

    static String[] currentQuestions = {};
    static String[] currentSolutions = {};
    static String[][] currentOptions = {};

    static String[] users_selection;

    static int currentIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mbt__answers__display);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Bundle bundle = getIntent().getExtras();

        currentIndex = 1; //set current index to 1 by default

        //collecct data
        currentQuestions = bundle.getStringArray("currentQuestions");
        currentSolutions = bundle.getStringArray("currentSolutions");
        users_selection =  bundle.getStringArray("users_selection");

        //deserialize options

        Object[] objects = (Object [])getIntent().getExtras().getSerializable("currentOptions");

        if(objects != null)
        {
            currentOptions = new String[objects.length][];
            for(int i = 0; i < objects.length; i++)
            {
                currentOptions[i] = (String[]) objects[i];
            }
        }


        //set up the index
        mbt_answers_index_textview = (TextView)findViewById(R.id.mbt_answers_index_textview);
        String index_string = String.format("Qst %d of %d",currentIndex,currentQuestions.length);
        mbt_answers_index_textview.setText(index_string);


        mbt_answers_display_radio_button_a = (RadioButton)findViewById(R.id.mbt_answers_display_radio_button_a);
        mbt_answers_display_radio_button_a.setEnabled(false);

        mbt_answers_display_radio_button_a.setText("A. "+currentOptions[0][0]);  //set option a text to the first row, 1st column in array by default


        mbt_answers_display_radio_button_b = (RadioButton)findViewById(R.id.mbt_answers_display_radio_button_b);
        mbt_answers_display_radio_button_b.setEnabled(false);

        mbt_answers_display_radio_button_b.setText("B. "+currentOptions[0][1]);  //set option b text to the first row, 2nd column in array by default



        mbt_answers_display_radio_button_c = (RadioButton)findViewById(R.id.mbt_answers_display_radio_button_c);
        mbt_answers_display_radio_button_c.setEnabled(false);

        mbt_answers_display_radio_button_c.setText("C. "+currentOptions[0][2]);    //set option c text to the first row, 3rd column in array by default

        mbt_answers_display_radio_button_d = (RadioButton)findViewById(R.id.mbt_answers_display_radio_button_d);
        mbt_answers_display_radio_button_d.setEnabled(false);

        mbt_answers_display_radio_button_d.setText("D. "+currentOptions[0][3]);  //set option d text to the first row, 4th column in array by default




        mbt_answers_display_question_textview = (TextView)findViewById(R.id.mbt_answers_display_question_textview);
        mbt_answers_display_question_textview.setText(currentQuestions[0]);  //set question to the first question in array by default


        mbt_answers_display_solution_textview = (TextView)findViewById(R.id.mbt_answers_display_solution_textview);
        mbt_answers_display_solution_textview.setText(currentSolutions[0]);  //set solution to the first solution in array by default

        //Check for correct answer and select it by default and color it red
        String correct_answer = currentOptions[0][4];
        if(correct_answer.equals("A")) {
            mbt_answers_display_radio_button_a.setChecked(true);
            mbt_answers_display_radio_button_a.setTextColor(Color.RED);
        }

        if(correct_answer.equals("B")) {
            mbt_answers_display_radio_button_b.setChecked(true);
            mbt_answers_display_radio_button_b.setTextColor(Color.RED);
        }

        if(correct_answer.equals("C")) {
            mbt_answers_display_radio_button_c.setChecked(true);
            mbt_answers_display_radio_button_c.setTextColor(Color.RED);
        }

        if(correct_answer.equals("D")) {
            mbt_answers_display_radio_button_d.setChecked(true);
            mbt_answers_display_radio_button_d.setTextColor(Color.RED);
        }


        //set up users selection

        users_selection_textview = (TextView)findViewById(R.id.users_selection_textview);
        users_selection_textview.setText("You selected : "+ (users_selection[0] == null ? "None" : users_selection[0]));


        //set up next and previous buttons
        mbt_answers_display_next_button = (Button)findViewById(R.id.mbt_answers_display_next_button);
        mbt_answers_display_next_button.setOnClickListener(this);

        mbt_answers_display_previous_button = (Button)findViewById(R.id.mbt_answers_display_previous_button);
        mbt_answers_display_previous_button.setOnClickListener(this);
        mbt_answers_display_previous_button.setVisibility(View.INVISIBLE); //set previous button invisble by default




    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.mbt_answers_display_next_button)
        {
            if((currentIndex < currentQuestions.length) && (currentIndex != currentQuestions.length)) {

                setAllRadioButtonsTextColorToBlue();
                currentIndex++;
                if (currentIndex == currentQuestions.length) {
                    mbt_answers_display_next_button.setVisibility(View.INVISIBLE);
                }
                mbt_answers_display_previous_button.setVisibility(View.VISIBLE);//make previous visible back
                mbt_answers_index_textview.setText("Qst : " + currentIndex + " of " + currentQuestions.length);
                mbt_answers_display_question_textview.setText(currentQuestions[currentIndex - 1]);
                mbt_answers_display_solution_textview.setText(currentSolutions[currentIndex - 1]);

                mbt_answers_display_radio_button_a.setText("A. " + currentOptions[currentIndex - 1][0]);
                mbt_answers_display_radio_button_b.setText("B. " + currentOptions[currentIndex - 1][1]);
                mbt_answers_display_radio_button_c.setText("C. " + currentOptions[currentIndex - 1][2]);
                mbt_answers_display_radio_button_d.setText("D. " + currentOptions[currentIndex - 1][3]);

                String correct_answer = currentOptions[currentIndex - 1][4];
                if (correct_answer.equals("A")) {
                    mbt_answers_display_radio_button_a.setChecked(true);
                    mbt_answers_display_radio_button_a.setTextColor(Color.RED);
                }

                if (correct_answer.equals("B")) {
                    mbt_answers_display_radio_button_b.setChecked(true);
                    mbt_answers_display_radio_button_b.setTextColor(Color.RED);
                }

                if (correct_answer.equals("C")) {
                    mbt_answers_display_radio_button_c.setChecked(true);
                    mbt_answers_display_radio_button_c.setTextColor(Color.RED);
                }

                if (correct_answer.equals("D")) {
                    mbt_answers_display_radio_button_d.setChecked(true);
                    mbt_answers_display_radio_button_d.setTextColor(Color.RED);
                }

                //tell user what they selected
                users_selection_textview.setText("You selected : "+ (users_selection[currentIndex - 1] == null ? "None" : users_selection[currentIndex - 1]));
            }

        }





        if(v.getId() == R.id.mbt_answers_display_previous_button)
        {
            if(currentIndex > 1) {
                setAllRadioButtonsTextColorToBlue();
                currentIndex--;
                if (currentIndex == 1) {
                    mbt_answers_display_previous_button.setVisibility(View.INVISIBLE);
                }

                mbt_answers_display_next_button.setVisibility(View.VISIBLE);//make next visible back

                mbt_answers_display_question_textview.setText(currentQuestions[currentIndex - 1]);
                mbt_answers_display_solution_textview.setText(currentSolutions[currentIndex - 1]);

                mbt_answers_index_textview.setText("Qst : " + currentIndex + " of " + currentQuestions.length);
                mbt_answers_display_radio_button_a.setText("A. " + currentOptions[currentIndex - 1][0]);
                mbt_answers_display_radio_button_b.setText("B. " + currentOptions[currentIndex - 1][1]);
                mbt_answers_display_radio_button_c.setText("C. " + currentOptions[currentIndex - 1][2]);
                mbt_answers_display_radio_button_d.setText("D. " + currentOptions[currentIndex - 1][3]);

                String correct_answer = currentOptions[currentIndex - 1][4];
                if (correct_answer.equals("A")) {
                    mbt_answers_display_radio_button_a.setChecked(true);
                    mbt_answers_display_radio_button_a.setTextColor(Color.RED);
                }

                if (correct_answer.equals("B")) {
                    mbt_answers_display_radio_button_b.setChecked(true);
                    mbt_answers_display_radio_button_b.setTextColor(Color.RED);
                }

                if (correct_answer.equals("C")) {
                    mbt_answers_display_radio_button_c.setChecked(true);
                    mbt_answers_display_radio_button_c.setTextColor(Color.RED);
                }

                if (correct_answer.equals("D")) {
                    mbt_answers_display_radio_button_d.setChecked(true);
                    mbt_answers_display_radio_button_d.setTextColor(Color.RED);
                }

                //tell user what they selected
                users_selection_textview.setText("You selected : "+ (users_selection[currentIndex - 1] == null ? "None" : users_selection[currentIndex - 1]));
            }
        }






    }


    private void setAllRadioButtonsTextColorToBlue()
    {
        mbt_answers_display_radio_button_a.setTextColor(Color.parseColor("#303F9F"));
        mbt_answers_display_radio_button_b.setTextColor(Color.parseColor("#303F9F"));
        mbt_answers_display_radio_button_c.setTextColor(Color.parseColor("#303F9F"));
        mbt_answers_display_radio_button_d.setTextColor(Color.parseColor("#303F9F"));
    }
}
