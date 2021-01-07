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
    public void getOwnerTest() {
        Person person = new Person("Manny", "Lion", 14, "mannylion@gmail.com");

        Person expected = person;
        Person actual = addressBook.getOwner();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void setOwnerTest() {
        Person person = new Person("Manny", "Lion", 14, "mannylion@gmail.com");
        addressBook.setOwner(person);

        Person expected = person;
        Person actual = addressBook.getOwner();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addPersonTest() {
        addressBook.addPerson()

    }

    @Test
    public void removePersonTest() {

    }

    @Test
    public void getPersonByEmailTest() {

    }

    @Test
    public void getAllPeopleTest() {

    }

    @Test
    public void saveAllTest() {

    }
}