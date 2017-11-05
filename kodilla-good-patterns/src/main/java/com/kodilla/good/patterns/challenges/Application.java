package com.kodilla.good.patterns.challenges;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        Map<String, List<String>> movieMap = movieStore.getMovies();

        movieMap.entrySet()
                .stream()
                .forEach(n -> System.out.println(n.getKey() + n.getValue().stream().
                        collect(Collectors.joining("!", " ", ""))));
    }
}
