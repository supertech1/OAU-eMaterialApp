package com.example.supertech.csc201real;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.TabHost;

public class examsection extends AppCompatActivity implements ViewPager.OnPageChangeListener, TabHost.OnTabChangeListener {

    TabLayout tabLayout;
    ViewPager viewPager;
    ViewPagerAdapter viewPagerAdapter;
    TabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_examsection);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        //tabLayout = (TabLayout)findViewById(R.id.examsectiontablayout);
        viewPager = (ViewPager)findViewById(R.id.examsectionviewpager);

        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());

        viewPagerAdapter.addFragments(new Examsectiona());
        viewPagerAdapter.addFragments(new Examsectionb());
        viewPager.setAdapter(viewPagerAdapter);
        viewPager.addOnPageChangeListener(this);
        //tabLayout.setupWithViewPager(viewPager);

        initTabHost();


        //get extras so as to set fragments list data

        Bundle bundle = getIntent().getExtras();
        String title = bundle.getString("title");
        this.setTitle(title);

        String[] sa_qst_nos = bundle.getStringArray("sa_qst_nos");
        String[] section_a_content = bundle.getStringArray("section_a_content");
        String[] section_a_solution = bundle.getStringArray("section_a_solution");

        Examsectiona esa = new Examsectiona();
        esa.set_qst_nos(sa_qst_nos);
        esa.set_Section_A_Content(section_a_content);
        esa.set_Section_A_Solution(section_a_solution);



        String[] sb_qst_nos = bundle.getStringArray("sb_qst_nos");
        String[] section_b_content = bundle.getStringArray("section_b_content");
        String[] section_b_solution = bundle.getStringArray("section_b_solution");

        Examsectionb esb = new Examsectionb();
        esb.set_qst_nos(sb_qst_nos);
        esb.set_Section_B_Content(section_b_content);
        esb.set_Section_B_Solution(section_b_solution);





    }

    public void initTabHost()
    {
        tabHost = (TabHost)findViewById(R.id.examsectiontabhost);
        tabHost.setup();
        String[] tabnames = {"Section A", "Section B"}; //, "Section B"

        for(int i = 0; i<tabnames.length; i++)
        {
            TabHost.TabSpec tabspec;
            tabspec = tabHost.newTabSpec(tabnames[i]);
            tabspec.setIndicator(tabnames[i]);
            tabspec.setContent(new FakeContent(getApplicationContext()));
            tabHost.addTab(tabspec);
        }

        tabHost.setOnTabChangedListener(this);

    }

    //Tabhost Listener
    @Override
    public void onTabChanged(String tabId) {

        int selectedItem = tabHost.getCurrentTab();
        viewPager.setCurrentItem(selectedItem);

        HorizontalScrollView hscrollview = (HorizontalScrollView)findViewById(R.id.h_scroll_view);
        View tabView = tabHost.getCurrentTabView();
        int scrollpos = tabView.getLeft() - (hscrollview.getWidth() - tabView.getWidth()) / 2;
        hscrollview.smoothScrollTo(scrollpos,0);
    }

    //ViewPager Listener
    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int selectedItem) {

        tabHost.setCurrentTab(selectedItem);

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }



    private class FakeContent implements TabHost.TabContentFactory
    {
        Context context;
        public FakeContent(Context context) {
            this.context = context;
        }

        @Override
        public View createTabContent(String tag) {

            View view = new View(context);
            view.setMinimumHeight(0);
            view.setMinimumWidth(0);

            return view;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater inflate = getMenuInflater();

        inflate.inflate(R.menu.menumenu,menu);
            //hide tutorial one from menu bar
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
    /*
    public  Context getContext()
    {
        return getApplicationContext();
    }*/

}
