package br.com.felipearruda.factory.apple.halfsimple.factory;

import br.com.felipearruda.factory.apple.halfsimple.model.IPhone;

public abstract class IphoneFactory {

    public IPhone orderIPhone(String level) {
        IPhone iphone = createIphone(level);

        iphone.getHardware();
        iphone.assemble();
        iphone.certificates();
        iphone.pack();

        return iphone;
    }

    protected abstract IPhone createIphone(String level);
    
}
