package com.example.supertech.csc201real;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class AllMenuListen extends AppCompatActivity {

    public void allMenuListen(MenuItem item, Context context)
    {

        Intent intent = new Intent();

        if(item.getItemId() == R.id.menututorialone)
        {
            intent = new Intent(context,TutorialOne.class);
            context.startActivity(intent);

        }
        if(item.getItemId() == R.id.menututorialtwo)
        {
            intent = new Intent(context,TutorialThree.class);
            context.startActivity(intent);
            finish();
        }

        if(item.getItemId() == R.id.menumcqs)
        {
            intent = new Intent(context,Practice.class);
            context.startActivity(intent);
            finish();
        }
        if(item.getItemId() == R.id.menupq)
        {
            intent = new Intent(context,PastQuestion.class);
            context.startActivity(intent);
            finish();
        }
        if(item.getItemId() == R.id.menupt)
        {
            intent = new Intent(context,MBT_Hompage.class);
            context.startActivity(intent);
            finish();
        }
        if(item.getItemId() == R.id.about)
        {
            intent = new Intent(context,About.class);
            context.startActivity(intent);
        }



    }

}
