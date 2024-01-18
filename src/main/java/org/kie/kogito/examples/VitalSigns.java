package org.kie.kogito.examples;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class VitalSigns {
    private Integer id;
    private float bpSYSTOLIC;
    private float height;
    private float heartRate;
    private float glucoseLevel;
    private float sao2;
    private float temperature;
    private float weight;
    private float spo2;
    private String bp;
    private float bpDIASTOLIC;
    private float  respiratoryRate ;
    private Integer illnessDuration  ;
    private String lmp ;
}
