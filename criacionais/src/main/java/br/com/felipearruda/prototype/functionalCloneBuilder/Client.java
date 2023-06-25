package br.com.felipearruda.prototype.functionalCloneBuilder;

import br.com.felipearruda.prototype.functionalCloneBuilder.model.Address;
import br.com.felipearruda.prototype.functionalCloneBuilder.model.User;

public class Client {

    public static void main(String[] args) {
        User user = new User("ToClone", 25, new Address("ABC Street", 1000));

        User cloneUser = user.cloneBuilder().withName("Felipe A").build();

        User anotherUser = cloneUser.cloneBuilder()
                .withName("Arruda Souza")
                .withAddress(
                        new Address("Rua XV", 420))
                .build();

        System.out.println(user);
        System.out.println(cloneUser);
        System.out.println(anotherUser);
    }

}
