package br.com.felipearruda.factory.apple.simple;

import br.com.felipearruda.factory.apple.simple.factory.IphoneSimpleFactory;
import br.com.felipearruda.factory.apple.simple.model.IPhone;

public class Client {

    public static void main(String[] args) {
        IphoneSimpleFactory iphoneSimpleFactory = new IphoneSimpleFactory();

        System.out.println("### Ordering an iPhone X");
		IPhone iphone = iphoneSimpleFactory.orderIPhone("x", "highEnd");
		System.out.println(iphone);
    }
    
}
