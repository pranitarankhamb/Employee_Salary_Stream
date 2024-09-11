<!-- 
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>

 -->
 
 <!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Employee Information Form</title>
<style>
    body {
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 0;
        background-color: #f4f4f4;
    }
    .container {
        max-width: 500px;
        margin: 50px auto;
        padding: 20px;
        background-color: #fff;
        border-radius: 5px;
        box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
        position:absolute;
        left:45%;
    }
    h1 {
        text-align: center;
        margin-bottom: 20px;
    }
    form {
        display: grid;
        gap: 10px;
       
       
    }
    label {
        font-weight: bold;
    }
    input[type="text"],
    input[type="email"],
    input[type="number"],
    textarea {
        width: 100%;
        padding: 8px;
        border: 1px solid #ccc;
        border-radius: 3px;
    }
    input[type="submit"] {
        width: auto;
        padding: 8px 20px;
        background-color: #007bff;
        color: #fff;
        border: none;
        border-radius: 3px;
        cursor: pointer;
    }
</style>
</head>
<body>
<%@include file="AdminDashboard.jsp" %>
<div class="container">
    <h1>Employee Information Form</h1>
    <form class="formarea" name ="frm" action="emp" method="POST">
    
        <label for="name">Employee Name:</label>
        <input type="text" id="name" name="name" placeholder=" Enter employee name" required>
        
        <label for="name">Employee Department:</label>
        <input type="text" id="dept" name="department" placeholder=" Enter employee department" required>
        
        <label for="name">Employee Join_Date:</label>
        <input type="date" id="ddate" name="join_date" placeholder=" Emter employee join date" required>
        
        <label for="email">Employee primary contact:</label>
        <input type="number" id="contp" name="primary_contact" placeholder=" Enter employee contact" required>
        
        <label for="contact">Employee secondary contact:</label>
        <input type="number" id="contact" name="secondary_contact" placeholder="Enter employee contact no" required>
        
        <label for="contact">Employee email:</label>
        <input type="email" id="email" name="email" placeholder="Enter employee email" required>
        
        <label for="contact">Birth Date</label>
        <input type="date" id="date" name="birth_date" placeholder="Enter employee dirthdate" required>
        
        <label for="name">gender</label>
        <input type="text" id="gender" name="gender" placeholder=" Enter gender" required>
        
        <label for="address">Employee Address:</label>
        <textarea id="address" name="address" rows="3" placeholder="Enter employee address" required></textarea>
      
        <input type="submit" value="Add New Employee">

    </form>
</div>
</body>
</html>
 