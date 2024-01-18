package org.kie.kogito.examples;

import io.quarkus.arc.All;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import javax.inject.Singleton;
//import jakarta.persistence.Entity;
//import javax.persistence.Id;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "code_groups")
@Singleton
public class CodeGroup extends PanacheEntity {
    @Id
    private Integer id;
    private String name;
    private CodeType type;
    public static CodeGroup findByName(String name){
        return find("name", name).firstResult();
    }
}
