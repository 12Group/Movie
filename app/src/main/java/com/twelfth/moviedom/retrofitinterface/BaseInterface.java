package com.twelfth.moviedom.retrofitinterface;

import retrofit2.Call;

/**
 * Created by zhou on 2016/8/3.
 */
public interface BaseInterface <T> {

    public Call<T> getData();
}
