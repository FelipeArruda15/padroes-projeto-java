package model;

import mediator.Mediator;

public class PortugueseUser extends User {

    public PortugueseUser(String name, Mediator mediator) {
        super(name, Language.PORTUGUESE, mediator);
    }

}
