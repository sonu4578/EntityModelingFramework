package com.wellsfargo.counselor.entity;



import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioID;

    @Column(nullable = false)
    private String portfolioName;

    @Column(nullable = false)
    private long totalValue;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createTimestamp;

    @Column(nullable = false)
    private LocalDateTime updateTimestamp;

    @OneToOne
    @JoinColumn(name = "clientID", nullable = false)
    private Client client;

    protected Portfolio() {

    }

    public Portfolio(String portfolioName, long totalValue, LocalDateTime createTimestamp, LocalDateTime updateTimestamp,Client client) {
        this.portfolioName = portfolioName;
        this.totalValue = totalValue;
        this.createTimestamp = createTimestamp;
        this.updateTimestamp = updateTimestamp;
        this.client = client;

    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
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

    public Long getPortfolioID() {
        return portfolioID;
    }

    public String getPortfolioName() {
        return portfolioName;
    }

    public void setPortfolioName(String PortfolioName) {
        this.portfolioName = PortfolioName;
    }

    public long getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(long TotalValue) {
        this.totalValue = TotalValue;
    }


    }







