package model;

import mediator.Mediator;

public abstract class User {

    final protected String name;
    final protected Language language;
    final protected Mediator mediator;

    public User(String name, Language language, Mediator mediator) {
        this.name = name;
        this.language = language;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public Language getLanguage() {
        return language;
    }

    public void sendMessage(String message) {
        this.sendMessage(message, null);
    }

    public void sendMessage(String message, User to) {
        String receiverName = to != null ? to.getName() : "ALL";
        System.out.println(String.format("'%s' is sending the message '%s' to '%s'", name, message, receiverName));
        mediator.sendMessage(message, to, this);
    }

    public void receiveMessage(String message, User from) {
        System.out.println(String.format("'%s' has recieved the message '%s'", name, message));
    }

}
