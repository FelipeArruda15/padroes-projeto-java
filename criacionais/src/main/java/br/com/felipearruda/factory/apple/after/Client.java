package br.com.felipearruda.factory.apple.after;

import br.com.felipearruda.factory.apple.after.factory.Iphone11Factory;
import br.com.felipearruda.factory.apple.after.factory.IphoneFactory;
import br.com.felipearruda.factory.apple.after.factory.IphoneXFactory;
import br.com.felipearruda.factory.apple.after.factory.IphoneXSMaxFactory;
import br.com.felipearruda.factory.apple.after.model.IPhone;

public class Client {
    
    public static void main(String[] args) {
        IphoneFactory iphone11Factory = new Iphone11Factory();
        IphoneFactory iphoneXFactory = new IphoneXFactory();


        System.out.println("### Ordering an iPhone X");
		IPhone iphone = iphoneXFactory.orderIPhone();
		System.out.println(iphone);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = iphone11Factory.orderIPhone();
		System.out.println(iphone2);

    }

}
