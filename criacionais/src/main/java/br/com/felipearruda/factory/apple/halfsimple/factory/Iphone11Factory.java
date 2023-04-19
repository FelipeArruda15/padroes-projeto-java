package br.com.felipearruda.factory.apple.halfsimple.factory;

import br.com.felipearruda.factory.apple.halfsimple.model.IPhone;
import br.com.felipearruda.factory.apple.halfsimple.model.IPhone11;
import br.com.felipearruda.factory.apple.halfsimple.model.IPhone11Pro;

public class Iphone11Factory extends IphoneFactory {

    @Override
    protected IPhone createIphone(String level) {
        IPhone iphone = null;
        if ("standard".equals(level)) {
            iphone = new IPhone11();
        } else if ("highEnd".equals(level)) {
            iphone = new IPhone11Pro();
        }

        return iphone;
    }

}
