package com.ecom.repository;

import com.ecom.model.OrderedItems;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderedItemsRepository extends JpaRepository<OrderedItems,Integer> {

}
