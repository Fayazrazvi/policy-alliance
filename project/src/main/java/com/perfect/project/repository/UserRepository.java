package com.perfect.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.perfect.project.entity.User;

public interface UserRepository extends JpaRepository<User ,Long> {

}
