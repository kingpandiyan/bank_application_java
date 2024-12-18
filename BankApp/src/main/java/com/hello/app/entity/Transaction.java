package com.hello.app.entity;

import java.time.LocalDate;

public class Transaction{
    private LocalDate transactionDate;
    private String transactionUserId;
    private Double transactionAmount;
    private String transactionType;
    private Double initialBalance;
    private Double finalBalance;
    private String transactionPerformence;

    public Transaction(LocalDate transactionDate, String transactionUserId, Double transactionAmount, String transactionType, Double initialBalance, Double finalBalance, String transactionPerformence) {
        this.transactionDate = transactionDate;
        this.transactionUserId = transactionUserId;
        this.transactionAmount = transactionAmount;
        this.transactionType = transactionType;
        this.initialBalance = initialBalance;
        this.finalBalance = finalBalance;
        this.transactionPerformence = transactionPerformence;
    }

    
    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getTransactionUserId() {
        return transactionUserId;
    }

    public void setTransactionUserId(String transactionUserId) {
        this.transactionUserId = transactionUserId;
    }

    public Double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(Double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public Double getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(Double initialBalance) {
        this.initialBalance = initialBalance;
    }

    public Double getFinalBalance() {
        return finalBalance;
    }

    public void setFinalBalance(Double finalBalance) {
        this.finalBalance = finalBalance;
    }

    public String getTransactionPerformence() {
        return transactionPerformence;
    }

    public void setTransactionPerformence(String transactionPerformence) {
        this.transactionPerformence = transactionPerformence;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Transaction{");
        sb.append("transactionDate=").append(transactionDate);
        sb.append(", transactionUserId=").append(transactionUserId);
        sb.append(", transactionAmount=").append(transactionAmount);
        sb.append(", transactionType=").append(transactionType);
        sb.append(", initialBalance=").append(initialBalance);
        sb.append(", finalBalance=").append(finalBalance);
        sb.append(", transactionPerformence=").append(transactionPerformence);
        sb.append('}');
        return sb.toString();
    }




}