package ua.klunniy.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.klunniy.spring.config.SpringConfig;
import ua.klunniy.spring.controller.MusicPlayer;
import ua.klunniy.spring.model.Ganr;
import ua.klunniy.spring.model.Music;

/**
 * @author Serhii Klunniy
 */
public class Main {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context =
//                new ClassPathXmlApplicationContext("applicationContext.xml");

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusics(Ganr.ROCK);

        context.close();
    }

}
