package com.example.supertech.csc201real;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class PQSolutionList extends AppCompatActivity implements AdapterView.OnItemClickListener{

    GridView pqsolutionlistgridview ;
    Intent intent = new Intent();
    HomePage mainActivity = new HomePage(); //to get reference to TestFileRead method MainActivity class
    String [] y2014tq, y2014ts;
    String title;
    String[] qsts_no;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pqsolutionlist);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Bundle bundle = getIntent().getExtras();
        int size = bundle.getInt("num_of_qsts",0);
        title = bundle.getString("title");
        this.setTitle(title);

        qsts_no = new String[size];
        qsts_no = contentArray(size);

        pqsolutionlistgridview = (GridView)findViewById(R.id.pqsolutionlistgridview);
        ArrayAdapter<String> aa = new ArrayAdapter<String>(this, R.layout.simple_list_item_1,qsts_no);
        pqsolutionlistgridview.setAdapter(aa);

        pqsolutionlistgridview.setOnItemClickListener(this);
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
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


        String selected = pqsolutionlistgridview.getItemAtPosition(position).toString();
        Bundle bundle = getIntent().getExtras();

        //String content ="";
        intent = new Intent(this,PQSolutions.class);

        intent.putExtra("num_of_qsts",10);
        intent.putExtra("exam_mode","test");
        intent.putExtra("year", "2014");
        intent.putExtra("title",bundle.getString("title"));
        displayContentForCell(selected,intent);


    }


    public void displayContentForCell(String cellNum, Intent intent)
    {
        //get qsts for 2014 test in an array....NB: index 0 is an empty string
        String [] y2014tq = {"",mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t1q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t2q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t3q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t4q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t5q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t6q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t7q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t8q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t9q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t10q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t11q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t12q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t13q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t14q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t15q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t16q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t17q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t18q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t19q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t20q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t21q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t22q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t23q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t24q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t25q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t26q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t27q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t28q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t29q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t30q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t31q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t32q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t33q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t34q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t35q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t36q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t37q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t38q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t39q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t40q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t41q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t42q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t43q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t44q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t45q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t46q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t47q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t48q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t49q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t50q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t51q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t52q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t53q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t54q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t55q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t56q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t57q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t58q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t59q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t60q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t61q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t62q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t63q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t64q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t65q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t66q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t67q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t68q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t69q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t70q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t71q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t72s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t73q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t74q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t75q))};

        //get solutions to each qst
        String [] y2014ts= {"",mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t1s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t2s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t3s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t4s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t5s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t6s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t7s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t8s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t9s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t10s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t11s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t12s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t13s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t14s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t15s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t16s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t17s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t18s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t19s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t20s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t21s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t22s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t23s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t24s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t25s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t26s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t27s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t28s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t29s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t30s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t31s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t32s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t33s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t34s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t35s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t36s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t37s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t38s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t39s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t40s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t41s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t42s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t43s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t44s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t45s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t46s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t47s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t48s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t49s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t50s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t51s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t52s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t53s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t54s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t55s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t56s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t57s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t58s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t59s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t60s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t61s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t62s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t63s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t64s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t65s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t66s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t67s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t68s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t69s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t70s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t71s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t72s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t73s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t74s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2014t75s))};


        String [] y2015tq = {"",mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t1q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t2q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t3q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t4q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t5q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t6q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t7q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t8q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t9q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t10q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t11q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t12q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t13q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t14q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t15q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t16q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t17q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t18q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t19q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t20q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t21q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t22q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t23q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t24q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t25q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t26q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t27q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t28q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t29q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t30q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t31q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t32q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t33q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t34q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t35q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t36q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t37q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t38q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t39q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t40q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t41q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t42q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t43q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t44q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t45q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t46q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t47q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t48q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t49q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t50q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t51q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t52q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t53q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t54q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t55q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t56q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t57q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t58q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t59q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t60q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t61q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t62q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t63q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t64q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t65q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t66q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t67q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t68q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t69q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t70q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t71q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t72s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t73q)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t74q)),
                mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t75q)),
                mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t76q)),
                mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t77q)),
                mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t78q)),
                mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t79q)),
                mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t80q)),
                mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t81q)),
                mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t82q)),
                mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t83q)),
                mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t84q)),
                mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t85q)),
                mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t86q)),
                mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t87q)),
                mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t88q)),
                mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t89q)),
                mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t90q))
        };

        String [] y2015ts= {"",mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t1s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t2s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t3s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t4s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t5s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t6s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t7s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t8s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t9s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t10s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t11s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t12s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t13s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t14s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t15s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t16s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t17s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t18s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t19s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t20s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t21s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t22s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t23s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t24s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t25s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t26s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t27s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t28s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t29s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t30s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t31s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t32s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t33s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t34s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t35s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t36s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t37s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t38s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t39s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t40s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t41s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t42s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t43s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t44s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t45s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t46s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t47s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t48s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t49s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t50s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t51s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t52s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t53s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t54s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t55s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t56s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t57s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t58s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t59s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t60s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t61s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t62s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t63s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t64s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t65s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t66s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t67s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t68s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t69s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t70s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t71s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t72s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t73s)),mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t74s)),
                mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t75s)),
                mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t76s)),
                mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t77s)),
                mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t78s)),
                mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t79s)),
                mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t80s)),
                mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t81s)),
                mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t82s)),
                mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t83s)),
                mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t84s)),
                mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t85s)),
                mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t86s)),
                mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t87s)),
                mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t88s)),
                mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t89s)),
                mainActivity.TestFileRead(getResources().openRawResource(R.raw.y2015t90s))
        };







        Bundle bundle = getIntent().getExtras();
        String index = bundle.getString("index");

        if(index.equals("y2014t"))
        {
            int cellnum = Integer.parseInt(cellNum);
            String testqst = y2014tq[cellnum];
            String testsolution = y2014ts[cellnum];
            intent.putExtra("testqst",testqst);
            intent.putExtra("qst_nos",qsts_no);
            intent.putExtra("testsolution", testsolution);
            intent.putExtra("title",title);
            intent.putExtra("position_from_grid",cellnum);
            intent.putExtra("yeartestqst", y2014tq);
            intent.putExtra("yeartestsolution", y2014ts);
            this.startActivity(intent);
        }
        else if(index.equals("y2015t"))
        {
            int cellnum = Integer.parseInt(cellNum);
            String testqst = y2015tq[cellnum];
            String testsolution = y2015ts[cellnum];
            intent.putExtra("testqst",testqst);
            intent.putExtra("qst_nos",qsts_no);
            intent.putExtra("testsolution", testsolution);
            intent.putExtra("title",title);
            intent.putExtra("position_from_grid",cellnum);
            intent.putExtra("yeartestqst", y2015tq);
            intent.putExtra("yeartestsolution", y2015ts);
            this.startActivity(intent);
        }
        /*
        if(index.equals("y2014e"))
        {
            int cellnum = Integer.parseInt(cellNum);
            String examqst = y2014eq[cellnum];
            String examsolution = y2014es[cellnum];
            intent.putExtra("title",title);
            intent.putExtra("testqst",examqst);
            intent.putExtra("testsolution", examsolution);
            intent.putExtra("position_from_grid",cellnum);
            intent.putExtra("yeartestqst", y2014eq);   //using the same format as test seesion
            intent.putExtra("yeartestsolution", y2014es);
            this.startActivity(intent);
        }
        */

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
