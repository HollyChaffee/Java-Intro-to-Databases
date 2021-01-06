package com.codedifferently.database;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddressBookTest {

    AddressBook addressBook;

    @Before
    public void init() throws DataBaseConnectionException {
        Person person = new Person("Manny", "Lion", 14, "mannylion@gmail.com");
        Person person1 = new Person("Lucy", "Cat", 11, "lucycat@gmail.com");
        Person person2 = new Person("Burdett", "Bird", 12, "burdettbird@gmail.com");

        DataBase dataBase = new DataBase();

        AddressBook addressBook = new AddressBook(dataBase);
        addressBook.addPerson(person);
        addressBook.addPerson(person1);
        addressBook.addPerson(person2);

    }

    @Test
    public void getOwner() {
        //Given
        Person person = new Person("Manny", "Lion", 14, "mannylion@gmail.com");

        //When
        String expected = "Manny";
        String actual = addressBook.getOwner().getFirstName();

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void setOwner() {
        //Given
        Person person = new Person("Manny", "Lion", 14, "mannylion@gmail.com");
        addressBook.setOwner(person);

        //When
        Person expected = person;
        Person actual = addressBook.getOwner();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addPerson() {

    }

    @Test
    public void removePerson() {

    }

    @Test
    public void getPersonByEmail() {

    }

    @Test
    public void getAllPeople() {

    }

    @Test
    public void saveAll() {

    }
}