package com.akenge.restapiauthentication.repository;

import com.akenge.restapiauthentication.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    User findUserByNaAndUserName(String userName);
}
