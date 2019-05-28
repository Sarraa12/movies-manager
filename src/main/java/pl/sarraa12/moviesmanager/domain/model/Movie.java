package pl.sarraa12.moviesmanager.domain.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "movies")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Movie extends AbstractEntity{
    private String originalName;
    private String polishName;
    private LocalDate year;
    private String country;

    // type
    // aktorzy
    // reżyserzy
    // scenarzyści

}
