package com.miempresa.javatests.movies.data;

import com.miempresa.javatests.movies.model.Genre;
import com.miempresa.javatests.movies.model.Movie;

import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.jdbc.core.RowMapper;

import java.util.Collection;

public class MovieRepositoryJdbc implements MovieRepository {

    private JdbcTemplate jdbcTemplate; //org.springframework

    public MovieRepositoryJdbc(JdbcTemplate jdbcTemplate) {

        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Movie findById(long id) {

        Object[] args = { id };
        return jdbcTemplate.queryForObject("select * from movies where id = ?", args, movieMapper);
    }

    @Override
    public Collection<Movie> findAll() {


        return jdbcTemplate.query("select * from movies", movieMapper);
    }

    @Override
    public void saveOrUpdate(Movie movie) {
        jdbcTemplate.update("insert into movies(name, minutes, genre) values(?, ?, ?)",
                movie.getName(), movie.getMinutes(), movie.getGenre().toString());
    }

    //RowMapper<Movie> inicialmente era un atributo de findAll, pero ya que lo usaremos
    //en otros lados lo sacamos de la funcion y le agregamos private static y se modifica
    //a una lambda
    private static RowMapper<Movie> movieMapper = (rs, nowNum) -> new Movie(
            rs.getInt("id"),
            rs.getString("name"),
            rs.getInt("minutes"),
            Genre.valueOf(rs.getString("genre")));

}
