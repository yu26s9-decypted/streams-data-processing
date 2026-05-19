package com.pluralsight.loop;

import java.util.Comparator;
import java.util.List;

public class Person {
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

    public static double calculateAverageAge(List<Person> people){
        int avg = 0;

        for(Person p : people){
            avg += p.getAge();
        }

        return (double) avg / people.size();
    }

    public static Person getYoungest(List<Person> people){
       return people.stream()
               .min(Comparator.comparing(Person::getAge))
               .orElse(null);
    }

    public static Person getOldest(List<Person> people){
        return people.stream()
                .max(Comparator.comparing(Person::getAge))
                .orElse(null);
    }



    @Override
    public String toString() {
        return String.format("%s %s %d", firstName, lastName, age);
    }
}
