package pl.sarraa12.moviesmanager.domain.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "types")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Type extends AbstractEntity{
    private String name;
    private String description;

}
