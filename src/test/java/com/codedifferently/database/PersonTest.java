package com.codedifferently.database;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    Person person;

    @Before
    public void init(){
        this.person = new Person("Manny", "Lion", 14, "mannylion@gmail.com");
    }


    @Test
    public void getFirstNameTest() {
        //Given

        //When
        String expected = "Manny";
        String actual = person.getFirstName();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setFirstNameTest() {
        //Given
        person.setFirstName("Jack");

        //When
        String expected = "Jack";
        String actual = person.getFirstName();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getLastNameTest() {
        //Given

        //When
        String expected = "Lion";
        String actual = person.getLastName();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setLastNameTest() {
        //Given
        person.setLastName("Welch");

        //When
        String expected = "Welch";
        String actual = person.getLastName();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAgeTest() {

        //When
        Integer expected = 14;
        Integer actual = person.getAge();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setAgeTest() {
        //Given
        person.setAge(15);

        //When
        Integer expected = 15;
        Integer actual = person.getAge();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getEmailTest() {

    }

    @Test
    public void setEmailTest() {
    }
}