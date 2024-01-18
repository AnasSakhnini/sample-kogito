package org.kie.kogito.examples;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CoPayment {
    private Long id;
    private String type;
    private int outNet;
    private Double value;
    private Double ceiling;
    private String preAuth;
    private Double claimTotal;
}
