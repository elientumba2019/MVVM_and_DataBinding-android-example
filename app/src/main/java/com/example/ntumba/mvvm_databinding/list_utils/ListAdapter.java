package com.example.ntumba.mvvm_databinding.list_utils;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.example.ntumba.mvvm_databinding.Person;

import java.util.List;

/**
 * Created by ntumba on 17-10-15.
 */

public class ListAdapter extends RecyclerView.Adapter<ListViewHolder> {


    private Context context;
    private List<Person> list;


    /**
     * constructor
     * @param context
     * @param list
     */
    public ListAdapter(Context context , List<Person> list){
        this.context = context;
        this.list = list;
    }



    /**
     * Returns an instance of the view holder
     * @param parent
     * @param viewType
     * @return
     */
    @Override
    public ListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }


    /**
     * does the necessary binding
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(ListViewHolder holder, int position) {

    }


    /**
     * returns the number of
     * item in the list
     * @return
     */
    @Override
    public int getItemCount() {
        return 0;
    }
}
