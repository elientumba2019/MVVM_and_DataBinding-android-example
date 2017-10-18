package com.example.ntumba.mvvm_databinding.list_utils;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.example.ntumba.mvvm_databinding.activities.EditContactActivity;
import com.example.ntumba.mvvm_databinding.model.Person;
import com.example.ntumba.mvvm_databinding.databinding.SingleItemBinding;
import com.example.ntumba.mvvm_databinding.viewModels.PersonsViewModel;

/**
 * Created by ntumba on 17-10-15.
 */

public class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {


    private SingleItemBinding itemBinding;
    private Person person;
    private Context context;

    //view root
    private View view;



    /**
     * constructor with argument
     * @param itemBinding
     */
    public ListViewHolder(SingleItemBinding itemBinding , Context context) {
        super(itemBinding.getRoot());

        this.itemBinding = itemBinding;
        this.view = itemBinding.getRoot();
        this.context = context;
        itemBinding.setPersonVM(new PersonsViewModel());
        view.setOnClickListener(this);
    }


    public void bind(Person person){
        this.person = person;
        itemBinding.avatar.setImageResource(person.getAvatar());
        itemBinding.getPersonVM().setPerson(person);
        itemBinding.executePendingBindings();
    }




    /**
     * onClick listener method
     * @param view
     */
    @Override
    public void onClick(View view) {

        if(view.getId() == itemBinding.singleItem.getId()){
            Toast.makeText(context , person.getFirstname() , Toast.LENGTH_LONG).show();
            Intent intent = EditContactActivity.getIntent(context , person.getId());
            context.startActivity(intent);
        }
    }
}
