package net.okres.springapp1.service;

/**
 * Created by Alex on 08.06.2017.
 */
public interface SecurityService {
    String findLoggedInUserName();

    void autoLogin(String username, String password);

}
