<%@ page errorPage="error.jsp" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
 int login;
login=Integer.parseInt(request.getParameter("login"));

%>
<p>
your login is<%=login %>id
</p>

</body>
</html>