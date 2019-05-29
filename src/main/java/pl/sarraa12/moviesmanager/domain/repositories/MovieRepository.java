package pl.sarraa12.moviesmanager.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sarraa12.moviesmanager.domain.model.Movie;

import java.time.LocalDate;
import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Long> {

    List<Movie> findByOriginalNameAndPolishNameAndPremiereDateBetween(
            String originalName, String polishName, LocalDate startDate, LocalDate endDate);
}
