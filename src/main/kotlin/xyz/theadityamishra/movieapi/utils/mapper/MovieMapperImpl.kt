package xyz.theadityamishra.movieapi.utils.mapper

import org.springframework.stereotype.Component
import org.springframework.stereotype.Service
import xyz.theadityamishra.movieapi.dto.MovieDTO
import xyz.theadityamishra.movieapi.entity.Movie

@Service
class MovieMapperImpl : Mapper<MovieDTO, Movie>
{

    override fun fromEntity(entity: Movie) = MovieDTO(
            entity.id,
            entity.name,
            entity.rating
        )

    override fun toEntity(domain: MovieDTO)= Movie(
            domain.id,
            domain.name,
            domain.rating
    )
}