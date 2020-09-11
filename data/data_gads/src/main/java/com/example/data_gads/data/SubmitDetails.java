
package com.example.data_gads.data;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SubmitDetails {

    @SerializedName("entry.1659819444")
    @Expose
    final String firstName;

    @SerializedName("entry.472564179")
    @Expose
    final String lastName;

    @SerializedName("entry.285899941")
    @Expose
    final String personalPhone;

    @SerializedName("entry.699265956")
    @Expose
    final String businessName;

    @SerializedName("entry.922324374")
    @Expose
    final String locationOfBusiness;

    @SerializedName("entry.163074460")
    @Expose
    final String businessEmail;

    @SerializedName("entry.729953638")
    @Expose
    final String businessPhone;

    @SerializedName("entry.352488134")
    @Expose
    final String governmentStat;

    @SerializedName("entry.1293650130")
    @Expose
    final String additionalInfo;

    public SubmitDetails(
            String firstName, String lastName, String personalPhone,
            String businessName, String locationOfBusiness, String businessEmail,
            String businessPhone, String governmentStat, String additionalInfo
    ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.personalPhone = personalPhone;
        this.businessName = businessName;
        this.locationOfBusiness = locationOfBusiness;
        this.businessEmail = businessEmail;
        this.businessPhone = businessPhone;
        this.governmentStat = governmentStat;
        this.additionalInfo = additionalInfo;
    }
}
