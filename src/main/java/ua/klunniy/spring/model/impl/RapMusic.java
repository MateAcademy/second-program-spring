package ua.klunniy.spring.model.impl;

import ua.klunniy.spring.model.Ganr;
import ua.klunniy.spring.model.Music;

/**
 * @author Serhii Klunniy
 */
public class RapMusic implements Music {

    private final Ganr ganr = Ganr.RAP;
    private final String[] songs = {"rap song-1", "rap song-2", "rap song-3"};

    public String[] getSongs() {
        return songs;
    }

    public Ganr getGanr() {
        return ganr;
    }

}