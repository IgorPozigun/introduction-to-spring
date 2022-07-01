package org.example.sprincer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSoring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        // Получили объект, который реализует интерфейс music. Данный объект прописывается в "applicationContext.xml"
        //Music music = context.getBean("musicBean", Music.class);
        //MusicPlayer musicPlayer = new MusicPlayer(music);
        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);

        musicPlayer.playMusic();
        context.close();
    }
}
