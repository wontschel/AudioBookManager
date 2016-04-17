package jk.abm.dao;

import jk.abm.model.AudioBook;
import jk.abm.model.Directory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;

import javax.transaction.Transactional;

@Transactional
public class DirectoryDao implements IDirectoryDao{
    @Autowired
    private HibernateTemplate hibernateTemplate;

    public void saveDirectory(Directory directory) {

        hibernateTemplate.save(directory);

    }
}