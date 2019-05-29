package pl.sarraa12.moviesmanager.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sarraa12.moviesmanager.domain.model.Location;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
