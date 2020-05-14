package com.example.fragmentsandrecycler.adpters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.fragmentsandrecycler.fragments.Fragment1;
import com.example.fragmentsandrecycler.fragments.Fragment2;

public class FragmentAdapter extends FragmentStatePagerAdapter {
    public FragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = Fragment1.newInstance();
                break;
            case 1:
                fragment = Fragment2.newInstance();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
