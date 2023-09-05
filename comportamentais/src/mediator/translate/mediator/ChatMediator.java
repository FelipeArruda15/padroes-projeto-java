package mediator;

import model.User;

public class ChatMediator extends Mediator {

    @Override
    protected String getMessage(String message, User to, User from) {
        return message;
    }

}
