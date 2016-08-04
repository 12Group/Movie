package com.twelfth.moviedom.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by zhou on 2016/8/3.
 */
public class MainVPAdapter extends FragmentPagerAdapter {
    ArrayList<Fragment> framents;
    String[] titles = new String[]{"最近更新","发现更多","往期排行"};

    public MainVPAdapter(FragmentManager fm, ArrayList<Fragment> framents) {
        super(fm);
        this.framents = framents;
    }

    @Override
    public Fragment getItem(int position) {
        return framents.get(position);
    }

    @Override
    public int getCount() {
        return framents.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}
