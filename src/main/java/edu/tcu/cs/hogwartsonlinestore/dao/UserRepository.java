package edu.tcu.cs.hogwartsonlinestore.dao;

import edu.tcu.cs.hogwartsonlinestore.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    public User findByUsername(String username);
}
