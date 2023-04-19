package br.com.felipearruda.factory.apple.after.factory;

import br.com.felipearruda.factory.apple.after.model.IPhone;
import br.com.felipearruda.factory.apple.after.model.IPhone11;

public class Iphone11Factory extends IphoneFactory {

    @Override
    protected IPhone createIphone() {
        return new IPhone11();
    }
    
}
