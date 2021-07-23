package xyz.theadityamishra.movieapi.service

import org.springframework.stereotype.Service
import xyz.theadityamishra.movieapi.dto.MovieDTO
import xyz.theadityamishra.movieapi.repository.MovieRepository
import xyz.theadityamishra.movieapi.utils.mapper.MovieMapperImpl
import java.lang.IllegalArgumentException

@Service
class MovieServiceImpl(
    private val movieRepository: MovieRepository,
    private val movieMapper: MovieMapperImpl
) : MovieService
{

    override fun createMovie(movieDTO: MovieDTO): MovieDTO
    {
        if (movieDTO.id != -1)
            throw IllegalArgumentException("ID should be null or -1")

        val movie = movieMapper.toEntity(movieDTO)
        movieRepository.save(movie)
        return movieMapper.fromEntity(movie)
    }
}