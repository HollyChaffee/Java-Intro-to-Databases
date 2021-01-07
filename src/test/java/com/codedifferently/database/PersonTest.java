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
        String expected = "Manny";
        String actual = person.getFirstName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setFirstNameTest() {
        person.setFirstName("Jack");

        String expected = "Jack";
        String actual = person.getFirstName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getLastNameTest() {
        String expected = "Lion";
        String actual = person.getLastName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setLastNameTest() {
        person.setLastName("Steve");

        String expected = "Steve";
        String actual = person.getLastName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAgeTest() {
        Integer expected = 14;
        Integer actual = person.getAge();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setAgeTest() {
        person.setAge(15);

        Integer expected = 15;
        Integer actual = person.getAge();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getEmailTest() {
        String expected = "mannylion@gmail.com";
        String actual = person.getEmail();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setEmailTest() {
        person.setEmail("joannasmith@gmail.com");

        String expected = "joannasmith@gmail.com";
        String actual = person.getEmail();

        Assert.assertEquals(expected, actual);
    }
}