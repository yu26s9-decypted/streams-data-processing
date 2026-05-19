package com.pluralsight.loop;

import java.util.List;

class Person {
    String firstName;
    String lastName;
    int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static double calculateAverageAge(List<Person> people) {
        if (people == null || people.isEmpty()) {
            return 0;
        }

        int sum = 0;
        for (Person p : people) {
            sum += p.getAge();
        }

        return (double) sum / people.size();
    }

    public static Person searchForPerson(List<Person> people, String search){
        for(Person p : people){
            if (search.equalsIgnoreCase(p.getFirstName()) ||  search.equalsIgnoreCase(p.getLastName())) {
                return p;
            }
        }
        return null;
    }

    public static Person getYoungest(List<Person> people) {
        Person youngest = people.getFirst();
        for (Person p : people) {
            if (p.getAge() < youngest.getAge()) {
                youngest = p;
            }
        }

        return youngest;
    }

    public static Person getOldest(List<Person> people) {
        Person oldest = people.getFirst();
        for (Person p : people) {
            if (p.getAge() > oldest.getAge()) {
                oldest = p;
            }
        }

        return oldest;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d", firstName, lastName, age);
    }
}