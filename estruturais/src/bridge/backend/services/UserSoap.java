package bridge.backend.services;

import bridge.backend.dao.UserDAO;
import bridge.backend.model.User;

public class UserSoap extends UserService {

    public UserSoap(UserDAO dao) {
        super(dao);
    }

    @Override
    public void save(User user) {
        System.out.println("Starting a save operation through SOAP Protocol!");
        getDao().save(user);
    }

}
