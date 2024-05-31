package com.rad.onlineshop.repository;


import com.rad.onlineshop.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
