package com.FashNova.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FashNova.model.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {



}
