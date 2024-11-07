<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ticket Booking</title>
    <!-- Include Bootstrap CDN for styles -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <h1 class="text-center">Ticket Booking</h1>
        
        <!-- Success and Failure messages -->
        <div class="text-center"> 
            <h2 class="text-success">${success}</h2>
            <h3 class="text-danger">${failure}</h3>
        </div>

        <!-- Booking Form -->
        <form action="ticket" method="post" class="mt-4">
            <div class="mb-3">
                <label for="ticketName" class="form-label">Ticket Name</label>
                <select name="name" id="ticketName" class="form-select" required>
                    <option value="">Select</option>
                    <option value="KhoKho">KhoKho</option>
                    <option value="BasketBall">BasketBall</option>
                    <option value="Hockey">Hockey</option>
                    <option value="Cricket">Cricket</option>
                </select>
            </div>

            <div class="mb-3">
                <label for="ticketCount" class="form-label">Tickets</label>
                <input type="number" name="ticket" id="ticketCount" class="form-control" min="1" required>
            </div>

            <div class="mb-3">
                <label for="contact" class="form-label">Primary Contact</label>
                <input type="number" name="contact" id="contact" class="form-control" required>
            </div>

            <div class="mb-3">
                <label for="email" class="form-label">Email</label>
                <input type="email" name="email" id="email" class="form-control" required>
            </div>

            <div class="text-center">
                <button type="submit" class="btn btn-primary">Book Tickets</button>
            </div>
        </form>
    </div>

    <!-- Bootstrap JS (Optional) -->
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.min.js"></script>
</body>
</html>
