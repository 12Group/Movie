package com.twelfth.moviedom;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.twelfth.moviedom.adapter.MainVPAdapter;
import com.twelfth.moviedom.fragments.HomeFrag;
import com.twelfth.moviedom.fragments.MoreFrag;
import com.twelfth.moviedom.fragments.OldFrag;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private ArrayList<Fragment> framents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();


    }

    private void initUI() {
        mToolbar = (Toolbar) findViewById(R.id.tb_main);
        mTabLayout = (TabLayout) findViewById(R.id.tbl_main);
        mViewPager = (ViewPager) findViewById(R.id.vp_main);

        //初始化Toolbar


        //初始化TabLayout



        //设置ViewPager

        framents = new ArrayList<>();

        framents.add(new HomeFrag());
        framents.add(new MoreFrag());
        framents.add(new OldFrag());

        MainVPAdapter mAdapter = new MainVPAdapter(getSupportFragmentManager(), framents);

        mViewPager.setAdapter(mAdapter);
        mTabLayout.setupWithViewPager(mViewPager);
        mTabLayout.setTabMode(TabLayout.MODE_FIXED);


    }
}
