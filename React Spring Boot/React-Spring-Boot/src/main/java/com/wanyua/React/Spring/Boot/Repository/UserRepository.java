package com.wanyua.React.Spring.Boot.Repository;

import com.wanyua.React.Spring.Boot.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
