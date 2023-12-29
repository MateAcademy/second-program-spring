package ua.klunniy.spring.model.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ua.klunniy.spring.model.Ganr;
import ua.klunniy.spring.model.Music;

/**
 * @author Serhii Klunniy
 */
//@Component
//@Scope("singleton")
public class ClassicalMusic implements Music {

    private final Ganr ganr = Ganr.CLASSICAL;
    private final String[] songs = {"classical song-1", "classical song-2", "classical song-3"};

    public String[] getSongs() {
        return songs;
    }

    public Ganr getGanr() {
        return ganr;
    }

}
