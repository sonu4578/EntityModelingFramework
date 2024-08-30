package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

public class Security {

    @Id
    @GeneratedValue()
    private long securityID;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private String purchaseDate;

    @Column(nullable = false)
    private long purchasePrice;

    @Column(nullable = false)
    private long quantity;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createTimestamp;

    @Column(nullable = false)
    private LocalDateTime updateTimestamp;

    @ManyToOne
    @JoinColumn(name = "PortfolioID", nullable = false)
    private Portfolio portfolio;


    protected Security() {

    }

    public Security(String name, String category, String purchaseDate, long purchasePrice, long quantity, LocalDateTime createTimestamp, LocalDateTime updateTimestamp, Portfolio portfolio) {
        this.name = name;
        this.category = category;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
        this.createTimestamp = createTimestamp;
        this.updateTimestamp = updateTimestamp;
        this. portfolio = portfolio;
    }

    public long getQuantity() {
        return quantity;
    }

    public LocalDateTime getCreateTimestamp() {
        return createTimestamp;
    }

    public void setCreateTimestamp(LocalDateTime createTimestamp) {
        createTimestamp = createTimestamp;
    }

    public LocalDateTime getUpdateTimestamp() {
        return updateTimestamp;
    }

    public void setUpdateTimestamp(LocalDateTime updateTimestamp) {
        updateTimestamp = updateTimestamp;
    }

    public Long getSecurityID() {
        return securityID;
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = name;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String Category) {
        this.category = category;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String PurchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public long getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(long purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public long quantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }
}