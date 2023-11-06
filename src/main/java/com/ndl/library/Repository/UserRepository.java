package com.ndl.library.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ndl.library.Model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
