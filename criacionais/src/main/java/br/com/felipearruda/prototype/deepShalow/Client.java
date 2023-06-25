package br.com.felipearruda.prototype.deepShalow;

import br.com.felipearruda.prototype.deepShalow.model.Address;
import br.com.felipearruda.prototype.deepShalow.model.User;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        User user = new User("Felipe", 21, new Address("Rua Geral", 345));
        System.out.println("User 1: " + user);

        User cloneUser = (User) user.clone();
        cloneUser.setName("Felipe 2");
        cloneUser.getAddress().setStreet("Rua 2");
        System.out.println("Clone: " + cloneUser);
        System.out.println("User 1: " + user);

    }

}
