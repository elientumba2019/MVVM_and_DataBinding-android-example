package com.example.ntumba.mvvm_databinding.activities;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ntumba.mvvm_databinding.R;

public abstract class SingleAbstractActivity extends AppCompatActivity {


    /**
     * returns some fragment from any activity
     * that extends this class
     * @return
     */
    public abstract Fragment getFragment();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_abstract);


        //getting the fragment manager
        FragmentManager manager = getSupportFragmentManager();
        Fragment fragment = manager.findFragmentById(R.id.fragment_general_container);


        if(fragment == null){
            fragment = getFragment();
            manager.beginTransaction().add(R.id.fragment_general_container , fragment).commit();
        }
    }
}
