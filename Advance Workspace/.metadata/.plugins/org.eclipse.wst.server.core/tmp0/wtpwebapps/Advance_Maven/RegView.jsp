<%@ page errorPage="error.jsp" language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%@ include file = "header.jsp" %>

<body>
	<form action="reg" method="post">

		<div align="center">
			<h1>USER REGISTRATION</h1>
			<table>
			
			<tr>
					<th>Id :</th>
					<td><input type="text" name="id" ></td>
				</tr>
				<tr>
					<th>First Name :</th>
					<td><input type="text" name="fname"></td>
				</tr>

				<tr>
					<th>Last Name :</th>
					<td><input type="text" name="lname"></td>
				</tr>

				<tr>
					<th>Login :</th>
					<td><input type="login" name="login"></td>
				</tr>

				<tr>
					<th>Password :</th>
					<td><input type="password" name="pwd"></td>
				</tr>

				<tr>
					<th>Gender :</th>
					<td><input type="radio" name="gender" value ="Male">Male <input
						type="radio" name="gender" value ="FeMale">female <input type="radio"
						name="gender" value ="Other">other</td>
				</tr>

				<tr>
					<th>DOB (dd-MM-yyyy):</th>
					<td><input type="date" name="dob"></td>
				</tr>

				<tr>
					<th>Mob No :</th>
					<td><input type="text" name="mob"></td>
				</tr>



				<tr>
					<th></th>
					<td><input type="submit" value="Register"></td>
				</tr>

			</table>
		</div>
		<br><br><br>
		

	</form>
		<%@ include file="footer.jsp"%>
</body>
</html>
