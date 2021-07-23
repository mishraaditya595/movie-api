package xyz.theadityamishra.movieapi.repository

import org.springframework.data.repository.CrudRepository
import xyz.theadityamishra.movieapi.dto.MovieDTO
import xyz.theadityamishra.movieapi.entity.Movie

interface MovieRepository: CrudRepository<Movie, Int>
