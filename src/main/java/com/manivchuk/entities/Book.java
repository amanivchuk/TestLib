package com.manivchuk.entities;

import java.util.Arrays;

/**
 * Created by nec on 02.11.17.
 */
public class Book {
    private long id;
    private Author author;
    private Genre genre;
    private Publisher publisher;
    private String name;
    private byte[] content;
    private Integer pageCount;
    private String isbn;
    private Integer publishYear;
    private byte[] image;
    private String descr;
    private Integer rating;
    private Long voteCount;

    public Book() {
    }

    public Book(long id, Author author, Genre genre, Publisher publisher, String name, byte[] content, Integer pageCount, String isbn, Integer publishYear, byte[] image, String descr, Integer rating, Long voteCount) {
        this.id = id;
        this.author = author;
        this.genre = genre;
        this.publisher = publisher;
        this.name = name;
        this.content = content;
        this.pageCount = pageCount;
        this.isbn = isbn;
        this.publishYear = publishYear;
        this.image = image;
        this.descr = descr;
        this.rating = rating;
        this.voteCount = voteCount;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(Integer publishYear) {
        this.publishYear = publishYear;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Long getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(Long voteCount) {
        this.voteCount = voteCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (id != book.id) return false;
        if (author != null ? !author.equals(book.author) : book.author != null) return false;
        if (genre != null ? !genre.equals(book.genre) : book.genre != null) return false;
        if (publisher != null ? !publisher.equals(book.publisher) : book.publisher != null) return false;
        if (name != null ? !name.equals(book.name) : book.name != null) return false;
        if (!Arrays.equals(content, book.content)) return false;
        if (pageCount != null ? !pageCount.equals(book.pageCount) : book.pageCount != null) return false;
        if (isbn != null ? !isbn.equals(book.isbn) : book.isbn != null) return false;
        if (publishYear != null ? !publishYear.equals(book.publishYear) : book.publishYear != null) return false;
        if (!Arrays.equals(image, book.image)) return false;
        if (descr != null ? !descr.equals(book.descr) : book.descr != null) return false;
        if (rating != null ? !rating.equals(book.rating) : book.rating != null) return false;
        return voteCount != null ? voteCount.equals(book.voteCount) : book.voteCount == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (genre != null ? genre.hashCode() : 0);
        result = 31 * result + (publisher != null ? publisher.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(content);
        result = 31 * result + (pageCount != null ? pageCount.hashCode() : 0);
        result = 31 * result + (isbn != null ? isbn.hashCode() : 0);
        result = 31 * result + (publishYear != null ? publishYear.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(image);
        result = 31 * result + (descr != null ? descr.hashCode() : 0);
        result = 31 * result + (rating != null ? rating.hashCode() : 0);
        result = 31 * result + (voteCount != null ? voteCount.hashCode() : 0);
        return result;
    }
}
