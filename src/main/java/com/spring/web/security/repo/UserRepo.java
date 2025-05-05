package com.spring.web.security.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.web.security.model.Users;

@Repository
public interface UserRepo extends JpaRepository<Users, String>{

	Users findByUsername(String username);

}
