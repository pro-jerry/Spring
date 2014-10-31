<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'welcome.jsp' starting page</title>
  </head>
  
  <body>
    welcome!<br/>
    <h1>数据传递</h1>
    ${result}
    <div>
    	<c:forEach items="${result }" var="result">
    		${result.key}-->${result.value }<br/>
    	</c:forEach>
    </div>
  </body>
</html>
