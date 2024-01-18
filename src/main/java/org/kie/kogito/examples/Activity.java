package org.kie.kogito.examples;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
@Data
@NoArgsConstructor
public class Activity {
    private Integer id;
    protected String activityID;
    private Integer idCaller;
    private Date start;
    private CodeType type;
    private String code;
    private float quantity;
    private float net;
    private float providerNet;
    private String clinician;
    private String orderingClinician;
    private String priorAuthorizationID;
    private float list;
    private float gross;
    private float patientShare;
    private float paymentAmount;
    private String denialCode;
    private float copayment;
    private float deductible;
    private Boolean manualPrices;
    private Integer providerType;
    private String providerCode;
    private float sysNet;
    private float sysList;
    private float providerPatientShare;
    private List<Observation> observation;
}
