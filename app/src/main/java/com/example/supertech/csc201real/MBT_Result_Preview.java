package com.example.supertech.csc201real;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MBT_Result_Preview extends AppCompatActivity implements View.OnClickListener {


    TextView mbt_result_total_question_textview, mbt_result_correct_answer_textview, mbt_result_wrong_answer_textview, mbt_result_unattempted_answer_textview,mbt_result_total_score_textview, mbt_result_time_used_textview;

    Button complete_solution_button, missed_solution_button;


    static String[] wrong_current_questions = {};
    static String[] wrong_current_solutions = {};
    static String[] wrong_user_selection = {};
    static String[][] wrong_current_options = {};

    static String[] currentQuestions = {};
    static String[] currentSolutions = {};
    static String[][] currentOptions = {};
    static String[] users_selection;

    static ArrayList<String> wrong_answers_index;  //it will contain the wrong answers index and the unattempted questions index
    static int unattempted_count;
    static int correct_answer_count;
    static String time_used;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mbt__result__preview);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        complete_solution_button = (Button)findViewById(R.id.complete_solution_button);
        complete_solution_button.setOnClickListener(this);
        missed_solution_button = (Button)findViewById(R.id.missed_solution_button);
        missed_solution_button.setOnClickListener(this);


        Bundle bundle = getIntent().getExtras();


        currentQuestions = bundle.getStringArray("currentQuestions");
        currentSolutions = bundle.getStringArray("currentSolutions");
        users_selection =  bundle.getStringArray("users_selection");
        time_used = bundle.getString("time_used");

        unattempted_count = 0; //set num of unattempted qsts to 0 by default;
        correct_answer_count = 0;

        wrong_answers_index = new ArrayList<>();

        Object[] objects = (Object [])getIntent().getExtras().getSerializable("currentOptions");

        if(objects != null)
        {
            currentOptions = new String[objects.length][];
            for(int i = 0; i < objects.length; i++)
            {
                currentOptions[i] = (String[]) objects[i];
            }
        }

        for(int i = 0; i < currentQuestions.length; i++)
        {
            if(users_selection[i] == null )
            {
                wrong_answers_index.add(""+i);
                unattempted_count++;
                continue;
            }
            else
            {
                if(users_selection[i].equals(currentOptions[i][4]))
                {
                    correct_answer_count++;
                }
                else
                {
                    wrong_answers_index.add(""+i);
                }
            }
        }


        mbt_result_total_question_textview = (TextView)findViewById(R.id.mbt_result_total_question_textview);
        mbt_result_total_question_textview.setText(""+currentQuestions.length);

        mbt_result_time_used_textview = (TextView)findViewById(R.id.mbt_result_time_used_textview);
        mbt_result_time_used_textview.setText(""+time_used);



        mbt_result_correct_answer_textview = (TextView)findViewById(R.id.mbt_result_correct_answer_textview);
        mbt_result_correct_answer_textview.setText(""+correct_answer_count);



        mbt_result_wrong_answer_textview = (TextView)findViewById(R.id.mbt_result_wrong_answer_textview);
        mbt_result_wrong_answer_textview.setText(""+wrong_answers_index.size());


        mbt_result_unattempted_answer_textview = (TextView)findViewById(R.id.mbt_result_unattempted_answer_textview);
        mbt_result_unattempted_answer_textview.setText(""+unattempted_count);


        mbt_result_total_score_textview = (TextView)findViewById(R.id.mbt_result_total_score_textview);
        mbt_result_total_score_textview.setText(""+correct_answer_count+" / "+currentQuestions.length);


        wrong_current_questions = new String[wrong_answers_index.size()];
        wrong_current_solutions = new String[wrong_answers_index.size()];
        wrong_user_selection = new String[wrong_answers_index.size()];
        wrong_current_options = new String[wrong_answers_index.size()][5];



        for (int i = 0; i <wrong_answers_index.size(); i++)
        {
            //get the wrong answer index and prepare a new array of wrong questions solution to send
            int index_value = Integer.parseInt(wrong_answers_index.get(i));
            wrong_current_questions[i] = currentQuestions[index_value];
            wrong_current_solutions[i] = currentSolutions[index_value];
            wrong_current_options[i] = currentOptions[index_value];
            wrong_user_selection[i] = users_selection[index_value];
        }


    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent(this, MBT_Answers_Display.class);

        if(v.getId() == R.id.complete_solution_button)
        {
            intent.putExtra("currentQuestions",currentQuestions);
            intent.putExtra("currentSolutions",currentSolutions);
            intent.putExtra("users_selection",users_selection);

            Bundle mBundle = new Bundle();
            mBundle.putSerializable("currentOptions",currentOptions);
            intent.putExtras(mBundle);



            startActivity(intent);
        }

        if(v.getId() == R.id.missed_solution_button)
        {
            if(wrong_answers_index.size() >= 1)
            {



                //send data

                intent.putExtra("currentQuestions",wrong_current_questions);
                intent.putExtra("currentSolutions",wrong_current_solutions);
                intent.putExtra("users_selection",wrong_user_selection);

                Bundle mBundle = new Bundle();
                mBundle.putSerializable("currentOptions",wrong_current_options);
                intent.putExtras(mBundle);

                startActivity(intent);
            }
            else
            {
                Toast.makeText(this,"You got all correctly",Toast.LENGTH_SHORT).show();
            }
        }

    }


    @Override
    public void onBackPressed() {

        AlertDialog.Builder alert = new AlertDialog.Builder(this, android.R.style.Theme_Holo_Dialog_NoActionBar_MinWidth);
        alert.setTitle("Exit Test");
        alert.setMessage("Are you sure you want to quit this test session? ");
        alert.setCancelable(false);

        //if user select yes
        alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {




                MBT_Result_Preview.super.onBackPressed();

            }
        });


        alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {




            }
        });

        alert.create().show();

    }
}
