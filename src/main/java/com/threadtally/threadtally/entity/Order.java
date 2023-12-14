package com.threadtally.threadtally.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="orders")
public class Order {
    @Id
    @SequenceGenerator(name="order_seq_gen", sequenceName = "order_id_gen",allocationSize=1)
    @GeneratedValue(generator ="order_seq_gen", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @ManyToOne
    @JoinColumn(name= "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name= "item_id")
    private Item item;

    @Column(name= "sales_quantity", nullable= false)
    private Integer sales_quantity;




   // @Column()
}
