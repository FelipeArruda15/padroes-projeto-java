package br.com.felipearruda.abstractfactory.app.service.factory.technologies;

import br.com.felipearruda.abstractfactory.app.service.services.CarService;
import br.com.felipearruda.abstractfactory.app.service.services.UserService;

public interface ServicesAbstractFactory {

    CarService getCarService();
    UserService getUserService();

}
