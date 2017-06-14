package net.okres.springapp1.dao;

import net.okres.springapp1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Alex on 08.06.2017.
 */
public interface UserDao extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
