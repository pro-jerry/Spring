<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>用户注册</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <form method="post">
    	username:<input type="text" name="username" value="${user.username}"><br/>
    	password:<input type="password" name="username"><br/>
    	city:<select>
    		<c:forEach items="${cityList }" var="city">
    			<option>${city }</option>
    		</c:forEach>
    	</select><br/>
    	<input type="submit" value="注册"/>
    	<input type="submit" name="_cancel" value="取消"/>
    </form>
    
    
  </body>
</html>
