package com.devesuperior.dsdelivery.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devesuperior.dsdelivery.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
