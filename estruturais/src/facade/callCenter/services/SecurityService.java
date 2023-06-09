package facade.callCenter.services;

import java.util.List;

import facade.callCenter.model.Card;
import facade.callCenter.model.Register;

class SecurityService {
	private CardService cardService;
	private RegisterService registerService;

	public SecurityService(CardService cardService, RegisterService registerService) {
		this.cardService = cardService;
		this.registerService = registerService;
	}

	public List<Register> blockCard(Card card) {
		System.out.println("Blocking card:" + card);
		List<Register> pendingRegistries = registerService.getRegistersByCard(card);
		cardService.removeCard(card);
		registerService.deleteCardRegistries(card);
		return pendingRegistries;
	}
}
