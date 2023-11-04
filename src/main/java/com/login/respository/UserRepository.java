package com.login.respository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.login.user.master.User;
@Repository

public interface  UserRepository extends JpaRepository<User,Integer>{
	Optional<User> findByUsername(String username);

}