package com.ndl.library.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ndl.library.Model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
