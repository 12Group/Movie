package com.twelfth.moviedom.fragments;

import android.support.v7.widget.RecyclerView;

import com.twelfth.moviedom.adapter.HomeFragAdapter;
import com.twelfth.moviedom.bean.HomeBean;
import com.twelfth.moviedom.constant.ConstantValue;



/**
 * Created by zhou on 2016/8/3.
 */
public class HomeFrag extends BaseFragment {
    @Override
    public RecyclerView.Adapter setRVAdapter(Object data) {
       HomeBean homeData = (HomeBean) data;

        return new HomeFragAdapter(homeData);
    }

    @Override
    public String setUrl() {
        return "http://www.pgc.tv/v2/getdailyList";
    }

    @Override
    public String setClass() {
        return ConstantValue.HOMEBEAN;
    }

}
