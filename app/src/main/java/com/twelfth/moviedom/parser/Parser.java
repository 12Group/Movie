package com.twelfth.moviedom.parser;

import com.google.gson.Gson;
import com.twelfth.moviedom.bean.HomeBean;
import com.twelfth.moviedom.bean.MoreBean;
import com.twelfth.moviedom.constant.ConstantValue;

/**
 * Created by zhou on 2016/8/4.
 */
public class Parser {
    public static Object parserJson(String json,String type){

        Object obj =null;
        Gson gson = new Gson();
        switch (type){
        case ConstantValue.HOMEBEAN:
        obj=gson.fromJson(json, HomeBean.class);


            break;
        case ConstantValue.MOREBEAN:
            obj= gson.fromJson(json,MoreBean.class);
            break;
    }



        return obj;
    }

}
