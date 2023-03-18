package AssignmentObjectContainers;

public class Address {

    public String streetName;

    public int streetNumber;

    public String country;

    public Address(String streetName, int streetNumber, String country) {
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address[{]" +
                "streetName= " + streetName + '\'' +
                ", streetNumber=" + streetNumber +
                ", country=" + country + '\'' +
                ']';
    }

    public String getStreetName() {
        return streetName;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public String getCountry() {
        return country;
    }
}
