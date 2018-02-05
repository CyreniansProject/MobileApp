package com.example.cyrenians.cyreniansprototype;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Alex on 2/3/2018.
 */

public class DemoViewHolder extends RecyclerView.ViewHolder {
    TextView title,description;
    ImageView imageView;


    public DemoViewHolder(View view) {
        super(view);


        title = (TextView) view.findViewById(R.id.productTitle);
        description =(TextView) view.findViewById(R.id.productDesc);
        imageView = (ImageView) view.findViewById(R.id.product);


    }
}
