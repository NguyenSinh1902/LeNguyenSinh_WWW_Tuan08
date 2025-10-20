<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Update Employee</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"/>
</head>
<body>
<div class="container mt-5 w-50 border p-4 rounded-3 shadow-sm">
    <h2 class="text-center fw-bold mb-4">UPDATE EMPLOYEE</h2>

    <form action="/employees/save" method="post">
        <input type="hidden" name="id" value="${employee.id}">

        <div class="mb-3">
            <label class="form-label">First Name</label>
            <input type="text" name="firstName" value="${employee.firstName}" class="form-control" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Last Name</label>
            <input type="text" name="lastName" value="${employee.lastName}" class="form-control" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Email</label>
            <input type="email" name="email" value="${employee.email}" class="form-control" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Date of Birth</label>
            <input type="date" name="dateOfBirth" value="${employee.dateOfBirth}" class="form-control" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Phone number</label>
            <input type="text" name="phone" value="${employee.phone}" class="form-control" required>
        </div>
        <div class="mb-3">
            <label class="form-label d-block">Gender</label>
            <input type="radio" name="gender" value="male" ${employee.gender == 'male' ? 'checked' : ''}> Male
            <input type="radio" name="gender" value="female" class="ms-3" ${employee.gender == 'female' ? 'checked' : ''}> Female
        </div>
        <div class="mb-3">
            <label class="form-label">Address</label>
            <input type="text" name="address" value="${employee.address}" class="form-control">
        </div>

        <div class="d-flex justify-content-between">
            <a href="/employees" class="btn btn-secondary">Back</a>
            <button type="submit" class="btn btn-primary">Update</button>
        </div>
    </form>
</div>
</body>
</html>
