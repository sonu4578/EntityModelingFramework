package com.wellsfargo.counselor.entity;


import jakarta.persistence.*;

import java.time.LocalDateTime;

public class Client {

    @Id
    @GeneratedValue()
    private long clientID;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createTimestamp;

    @Column(nullable = false)
    private LocalDateTime updateTimestamp;

    @ManyToOne
    @JoinColumn(name = "advisorID", nullable = false)
    private Advisor advisor;
    

    protected Client() {

    }

    public Client(String firstName, String lastName, String address, String phoneNumber, String email, LocalDateTime createTimestamp, LocalDateTime updateTimestamp, Advisor advisor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.createTimestamp = createTimestamp;
        this.updateTimestamp = updateTimestamp;
        this.advisor = advisor;
    }

    public Long clientID() {
        return clientID;
    }

    public LocalDateTime getCreateTimestamp() {
        return createTimestamp;
    }

    public void setCreateTimestamp(LocalDateTime createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    public LocalDateTime getUpdateTimestamp() {
        return updateTimestamp;
    }

    public void setUpdateTimestamp(LocalDateTime updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }

    public Advisor getFinancialAdvisor() {
        return advisor;
    }

    public void setFinancialAdvisor(Advisor financialAdvisor) {
        this.advisor = financialAdvisor;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {return lastName;}

    public void setLastName(String LastName) {
        this.lastName = LastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String Email) {
        this.email = Email;
    }
}