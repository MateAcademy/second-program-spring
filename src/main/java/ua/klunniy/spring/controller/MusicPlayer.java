package ua.klunniy.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ua.klunniy.spring.model.Ganr;
import ua.klunniy.spring.model.Music;
import ua.klunniy.spring.model.impl.ClassicalMusic;

import java.util.List;
import java.util.Random;

/**
 * @author Serhii Klunniy
 */
@Component
@Scope("singleton")
public class MusicPlayer {

    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1,
                       @Qualifier("rockMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public void playMusics(Ganr ganr) {
        Random random = new Random();
        int id = random.nextInt(3);

        if (ganr == Ganr.CLASSICAL) {
            String[] songs = music1.getSongs();
            System.out.println(songs[id]);
        } else if (ganr == Ganr.ROCK) {
            String[] songs = music2.getSongs();
            System.out.println(songs[id]);
        }
    }

}
