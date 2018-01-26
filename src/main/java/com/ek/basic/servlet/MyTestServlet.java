package com.ek.basic.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 * 这个Servlet用来测试获得IoC容器中bean的实例 
 */
@WebServlet("/testServlet")
public class MyTestServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;
       
   
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    //这是自己写的listener
    //从application域对象中得到IoC容器的引用
    //ServletContext servletContext = this.getServletContext();
    //ApplicationContext cxt = (ApplicationContext) servletContext.getAttribute("applicationContext");
    //System.out.println(cxt.getBean("dataSource"));
    
    //这是spring给的listener
    ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
    System.out.println(ctx.getBean("dataSource").getClass().getName());
  }

}