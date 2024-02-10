package com.via.vwitter.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.via.vwitter.models.AppUser;

@Repository
public interface UserRepository extends JpaRepository<AppUser, Integer>{
    
    Optional<AppUser> findByUsername(String username);
}
