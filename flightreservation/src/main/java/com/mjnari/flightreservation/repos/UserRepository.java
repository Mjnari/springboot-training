package com.mjnari.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mjnari.flightreservation.models.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

}
