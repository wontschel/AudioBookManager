package jk.abm.dao;

import jk.abm.AppConfig;
import jk.abm.model.AudioBook;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Date;

/**
 * Created by wontschel on 17.04.2016.
 */
public class AudioBookDaoTest {

    @Test
    private void saveAudioBookTest(){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

        ctx.register(AppConfig.class);
        ctx.refresh();

        IAudioBookDao pdao = ctx.getBean(IAudioBookDao.class);

        AudioBook audioBook = new AudioBook(1,"AudioBook1",1,new Date());


        pdao.saveAudioBook(audioBook);

        System.out.println("Done");

    }

}
