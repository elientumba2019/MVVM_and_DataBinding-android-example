package com.example.ntumba.mvvm_databinding.fragments;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.ntumba.mvvm_databinding.R;
import com.example.ntumba.mvvm_databinding.databinding.EditContactLayout2Binding;
import com.example.ntumba.mvvm_databinding.model.Person;
import com.example.ntumba.mvvm_databinding.model.PersonSingleTon;

import java.util.UUID;



/**
 * Created by ntumba on 17-10-15.
 */

public class EditContactFragment extends Fragment {


    public static final String PERSON_ID_KEY_ARGUMENT = "key";
    private Person person;
    private Bundle bundle;






    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bundle = getArguments();
        UUID id = (UUID) bundle.getSerializable(PERSON_ID_KEY_ARGUMENT);
        person = PersonSingleTon.getSingleTonInstance().getPerson(id);

    }




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

        //inflating the binding class
        EditContactLayout2Binding binding = DataBindingUtil.inflate
                (inflater, R.layout.edit_contact_layout2 , container , false);


        binding.firstname.setText(person.getFirstname());
        binding.lastname.setText(person.getLastname());




        binding.saveButton.setOnClickListener(c ->{

            Person person = new Person(this.person.getAvatar() ,
                    binding.firstname.getText().toString() ,
                    binding.lastname.getText().toString());

            person.setId(this.person.getId());

            PersonSingleTon.getSingleTonInstance().updateContact(person);
            getActivity().finish();

        });

        return binding.getRoot();
    }





    /**
     * returns an instance of the fragment
     * @return
     */
    public static EditContactFragment getInstance(UUID personID){
        Bundle argument = new Bundle();
        argument.putSerializable(PERSON_ID_KEY_ARGUMENT , personID);
        EditContactFragment fragment = new EditContactFragment();
        fragment.setArguments(argument);
        return  fragment;
    }
}
