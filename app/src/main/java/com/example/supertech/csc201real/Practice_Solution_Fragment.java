package com.example.supertech.csc201real;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Practice_Solution_Fragment extends Fragment implements View.OnClickListener{

    TextView frag_practice_question_textview, frag_practice_solution_textview, frag_practice_index_textview;
    RadioButton radio_button_a, radio_button_b,radio_button_c,radio_button_d;
    Button check_solution_button ;
    RadioGroup options_radio_group;
    ImageButton nextbutton, previousbutton,searchtbutton;
    EditText search_index;

    RelativeLayout correct_toast_relative_layout,wrong_toast_relative_layout;
    Toast correct_toast,wrong_toast;

    static int position_from_list = 0;  //holds the current position from practice list....to lookup the content in the multi_array
    static String item_title = "";  //title of selected item
    static String current_row_questions[] = {};    //holds questions from each row
    static String current_row_solutions[] = {};   //holds solutions from each row
    static String[][] qst_options = {};  //hold options for each question in the current row


    static int current_index; //rep the current index of the question in the current row

    HomePage homePage = new HomePage(); //get reference to method to read from raw



    public Practice_Solution_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_practice__solution_, container, false);
        frag_practice_question_textview = (TextView)v.findViewById(R.id.frag_practice_question_textview);


        //prepare the correct and incorrect custom toast
        correct_toast_relative_layout = (RelativeLayout)getActivity().getLayoutInflater().inflate(R.layout.correct_custom_toast,(RelativeLayout)v.findViewById(R.id.correct_toast_relative_layout));
        correct_toast = new Toast(getActivity());
        correct_toast.setDuration(Toast.LENGTH_SHORT);

        correct_toast.setView(correct_toast_relative_layout);

        wrong_toast_relative_layout = (RelativeLayout)getActivity().getLayoutInflater().inflate(R.layout.wrong_custom_toast,(RelativeLayout)v.findViewById(R.id.wrong_toast_relative_layout));
        wrong_toast = new Toast(getActivity());
        wrong_toast.setDuration(Toast.LENGTH_SHORT);

        wrong_toast.setView(wrong_toast_relative_layout);


        //set the title to the selected item
        getActivity().setTitle(item_title);

        current_index = 1; //default index to 1


        frag_practice_question_textview.setText(current_row_questions[0]);

        String indexText = String.format(" %d of %d ",current_index,current_row_questions.length);  //default index is 1
        String searchIndexText = String.format("%d - %d ",1,current_row_questions.length);  // the search index hint

        frag_practice_index_textview = (TextView)v.findViewById(R.id.frag_practice_index_textview);
        frag_practice_index_textview.setText(indexText);





        frag_practice_solution_textview = (TextView)v.findViewById(R.id.frag_practice_solution_textview);

        frag_practice_solution_textview.setText(current_row_solutions[0]);
        frag_practice_solution_textview.setVisibility(View.INVISIBLE);  //hide solution from user by default til he click d radio btn

        check_solution_button = (Button)v.findViewById(R.id.check_solution_button);
        check_solution_button.setOnClickListener(this);

        searchtbutton = (ImageButton) v.findViewById(R.id.searchtbutton);
        searchtbutton.setOnClickListener(this);


        nextbutton = (ImageButton) v.findViewById(R.id.nextbutton);
        nextbutton.setOnClickListener(this);

        previousbutton = (ImageButton)v.findViewById(R.id.previousbutton);
        previousbutton.setOnClickListener(this);




        //initialize option radio buttons

        options_radio_group = (RadioGroup)v.findViewById(R.id.option_radio_group);

        radio_button_a = (RadioButton)v.findViewById(R.id.radio_button_a);
        radio_button_a.setOnClickListener(this);
        radio_button_b = (RadioButton)v.findViewById(R.id.radio_button_b);
        radio_button_b.setOnClickListener(this);
        radio_button_c = (RadioButton)v.findViewById(R.id.radio_button_c);
        radio_button_c.setOnClickListener(this);
        radio_button_d = (RadioButton)v.findViewById(R.id.radio_button_d);
        radio_button_d.setOnClickListener(this);


        //set the options
        radio_button_a.setText("A.   "+qst_options[(current_index - 1)][0]);
        radio_button_b.setText("B.   "+qst_options[(current_index - 1)][1]);
        radio_button_c.setText("C.   "+qst_options[(current_index - 1)][2]);
        radio_button_d.setText("D.   "+qst_options[(current_index - 1)][3]);



        search_index = (EditText)v.findViewById(R.id.search_index);
        search_index.setHint(searchIndexText);


        //respond to the done button on keyboard
        search_index.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if(keyCode == event.KEYCODE_ENTER)
                {
                    //do something later if you have the time....after putting the code from the go button, it is throwing an error...numformat stuff
                }
                return false;
            }
        });



        return v;
    }
    /*

    public String[] getQuestions(int position)
    {
        //put all questions here

        questions = {{homePage.TestFileRead(getResources().openRawResource(R.raw.oneqst1)),homePage.TestFileRead(getResources().openRawResource(R.raw.oneqst1)),homePage.TestFileRead(getResources().openRawResource(R.raw.oneqst1))},  //row0

                                {homePage.TestFileRead(getResources().openRawResource(R.raw.oneqst1))} //row1
                                };
        return question[position];

    }

    public String[] getSolutions(int position)
    {
        String question[][] = {{homePage.TestFileRead(getResources().openRawResource(R.raw.oneqst1)),homePage.TestFileRead(getResources().openRawResource(R.raw.oneqst1)),homePage.TestFileRead(getResources().openRawResource(R.raw.oneqst1))},  //row 0
                                {homePage.TestFileRead(getResources().openRawResource(R.raw.oneqst1))}  //row 1

                                 };
        return question[position];
    }

       */

    public void setBundles(int position, String title, String[] row_questions, String[] row_solutions,String[][] qst_option)
    {
        Practice_Solution_Fragment.position_from_list = position;
        Practice_Solution_Fragment.item_title = title;
        Practice_Solution_Fragment.current_row_questions = row_questions;
        Practice_Solution_Fragment.current_row_solutions = row_solutions;
        Practice_Solution_Fragment.qst_options = qst_option;
    }




    @Override
    public void onClick(View v) {

        //check if user click the radio button
        if(v.getId() == R.id.check_solution_button)
        {
            frag_practice_solution_textview.setVisibility(View.VISIBLE);
        }

        if(v.getId() == R.id.searchtbutton)
        {
            int users_input = current_index;
            try {
                users_input = Integer.parseInt(search_index.getText().toString());
                search_index.setText("");
            }
            catch (Exception e)
            {
                Toast.makeText(getActivity(),"Please enter question number between 1 - "+current_row_questions.length,Toast.LENGTH_SHORT).show();
            }
            if(users_input < 1 || users_input > current_row_questions.length)
            {
                Toast.makeText(getActivity(),"Please enter question number between 1 - "+current_row_questions.length,Toast.LENGTH_SHORT).show();
                search_index.setText("");
            }
            else
            {
                search_index.setText("");

                current_index = users_input;
                frag_practice_question_textview.setText(current_row_questions[current_index - 1]);  //setquestion
                frag_practice_solution_textview.setText(current_row_solutions[current_index - 1]);  //setsolution
                frag_practice_solution_textview.setVisibility(View.INVISIBLE);


                //Update the options
                radio_button_a.setText("A.   "+qst_options[(current_index - 1)][0]);
                radio_button_b.setText("B.   "+qst_options[(current_index - 1)][1]);
                radio_button_c.setText("C.   "+qst_options[(current_index - 1)][2]);
                radio_button_d.setText("D.   "+qst_options[(current_index - 1)][3]);
                options_radio_group.clearCheck();

                String indexText = String.format(" %d of %d ",current_index,current_row_questions.length);  //set index
                frag_practice_index_textview.setText(indexText);


                //hide keyboard
                View view = getActivity().getCurrentFocus();
                if(view != null) {
                    InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(view.getWindowToken(),0);
                }

            }





        }

        if(v.getId() == R.id.nextbutton)
        {
            options_radio_group.clearCheck();
            current_index++;
            frag_practice_solution_textview.setVisibility(View.INVISIBLE);

            if(current_index > (current_row_questions.length))
            {
                current_index = 1; //reset cursor to the beginning
            }


            frag_practice_question_textview.setText(current_row_questions[current_index - 1]);  //setquestion
            frag_practice_solution_textview.setText(current_row_solutions[current_index - 1]);  //setsolution

            //Update the options
            radio_button_a.setText("A.   "+qst_options[(current_index - 1)][0]);
            radio_button_b.setText("B.   "+qst_options[(current_index - 1)][1]);
            radio_button_c.setText("C.   "+qst_options[(current_index - 1)][2]);
            radio_button_d.setText("D.   "+qst_options[(current_index - 1)][3]);

            String indexText = String.format(" %d of %d ",current_index,current_row_questions.length);  //set index
            frag_practice_index_textview.setText(indexText);

        }

        if(v.getId() == R.id.previousbutton)
        {
            options_radio_group.clearCheck();
            current_index--;
            frag_practice_solution_textview.setVisibility(View.INVISIBLE);

            if(current_index == 0 )
            {
                current_index = current_row_questions.length; //reset cursor to the beginning
            }


            frag_practice_question_textview.setText(current_row_questions[current_index - 1]);  //setquestion
            frag_practice_solution_textview.setText(current_row_solutions[current_index - 1]);  //setsolution


            //Update the options
            radio_button_a.setText("A.   "+qst_options[(current_index - 1)][0]);
            radio_button_b.setText("B.   "+qst_options[(current_index - 1)][1]);
            radio_button_c.setText("C.   "+qst_options[(current_index - 1)][2]);
            radio_button_d.setText("D.   "+qst_options[(current_index - 1)][3]);

            String indexText = String.format("Qst : %d of %d ",current_index,current_row_questions.length);  //set index
            frag_practice_index_textview.setText(indexText);

        }



        //listen to option radio group

        if(v.getId() == R.id.radio_button_a)
        {
            String qst_ans = qst_options[(current_index-1)][4];
            //check if ans is equal to this option....rmbr ans is an array and starts from 0
            if(qst_ans.equals("A"))
            {
                wrong_toast.cancel();
                correct_toast.show();
            }
            else
            {
                correct_toast.cancel();
                wrong_toast.show();
            }

        }

        if(v.getId() == R.id.radio_button_b)
        {
            String qst_ans = qst_options[(current_index-1)][4];
            //check if ans is equal to this option....rmbr ans is an array and starts from 0
            if(qst_ans.equals("B"))
            {
                wrong_toast.cancel();
                correct_toast.show();

            }
            else
            {
                correct_toast.cancel();
                wrong_toast.show();
            }

        }

        if(v.getId() == R.id.radio_button_c)
        {
            String qst_ans = qst_options[(current_index-1)][4];
            //check if ans is equal to this option....rmbr ans is an array and starts from 0
            if(qst_ans.equals("C"))
            {
                wrong_toast.cancel();
                correct_toast.show();
            }
            else
            {
                correct_toast.cancel();
                wrong_toast.show();
            }

        }

        if(v.getId() == R.id.radio_button_d)
        {
            String qst_ans = qst_options[(current_index-1)][4];
            //check if ans is equal to this option....rmbr ans is an array and starts from 0
            if(qst_ans.equals("D"))
            {
                wrong_toast.cancel();
                correct_toast.show();
            }
            else
            {
                correct_toast.cancel();
                wrong_toast.show();
            }

        }

    }

    @Override
    public void onDetach() {
        super.onDetach();
        getActivity().setTitle("     Java MCQs");
    }
}
