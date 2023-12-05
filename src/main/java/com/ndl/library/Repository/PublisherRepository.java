package com.ndl.library.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ndl.library.Model.Publisher;

@Repository
public interface PublisherRepository extends JpaRepository<Publisher, Integer> {

}
