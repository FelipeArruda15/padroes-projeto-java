package br.com.felipearruda.abstractfactory.app.service.factory.technologies;

import br.com.felipearruda.abstractfactory.app.service.services.CarRestApiService;
import br.com.felipearruda.abstractfactory.app.service.services.CarService;
import br.com.felipearruda.abstractfactory.app.service.services.UserRestApiService;
import br.com.felipearruda.abstractfactory.app.service.services.UserService;

public class RestAPIServiceFactory implements ServicesAbstractFactory {

    @Override
    public CarService getCarService() {
        return new CarRestApiService();
    }

    @Override
    public UserService getUserService() {
       return new UserRestApiService();
    }
    
}
