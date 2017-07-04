package com.example.android.a5_masterpiece;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by koszojudit on 2017. 07. 03..
 */

public class DiscoverFragmentAdapter extends FragmentPagerAdapter {

    // Create a new FragmentAdapter object.
    // @param fm is the fragment manager that will keep each fragment's state in the adapter across swipes.

    public DiscoverFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    // Return the fragment that should be displayed for the given page number.

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new ComposersFragment();
        } else if (position == 1) {
            return new PerformersFragment();
        } else {
            return new ErasFragment();
        }
    }

    //Return the total number of pages.

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Composers";
            case 1:
                return "Performers";
            case 2:
                return "Eras";
        }
        return null;
    }
}
