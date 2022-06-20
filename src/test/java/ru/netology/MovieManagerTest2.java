package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovieManagerTest2 {

    @Test
    public void findLast() {
        MovieManager manager = new MovieManager();
        manager.setItems(new String[]{"Film 1", "Film 2", "Film 3", "Film 4", "Film 5", "Film 6", "Film 7", "Film 8", "Film 9", "Film 10", "Film 11"});

        String[] expected = {"Film 11", "Film 10", "Film 9", "Film 8", "Film 7", "Film 6", "Film 5", "Film 4", "v 3", "Film 2"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRunManager() {
        MovieManager manager = new MovieManager(5);

        int expected = 5;
        int actual = manager.getFindLast();

        assertEquals(expected, actual);
    }


}
