package AssignmentObjectContainers;

import java.util.Comparator;
class ComparatorByAge implements Comparator<Person> {


    public int compare(Person p1, Person p2) {
        if (p1.age < p2.age) {
            return -1;
        } else if (p1.age > p2.age) {
            return 1;
        } else {
            return p1.age.compareTo(p2.age);
        }
    }
}
class ComparatorByName implements Comparator<Person> {


    public int compare(Person p1, Person p2) {
        return p1.name.compareTo(p2.name);
    }
}

