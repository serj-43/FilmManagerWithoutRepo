package netology.managers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Film {
    private int id;
    private String filmName;
    private String filmGenre;
    private int releaseYear;
    private int filmRating;
    private String directorName;
}
