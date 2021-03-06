package com.example.al.alan2017summer.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.util.Pair;

import java.util.ArrayList;

import static android.R.id.list;

/**
 * Created by Al on 6/19/2017.
 */

public class ViewFragmentStateAdapter extends FragmentStatePagerAdapter {

    private final ArrayList<Pair<String,Fragment>> list;

    public ViewFragmentStateAdapter(FragmentManager fm, ArrayList<Pair<String,Fragment>> list) {
        super(fm);
        this.list = list;
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position).second;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return list.get(position).first;
    }
}
