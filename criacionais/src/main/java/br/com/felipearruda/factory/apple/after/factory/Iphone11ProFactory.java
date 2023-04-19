package br.com.felipearruda.factory.apple.after.factory;

import br.com.felipearruda.factory.apple.after.model.IPhone;
import br.com.felipearruda.factory.apple.after.model.IPhone11Pro;

public class Iphone11ProFactory extends IphoneFactory {

    @Override
    protected IPhone createIphone() {
        return new IPhone11Pro();
    }
    
}
