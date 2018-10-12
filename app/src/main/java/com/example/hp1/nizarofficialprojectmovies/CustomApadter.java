package com.example.hp1.nizarofficialprojectmovies;


import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CustomApadter extends ArrayAdapter<Movies> {

    private int resourselayout;
    private Context ncontext;

    public CustomApadter( @NonNull Context context, int resource, @NonNull List<Movies> objects) {
        super(context, resource, objects);
        this.resourselayout = resource;
        this.ncontext = context;
    }
    public View getView(int position, View ConvertView, ViewGroup parent){

            View v = ConvertView;
            if(v == null)
                v = LayoutInflater.from(ncontext).inflate(resourselayout,parent,false);

            Movies p = getItem(position);

            if (p!=null){
                TextView  tvTitle = (TextView) v.findViewById(R.id.tvTitle);
                tvTitle.setText(p.getName());

                ImageView imageView = (ImageView)v.findViewById(R.id.imageView);
                imageView.setImageResource(p.getImage());

            }
            return v;
    }
}
