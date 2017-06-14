package net.okres.springapp1.service;

import net.okres.springapp1.model.User;

/**
 * Created by Alex on 08.06.2017.
 */
public interface UserService {
    void save(User user);

    User findByUserName(String username);

}
