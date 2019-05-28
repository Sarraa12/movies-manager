package pl.sarraa12.moviesmanager.services.converters;

import pl.sarraa12.moviesmanager.domain.model.Movie;
import pl.sarraa12.moviesmanager.dto.MovieDTO;

public class ConverterFactory {
    public static Movie converterMovie(MovieDTO movieDTO){
        Movie movie = new Movie();
        movie.setOriginalName(movieDTO.getOriginalName());
        movie.setPolishName(movieDTO.getPolishName());
        movie.setYear(movieDTO.getYear());
        movie.setCountry(movieDTO.getCountry());
        return movie;
    }

    public static MovieDTO converterMovieDTO(Movie movie){
        MovieDTO movieDTO = new MovieDTO();
        movieDTO.setOriginalName(movie.getOriginalName());
        movieDTO.setPolishName(movie.getPolishName());
        movieDTO.setYear(movie.getYear());
        movieDTO.setCountry(movie.getCountry());
        return movieDTO;
    }
}
