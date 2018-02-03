package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class Application {

    public static void main (String[] args) {

        MovieStore movieStore = new MovieStore();
        movieStore.getMovies().entrySet().stream().forEach(System.out::println);

        String resultOfTranslateMovies = movieStore.getMovies().values().stream().flatMap(a -> a.stream()).collect(Collectors.joining("!"));

        System.out.println(resultOfTranslateMovies);
    }
}
