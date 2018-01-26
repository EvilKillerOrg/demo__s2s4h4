package com.ek.basic.action;

import com.ek.basic.service.BookService;
import com.opensymphony.xwork2.ActionSupport;

public class BookAction extends ActionSupport{
  private static final long serialVersionUID = 1L;
  
  private BookService bookService;
  public void setBookService(BookService bookService) {
    this.bookService = bookService;
  }


  @Override
  public String execute() throws Exception {
    System.out.println("execute.....");
    bookService.save();
    return SUCCESS;
  }

  
}
