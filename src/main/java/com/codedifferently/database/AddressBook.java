package com.codedifferently.database;

import java.util.ArrayList;

public class AddressBook {

    private DataBase dataBase;
    private Person owner;
    private ArrayList<Person> people;

    public AddressBook(DataBase dataBase) {
        this.dataBase = dataBase;
        this.owner = owner;
        this.people = new ArrayList<Person>();
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person Person) {
        this.owner = owner;
    }

    public void addPerson(Person person) {
    }

    public void removePerson(Person Person) {
    }

    public Person getPersonByEmail(String email) {
        return null;
    }

    public ArrayList<Person> getAllPeople() {

        return people;
    }

    public Boolean saveAll() {
        return null;
    }

}
