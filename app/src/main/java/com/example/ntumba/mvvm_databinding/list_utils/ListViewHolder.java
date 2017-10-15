package com.example.ntumba.mvvm_databinding.list_utils;

import android.support.v7.widget.RecyclerView;
import com.example.ntumba.mvvm_databinding.databinding.SingleItemBinding;

/**
 * Created by ntumba on 17-10-15.
 */

public class ListViewHolder extends RecyclerView.ViewHolder {


    /**
     * constructor with argument
     * @param itemBinding
     */
    public ListViewHolder(SingleItemBinding itemBinding) {
        super(itemBinding.getRoot());
    }
}
