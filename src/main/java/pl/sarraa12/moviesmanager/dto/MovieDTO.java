package pl.sarraa12.moviesmanager.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieDTO {

    private String originalName;
    private String polishName;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate premiereDate;
    @NotNull
    private Long locationId;

}
