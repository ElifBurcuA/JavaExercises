<%

 String username=(String)session.getAttribute("username");
if(username==null){
	response.sendRedirect("Login.jsp");
	return;
}

%>


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Home</h1>
Welcome <%=username %>
<a href="Logout.jsp">Log out</a>
</body>
</html>