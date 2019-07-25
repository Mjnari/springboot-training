package com.mjnari.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mjnari.flightreservation.models.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
