package com.example.ntumba.mvvm_databinding.model;

import android.support.annotation.NonNull;

import com.example.ntumba.mvvm_databinding.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ntumba on 17-10-15.
 */

public class PersonSingleTon {

    private static PersonSingleTon personSingleTon = null;
    private  List<Person> listOfperson;


    /**
     * constructor
     */
    private PersonSingleTon(){
        listOfperson = getList();
    }



    /**
     * returns an instance of the singleton
     * @return
     */
    public static PersonSingleTon getSingleTonInstance(){

        if(personSingleTon == null){
            personSingleTon = new PersonSingleTon();
            return personSingleTon;
        }
        else {
            return personSingleTon;
        }

    }


    /**
     * returns a randomly generated
     * list of persons
     * @return
     */
    public List<Person> getPersonList(){
        return this.listOfperson;
    }




    @NonNull
    private List<Person> getList() {
        ArrayList<Person> list = new ArrayList<>();

        for(int c = 0 ; c < 20 ; c++){
            Person person = new Person();
            person.setFirstname("Firstname " + (c + 1));
            person.setLastname("Lastname " + (c + 1));
            person.setSex((int)(Math.random() * 2));
            person.setAvatar((person.getSex() == 0 ? R.drawable.male : R.drawable.female));

            //adding the person to the list
            list.add(person);
        }
        return list;
    }

}
