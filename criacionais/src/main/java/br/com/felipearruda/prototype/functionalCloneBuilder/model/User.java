package br.com.felipearruda.prototype.functionalCloneBuilder.model;

import java.security.PublicKey;

public class User implements Cloneable {

    private final String name;
    private final int age;
    private final Address address;

    public User(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public Builder cloneBuilder() {
        return new Builder(name, age, address);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Address addressCloned = (Address) address.clone();
        return new User(name, age, addressCloned);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", age: " + age + ". Address: " + address;
    }

    public static class Builder {

        private String name;
        private int age;
        private Address address;

        public Builder(String name, int age, Address address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withAge(int age) {
            this.age = age;
            return this;
        }

        public Builder withAddress(Address address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(name, age, address);
        }

    }

}
