package ua.klunniy.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import ua.klunniy.spring.controller.MusicPlayer;
import ua.klunniy.spring.model.Ganr;
import ua.klunniy.spring.model.Music;
import ua.klunniy.spring.model.impl.ClassicalMusic;
import ua.klunniy.spring.model.impl.RapMusic;
import ua.klunniy.spring.model.impl.RockMusic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Serhii Klunniy
 */
@Configuration
//@ComponentScan("ua.klunniy.spring")
@PropertySource("classpath:properties.yaml")
public class SpringConfig {

    @Bean
    public List<Ganr> ganrList() {
        List<Ganr> ganrList = new ArrayList<>();
        ganrList.add(Ganr.CLASSICAL);
        ganrList.add(Ganr.ROCK);
        ganrList.add(Ganr.RAP);
        return ganrList;
    }

    @Bean
    public List<Music> musicList() {
        List<Music> musicList = new ArrayList<>();
        musicList.add(classicalMusic());
        musicList.add(rockMusic());
        musicList.add(rapMusic());
        return musicList;
    }

    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public RapMusic rapMusic() {
        return new RapMusic();
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicList());
    }

}
