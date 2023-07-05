package bridge.backend.dao;

import bridge.backend.model.User;

public class UserOracleDB implements UserDAO {

    @Override
    public void save(User user) {
        System.out.println("Saving the user in the Oracle Database!");
    }

}
