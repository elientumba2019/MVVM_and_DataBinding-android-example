package com.example.ntumba.mvvm_databinding.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by ntumba on 17-10-15.
 */

public class EditContactFragment extends Fragment {


    /**
     * creates the views and inflates layouts
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }




    /**
     * returns an instance of the fragment
     * @return
     */
    public static EditContactFragment getInstance(){
        return  new EditContactFragment();
    }
}
