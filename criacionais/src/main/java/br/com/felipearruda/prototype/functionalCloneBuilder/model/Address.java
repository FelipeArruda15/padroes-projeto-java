package br.com.felipearruda.prototype.functionalCloneBuilder.model;

public class Address implements Cloneable {

    private final String street;
    private final int number;

    public Address(String street, int number) {
        this.street = street;
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public int getNumber() {
        return number;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Builder cloneBuilder() {
        return new Builder(street, number);
    }

    @Override
    public String toString() {
        return "Street: " + street + ", number: " + number;
    }

    public static class Builder {

        private String street;
        private int number;

        public Builder(String street, int number) {
            this.street = street;
            this.number = number;
        }

        public Builder withStreet(String street) {
            this.street = street;
            return this;
        }

        public Builder withNumber(int number) {
            this.number = number;
            return this;
        }

        public Address build() {
            return new Address(street, number);
        }

    }
}
