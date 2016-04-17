package jk.abm.dao;

import jk.abm.model.AudioBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import javax.transaction.Transactional;

@Transactional
public class AudioBookDao implements IAudioBookDao{
    @Autowired
    private HibernateTemplate hibernateTemplate;

    public void saveAudioBook(AudioBook audioBook) {

        hibernateTemplate.save(audioBook);

    }
}



