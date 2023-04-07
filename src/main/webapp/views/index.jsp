<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Enquiry Form</title>
</head>
<body>
	<h2>Student Enquiry Form</h2>

	<hr />

	<p>
		<font color='blue'>${msg}</font>
	</p>

	<form:form action="save" modelAttribute="student" method="POST">

		<table>

			<tr>
				<td>Name:</td>
				<td><form:input path="name" /></td>
			</tr>

			<tr>
				<td>Email:</td>
				<td><form:input path="email" /></td>
			</tr>

			<tr>
				<td>Gender:</td>
				<td><form:radiobutton path="gender" value="M" />Male <form:radiobutton
						path="gender" value="F" />Fe-Male</td>

			</tr>

			<tr>
				<td>Course:</td>
				<td><form:select path="course">
						<form:option value="">-select</form:option>
						<form:options items="${courses}" />
						<%-- <form:option value="java">Java</form:option>
						<form:option value="angular">Angular</form:option>
						<form:option value="devops">Devops</form:option>
						<form:option value="python">Python</form:option> --%>
					</form:select></td>
			</tr>

			<tr>
				<td>Timings:</td>
				
				<td><form:checkbox path="timings" value="morning" />Morning 
				<form:checkbox path="timings" value="after-noon" />After-Noon
				<form:checkbox path="timings" value="Evening" />Evening
				
				</td>


			</tr>
			<td></td>
			<td><input type="submit" value="Save" /></td>
			</tr>
		</table>

	</form:form>

</body>
</html>