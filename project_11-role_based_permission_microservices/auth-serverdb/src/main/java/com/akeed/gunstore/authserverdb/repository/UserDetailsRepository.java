package com.akeed.gunstore.authserverdb.repository;

import com.akeed.gunstore.authserverdb.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserDetailsRepository extends JpaRepository<User,Integer> {

    Optional<User>findByUsername(String name);
}
