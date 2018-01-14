package com.kodilla.stream.beautifier;

public class PoemBeutifier {
    public String beautify(String abc, PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate(abc);
        System.out.println("Result after beautify: " + result);
        return result;
    }
}
