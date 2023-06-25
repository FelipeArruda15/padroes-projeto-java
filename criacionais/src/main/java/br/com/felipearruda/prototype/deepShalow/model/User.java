package br.com.felipearruda.prototype.deepShalow.model;

public class User implements Cloneable {

    private String name;
    private int age;
    private Address address;

    public User(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        // return super.clone();
        User user = (User) super.clone();
        Address address = (Address) user.getAddress().clone();
        user.setAddress(address);

        return user;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", age: " + age + ". Address: " + address;
    }

}
