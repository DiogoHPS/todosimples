package com.diogo.todosimples.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diogo.todosimples.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


    
}