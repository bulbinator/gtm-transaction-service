package com.enbridge.gtm.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Transaction {
    @Id
    private String contractId;
    private double gasVolume;
    private String deliveryPoint;

    public Transaction() {}

    public Transaction(String contractId, double gasVolume, String deliveryPoint) {
        this.contractId = contractId;
        this.gasVolume = gasVolume;
        this.deliveryPoint = deliveryPoint;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public double getGasVolume() {
        return gasVolume;
    }

    public void setGasVolume(double gasVolume) {
        this.gasVolume = gasVolume;
    }

    public String getDeliveryPoint() {
        return deliveryPoint;
    }

    public void setDeliveryPoint(String deliveryPoint) {
        this.deliveryPoint = deliveryPoint;
    }
}
