package fr.efrei.domain;

public class Address {
    private String streetAdress;
    private String postalAdress;
    private String city;
    private String country;
    private String streetNumber;
    private double postalCode;

    //default constructor
    private Address() {}

    //add another constructor later
    private Address(Builder builder){
        this.streetAdress = builder.streetAdress;
        this.postalAdress = builder.postalAdress;
        this.city=builder.city;
        this.country=builder.country;
        this.streetNumber=builder.streetNumber;
        this.postalCode=builder.postalCode;
    }

    //getters but no setters, to have protected classes
    public String getStreetAdress() {
        return streetAdress;
    }

    public String getPostalAdress() {
        return postalAdress;
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
                ", postalAdress="+postalAdress+
                ",streetAdress=" + streetAdress +
                "}";
    }

    //builder class = static inner class, copy the same attributes at the top
    public static class Builder {
        public double postalCode;
        public String streetNumber;
        public String country;
        public String city;
        public String postalAdress;
        public String streetAdress;

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
        public Builder setPostalAdress(String postalAdress) {
            this.postalAdress = postalAdress;
            return this; 
        }
            
        public Builder setStreetAdress(String streetAdress) {
            this.streetAdress = streetAdress;
            return this; 
        }

        public Builder copy(Address address){
            this.streetAdress = address.streetAdress;
            this.postalAdress = address.postalAdress;
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