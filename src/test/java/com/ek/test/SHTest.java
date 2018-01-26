package com.ek.test;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.After;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * 测试获取数据库连接的测试类
 *
 */
public class SHTest {

  private AbstractApplicationContext ctx = null;
  
  {
    ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
  }
  
  
  
  @Test
  public void testConnection() {
    DataSource dataSource = ctx.getBean(DataSource.class);
    try {
      System.out.println(dataSource.getConnection());
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
  
  @After
  public void close(){
    ctx.close();
  }

}