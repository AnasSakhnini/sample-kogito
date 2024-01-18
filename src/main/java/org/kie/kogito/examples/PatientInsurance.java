package org.kie.kogito.examples;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
@Data
@NoArgsConstructor
public class PatientInsurance {
    private Integer id;
    private Integer idCaller;
    private String patientInsuranceId;
    private String relationTo;
    private String principleInsuranceId;
    private String insuranceLisence;
    private String packageName;
    private String networkName;
    private Integer networkId;
    private String subNetworkName;
    private Integer subNetworkId;
    private String planName;
    private Integer planId;
    private Date startDate;
    private Date renewalDate;
    private Date endDate;
    private float grossPremium;
    private String policyHolderTypeId;
    private String principleInsuranceNumber;
    private Integer isExpired;
    private String policyNumber;
    private Integer verified;
    private Integer admissionType;
    private Integer isPending;
    private Integer maternity;
    private Integer dental;
    private Integer optical;
    private List<CoPayment> coPayments;
    private List<Deductible> deductibles;
}
