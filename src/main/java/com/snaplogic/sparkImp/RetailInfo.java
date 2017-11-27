package com.snaplogic.sparkImp;

import java.io.Serializable;

public class RetailInfo implements Serializable {
    private String DRGDefinition;
    private int ProviderId;
    private String ProviderName;
    private String ProviderStreetAddress;
    private String ProviderCity;
    private String ProviderState;
    private String ProviderZipCode;
    private String HospitalReferralRegionDescription;
    private double TotalDischarges;
    private double AverageCoveredCharges;
    private double AverageTotalPayments;
    private double AverageMedicarePayments;

    public RetailInfo(){
        setDRGDefinition("");
        setProviderId(0);
        setProviderName("");
        setProviderStreetAddress("");
        setProviderCity("");
        setProviderState("");
        setProviderZipCode("");
        setHospitalReferralRegionDescription("");
        setTotalDischarges(0);
        setAverageCoveredCharges(0);
        setAverageTotalPayments(0);
        setAverageMedicarePayments(0);
    }

    public void set(String[] values){
        if(values.length==12){
            setDRGDefinition(values[0]);
            setProviderId(Integer.valueOf(values[1]));
            setProviderName(values[2]);
            setProviderStreetAddress(values[3]);
            setProviderCity(values[4]);
            setProviderState(values[5]);
            setProviderZipCode(values[6]);
            setHospitalReferralRegionDescription(values[7]);
            setTotalDischarges(Double.valueOf(values[8]));
            setAverageCoveredCharges(Double.valueOf(values[9].substring(1)));
            setAverageTotalPayments(Double.valueOf(values[10].substring(1)));
            setAverageMedicarePayments(Double.valueOf(values[11].substring(1)));
        }
    }

    public String getDRGDefinition() {
        return DRGDefinition;
    }

    public void setDRGDefinition(String DRGDefinition) {
        this.DRGDefinition = DRGDefinition;
    }

    public int getProviderId() {
        return ProviderId;
    }

    public void setProviderId(int providerId) {
        ProviderId = providerId;
    }

    public String getProviderName() {
        return ProviderName;
    }

    public void setProviderName(String providerName) {
        ProviderName = providerName;
    }

    public String getProviderStreetAddress() {
        return ProviderStreetAddress;
    }

    public void setProviderStreetAddress(String providerStreetAddress) {
        ProviderStreetAddress = providerStreetAddress;
    }

    public String getProviderCity() {
        return ProviderCity;
    }

    public void setProviderCity(String providerCity) {
        ProviderCity = providerCity;
    }

    public String getProviderState() {
        return ProviderState;
    }

    public void setProviderState(String providerState) {
        ProviderState = providerState;
    }

    public String getProviderZipCode() {
        return ProviderZipCode;
    }

    public void setProviderZipCode(String providerZipCode) {
        ProviderZipCode = providerZipCode;
    }

    public String getHospitalReferralRegionDescription() {
        return HospitalReferralRegionDescription;
    }

    public void setHospitalReferralRegionDescription(String hospitalReferralRegionDescription) {
        HospitalReferralRegionDescription = hospitalReferralRegionDescription;
    }

    public double getTotalDischarges() {
        return TotalDischarges;
    }

    public void setTotalDischarges(double totalDischarges) {
        TotalDischarges = totalDischarges;
    }

    public double getAverageCoveredCharges() {
        return AverageCoveredCharges;
    }

    public void setAverageCoveredCharges(double averageCoveredCharges) {
        AverageCoveredCharges = averageCoveredCharges;
    }

    public double getAverageTotalPayments() {
        return AverageTotalPayments;
    }

    public void setAverageTotalPayments(double averageTotalPayments) {
        AverageTotalPayments = averageTotalPayments;
    }

    public double getAverageMedicarePayments() {
        return AverageMedicarePayments;
    }

    public void setAverageMedicarePayments(double averageMedicarePayments) {
        AverageMedicarePayments = averageMedicarePayments;
    }

    @Override
    public String toString() {
        return String.format("%s\t%d\t%s\t%s\t%s\t%s\t%s\t%s\t%.2f\t%.2f\t%.2f\t%.2f",
                this.DRGDefinition,
                this.ProviderId,
                this.ProviderName,
                this.ProviderStreetAddress,
                this.ProviderCity,
                this.ProviderState,
                this.ProviderZipCode,
                this.HospitalReferralRegionDescription,
                this.TotalDischarges,
                this.AverageCoveredCharges,
                this.AverageTotalPayments,
                this.AverageMedicarePayments);
    }
}
