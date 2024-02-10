package com.via.vwitter.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.via.vwitter.models.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{
    
    Optional<Role> findRoleByAuthority(String authority);
}
