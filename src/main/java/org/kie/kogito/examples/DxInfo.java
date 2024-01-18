package org.kie.kogito.examples;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DxInfo {
    private Integer id;
    private DxInfoType type;
    private String code;
}
