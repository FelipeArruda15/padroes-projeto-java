package br.com.felipearruda.factory.apple.after.factory;

import br.com.felipearruda.factory.apple.after.model.IPhone;

public abstract class IphoneFactory {

    public IPhone orderIPhone() {
        IPhone iphone = createIphone();

        iphone.getHardware();
        iphone.assemble();
        iphone.certificates();
        iphone.pack();

        return iphone;
    }

    protected abstract IPhone createIphone();

}
