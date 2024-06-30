package com.crud_restful_apis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud_restful_apis.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	
}
