package com.example.cyrenians.cyreniansprototype;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Alex on 2/3/2018.
 */

public class RecyclerView_Adapter extends  RecyclerView.Adapter<DemoViewHolder>  {
    private ArrayList<Product> arrayList;
    private Context context;


    public RecyclerView_Adapter(Context context, ArrayList<Product> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }


    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    @Override
    public void onBindViewHolder(DemoViewHolder holder, int position) {
        Product product = arrayList.get(position);

        holder.title.setText(product.getProduct());
        holder.description.setText(product.getDesc());
        holder.imageView.setImageResource(product.getImage());

    }

    @Override
    public DemoViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        LayoutInflater mInflater = LayoutInflater.from(viewGroup.getContext());
        ViewGroup mainGroup = (ViewGroup) mInflater.inflate(
                R.layout.item_row, viewGroup, false);
        DemoViewHolder mainHolder = new DemoViewHolder(mainGroup) {
            @Override
            public String toString() {
                return super.toString();
            }
        };
        return mainHolder;
    }
}
