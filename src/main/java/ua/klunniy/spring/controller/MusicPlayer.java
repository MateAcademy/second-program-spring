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
    List<Music> musicList;

    @Autowired
    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }


    public void playMusics(Ganr ganr) {
        Random random = new Random();
        int id = random.nextInt(3);

        for (Music music : musicList) {
            if (music.getGanr() == ganr) {
                String[] songs = music.getSongs();
                System.out.println(songs[id]);
            }
        }
    }

}
