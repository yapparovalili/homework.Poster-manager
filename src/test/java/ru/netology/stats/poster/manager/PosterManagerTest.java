package ru.netology.stats.poster.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    @Test

    public void testAddMovie() {
        PosterManager manager = new PosterManager(10);

        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");

        String[] actual = manager.findAll();
        String[] expected = {"Film I", "Film II", "Film III"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void testFindLast() {
        PosterManager manager = new PosterManager(10);

        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");
        manager.addMovie("Film IV");
        manager.addMovie("Film V");
        manager.addMovie("Film VI");
        manager.addMovie("Film VII");
        manager.addMovie("Film VIII");


        String[] actual = manager.findLast();
        String[] expected = {"Film VIII", "Film VII", "Film VI", "Film V", "Film IV", "Film III", "Film II", "Film I"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void testMaxFindLast() {
        PosterManager manager = new PosterManager();

        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");
        manager.addMovie("Film IV");
        manager.addMovie("Film V");
        manager.addMovie("Film VI");
        manager.addMovie("Film VII");
        manager.addMovie("Film VIII");
        manager.addMovie("Film IX");
        manager.addMovie("Film X");


        String[] actual = manager.findLast();
        String[] expected = {"Film X", "Film IX", "Film VIII", "Film VII", "Film VI", "Film V", "Film IV", "Film III", "Film II", "Film I"};

        Assertions.assertArrayEquals(expected, actual);
    }
}
