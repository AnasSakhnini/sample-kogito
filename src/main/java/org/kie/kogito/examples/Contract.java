package org.kie.kogito.examples;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Contract {
    private Integer id;
    private String packageName;
    private String network;
    private String subNetworkName;
    private String policy;
}
