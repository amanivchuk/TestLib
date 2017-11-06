package com.manivchuk.bean.impl;

import com.manivchuk.bean.interfaces.GenreDao;
import com.manivchuk.entities.Genre;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by nec on 06.11.17.
 */
@Component
public class GenreDaoImpl implements GenreDao {
    private List<Genre> genres;

    @Autowired
    private SessionFactory sessionFactory;
    @Transactional
    public List<Genre> getGenres() {

    /*    genres = (List<Genre>) sessionFactory.getCurrentSession()
                .createCriteria(Genre.class)
                .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
*/

        return sessionFactory.getCurrentSession().createCriteria(Genre.class).list();
//        return genres;
    }
}
