package pl.sarraa12.moviesmanager.domain.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "locations")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Location extends AbstractEntity{
    private String city;
    private String country;
//    @ManyToMany
//    private List<Movie> movies = new ArrayList<>();
}
