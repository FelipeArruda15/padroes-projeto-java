package br.com.felipearruda.abstractfactory.app.service.factory.technologies;

import br.com.felipearruda.abstractfactory.app.service.services.CarEJBService;
import br.com.felipearruda.abstractfactory.app.service.services.CarService;
import br.com.felipearruda.abstractfactory.app.service.services.UserEJBService;
import br.com.felipearruda.abstractfactory.app.service.services.UserService;

public class EJBServiceFactory implements ServicesAbstractFactory {

    @Override
    public CarService getCarService() {
        return new CarEJBService();
    }

    @Override
    public UserService getUserService() {
        return new UserEJBService();
    }
    
}
