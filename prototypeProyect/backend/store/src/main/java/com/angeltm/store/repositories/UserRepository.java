package com.angeltm.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.angeltm.store.Models.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    
}
