package br.com.felipearruda.abstractfactory.app.service;

import br.com.felipearruda.abstractfactory.app.service.factory.technologies.RestAPIServiceFactory;
import br.com.felipearruda.abstractfactory.app.service.factory.technologies.ServicesAbstractFactory;

public class Client {

	public static void main(String[] args) {
		// Por tecnologia
		ServicesAbstractFactory service = new RestAPIServiceFactory();
		service.getCarService().save("I30");
		service.getCarService().update("I30 2.O");
		service.getUserService().delete(1);
		service.getUserService().save("Hyundai I30");

	}
}
