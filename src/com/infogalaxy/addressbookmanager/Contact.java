package com.infogalaxy.addressbookmanager;

public class Contact {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String mobno;
    private String email;
    private String zip;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setState(String state) {
        this.state = state;
    }
    public void setMobno(String mobno) {
        this.mobno = mobno;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getAddress() {
        return address;
    }
    public String getCity() {
        return city;
    }
    public String getState() {
        return state;
    }
    public String getMobno() {
        return mobno;
    }
    public String getEmail() {
        return email;
    }
    public String getZip() {
        return zip;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", mobno='" + mobno + '\'' +
                ", email='" + email + '\'' +
                ", zip='" + zip + '\'' +
            '}';
    }
}
