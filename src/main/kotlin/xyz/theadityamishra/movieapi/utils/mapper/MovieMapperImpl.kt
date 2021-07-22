package xyz.theadityamishra.movieapi.utils.mapper

import xyz.theadityamishra.movieapi.dto.MovieDTO
import xyz.theadityamishra.movieapi.entity.Movie

class MovieMapperImpl<D, E> : Mapper<MovieDTO, Movie>
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