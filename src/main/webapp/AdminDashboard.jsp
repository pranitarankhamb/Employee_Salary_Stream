
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>EmployeeManagment</title>
    <link href="CSS/AdminDashboard.css" rel="stylesheet"/>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css" />
    
  </head>
  <body>
  
 <%--  <%
  	String Username = (String)session.getAttribute("Username");
  
  %>
  
  <h1>Welcome <%out.pritnln(Username); %></h1> --%>
  
    <nav class="sidebar">
      <a href="#" class="logo">Management</a>

      <div class="menu-content">
        <ul class="menu-items">
         <li class="item">
            <div class="submenu-item">
              <span>Employee Details</span>
              <i class="fa-solid fa-chevron-right"></i>
            </div>

            <ul class="menu-items submenu">
              <div class="menu-title">
                <i class="fa-solid fa-chevron-left"></i>
                Your submenu title
              </div>
              <li class="item">
                <a href="AddEmployee.jsp">Add Employee</a>
              </li>
              <li class="item">
                <a href="ViewEmployee.jsp">View Employee</a>
              </li>
              <li class="item">
                <a href="UpdateEmployee.jsp">Update Employee</a>
              </li>
            </ul>
          </li>

          <!-- <li class="item">
            <div class="submenu-item">
              <span>First submenu</span>
              <i class="fa-solid fa-chevron-right"></i>
            </div>

            <ul class="menu-items submenu">
              <div class="menu-title">
                <i class="fa-solid fa-chevron-left"></i>
                Your submenu title
              </div>
              <li class="item">
                <a href="NewFile.jsp">First sublink</a>
              </li>
              <li class="item">
                <a href="#">First sublink</a>
              </li>
              <li class="item">
                <a href="#">First sublink</a>
              </li>
            </ul>
          </li> -->

          <!-- <li class="item">
            <div class="submenu-item">
              <span>First submenu</span>
              <i class="fa-solid fa-chevron-right"></i>
            </div>

            <ul class="menu-items submenu">
              <div class="menu-title">
                <i class="fa-solid fa-chevron-left"></i>
                Your submenu title
              </div>
              <li class="item">
                <a href="">First sublink</a>
              </li>
              <li class="item">
                <a href="#">First sublink</a>
              </li>
              <li class="item">
                <a href="#">First sublink</a>
              </li>
            </ul>
          </li> -->
          <!-- <li class="item">
            <div class="submenu-item">
              <span>Second submenu</span>
              <i class="fa-solid fa-chevron-right"></i>
            </div>

            <ul class="menu-items submenu">
              <div class="menu-title">
                <i class="fa-solid fa-chevron-left"></i>
                Your submenu title
              </div>
              <li class="item">
                <a href="#">Second sublink</a>
              </li>
              <li class="item">
                <a href="#">Second sublink</a>
              </li>
              <li class="item">
                <a href="#">Second sublink</a>
              </li>
              
              <li class="item">
                <a href="#">Second sublink</a>
              </li>
              
            </ul>
          </li> -->

          <li class="item">
            <a href="#">Attendance</a>
          </li>

          <li class="item">
            <a href="NewFile.jsp">Salary of Employee</a>
          </li>
        </ul>
      </div>
    </nav>

     <nav class="navbar">
      <i class="fa-solid fa-bars" id="sidebar-close"></i>
    </nav> 
    
    
    
  

    <script>
    const sidebar = document.querySelector(".sidebar");
    const sidebarClose = document.querySelector("#sidebar-close");
    const menu = document.querySelector(".menu-content");
    const menuItems = document.querySelectorAll(".submenu-item");
    const subMenuTitles = document.querySelectorAll(".submenu .menu-title");

    sidebarClose.addEventListener("click", () => sidebar.classList.toggle("close"));

    menuItems.forEach((item, index) => {
      item.addEventListener("click", () => {
        menu.classList.add("submenu-active");
        item.classList.add("show-submenu");
        menuItems.forEach((item2, index2) => {
          if (index !== index2) {
            item2.classList.remove("show-submenu");
          }
        });
      });
    });

    subMenuTitles.forEach((title) => {
      title.addEventListener("click", () => {
        menu.classList.remove("submenu-active");
      });
    });
    </script>
    
    
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
    
  </body>
</html>