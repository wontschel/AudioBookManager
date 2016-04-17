package jk.abm;

import jk.abm.dao.AudioBookDao;
import jk.abm.dao.DirectoryDao;
import jk.abm.dao.IAudioBookDao;
import jk.abm.dao.IDirectoryDao;
import jk.abm.model.AudioBook;
import jk.abm.model.Directory;
import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;

import javax.sql.DataSource;

/**
 * Created by wontschel on 17.04.2016.
 */
public class AppConfig {
    @Bean
    public IAudioBookDao audioBookDao() {
        return new AudioBookDao();
    }

    @Bean
    public IDirectoryDao directoryDao() {
        return new DirectoryDao();
    }

    @Bean
    public HibernateTemplate hibernateTemplate() {
        return new HibernateTemplate(sessionFactory());
    }

    @Bean
    public SessionFactory sessionFactory() {
        return new LocalSessionFactoryBuilder(getDataSource())
                .addAnnotatedClasses(AudioBook.class)
                .addAnnotatedClasses(Directory.class)
                .buildSessionFactory();
    }

    @Bean
    public DataSource getDataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/shopapp");
        dataSource.setUsername("root");
        dataSource.setPassword("");

        return dataSource;
    }
    @Bean
    public HibernateTransactionManager hibTransMan(){
        return new HibernateTransactionManager(sessionFactory());
    }
}
