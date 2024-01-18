package org.kie.kogito.examples;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
public class Diagnosis {
    private Integer id;
    private Integer idCaller;
    private String type;
    private String code;
    private String providerType;
    private String providerCode;
    private List<DxInfo> dxInfo;
}
