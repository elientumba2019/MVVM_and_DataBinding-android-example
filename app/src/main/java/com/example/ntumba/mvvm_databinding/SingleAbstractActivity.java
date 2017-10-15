package com.example.ntumba.mvvm_databinding;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public abstract class SingleAbstractActivity extends AppCompatActivity {


    /**
     * returns some fragment from any activity
     * that extends this class
     * @return
     */
    public abstract Fragment createLayout();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_abstract);
    }
}
