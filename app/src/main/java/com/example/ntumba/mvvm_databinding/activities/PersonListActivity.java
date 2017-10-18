package com.example.ntumba.mvvm_databinding.activities;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.example.ntumba.mvvm_databinding.fragments.PersonListFragment;

/**
 * Created by ntumba on 17-10-15.
 */

public class PersonListActivity extends SingleAbstractActivity {


    private PersonListFragment fragment;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fragment = PersonListFragment.getFragmentInstance();
    }


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
