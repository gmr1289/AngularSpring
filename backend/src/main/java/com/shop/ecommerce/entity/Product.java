package com.shop.ecommerce.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "Product")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String sku;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private BigDecimal unitPrice;

    @Column
    private String imageUrl;

    @Column
    private boolean active;

    @Column
    private int stock;

    @Column
    @CreationTimestamp
    private Date created;

    @Column
    @UpdateTimestamp
    private Date updated;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private ProductCategory category;
}
