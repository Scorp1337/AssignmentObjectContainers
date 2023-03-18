package AssignmentObjectContainers;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Person {
    public String name;
    public Integer age;


    List<Hobby> hobbies = new ArrayList<>();

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void addHobby( Hobby hobby){

        hobbies.add(hobby);

    }


    @Override
    public String toString() {
        return "Person[" +
                "name= " + name + '\'' +
                ", age= " + age +
                ']';
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public List<Hobby> getHobbies() {
        return hobbies;
    }



    }









