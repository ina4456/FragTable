package com.example.fragtable.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.fragtable.frag.FirstFragment;
import com.example.fragtable.frag.Fragment01;
import com.example.fragtable.frag.Fragment02;
import com.example.fragtable.frag.Fragment03;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FragAdapter extends FragmentStatePagerAdapter {

    private ArrayList<Fragment> fragItem;
    private ArrayList<String> title = new ArrayList<String>();

    public FragAdapter(@NonNull FragmentManager fm) {
        super(fm);
        fragItem = new ArrayList<Fragment>();
        fragItem.add(new Fragment01());
        fragItem.add(new Fragment02());
        fragItem.add(new Fragment03());

        title.add("메뉴1");
        title.add("메뉴2");
        title.add("메뉴3");


    }

    @Override
    public CharSequence getPageTitle(int position){
        return title.get(position);
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Fragment01 frag01 = new Fragment01();
                return frag01;
            case 1:
                Fragment02 frag02 = new Fragment02();
                return frag02;

            case 2:
                FirstFragment frag03 = new FirstFragment();
                return frag03;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return fragItem.size();
    }


}
