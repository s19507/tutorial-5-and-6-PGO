package com.company;

public class Address {
    public String createAddress(String country) {
        return String.format(" country: %s", country);
    }

    public String createAddress(String country, String city) {
        return String.format(" country: %s, city: %S", country, city);
    }

    public String createAddress(String country, String city, String postalCode) {
        return String.format(" country: %s, city: %S", "postalCode:  %S", country, city, postalCode);
    }

    public String createAddress(String country, String city, String postalCode, String streetName) {
        return String.format(" country: %s, city: %s, postalCode: %s, streetName:%s", country, city, postalCode, streetName);
    }

    public String createAddress(String country, String city, String postalCode, String streetName, int apartmentNumber) {
        return String.format(" country: %s, city: %s, postalCode: %s, streetName:%s, apartmentNumber: %d", country, city, postalCode, streetName, apartmentNumber);
    }
}

