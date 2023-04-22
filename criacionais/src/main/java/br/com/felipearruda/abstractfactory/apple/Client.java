package br.com.felipearruda.abstractfactory.apple;

import br.com.felipearruda.abstractfactory.apple.model.iphone.IPhone;
import br.com.felipearruda.abstractfactory.apple.factory.IPhone11Factory;
import br.com.felipearruda.abstractfactory.apple.factory.abstractFactory.BrazilRulesFactory;
import br.com.felipearruda.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;

public class Client {
	
	public static void main(String[] args) {
		CountryRulesAbstractFactory rule = new BrazilRulesFactory();

		System.out.println("### Ordering an iPhone X");
		IPhone iphone = new IPhone11Factory(rule).orderIPhone("standard");
		System.out.println(rule.getCertificates().applyCertification());
		System.out.println(rule.getPacking().pack());
		System.out.println(iphone);

	}
}
