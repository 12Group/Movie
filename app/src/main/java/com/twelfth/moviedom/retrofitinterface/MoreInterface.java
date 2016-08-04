package com.twelfth.moviedom.retrofitinterface;

import com.twelfth.moviedom.bean.MoreBean;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by zhou on 2016/8/4.
 */
public interface MoreInterface extends BaseInterface<MoreBean> {

    @GET(value = "getcategorylist")
    public Call<MoreBean> getData();

}
