package com.miempresa.javatests.movies.service;

import com.miempresa.javatests.movies.data.MovieRepository;
import com.miempresa.javatests.movies.model.Genre;
import com.miempresa.javatests.movies.model.Movie;

import java.util.Collection;
import java.util.stream.Collectors;

public class MovieService {

    //mi servicio de peliculas necesita el repositorio donde estan guardadas las peliculas
    private MovieRepository movieRepository;

    //necesito un constructor tambien

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }


    public Collection<Movie> findMoviesByGenre(Genre genre) {
        //tipo de retorno, luego lo pensaré

        Collection<Movie> allMovies = movieRepository.findAll().stream()
                .filter(movie -> movie.getGenre()== genre).collect(Collectors.toList());
        return allMovies;
    }


    public Collection<Movie> findMoviesByLength(int length) {

        return movieRepository.findAll().stream()
                .filter(movie -> movie.getMinutes()<= length).collect(Collectors.toList());

    }
}
