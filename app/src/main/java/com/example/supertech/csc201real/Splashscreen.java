package com.example.supertech.csc201real;

/**
 * Created by Supertech on 2016/06/30.
 */
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.PixelFormat;
import android.os.Bundle;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;


public class Splashscreen extends Activity {
    Intent intent = new Intent();
    SharedPreferences pref;

    HomePage homePage = new HomePage();

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        window.setFormat(PixelFormat.RGBA_8888);
    }
    /** Called when the activity is first created. */
    Thread splashTread;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        StartAnimations();
    }
    private void StartAnimations() {
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.alpha);
        anim.reset();
        LinearLayout l=(LinearLayout) findViewById(R.id.lin_lay);
        l.clearAnimation();
        l.startAnimation(anim);

        anim = AnimationUtils.loadAnimation(this, R.anim.translate);
        anim.reset();
        ImageView iv = (ImageView) findViewById(R.id.splash);
        iv.clearAnimation();
        iv.startAnimation(anim);

        splashTread = new Thread() {
            @Override
            public void run() {
                try {
                    int waited = 0;
                    // Splash screen pause time
                    while (waited < 3500) {
                        sleep(100);
                        waited += 100;
                    }
                    //Intent intent = new Intent(Splashscreen.this,
                         //   LogIntoApp.class);
                    pref = getApplicationContext().getSharedPreferences("pref_file",MODE_PRIVATE);
                    String passcoded = pref.getString("undomepata","");
                    if(passcoded.equals("jollofattic"))
                    {
                        startHomePage();
                        finish();
                    }
                    else
                    {
                        startLogIntoApp();
                        finish();
                    }

                   // intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                   // startActivity(intent);
                    //Splashscreen.this.finish();
                } catch (InterruptedException e) {
                    // do nothing
                } finally {
                    Splashscreen.this.finish();
                }

            }
        };
        splashTread.start();

    }

    public void startLogIntoApp()
    {
        intent = new Intent(Splashscreen.this, LogIntoApp.class);
        String courseoutline = homePage.TestFileRead(getResources().openRawResource(R.raw.courseoutline));
        String introduction = homePage.TestFileRead(getResources().openRawResource(R.raw.introduction));
        String variable = homePage.TestFileRead(getResources().openRawResource(R.raw.variable));
        String selection = homePage.TestFileRead(getResources().openRawResource(R.raw.selection));
        String array = homePage.TestFileRead(getResources().openRawResource(R.raw.array));
        String repetition = homePage.TestFileRead(getResources().openRawResource(R.raw.repetition));
        String classes = homePage.TestFileRead(getResources().openRawResource(R.raw.classes));
        String inputoutput = homePage.TestFileRead(getResources().openRawResource(R.raw.inputoutput));
        String exception = homePage.TestFileRead(getResources().openRawResource(R.raw.exception));

        intent.putExtra("courseoutline",courseoutline);
        intent.putExtra("introduction", introduction);
        intent.putExtra("variable", variable);
        intent.putExtra("selection",selection);
        intent.putExtra("array",array);
        intent.putExtra("repetition",repetition);
        intent.putExtra("classes", classes);
        intent.putExtra("inputoutput",inputoutput);
        intent.putExtra("exception",exception);


        this.startActivity(intent);
    }

    public void startHomePage()
    {
        intent = new Intent(Splashscreen.this, HomePage.class);

        String courseoutline = homePage.TestFileRead(getResources().openRawResource(R.raw.courseoutline));
        String introduction = homePage.TestFileRead(getResources().openRawResource(R.raw.introduction));
        String variable = homePage.TestFileRead(getResources().openRawResource(R.raw.variable));
        String selection = homePage.TestFileRead(getResources().openRawResource(R.raw.selection));
        String array = homePage.TestFileRead(getResources().openRawResource(R.raw.array));
        String repetition = homePage.TestFileRead(getResources().openRawResource(R.raw.repetition));
        String classes = homePage.TestFileRead(getResources().openRawResource(R.raw.classes));
        String inputoutput = homePage.TestFileRead(getResources().openRawResource(R.raw.inputoutput));
        String exception = homePage.TestFileRead(getResources().openRawResource(R.raw.exception));

        intent.putExtra("courseoutline",courseoutline);
        intent.putExtra("introduction", introduction);
        intent.putExtra("variable", variable);
        intent.putExtra("selection",selection);
        intent.putExtra("array",array);
        intent.putExtra("repetition",repetition);
        intent.putExtra("classes", classes);
        intent.putExtra("inputoutput",inputoutput);
        intent.putExtra("exception",exception);

        this.startActivity(intent);
    }
}