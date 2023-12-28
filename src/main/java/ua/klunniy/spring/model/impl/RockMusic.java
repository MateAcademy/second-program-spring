package ua.klunniy.spring.model.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ua.klunniy.spring.model.Music;

/**
 * @author Serhii Klunniy
 */
@Component
@Scope("singleton")
public class RockMusic implements Music {

    private final String[] songs = {"rock song-1", "rock song-2", "rock song-3"};

    public String[] getSongs() {
        return songs;
    }
}
