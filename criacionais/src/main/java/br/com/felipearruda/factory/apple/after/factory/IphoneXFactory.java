package br.com.felipearruda.factory.apple.after.factory;

import br.com.felipearruda.factory.apple.after.model.IPhone;
import br.com.felipearruda.factory.apple.after.model.IPhoneX;

public class IphoneXFactory extends IphoneFactory {

    @Override
    protected IPhone createIphone() {
        return new IPhoneX();
    }
    
}
