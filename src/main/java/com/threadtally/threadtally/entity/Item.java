package com.threadtally.threadtally.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="items")
public class Item {

    @Id
    @SequenceGenerator(name="item_seq_gen", sequenceName = "item_id_gen",allocationSize=1)
    @GeneratedValue(generator ="item_seq_gen", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name="item_name",nullable = false)
    private String itemName;

    @Column(name="item_quantiy",nullable = false)
    private Integer itemQuantity;

    @Column(name="item_price",nullable = false)
    private Double itemPrice;

}
