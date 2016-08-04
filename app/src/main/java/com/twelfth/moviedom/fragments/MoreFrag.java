package com.twelfth.moviedom.fragments;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.twelfth.moviedom.adapter.MoreFragAdapter;
import com.twelfth.moviedom.bean.MoreBean;
import com.twelfth.moviedom.constant.ConstantValue;



/**
 * Created by zhou on 2016/8/3.
 */
public class MoreFrag extends BaseFragment
{
    @Override
    public RecyclerView.LayoutManager setRVLayout() {
        return new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
    }

    @Override
    public RecyclerView.Adapter setRVAdapter(Object data) {
        MoreBean moreData = (MoreBean) data;


        return new MoreFragAdapter(moreData);
    }

    @Override
    public String setUrl() {
        return "http://www.pgc.tv/v2/getcategorylist";
    }

    @Override
    public String setClass() {
        return ConstantValue.MOREBEAN;
    }

}
