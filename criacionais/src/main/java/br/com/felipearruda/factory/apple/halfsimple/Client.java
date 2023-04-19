package br.com.felipearruda.factory.apple.halfsimple;

import br.com.felipearruda.factory.apple.halfsimple.factory.IphoneFactory;
import br.com.felipearruda.factory.apple.halfsimple.factory.IphoneXFactory;
import br.com.felipearruda.factory.apple.halfsimple.factory.Iphone11Factory;
import br.com.felipearruda.factory.apple.halfsimple.model.IPhone;
import br.com.felipearruda.factory.apple.halfsimple.model.IPhone11;
import br.com.felipearruda.factory.apple.halfsimple.model.IPhone11Pro;
import br.com.felipearruda.factory.apple.halfsimple.model.IPhoneX;
import br.com.felipearruda.factory.apple.halfsimple.model.IPhoneXSMax;

public class Client {

	public static void main(String[] args) {
		IphoneFactory iphone11Factory = new Iphone11Factory();
		IphoneFactory iphoneXFactory = new IphoneXFactory();

		System.out.println("### Ordering an iPhone X");
		IPhone iphone = iphoneXFactory.orderIPhone("standard");
		System.out.println(iphone);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = iphone11Factory.orderIPhone("highEnd");
		System.out.println(iphone2);
	}
}
