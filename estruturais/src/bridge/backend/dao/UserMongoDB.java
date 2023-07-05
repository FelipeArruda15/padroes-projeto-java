package bridge.backend.dao;

import bridge.backend.model.User;

public class UserMongoDB implements UserDAO {

    @Override
    public void save(User user) {
        System.out.println("Saving the user in the Mongo Database!");
    }

}
