package com.example.ntumba.mvvm_databinding.model;

import android.support.annotation.NonNull;

import com.example.ntumba.mvvm_databinding.R;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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


    /**
     * returns a contact from the list if its in it
     * @param id
     * @return
     */
    public Person getPerson(UUID id){
        for(int c = 0 ; c < listOfperson.size() ; c++){
            if(id.equals(listOfperson.get(c).getId())){
                return listOfperson.get(c);
            }
        }
        return  null;
    }


    /**
     * updates a contact
     * @param person
     * @return
     */
    public boolean updateContact(Person person){
        for(int c = 0 ; c < listOfperson.size() ; c++){
            if(person.getId().equals(listOfperson.get(c).getId())){
                listOfperson.set(c , person);
                return  true;
            }
        }
        return  false;
    }
}
