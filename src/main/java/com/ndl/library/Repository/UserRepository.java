package com.ndl.library.Repository;

import org.springframework.data.repository.CrudRepository;

import com.ndl.library.Model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
