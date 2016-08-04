package com.twelfth.moviedom.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.twelfth.moviedom.R;
import com.twelfth.moviedom.bean.HomeBean;


/**
 * Created by zhou on 2016/8/3.
 */
public class HomeFragAdapter extends RecyclerView.Adapter<HomeFragAdapter.HomeFragViewHolder> {
   private HomeBean data;

    public HomeFragAdapter(HomeBean data) {
        this.data = data;

    }

    @Override
    public HomeFragViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(parent.getContext(), R.layout.home_page, null);

        return new HomeFragViewHolder(view);
    }

    @Override
    public void onBindViewHolder(HomeFragViewHolder holder, int position) {
    holder.iv.setImageResource(R.mipmap.ic_launcher);
        holder.tv.setText("aaaaa");
    }

    @Override
    public int getItemCount() {
        return 20;
    }

    class HomeFragViewHolder extends RecyclerView.ViewHolder{

        private  ImageView iv;
        private  TextView tv;

        public HomeFragViewHolder(View itemView) {
            super(itemView);
             iv =  (ImageView) itemView.findViewById(R.id.iv_home);
             tv =  (TextView) itemView.findViewById(R.id.tv_home);

        }
    }
}
