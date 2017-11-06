package com.manivchuk.bean.interfaces;

import com.manivchuk.entities.Genre;

import java.util.List;

/**
 * Created by nec on 06.11.17.
 */
public interface GenreDao {
    List<Genre> getGenres();
}
