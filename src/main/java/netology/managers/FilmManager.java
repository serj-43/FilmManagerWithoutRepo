package netology.managers;


public class FilmManager {
    private int maxFilms = 10;
    private Film[] items = new Film[0];

    public FilmManager(int maxFilms) {
        this.maxFilms = maxFilms;
    }

    public FilmManager() {
    }

    public void addFilm(Film film) {
        Film[] tmp = new Film[items.length + 1];
        System.arraycopy(items, 0, tmp, 0, items.length);
        tmp[tmp.length - 1] = film;
        items = tmp;
    }

    public Film[] findAll() {
        return items;
    }

    public Film[] lastAdded() {
        Film[] tmp = new Film[this.maxFilms];
        if (items.length <= this.maxFilms) {
            tmp = this.findAll();
        } else {
            int j = 0;
            for (int i = items.length - 1; i > (items.length - 1 - this.maxFilms); i--) {
                tmp[j] = items[i];
                j++;
            }
        }
        return tmp;
    }
}
