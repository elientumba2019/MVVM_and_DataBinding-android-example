package com.example.ntumba.mvvm_databinding.fragments;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ntumba.mvvm_databinding.R;
import com.example.ntumba.mvvm_databinding.databinding.FragmentListBinding;

/**
 * Created by ntumba on 17-10-15.
 */

/**
 * fragment corresponding to the
 * FragmentListActivity.java
 */
public class PersonListFragment extends Fragment {


    public PersonListFragment(){}



    /**
     * oncreate view method
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {


        //inflating the layout using the binding utils
        FragmentListBinding fragmentBinding = DataBindingUtil.inflate(
                inflater , R.layout.fragment_list , container , false
        );


        //setting the layout manager
        fragmentBinding.fragmentRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));


        return fragmentBinding.getRoot();
    }





    /**
     * get instance method
     * @return
     */
    public static PersonListFragment getFragmentInstance(){
        return new PersonListFragment();
    }
}
