package com.ecom.repository;

import com.ecom.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository  extends JpaRepository<Orders, Integer> {
    List<Orders> findByEmailId(String emailId);
}
