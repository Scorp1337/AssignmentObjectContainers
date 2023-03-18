package AssignmentObjectContainers;

import java.util.ArrayList;
import java.util.List;

public class Hobby {
    public String name;
    public int frequency;

    List<Address> addresses = new ArrayList<>();


    public Hobby(String name, int frequency) {
        this.name = name;
        this.frequency = frequency;

    }

    public void addAddress(Address address){

        addresses.add(address);
    }




    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public int getFrequency() {
        return frequency;
    }

    public List<Address> getAddresses() {
        return addresses;
    }
}