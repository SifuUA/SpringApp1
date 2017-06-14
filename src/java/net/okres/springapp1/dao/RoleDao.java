package net.okres.springapp1.dao;

import net.okres.springapp1.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Alex on 08.06.2017.
 */
public interface RoleDao extends JpaRepository<Role, Long> {
}
