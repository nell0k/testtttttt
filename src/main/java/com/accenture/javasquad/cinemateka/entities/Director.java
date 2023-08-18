package com.accenture.javasquad.cinemateka.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table (name="movie_directors")
public class Director {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "uu_id")
    private String uuid;
    @Column (name="full_name")
    private String fullName;

    @Column (name="directors_awards")
    private Integer directorsAwards;

    @OneToMany(mappedBy="director")
    private Set<Movie> movies;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Integer getDirectorsAwards() {
        return directorsAwards;
    }

    public void setDirectorsAwards(Integer directorsAwards) {
        this.directorsAwards = directorsAwards;
    }

    public Set<Movie> getMovies() {
        return movies;
    }

    public void setMovies(Set<Movie> movies) {
        this.movies = movies;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
