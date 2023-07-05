package bridge.backend.services;

import bridge.backend.dao.UserDAO;
import bridge.backend.model.User;

public abstract class UserService {

    protected UserDAO dao;

    public UserService(UserDAO dao) {
        this.dao = dao;
    }

    public UserDAO getDao() {
        return dao;
    }

    public abstract void save(User user);

}
