package adapter.hexagonal.application;

import java.util.List;
import java.util.Map;

import adapter.hexagonal.core.model.User;
import adapter.hexagonal.core.port.UserRepository;
import adapter.hexagonal.core.usecases.UserService;
import adapter.hexagonal.infrasctruture.UserMemoryDatabaseAdapter;

public class UserRest {

    private UserService service;

    public UserRest() {
        UserRepository repository = new UserMemoryDatabaseAdapter();
        service = new UserService(repository);
    }

    public Integer post(Map<String, String> values) {
        try {
            User user = new User(values.get("name"), values.get("email"), values.get("password"));
            service.saveUser(user);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 400;
        }

        return 201;
    }

    public Integer get() {
        List<User> users = service.getUsers();
        users.forEach(System.out::println);
        return 200;
    }

}
