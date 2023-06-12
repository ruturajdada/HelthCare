package com.app.jpaRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.user;

public interface userRepo extends JpaRepository<user, Integer>{

}
