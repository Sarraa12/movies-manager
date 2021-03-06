package pl.sarraa12.moviesmanager.domain.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
    private LocalDate premiereDate;
    @ManyToMany
    private List<Location> locations = new ArrayList<>();


}
