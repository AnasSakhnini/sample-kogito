package org.kie.kogito.examples;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
public class RegulatorMemberInfo {
    private Integer id;
    private Integer idCaller;
    private Date transactionDate;
    private String referenceNumber;
    private String policyID;
    private Date enrollmentDate;
    private Date deletionDate;
    private String uidNumber;
    private Date dateOfBirth;
    private Integer gender;
    private String payerID;
    private String payerName;
    private String firstName;
    private String secondName;
    private String familyName;
}
