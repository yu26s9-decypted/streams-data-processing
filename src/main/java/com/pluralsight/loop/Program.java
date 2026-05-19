package com.pluralsight.loop;

import stream.Person;
import ui.Console;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args){
        List<Person> people = new ArrayList<>();

        people.add(new Person("John", "Smith", 25));
        people.add(new Person("Emma", "Johnson", 32));
        people.add(new Person("Michael", "Brown", 41));
        people.add(new Person("Sophia", "Davis", 19));
        people.add(new Person("James", "Wilson", 55));
        people.add(new Person("Olivia", "Miller", 28));
        people.add(new Person("Daniel", "Moore", 36));
        people.add(new Person("Ava", "Taylor", 22));
        people.add(new Person("Ethan", "Anderson", 47));
        people.add(new Person("Mia", "Thomas", 31));


        System.out.println("Average age of this list is: " + Person.calculateAverageAgeStreamMethod(people));
        System.out.println("Youngest person is " + Person.getYoungest(people));
        System.out.println("Oldest person is: " +Person.getOldest(people));

        System.out.println(Person.getSummaryStat(people));

        boolean isSearching = true;
        while (isSearching){
            String search = Console.askForString("Enter a name to search for.");


            List<Person> matchingPeople = people.stream()
                    .filter(p -> p.getFirstName().equalsIgnoreCase(search) || p.getLastName().equalsIgnoreCase(search))
                    .toList();

            if(matchingPeople.size() <= 0){
                System.out.println("No results found.");
            } else {
                System.out.println(matchingPeople);
            }

        }

    }



}
