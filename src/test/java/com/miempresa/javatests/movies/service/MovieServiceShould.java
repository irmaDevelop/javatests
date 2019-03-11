package com.miempresa.javatests.movies.service;

import com.miempresa.javatests.movies.data.MovieRepository;
import com.miempresa.javatests.movies.model.Genre;
import com.miempresa.javatests.movies.model.Movie;
import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class MovieServiceShould {

    private MovieService movieService;


    //se coloca para que se ejecute antes de cualquier test, de lo contraria tendriamos que
    //estar duplicando en cada test.

    @Before
    public void setUp() throws Exception {
        //En el test necesito especificar el repositorio tambien
        //que aunque no esta implementada aun la interface usaremos mockito
        //e indicamos que queremos un mock de MovieRepository.class
        MovieRepository movieRepository = Mockito.mock(MovieRepository.class);

        Mockito.when(movieRepository.findAll()).thenReturn(
                Arrays.asList(
                        new Movie(1, "Dark Knight", 152, Genre.ACTION),
                        new Movie(2, "Memento",     113, Genre.THRILLER),
                        new Movie(3, "There's Something About Mary", 119, Genre.COMEDY),
                        new Movie(4, "Super 8", 112, Genre.THRILLER),
                        new Movie(5, "Scream", 111, Genre.HORROR),
                        new Movie(6, "Home Alone", 103, Genre.COMEDY),
                        new Movie(7, "Matrix", 136, Genre.ACTION)

                )
        );
        //necesito mi movieService
        //le puedo pasar el repositorio anterior a mi servicio
        movieService = new MovieService(movieRepository); //luego de esto ya no se marca en rojo en el test

        //necesito que movieService
        //sea un atributo de la clase
    }

    @Test
    public void return_movie_by_genre() {

        //necesito que mi movieService pueda encontrar películas por género.
        Collection<Movie> movies = movieService.findMoviesByGenre(Genre.COMEDY); //debe devolver las comedias
        assertThat(getMovieIds(movies), CoreMatchers.is(Arrays.asList(3, 6))); //3 y 6 son los ids de comedias

    }

    @Test
    public void return_movies_by_length(){

        Collection<Movie> movies = movieService.findMoviesByLength(119);
        assertThat(getMovieIds(movies), CoreMatchers.is(Arrays.asList(2, 3, 4, 5, 6))); //son las menores iguales a 119 de duration

    }

    private List<Integer> getMovieIds(Collection<Movie> movies) {
        //como comprobamos que devuelve las peliculas de comedia que estamos buscando
        return movies.stream().map(movie -> movie.getId()).collect(Collectors.toList());
    }
}