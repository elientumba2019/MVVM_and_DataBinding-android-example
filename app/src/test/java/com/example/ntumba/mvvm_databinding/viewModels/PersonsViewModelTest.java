package com.example.ntumba.mvvm_databinding.viewModels;

import com.example.ntumba.mvvm_databinding.model.Person;

import org.junit.Before;

import static org.junit.Assert.*;

/**
 * Created by ntumba on 17-10-27.
 */
public class PersonsViewModelTest {


    private PersonsViewModel subject;
    private Person person;


    /**
     * setup for the sound view model
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
        subject = new PersonsViewModel();
        person = new Person(00 , "Firstname" , "Lastname");
        subject.setPerson(person);
    }






}