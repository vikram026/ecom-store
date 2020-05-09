package com.ecom.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
public class OrderedItems {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int itemId;

    private int qty;


}
