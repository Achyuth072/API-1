package com.ba.LoginApp.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ba.LoginApp.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
	User findByUsername(String username);

}
