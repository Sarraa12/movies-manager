package pl.sarraa12.moviesmanager.domain.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "people")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Person extends AbstractEntity{
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String country;


}
