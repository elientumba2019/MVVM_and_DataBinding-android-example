package com.example.ntumba.mvvm_databinding.activities;

import android.support.v4.app.Fragment;

import com.example.ntumba.mvvm_databinding.fragments.PersonListFragment;

/**
 * Created by ntumba on 17-10-15.
 */

public class PersonListActivity extends SingleAbstractActivity {



    /**
     * returns the fragment that is being
     * held by this activity
     * @return
     */
    @Override
    public Fragment getFragment() {
        return PersonListFragment.getFragmentInstance();
    }
}
