package com.ndl.library.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ndl.library.Model.Publisher;

public interface PublisherRepository extends JpaRepository<Publisher, Integer> {

}
