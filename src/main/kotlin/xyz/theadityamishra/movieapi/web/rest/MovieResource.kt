package xyz.theadityamishra.movieapi.web.rest

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import xyz.theadityamishra.movieapi.dto.MovieDTO
import xyz.theadityamishra.movieapi.service.MovieService
import java.lang.IllegalArgumentException

@RestController
class MovieResource(private val movieService: MovieService)
{
    @PostMapping
    fun createMovie(@RequestBody movieDTO: MovieDTO): ResponseEntity<MovieDTO>
    {
        try
        {
            return ResponseEntity(movieService.createMovie(movieDTO), HttpStatus.CREATED)
        }
        catch (e: IllegalArgumentException)
        {
            return ResponseEntity(null, HttpStatus.BAD_REQUEST)
        }
    }
}