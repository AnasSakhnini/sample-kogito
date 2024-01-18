package org.kie.kogito.examples;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
public class Encounter {
    private Integer id;
    private Integer idCaller;
    private String facilityID;
    private Integer type;
    private String patientID;
    private Date start;
    private Date end;
    private Integer startType;
    private Integer endType;
    private String transferSource;
    private String transferDestination;
    private Integer newPatient;
    private String orderingClinician;
    private Float birthWeight;
    private Authorisation authorisation;
    private VitalSigns vitalSigns;
}
