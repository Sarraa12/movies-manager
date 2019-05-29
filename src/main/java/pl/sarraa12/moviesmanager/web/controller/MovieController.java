package pl.sarraa12.moviesmanager.web.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.sarraa12.moviesmanager.domain.model.Location;
import pl.sarraa12.moviesmanager.domain.model.Movie;
import pl.sarraa12.moviesmanager.domain.model.User;
import pl.sarraa12.moviesmanager.domain.repositories.LocationRepository;
import pl.sarraa12.moviesmanager.domain.repositories.MovieRepository;
import pl.sarraa12.moviesmanager.dto.MovieDTO;
import pl.sarraa12.moviesmanager.dto.SearchMovieDTO;
import pl.sarraa12.moviesmanager.services.converters.ConverterFactory;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/movies")
public class MovieController {

    private MovieRepository movieRepository;
    private LocationRepository locationRepository;

    public MovieController(MovieRepository movieRepository, LocationRepository locationRepository) {
        this.movieRepository = movieRepository;
        this.locationRepository = locationRepository;
    }

    // find movie
    @GetMapping("/find")
    public String prepareSearchPage(Model model) {
        model.addAttribute("searchMovieForm", new SearchMovieDTO());
        return "searchMovieForm";
    }

    @PostMapping("/find")
    public String search(@Valid @ModelAttribute("searchMovieForm") SearchMovieDTO searchMovieDTO, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "searchMovieForm";
        }
        model.addAttribute("moviesList", movieRepository.findByOriginalNameAndPolishNameAndPremiereDateBetween(
                searchMovieDTO.getOriginalName(), searchMovieDTO.getPolishName(), searchMovieDTO.getStartYear(),
                searchMovieDTO.getEndYear()));
        return "showAllMovies";
    }
    // all movies
    @GetMapping("/showAll")
    public String showList(Model model){
        model.addAttribute("moviesList", movieRepository.findAll());
        return "showAllMovies";
    }
    // add trip
    @PostMapping("/add")
    public String save(@Valid @ModelAttribute("movie")MovieDTO movieDTO, BindingResult result){
        if(result.hasErrors()){
            return "movieForm";
        }
        Movie movieToAdd = ConverterFactory.converterMovie(movieDTO);
        List<Location> locations = locationRepository.findAll();
        movieToAdd.setLocations(locations);
        movieRepository.save(movieToAdd);

        return "redirect:/movies/showAll";
    }
    @GetMapping("/add")
    public String save(Model model){
        model.addAttribute("movie", new MovieDTO());
        model.addAttribute("location", locationRepository.findAll());

        return "movieForm";
    }
    // delete movie
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        movieRepository.deleteById(id);
        return "redirect:/movies/showAll";
    }
    // update trip
    @PostMapping("/update/{id}")
    public String update(@Valid @ModelAttribute("movie") MovieDTO movieDTO, BindingResult result, @PathVariable Long id){
        if (result.hasErrors()){
            return "movieForm";
        }
        Movie movie = ConverterFactory.converterMovie(movieDTO);
        movie.setId(id);
        movieRepository.save(movie);

        return "redirect:/movies/showAll";
    }
    @GetMapping("/update/{id}")
    public String update(@PathVariable Long id, Model model){
        model.addAttribute("movie", ConverterFactory.converterMovieDTO(movieRepository.findById(id).get()));
        return "movieForm";
    }
}