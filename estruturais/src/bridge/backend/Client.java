package bridge.backend;

import bridge.backend.dao.UserMongoDB;
import bridge.backend.dao.UserOracleDB;
import bridge.backend.model.User;
import bridge.backend.services.UserRest;
import bridge.backend.services.UserService;
import bridge.backend.services.UserSoap;

public class Client {

    public static void main(String[] args) {
        User user = new User("Felipe", "felipe@gmail.com", "senha");
        UserService userRestOracleService = new UserRest(new UserOracleDB());
        userRestOracleService.save(user);

        UserService userRestMongoService = new UserRest(new UserMongoDB());
        userRestMongoService.save(user);

        UserService userSoapMongoService = new UserSoap(new UserMongoDB());
        userSoapMongoService.save(user);
    }

}
