package com.twelfth.moviedom.retrofitinterface;

import com.twelfth.moviedom.bean.HomeBean;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by zhou on 2016/8/3.
 */
public interface HomeInterface extends BaseInterface<HomeBean>{
    //value接收网络请求地址的相对路径
    @GET(value = "getdailyList")
    public Call<HomeBean> getData();
}
