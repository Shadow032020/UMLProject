package fr.efrei.domain;

public class Address {
    private String streetAddress;
    private String postalAddress;
    private String city;
    private String country;
    private String streetNumber;
    private double postalCode;

    //default constructor
    private Address() {}

    //add another constructor later
    private Address(Builder builder){
        this.streetAddress = builder.streetAddress;
        this.postalAddress = builder.postalAddress;
        this.city=builder.city;
        this.country=builder.country;
        this.streetNumber=builder.streetNumber;
        this.postalCode=builder.postalCode;
    }

    //getters but no setters, to have protected classes
    public String getStreetAddress() {
        return streetAddress;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public double getPostalCode() {
        return postalCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "postalCode="+postalCode+
                ", streetNumber="+streetNumber+
                ", country="+country+
                ", city="+city+
                ", postalAdress="+postalAddress+
                ",streetAdress=" + streetAddress +
                "}";
    }

    //builder class = static inner class, copy the same attributes at the top
    public static class Builder {
        public double postalCode;
        public String streetNumber;
        public String country;
        public String city;
        public String postalAddress;
        public String streetAddress;

        //setters, not getters
        public Builder setPostalCode(double postalCode) {
            this.postalCode = postalCode;
            return this; 
        }
        public Builder setStreetNumber(String streetNumber) {
            this.streetNumber = streetNumber;
            return this; 
        }
        public Builder setCountry(String country) {
            this.country = country;
            return this; 
        }
        public Builder setCity(String city) {
            this.city = city;
            return this; 
        }
        public Builder setPostalAddress(String postalAddress) {
            this.postalAddress = postalAddress;
            return this; 
        }
            
        public Builder setStreetAddress(String streetAddress) {
            this.streetAddress = streetAddress;
            return this; 
        }

        public Builder copy(Address address){
            this.streetAddress = address.streetAddress;
            this.postalAddress = address.postalAddress;
            this.city=address.city;
            this.country=address.country;
            this.streetNumber=address.streetNumber;
            this.postalCode=address.postalCode;
            return this; //return the Builder object
        }

        //build an Address object -- like copy constructor in C++
        public Address build() {
            return new Address(this);
        }   
    }
}