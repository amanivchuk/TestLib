package com.manivchuk.bean.impl;

import com.manivchuk.bean.interfaces.BookDao;
import com.manivchuk.entities.Author;
import com.manivchuk.entities.Book;
import com.manivchuk.entities.Genre;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by nec on 02.11.17.
 */
@Component
public class BookDaoImpl implements BookDao {

    @Autowired
    private SessionFactory sessionFactory;
    private List<Book> books;

    private ProjectionList projectionList;

    public BookDaoImpl() {
        this.projectionList = Projections.projectionList();
        projectionList.add(Projections.property("id"),"id");
        projectionList.add(Projections.property("name"),"name");
        projectionList.add(Projections.property("genre"),"genre");
        projectionList.add(Projections.property("pageCount"),"pageCount");
        projectionList.add(Projections.property("isbn"),"isbn");
        projectionList.add(Projections.property("publisher"),"publisher");
        projectionList.add(Projections.property("author"),"author");
        projectionList.add(Projections.property("publishYear"),"publishYear");
        projectionList.add(Projections.property("descr"),"descr");
        projectionList.add(Projections.property("rating"),"rating");
    }

    @Transactional
    public List<Book> getBooks() {
       /* books = (List<Book>) sessionFactory.getCurrentSession()
                .createCriteria(Book.class)
                .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
*/
        DetachedCriteria bookListCriteria = DetachedCriteria.forClass(Book.class, "b");
        createAliases(bookListCriteria);
        List<Book> books = creteBookList(bookListCriteria);
        return books;
    }

    private void createAliases(DetachedCriteria criteria){
        criteria.createAlias("b.author", "author");
        criteria.createAlias("b.genre", "genre");
        criteria.createAlias("b.publisher", "publisher");
    }
    private List<Book> creteBookList (DetachedCriteria bookListCriteria){
        Criteria criteria = bookListCriteria.getExecutableCriteria(sessionFactory.getCurrentSession());
        criteria.addOrder(Order.asc("b.name")).setProjection(projectionList).setResultTransformer(Transformers.aliasToBean(Book.class));
        return criteria.list();
    }

    public List<Book> getBooks(Author author) {
        return null;
    }

    public List<Book> getBooks(String bookName) {
        return null;
    }

    public List<Book> getBooks(Genre genre) {
        return null;
    }

    public List<Book> getBooks(Character letter) {
        return null;
    }
}
