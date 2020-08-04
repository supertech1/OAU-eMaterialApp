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
import android.widget.Button;

public class PastQuestion extends AppCompatActivity  implements View.OnClickListener {

    Button y2014tbtn,y2014ebtn,y2015tbtn,y2015ebtn ;
    Intent intent = new Intent();
    HomePage mainActivity = new HomePage();
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_past_question);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        this.setTitle("Past Questions");

        y2014tbtn = (Button)findViewById(R.id.y2014t_btn);
        y2014tbtn.setOnClickListener(this);


        y2014ebtn = (Button)findViewById(R.id.y2014e_btn);
        y2014ebtn.setOnClickListener(this);


        y2015tbtn = (Button)findViewById(R.id.y2015t_btn);
        y2015tbtn.setOnClickListener(this);

        y2015ebtn = (Button)findViewById(R.id.y2015e_btn);
        y2015ebtn.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.y2014t_btn)
        {
            intent = new Intent(PastQuestion.this,PQSolutionList.class);
            intent.putExtra("num_of_qsts", 75);
            intent.putExtra("index","y2014t");
            intent.putExtra("title", "2014/15 Test(Type 3)");
            startActivity(intent);
        }
        else if(v.getId() == R.id.y2014e_btn)
        {
            //intent = new Intent(PastQuestion.this,PQSolutionList.class);

            intent = new Intent(PastQuestion.this,examsection.class);
            intent.putExtra("title", "2014/15 Exam(Type 2)");
            intent.putExtra("index","y2014e");

            //send sectiona data
            String[] sa_qst_nos = new String[50];  //send section a qst_nums to fragment....sa-section a
            sa_qst_nos = contentArray(sa_qst_nos.length);
            intent.putExtra("sa_qst_nos",sa_qst_nos);

            String [] section_a_content = {"",mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e1q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e2q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e3q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e4q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e5q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e6q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e7q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e8q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e9q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e10q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e11q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e12q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e13q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e14q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e15q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e16q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e17q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e18q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e19q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e20q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e21q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e22q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e23q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e24q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e25q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e26q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e27q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e28q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e29q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e30q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e31q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e32q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e33q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e34q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e35q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e36q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e37q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e38q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e39q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e40q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e41q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e42q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e43q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e44q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e45q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e46q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e47q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e48q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e49q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e50q))


            };


            intent.putExtra("section_a_content",section_a_content);

            String [] section_a_solution = {"",mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e1s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e2s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e3s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e4s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e5s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e6s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e7s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e8s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e9s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e10s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e11s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e12s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e13s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e14s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e15s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e16s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e17s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e18s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e19s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e20s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e21s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e22s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e23s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e24s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e25s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e26s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e27s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e28s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e29s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e30s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e31s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e32s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e33s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e34s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e35s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e36s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e37s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e38s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e39s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e40s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e41s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e42s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e43s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e44s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e45s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e46s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e47s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e48s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e49s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014e50s))


            };

            intent.putExtra("section_a_solution",section_a_solution);


            //send sectionb data

            String[] sb_qst_nos = {"Qst 1a.","Qst 1b.","Qst 1c.","Qst 2a.","Qst 2b.","Qst 2c.","Qst 3a.","Qst 3b.","Qst 3c."};  //send section b qst_nums to fragment....sa-section a
            intent.putExtra("sb_qst_nos",sb_qst_nos);

            String [] section_b_content = {"",mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014secb1aq)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014secb1bq)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014secb1cq)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014secb2aq)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014secb2bq)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014secb2cq)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014secb3aq)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014secb3bq)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014secb3cq)),


            };

            intent.putExtra("section_b_content",section_b_content);



            String [] section_b_solution = {"",mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014secb1as)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014secb1bs)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014secb1cs)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014secb2as)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014secb2bs)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014secb2cs)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014secb3as)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014secb3bs)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014secb3cs)),


            };


            intent.putExtra("section_b_solution",section_b_solution);

            startActivity(intent);
        }
        else if (v.getId() == R.id.y2015t_btn)
        {
            intent = new Intent(PastQuestion.this,PQSolutionList.class);
            intent.putExtra("num_of_qsts", 90);
            intent.putExtra("index","y2015t");
            intent.putExtra("title", "2015/16 Test(Type 1)");
            startActivity(intent);
        }
        else if(v.getId() == R.id.y2015e_btn)
        {
            //intent = new Intent(PastQuestion.this,PQSolutionList.class);

            intent = new Intent(PastQuestion.this,examsection.class);
            intent.putExtra("title", "2015/16 Exam(Type 1)");
            intent.putExtra("index","y2015e");

            //send sectiona data
            String[] sa_qst_nos = new String[125];  //send section a qst_nums to fragment....sa-section a
            sa_qst_nos = contentArray(sa_qst_nos.length);
            intent.putExtra("sa_qst_nos",sa_qst_nos);

            String [] section_a_content = {"",mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e1q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e2q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e3q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e4q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e5q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e6q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e7q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e8q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e9q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e10q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e11q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e12q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e13q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e14q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e15q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e16q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e17q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e18q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e19q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e20q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e21q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e22q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e23q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e24q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e25q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e26q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e27q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e28q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e29q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e30q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e31q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e32q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e33q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e34q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e35q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e36q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e37q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e38q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e39q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e40q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e41q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e42q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e43q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e44q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e45q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e46q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e47q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e48q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e49q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e50q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e51q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e52q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e53q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e54q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e55q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e56q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e57q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e58q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e59q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e60q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e61q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e62q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e63q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e64q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e65q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e66q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e67q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e68q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e69q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e70q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e71q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e72q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e73q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e74q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e75q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e76q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e77q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e78q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e79q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e80q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e81q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e82q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e83q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e84q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e85q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e86q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e87q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e88q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e89q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e90q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e91q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e92q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e93q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e94q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e95q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e96q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e97q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e98q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e99q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e100q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e101q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e102q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e103q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e104q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e105q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e106q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e107q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e108q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e109q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e110q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e111q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e112q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e113q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e114q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e115q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e116q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e117q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e118q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e119q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e120q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e121q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e122q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e123q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e124q)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e125q)),


            };


            intent.putExtra("section_a_content",section_a_content);

            String [] section_a_solution = {"",mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e1s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e2s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e3s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e4s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e5s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e6s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e7s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e8s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e9s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e10s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e11s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e12s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e13s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e14s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e15s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e16s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e17s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e18s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e19s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e20s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e21s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e22s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e23s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e24s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e25s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e26s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e27s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e28s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e29s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e30s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e31s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e32s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e33s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e34s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e35s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e36s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e37s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e38s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e39s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e40s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e41s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e42s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e43s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e44s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e45s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e46s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e47s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e48s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e49s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e50s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e51s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e52s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e53s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e54s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e55s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e56s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e57s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e58s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e59s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e60s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e61s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e62s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e63s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e64s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e65s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e66s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e67s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e68s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e69s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e70s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e71s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e72s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e73s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e74s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e75s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e76s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e77s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e78s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e79s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e80s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e81s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e82s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e83s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e84s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e85s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e86s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e87s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e88s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e89s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e90s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e91s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e92s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e93s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e94s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e95s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e96s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e97s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e9s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e99s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e100s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e101s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e102s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e103s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e104s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e105s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e106s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e107s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e108s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e109s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e110s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e111s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e112s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e113s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e114s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e115s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e116s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e117s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e118s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e119s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e120s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e121s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e122s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e123s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e124s)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015e125s)),


            };

            intent.putExtra("section_a_solution",section_a_solution);


            //send sectionb data

            String[] sb_qst_nos = {"Qst 1a.","Qst 1b.","Qst 2a.","Qst 2b.","Qst 2c."};  //send section b qst_nums to fragment....sa-section a
            intent.putExtra("sb_qst_nos",sb_qst_nos);

            String [] section_b_content = {"",mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015secb1aq)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015secb1bq)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015secb2aq)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015secb2bq)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015secb2cq))

            };

            intent.putExtra("section_b_content",section_b_content);



            String [] section_b_solution = {"",mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015secb1as)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015secb1bs)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015secb2as)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015secb2bs)),
                    mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015secb2cs))

            };


            intent.putExtra("section_b_solution",section_b_solution);

            startActivity(intent);
        }
    }

    public String[] contentArray(int size)
    {
        String[] content = new String[size];

        for(int counter = 0; counter < size; counter++)
        {
            content[counter] = ""+(counter + 1);
        }
        return content;
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
        AllMenuListen allMenuListen = new AllMenuListen(); //get a reference to homepage so as to access the utility method there
        allMenuListen.allMenuListen(item,this);
        if(item.getItemId() != R.id.about)
        {
            finish();
        }
        return true;
    }

}
