package model;

import mediator.Mediator;

public class EnglishUser extends User {

    public EnglishUser(String name, Mediator mediator) {
        super(name, Language.ENGLISH, mediator);
    }

}
