<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Employee List</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"/>
</head>
<body>
<div class="container mt-4">
    <h3 class="text-center fw-bold">EMPLOYEE LIST</h3>

    <div class="d-flex justify-content-between mb-3">
        <form class="d-flex" action="/employees" method="get">
            <input type="text" name="keyword" class="form-control me-2" placeholder="Search"/>
            <button class="btn btn-secondary" type="submit">Search</button>
        </form>
        <a href="/employees/add" class="btn btn-primary">Add Employee</a>
    </div>

    <table class="table table-bordered text-center align-middle">
        <thead class="table-light">
        <tr>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Gender</th>
            <th>Date of birth</th>
            <th>Email</th>
            <th>Phone</th>
            <th>Action</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="emp" items="${list}">
            <tr>
                <td>${emp.firstName}</td>
                <td>${emp.lastName}</td>
                <td>${emp.gender}</td>
                <td>${emp.dateOfBirth}</td>
                <td>${emp.email}</td>
                <td>${emp.phone}</td>
                <td>
                    <a href="/employees/edit/${emp.id}" class="text-primary">Update</a> |
                    <a href="/employees/delete/${emp.id}" class="text-danger"
                       onclick="return confirm('Are you sure to delete this employee?')">Delete</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
