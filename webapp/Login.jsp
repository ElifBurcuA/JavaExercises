<%
String login=request.getParameter("login");
String message="Please enter (Lütfen giriş yapınız)";
if(login!=null){
	String username=request.getParameter("username");
	String password=request.getParameter("password");
	String adminUsername=getServletContext().getInitParameter("username");
	String adminPassword=getServletContext().getInitParameter("password");
	
	if(username.equals(adminUsername)){
		if(password.equals(adminPassword)){
			session.setAttribute("username",username);
			response.sendRedirect("Home.jsp");
			return;
		}else{
			message="Şifre doğru değil";
		}
		
		
	}else{
		message="Kullanıcı tanımlı değil ";
	}
	
	
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
<h1>Login</h1>
<%=message %>
<form action="Login.jsp" method="POST">
<div>
User Name <input type="text" name="username"><br/>
Password <input type="password" name="password"><br/>	
<input type="submit" value="Enter(Gir)" name="login"> <br/>

</div>


</form>
</body>
</html>