package com.FashNova.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FashNova.model.PasswordResetToken;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Integer> {
	PasswordResetToken findByToken(String token);
}
