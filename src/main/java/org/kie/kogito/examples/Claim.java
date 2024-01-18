package org.kie.kogito.examples;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;
@Data
@NoArgsConstructor
public class Claim {
    private Integer id;
    private Integer rootID;
    private Integer idCaller;
    private String IDPayer;
    private String memberID;
    private String payerID;
    private String providerID;
    private String emiratesIDNumber;
    private float gross;
    private float patientShare;
    private float net;
    private float providerInvoiceAmount;
    private String denialCode;
    private String paymentReference;
    private Date dateSettlement;
    private Boolean pending;
    private Boolean imported;
    private String status;
    private Boolean fileAttached;
    private Contract contract;
    private List<Activity> activities;
    private ClaimType claimType;
    private List<Diagnosis> diagnoses;
    private Encounter encounter;
    private Patient patient;
    private RegulatorMemberInfo regulatorMemberInfo;
}
