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

    public void setOwner(Person person) {
        this.owner = person;
    }

    public void addPerson(Person person) {
        people.add(person);
    }

    public void removePerson(Person person) {
        people.remove(person);
    }

    public Person getPersonByEmail(String email) {
        return null;
    }

    public ArrayList<Person> getAllPeople() {

        return people;
    }

    public Boolean saveAll() {
        return false;
    }

}
