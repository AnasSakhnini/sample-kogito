package org.kie.kogito.examples;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
public class Authorisation {
    private Integer id;
    private Date start;
    private Date end;
    private Boolean verbal;
}
