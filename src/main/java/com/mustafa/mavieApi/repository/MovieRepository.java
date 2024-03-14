package com.mustafa.mavieApi.repository;

import com.mustafa.mavieApi.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie,Integer> {
}
