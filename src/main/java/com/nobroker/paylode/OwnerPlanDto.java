package com.nobroker.paylode;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class OwnerPlanDto {


    private long planId;
    private String planName;
    private double price;
    private int planValidity;
    private boolean relationShipManager;
    private boolean rentalAgreement;
    private boolean propertyPromotion;
    private boolean guaranteedTenants;
    private boolean showingProperty;
    private boolean facebookMarketingOfProperty;

    

}
