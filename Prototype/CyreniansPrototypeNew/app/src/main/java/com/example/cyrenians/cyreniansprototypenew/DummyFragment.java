package com.example.cyrenians.cyreniansprototypenew;
import android.app.Fragment;
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

public class DummyFragment extends android.support.v4.app.Fragment {
    private View view;

    private String title,description;//String for tab title
    private ImageView imageView;

    private static RecyclerView recyclerView;
    ArrayList<Product> arrayList = new ArrayList<>();

    public static DummyFragment newInstance() {
        DummyFragment fragment = new DummyFragment();
        return fragment;
    }

    public DummyFragment() {
    }

    public DummyFragment(String title) {
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
        Product potato = new Product();
        potato.setName("Potato");
        potato.setDesc("Vegetable");
        potato.setImage(R.drawable.potato);
        products.add(potato);

        Product carrot = new Product();
        carrot.setName("Carrot");
        carrot.setDesc("Vegetable");
        carrot.setImage(R.drawable.carrot);
        products.add(carrot);

        return products;
    }
}
