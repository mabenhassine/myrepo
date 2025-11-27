package com.mbh.training.myproject.example.delivery.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Item cannot be null")
    private String item;

    @Min(value = 1, message = "Quantity must be at least 1")
    private int quantity;

    @Min(value = 0, message = "Price must be a positive number")
    private BigDecimal price;

    @Min(value = 0, message = "Promotion must be a positive number")
    private BigDecimal promotionPercentage;

    public Order() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) { this.price = price; }

    public BigDecimal getPromotionPercentage() { return promotionPercentage;}

    public void setPromotionPercentage(BigDecimal promotionPercentage) { this.promotionPercentage = promotionPercentage; }
}

