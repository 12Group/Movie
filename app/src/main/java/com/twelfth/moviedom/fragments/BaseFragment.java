package com.twelfth.moviedom.fragments;


import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.twelfth.moviedom.R;
import com.twelfth.moviedom.parser.Parser;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;


/**
 * A simple {@link Fragment} subclass.
 */
public abstract class BaseFragment extends Fragment {

    public static final int BASEDATA = 100;
    public static final int MOREDATA = 200;
    public RecyclerView mRecyclerView;
    private OkHttpClient client;
    public Object data;
    private ImageView ivLoading;
    private AnimationDrawable drawable;

    public BaseFragment() {
        // Required empty public constructor
    }
    public Handler mHandle  = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what){
                case BASEDATA:
                mRecyclerView.setAdapter(setRVAdapter(data));
                    ivLoading.setVisibility(View.GONE);
                    mRecyclerView.setVisibility(View.VISIBLE);
                drawable.stop();
                    break;
                case MOREDATA:


                    break;
            }


        }
    };


    //网络请求数据封装
    public void  loadDta(){

        Request request = new Request.Builder().url(setUrl()).build();
        client.newCall(request).enqueue(new okhttp3.Callback() {
            @Override
            public void onFailure(okhttp3.Call call, IOException e) {

            }

            @Override
            public void onResponse(okhttp3.Call call, okhttp3.Response response) throws IOException {
                String json = response.body().string();

                if(json!=null){
                    data = Parser.parserJson(json,setClass());
                    mHandle.sendEmptyMessage(BASEDATA);
                }



            }
        });


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_base, container, false);
        ivLoading = (ImageView) view.findViewById(R.id.iv_loading);

        drawable = (AnimationDrawable) ivLoading.getBackground();
        drawable.start();

        mRecyclerView = (RecyclerView) view.findViewById(R.id.rv_frag);
        mRecyclerView.setLayoutManager(setRVLayout());
        client = new OkHttpClient();

       loadDta();


        return view;
    }

    public  RecyclerView.LayoutManager setRVLayout(){

        return new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false);

    }
    public abstract RecyclerView.Adapter setRVAdapter(Object data);
    public abstract String setUrl();
    public abstract String setClass();

}
