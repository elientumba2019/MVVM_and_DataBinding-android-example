package com.example.ntumba.mvvm_databinding.viewModels;

import com.example.ntumba.mvvm_databinding.Person;

/**
 * Created by ntumba on 17-10-15.
 */

public class PersonsViewModel {

    private Person person;


    /**
     * constructor
     * @param person
     */
    public PersonsViewModel(Person person){
        this.person = person;
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
    }


    /**
     * returns the person firstname
     * @return
     */
    public String getFirstname(){
        return person.getFirstname();
    }



    /**
     * returns the person lastname
     * @return
     */
    public String getLastname(){
        return person.getLastname();
    }


    /**
     * return the person id ressource avatar
     * @return
     */
    public int getAvatar(){
        return person.getAvatar();
    }
}
