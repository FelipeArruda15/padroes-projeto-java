package facade.callCenter;

import facade.callCenter.model.Card;
import facade.callCenter.services.CallCenterFacade;

public class Client {

    public static void main(String[] args) {
        CallCenterFacade facade = new CallCenterFacade();

        Card card = facade.getCardByUser(123456L);
        System.out.println(card);

        facade.getSumary(card);

        facade.getPaymentInfoByCard(card);

        facade.cancelLastRegister(card);

        Card newCard = facade.getCardByUser(123456L);
        System.out.println(newCard);
    }

}
