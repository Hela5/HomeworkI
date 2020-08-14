package com.JavaApp;

import com.google.api.client.util.Key;
import com.google.gson.annotations.SerializedName;

import java.time.LocalDateTime;

public class MarylandInfo {

    @SerializedName("fiscal_year")
    @Key("fiscal_year")
    private Integer fiscalYear;

    @Key("agency_name")
    @SerializedName("agency_name")
    private String agencyName;

    @Key("vendor_name")
    @SerializedName("vendor_name")
    private String vendorName;

    @Key("vendor_zip")
    @SerializedName("vendor_zip")
    private String vendorZip;

    @Key("amount")
    @SerializedName("amount")
    private Double amount;

    @Key("fiscal_period")
    @SerializedName("fiscal_period")
    private Integer fiscalPeriod;

    @Key("date")
    @SerializedName("date")
    private LocalDateTime date;



/*    public String toString() {
        return "Payments [fiscalYear "  + fiscalYear + ", agencyName " + agencyName+", vendorName " +  vendorName + ", vendorZip " + vendorZip + ", amount " + amount + ", fiscalPeriod " +  fiscalPeriod + ", date " +date ;
    }*/

/*    public MarylandInfo(String fiscalYear, String agencyName, String vendorName, String vendorZip, Float amount, Integer fiscalPeriod, LocalDateTime date){
        this.fiscalYear = fiscalYear;
        this.agencyName = agencyName;
        this.vendorName = vendorName;
        this.vendorZip = vendorZip;
        this.amount = amount;
        this.fiscalPeriod = fiscalPeriod;
        this.date = date;
    }*/
    public Integer getFiscalYear() {
        return fiscalYear;
    }

    public void setFiscalYear(Integer fiscalYear) {
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

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getFiscalPeriod() {
        return fiscalPeriod;
    }

    public void setFiscalPeriod(Integer fiscalPeriod) {
        this.fiscalPeriod = fiscalPeriod;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
