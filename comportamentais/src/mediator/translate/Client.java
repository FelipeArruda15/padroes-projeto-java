import mediator.ChatMediator;
import mediator.Mediator;
import model.EnglishUser;
import model.PortugueseUser;
import model.User;

public class Client {
    public static void main(String[] args) throws Exception {
        Mediator chatRoom = new ChatMediator();
        // Mediator chatRoom = new TranslatorMediator();

        User felipe = new EnglishUser("Felipe", chatRoom);
        User aline = new PortugueseUser("Aline", chatRoom);
        User oseias = new PortugueseUser("Oseias", chatRoom);
        User day = new EnglishUser("Day", chatRoom);
        User dani = new EnglishUser("Dani", chatRoom);

        chatRoom.addUser(felipe);
        chatRoom.addUser(aline);
        chatRoom.addUser(oseias);
        chatRoom.addUser(day);
        chatRoom.addUser(dani);

        felipe.sendMessage("Hello");
        aline.sendMessage("Oi", felipe);
    }
}
