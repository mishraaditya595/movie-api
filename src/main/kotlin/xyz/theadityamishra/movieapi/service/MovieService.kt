package xyz.theadityamishra.movieapi.service

import xyz.theadityamishra.movieapi.dto.MovieDTO

interface MovieService
{
    fun createMovie(movieDTO: MovieDTO): MovieDTO
}