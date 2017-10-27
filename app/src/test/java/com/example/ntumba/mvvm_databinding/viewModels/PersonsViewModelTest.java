package com.example.ntumba.mvvm_databinding.viewModels;

import com.example.ntumba.mvvm_databinding.model.Person;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

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
        subject = mock(PersonsViewModel.class);
        person = new Person(00 , "Firstname" , "Lastname");
        subject.setPerson(person);
    }




    /**
     * first name and last name test
     */
    @Test
    public void personNameTest(){
        assertThat(subject.getFirstname() , is(person.getFirstname()));
    }





    /**
     * test for the method that will be used
     * to start new activities
     */
    @Test
    public void onContactClicked(){
        subject.onContactClicked();
        verify(subject).startActivity();
    }




}