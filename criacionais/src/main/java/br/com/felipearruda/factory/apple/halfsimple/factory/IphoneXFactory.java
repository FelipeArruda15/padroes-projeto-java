package br.com.felipearruda.factory.apple.halfsimple.factory;

import br.com.felipearruda.factory.apple.halfsimple.model.IPhone;
import br.com.felipearruda.factory.apple.halfsimple.model.IPhoneX;
import br.com.felipearruda.factory.apple.halfsimple.model.IPhoneXSMax;

public class IphoneXFactory extends IphoneFactory {

    @Override
    protected IPhone createIphone(String level) {
        IPhone iphone = null;
        if ("standard".equals(level)) {
            iphone = new IPhoneX();
        } else if ("highEnd".equals(level)) {
            iphone = new IPhoneXSMax();
        }

        return iphone;
    }

}
