package bridge.backend.services;

import bridge.backend.dao.UserDAO;
import bridge.backend.model.User;

public class UserRest extends UserService {

    public UserRest(UserDAO dao) {
        super(dao);
    }

    @Override
    public void save(User user) {
        System.out.println("Starting a save operation through Rest Protocol!");
        getDao().save(user);
    }

}
