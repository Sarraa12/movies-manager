package pl.sarraa12.moviesmanager.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchMovieDTO {

    private String originalName;
    private String polishName;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate startYear;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate endYear;
    private String country;

}
