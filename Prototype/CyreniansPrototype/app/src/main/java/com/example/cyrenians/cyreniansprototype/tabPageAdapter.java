package com.example.cyrenians.cyreniansprototype;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Alex on 1/28/2018.
 */

public class tabPageAdapter extends FragmentStatePagerAdapter {

    String tabArray[] = new String[]{"Products","Recipes"};
    Integer tabPages = 2;

    public tabPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabArray[position];
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                ProductFragment productFragment = new ProductFragment();
                return productFragment;
            case 1:
                RecipeFragment recipeFragment = new RecipeFragment();
                return recipeFragment;
        }

        return null;
    }

    @Override
    public int getCount() {
        return tabPages;
    }
}
