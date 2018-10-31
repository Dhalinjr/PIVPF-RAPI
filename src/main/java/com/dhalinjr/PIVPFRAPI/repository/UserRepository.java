package com.dhalinjr.PIVPFRAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dhalinjr.PIVPFRAPI.entity.User;


public interface UserRepository extends JpaRepository<User, Long> {
	User findOneByUsername(String username);
}
