
<%@ page errorPage="error.jsp" language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
	<%@ include file="headerwelcome.jsp"%>
<body style="background-color: powderblue">
	<form action="loginctrl" method="post">
		<br> <br> <br> <br> <br> <br> <br>
		<%
			String s = (String) request.getAttribute("msg");
			String L = (String) request.getAttribute("Lmsg");
			String P = (String) request.getAttribute("Pmsg");
			if (s != null) {
		%>
		<h1 style="color: red"><%=s%></h1>
		<%
			}
		%>

		<%
			String logout = (String) request.getAttribute("logout");
			if (logout != null) {
		%>
		<center>
			<h2>
				<font color="green"><%=logout%></font>
			</h2>
		</center>
		<%
			}
		%>

		<div align="center">
			<h1>Welcome Student</h1>

			<h2>STUDENT REGISTRATION</h2>
			<table>
				<tr>
					<th>id:</th>
					<td><input type="text" name="id" size=30 value=""> <font
						color="red"> <%
 	if (L != null) {
 %><%=L%> <%
 	}
 %></font></td>

				</tr>
				<tr>
					<th>Password :</th>
					<td><input type="password" name="pwd" size=30 value="">
						<font color="red"> <%
 	if (P != null) {
 %><%=P%> <%
 	}
 %>
					</font></td>
				</tr>

				<tr>
					<th></th>
					<td colspan="2"><input type="submit" name="operation"
						value="signin"> &nbsp;</td>
				</tr>
				<tr>
					<td colspan="2" align="center"><a href="RegView.jsp"><b>Sign
								up</b></a>| <a href="forgot.jsp"><b>Forgot Password</b></a> <a
						href="welcomeview.jsp>"></a></td>
				</tr>



			</table>
		</div>
		<br>
		<br>
		<br>
		
		
			<%@ include file="footer.jsp"%>
</body>
</html>