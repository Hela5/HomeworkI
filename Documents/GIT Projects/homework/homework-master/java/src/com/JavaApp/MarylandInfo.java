package com.JavaApp;

import com.google.gson.annotations.SerializedName;

import java.time.LocalDateTime;

public class MarylandInfo {
    @SerializedName("fiscal_year")
    private String fiscalYear;
    @SerializedName("agency_name")
    private String agencyName;
    @SerializedName("vendor_name")
    private String vendorName;
    @SerializedName("vendor_zip")
    private String vendorZip;
    @SerializedName("amount")
    private Double amount;
    @SerializedName("fiscal_period")
    private Integer fiscalPeriod;
    @SerializedName("date")
    private LocalDateTime date;


    public String toString() {
        return "Payments [fiscalYear "  + fiscalYear + ", agencyName " + agencyName+", vendorName " +  vendorName + ", vendorZip " + vendorZip + ", amount " + amount + ", fiscalPeriod " +  fiscalPeriod + ", date " +date ;
    }

/*    public MarylandInfo(String fiscalYear, String agencyName, String vendorName, String vendorZip, Float amount, Integer fiscalPeriod, LocalDateTime date){
        this.fiscalYear = fiscalYear;
        this.agencyName = agencyName;
        this.vendorName = vendorName;
        this.vendorZip = vendorZip;
        this.amount = amount;
        this.fiscalPeriod = fiscalPeriod;
        this.date = date;
    }*/
/*
    public int getFiscalYear() {
        return fiscalYear;
    }

    public void setFiscalYear(int fiscalYear) {
        this.fiscalYear = fiscalYear;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorZip() {
        return vendorZip;
    }

    public void setVendorZip(String vendorZip) {
        this.vendorZip = vendorZip;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getFiscalPeriod() {
        return fiscalPeriod;
    }

    public void setFiscalPeriod(int fiscalPeriod) {
        this.fiscalPeriod = fiscalPeriod;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }*/
}
