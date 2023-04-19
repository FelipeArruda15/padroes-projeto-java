package br.com.felipearruda.factory.apple.simple.factory;

import br.com.felipearruda.factory.apple.simple.model.IPhone;
import br.com.felipearruda.factory.apple.simple.model.IPhone11;
import br.com.felipearruda.factory.apple.simple.model.IPhone11Pro;
import br.com.felipearruda.factory.apple.simple.model.IPhoneX;
import br.com.felipearruda.factory.apple.simple.model.IPhoneXSMax;

public class IphoneSimpleFactory {
    
    public IPhone orderIPhone(String generation, String level) {
		IPhone iphone = null;
		
		if("x".equals(generation)) {
			if("standard".equals(level)) {
				iphone = new IPhoneX();
			} else if("highEnd".equals(level)) {
				iphone = new IPhoneXSMax();
			}
		} else if("11".equals(generation)) {
			if("standard".equals(level)) {
				iphone = new IPhone11();
			} else if("c".equals(level)) {
				iphone = new IPhone11Pro();
			}
		}
		
		iphone.getHardware();
		iphone.assemble();
		iphone.certificates();
		iphone.pack();
		
		return iphone;
	}

}
