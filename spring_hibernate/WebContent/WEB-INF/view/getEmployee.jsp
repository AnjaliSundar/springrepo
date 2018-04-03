<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<tr>
<th>E.no</th>
<th>Name</th>
<th>Salary</th>
<th>Designation</th>
</tr>
<as:foreach var="employee" items="${allEmployees}">
<tr>
<td>${employee.id}</td>
<td>${employee.employeeName}</td>
<td>${employee.employeeSalary}</td>
<td>${employee.employee.Designation}</td>
</body>
</html>