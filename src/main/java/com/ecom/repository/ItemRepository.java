package com.ecom.repository;

import com.ecom.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository  extends JpaRepository<Item,Integer> {
}
