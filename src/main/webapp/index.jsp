<%@page import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@page import="org.springframework.context.ApplicationContext" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>

 
	<%
		//使用了spring提供的listener的情况下 页面上获取bean
		//1.从application域对象中获取IoC容器的实例
		ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(application);
		out.println(ctx.getBean("dataSource").getClass().getName());
	%>
	
	<br><br><br>
	
	
	<!-- 测试servlet获得bean对象 -->
	<a href="${pageContext.request.contextPath}/testServlet">servlet</a>
	
	<!-- 测试action获取IoC中的bean -->
	<a href="${pageContext.request.contextPath}/bookAction">action</a>
	
</body>
</html>