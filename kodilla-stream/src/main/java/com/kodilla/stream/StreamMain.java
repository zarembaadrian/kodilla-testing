package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeutifier;

public class StreamMain {
    public static void main(String[] args) {

        PoemBeutifier poemBeutifier = new PoemBeutifier();
        poemBeutifier.beautify("Adrian", (abc) -> abc + "a");
        poemBeutifier.beautify("Ronaldo",(abc) -> "False" + abc);
        poemBeutifier.beautify("MaRiA", (abc) -> abc.toLowerCase());
        poemBeutifier.beautify("pepe guardiola", (abc) -> abc.toUpperCase());
        poemBeutifier.beautify("Joseph", (abc) -> abc + abc);

        }
}
