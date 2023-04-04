package com.niit.repository;

import com.niit.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String>{

   // User findRegistrationToLogin(String email, String password);
}

