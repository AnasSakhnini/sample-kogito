package org.kie.kogito.examples;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
public class ClaimType {

    public static final String Maternity = "Maternity";
    public static final String Dental = "Dental";
    public static final String Optical = "Optical";
    public static final String Physiotherapy = "Physiotherapy";
    public static final String None = "None";
    private Integer id;
    private String type;
}
