package netology.managers;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ManagerTest {
    Film film1 = new Film(1, "Terminator", "action", 1984, 9, "J. Cameron");
    Film film2 = new Film(2, "Green Mile", "drama", 1999, 8, "F. Darabount");
    Film film3 = new Film(3, "1+1", "comedy", 2011, 7, "O. Nakash");
    Film film4 = new Film(4, "Pulp Fiction", "crime", 1994, 10, "Q. Tarantino");

    @Test
    public void FilmAdd() {
        Film[] expected = {film1};
        FilmManager manager = new FilmManager();
        manager.addFilm(film1);
        Film[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FilmsShow() {
        Film[] expected = {film1, film2, film3, film4};
        FilmManager manager = new FilmManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        Film[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void lastAddedLessMax() {
        Film[] expected = {film1, film2, film3, film4};
        FilmManager manager = new FilmManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        Film[] actual = manager.lastAdded();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void lastAddedOverMax() {
        Film[] expected = {film4, film3, film2};
        FilmManager manager = new FilmManager(3);
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        Film[] actual = manager.lastAdded();
        Assertions.assertArrayEquals(expected, actual);
    }
}
