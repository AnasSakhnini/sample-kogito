package org.kie.kogito.examples;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Observation {
    private Integer id;
    private Integer idCaller;
    private String type;
    private String code;
    private String value;
    private String valueType;
}
