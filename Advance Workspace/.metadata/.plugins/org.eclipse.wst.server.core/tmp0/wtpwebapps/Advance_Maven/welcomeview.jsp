<%@ page errorPage="error.jsp" language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Log-In</title>
</head>
<body>
<a href=""></a>
	<%@ include file="header.jsp"%>
	<h1 style="color: red;">
		<%
			String s = (String) request.getAttribute("Fmsg");
			String F = (String) request.getAttribute("msg");
			if (s != null) {
		%><h1  style="color=red"> Hi "<%=s%>"</h1>
		<%
			}
		%>
		<center>
			<h1 style="color: blue">Welcome to Silver Shades</h1>
		</center>
	</h1>
	<tr>
		<font color="red"> <%
 	if (F != null) {
 %><%=F%> <%
 	}
 %>
    
 
 </font>
		</td>
	</tr>
		<%@ include file="footer.jsp"%>
	

</body>
</html>