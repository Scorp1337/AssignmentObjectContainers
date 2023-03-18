package AssignmentObjectContainers;

import java.util.*;

/**
 * Person > Store Person in a TreeSet
 * properties : name, age
 * Iterate through the Treeset and print the name and age.
 * List of hobbies for people, storeHobbies
 * Hobby > properties : name, frequency (int) how many times a week, List of adress.
 * you will use a HashMap with the following structure <Person, List<Hobby>>
 * add some information to this map - any detail you consider relevant
 * <p>
 * for a certain Person, print the names of the hobbies and the countries where it can be practiced
 * printNameOfHobbies and countries
 * use some example classes, appropriately, such as: Person, Unemployed, Hired, Student, Address, Country
 */
public class App {
    public static void main(String[] args) {


        TreeSet<Person> people = new TreeSet<>(new ComparatorByName());

        people.add(new Person("Alin", 36));
        people.add(new Person("Victor", 17));
        people.add(new Person("Maria", 25));

        Person person1 = new Person("Alin", 36);
        Person person2 = new Person("Victor", 17);
        Person person3 = new Person("Maria", 25);

        people.add(person1);
        people.add(person2);
        people.add(person3);
        System.out.println("Listing by name");

        for (Person person : people) {
            System.out.println(person);
        }
        TreeSet<Person> people2 = new TreeSet<>(new ComparatorByAge());
        people2.add(person1);
        people2.add(person2);
        people2.add(person3);

        System.out.println("Listing by age");
        for (Person person : people2) {
            System.out.println(person);
        }
        System.out.println("===========================================================================================================================");
        Address address1 = new Address("Fortuna", 15, "USA");
        Address address2 = new Address("Minor", 7, "India");
        Address address3 = new Address("Miracle", 15, "Brazil");


        Hobby football = new Hobby("Football", 2);
        Hobby cricket = new Hobby("Cricket", 2);
        Hobby basketball = new Hobby("Basketball", 2);

        football.addresses.add(address3);
        cricket.addresses.add(address2);
        basketball.addresses.add(address1);

        basketball.addAddress(address1);
        cricket.addAddress(address2);
        football.addAddress(address3);

        person1.addHobby(cricket);
        person2.addHobby(football);
        person2.addHobby(basketball);


        System.out.println("Victor hobbies are: " + person2.getHobbies());
        System.out.println("Alin hobbies are: " + person1.getHobbies());
        System.out.println("===========================================================================================================================");

        Map<Person, List<Hobby>> peopleMap = new HashMap<>();

        peopleMap.put(person1, person1.hobbies);

        peopleMap.put(person2, person2.hobbies);

        System.out.println(peopleMap);

        System.out.println("===========================================================================================================================");



        System.out.println("Hobbies and country for a certain person: " + person2.name + "'s hobbies are "
                            + peopleMap.get(person2));
    }

}





