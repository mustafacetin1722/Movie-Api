package com.mustafa.mavieApi.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "movies")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 200)
    @NotBlank(message = "Please provide movies title!")
    private String title;

    @Column(nullable = false)
    @NotBlank(message = "Please provide movies director!")
    private String director;

    @Column(nullable = false)
    @NotBlank(message = "Please provide movies studio!")
    private String studio;

    @ElementCollection
    @CollectionTable(name = "movie_cast")
    private Set<String> movieCast;

    @Column(nullable = false)
    @NotBlank(message = "Please provide movies release year!")
    private Integer releaseYear;

    @Column(nullable = false)
    @NotBlank(message = "Please provide movies poster!")
    private String poster;
}
