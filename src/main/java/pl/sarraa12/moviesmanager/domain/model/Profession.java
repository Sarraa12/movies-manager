package pl.sarraa12.moviesmanager.domain.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "professions")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Profession extends AbstractEntity{
    private String name;
    private String description;

}
