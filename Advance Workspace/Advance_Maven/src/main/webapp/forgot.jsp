<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%@ include file = "header.jsp" %>

<body>
	<center>
		<h1>Forgot your password?</h1>
		<h4>Submit your email address and we'll send you password.</h4>
		<p>Password sent to your email id</p>

		<table>
			<tr>
				<td>
					<p>Email Id:</p>
				</td>
				<td><input type="email" name="email" placeholder="Enter ID here">
				</td>
				<td>
					<button>
						<a href="loginview.jsp"
							style="float: center; text-decoration: none;">Go
					</button>
				</td>
			</tr>

			<td></td>
			<td>Email is required</td>

		</table>
	</center>
		<%@ include file="footer.jsp"%>
</body>
</html>