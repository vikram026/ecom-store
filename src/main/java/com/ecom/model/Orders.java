package com.ecom.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int orderId;
    @OneToMany(targetEntity = OrderedItems.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "orderId",referencedColumnName = "orderId")
    private List<OrderedItems> orderedItems;

    private String emailId;
    private int amount;
}
