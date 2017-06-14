package net.okres.springapp1.service;

import net.okres.springapp1.dao.RoleDao;
import net.okres.springapp1.dao.UserDao;
import net.okres.springapp1.model.Role;
import net.okres.springapp1.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Alex on 08.06.2017.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired//автосвязывание
    private UserDao userDao;

    @Autowired
    private RoleDao roleDao;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Override
    public void save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        Set<Role> roles = new HashSet<>();
        roles.add(roleDao.getOne(1L));
        user.setRoles(roles);
        userDao.save(user);
    }

    @Override
    public User findByUserName(String username) {
        return userDao.findByUsername(username);
    }
}
