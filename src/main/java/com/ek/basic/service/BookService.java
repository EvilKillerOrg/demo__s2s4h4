package com.ek.basic.service;

import com.ek.basic.dao.BookDAO;

public class BookService {

  private BookDAO bookDAO;

  public void setBookDAO(BookDAO bookDAO) {
    this.bookDAO = bookDAO;
  }

  public void save() {
    System.out.println("BookService.save");
  }

}
