package com.example.cyrenians.cyreniansprototype;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by Alex on 2/3/2018.
 */

public class DummyFragment2 extends android.support.v4.app.Fragment {
    private View view;

    private String title,description;//String for tab title
    private ImageView imageView;

    private static RecyclerView recyclerView;
    ArrayList<Product> arrayList = new ArrayList<>();



    public DummyFragment2() {
    }

    public DummyFragment2(String title) {
        this.title = title;//Setting tab title
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.dummy_fragment, container, false);

        setRecyclerView();
        return view;

    }
    //Setting recycler view
    private void setRecyclerView() {

        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));//Linear Items
        recyclerView.setAdapter(new RecyclerView_Adapter(getActivity(),getData()));// set adapter on recyclerview

    }
    private ArrayList getData(){
        ArrayList<Product> products = new ArrayList<>();
        Product salad = new Product();
        salad.setName("Salad");
        salad.setDesc("Srsly?");
        salad.setImage(R.drawable.salad);
        products.add(salad);

        return products;
    }
}
