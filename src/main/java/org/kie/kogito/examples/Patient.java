package org.kie.kogito.examples;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
public class Patient {
    private Integer id;
    private Integer idCaller;
    private String patientName;
    private String patientSurname;
    private String genderId;
    private String emiratesId;
    private String passportId;
    private String drivingLicense;
    private Date dateOfBirth;
    private String nationality;
    private String martialStatus;
    private Integer emirateTypes;
    private PatientInsurance patientInsurance;
}
