package com.ek.basic.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * 这个listener 是思路  spring已经提供了一个更加严谨的 listener 在web.xml中配置就可以用了
 *
 */
public class SpringServletContextListener implements ServletContextListener{

  @Override
  public void contextDestroyed(ServletContextEvent arg0) {
    
  }

  @Override
  public void contextInitialized(ServletContextEvent arg0) {
    //1. 获取spring配置文件的名称
    ServletContext servletContext = arg0.getServletContext();
    String config = servletContext.getInitParameter("configLocation");
    
    //1. 创建IoC容器
    ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
    
    //2. 把创建的IoC容器放在ServletContext的一个属性中
    servletContext.setAttribute("applicationContext", ctx);
    
  }
}