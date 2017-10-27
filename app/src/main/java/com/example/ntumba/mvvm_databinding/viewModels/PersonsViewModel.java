package com.example.ntumba.mvvm_databinding.viewModels;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.ntumba.mvvm_databinding.model.Person;

/**
 * Created by ntumba on 17-10-15.
 */

public class PersonsViewModel extends BaseObservable{

    private Person person;


    /**
     * constructor
     */
    public PersonsViewModel(){

    }


    /**
     * return an instance of person
     * @return
     */
    public Person getPerson(){
        return person;

    }



    /**
     * set the person
     * @param person
     */
    public void setPerson(Person person){
        this.person = person;
        super.notifyChange();
    }


    /**
     * returns the person firstname
     * @return
     */
    @Bindable
    public String getFirstname(){
        return person.getFirstname();
    }



    /**
     * returns the person lastname
     * @return
     */
    @Bindable
    public String getLastname(){
        return person.getLastname();
    }


    /**
     * return the person id ressource avatar
     * @return
     */
    @Bindable
    public int getAvatar(){
        return person.getAvatar();
    }




    /**
     * starts a new activity whenever a contact is clicked
     * on
     */
    public void onContactClicked() {
    }
}
