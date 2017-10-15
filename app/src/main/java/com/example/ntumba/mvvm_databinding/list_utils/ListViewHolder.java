package com.example.ntumba.mvvm_databinding.list_utils;

import android.support.v7.widget.RecyclerView;

import com.example.ntumba.mvvm_databinding.Person;
import com.example.ntumba.mvvm_databinding.databinding.SingleItemBinding;
import com.example.ntumba.mvvm_databinding.viewModels.PersonsViewModel;

/**
 * Created by ntumba on 17-10-15.
 */

public class ListViewHolder extends RecyclerView.ViewHolder {


    private SingleItemBinding itemBinding;


    /**
     * constructor with argument
     * @param itemBinding
     */
    public ListViewHolder(SingleItemBinding itemBinding) {
        super(itemBinding.getRoot());
        this.itemBinding = itemBinding;
        itemBinding.setPersonVM(new PersonsViewModel());
    }


    public void bind(Person person){
        itemBinding.avatar.setImageResource(person.getAvatar());
        itemBinding.getPersonVM().setPerson(person);
        itemBinding.executePendingBindings();
    }
}
