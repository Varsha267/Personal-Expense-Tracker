package com.example.PersonalFinanceTracker.repository;

import com.example.PersonalFinanceTracker.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AppUserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
