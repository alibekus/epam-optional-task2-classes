package kz.akbar.model;

public class Manufacturer {

    private String name;
    private Address address;

    public Manufacturer(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public static class Address {
        private String country;
        private String city;
        private String street;
        private int buildingNumber;

        public Address(String country, String city, String street, int buildingNumber) {
            this.country = country;
            this.city = city;
            this.street = street;
            this.buildingNumber = buildingNumber;
        }

        public String getCountry() {
            return country;
        }

        public String getCity() {
            return city;
        }

        public String getStreet() {
            return street;
        }

        public int getBuildingNumber() {
            return buildingNumber;
        }
    }
}
