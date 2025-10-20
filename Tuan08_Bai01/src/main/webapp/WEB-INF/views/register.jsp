<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register Employee</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"/>
</head>
<body>
<div class="container mt-5 w-50 border p-4 rounded-3 shadow-sm">
    <h2 class="text-center fw-bold mb-4">REGISTRATION EMPLOYEE</h2>

    <form action="/employees/save" method="post">
        <div class="mb-3">
            <label class="form-label">First Name</label>
            <input type="text" name="firstName" class="form-control" placeholder="First Name" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Last Name</label>
            <input type="text" name="lastName" class="form-control" placeholder="Last Name" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Email</label>
            <input type="email" name="email" class="form-control" placeholder="Email" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Date of Birth</label>
            <input type="date" name="dateOfBirth" class="form-control" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Phone number</label>
            <input type="text" name="phone" class="form-control" placeholder="Phone number" required>
        </div>
        <div class="mb-3">
            <label class="form-label d-block">Gender</label>
            <input type="radio" name="gender" value="male" required> Male
            <input type="radio" name="gender" value="female" class="ms-3" required> Female
        </div>
        <div class="mb-3">
            <label class="form-label">Address</label>
            <input type="text" name="address" class="form-control" placeholder="Address">
        </div>

        <div class="d-flex justify-content-between">
            <a href="/employees" class="btn btn-secondary">Back</a>
            <button type="submit" class="btn btn-primary">Register</button>
        </div>
    </form>
</div>
</body>
</html>
