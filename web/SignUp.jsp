<%-- 
    Document   : SignUp
    Created on : May 11, 2022, 11:42:14 AM
    Author     : VK
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="css/Style.css" />
    <link href="css/SignupCSS.css" rel="stylesheet" type="text/css"/>
    <title>SignUP page</title> 
  </head>
  <body>
    <header>
      <span class="image-clickable">
        <a href="index.html">
          <h1>VACOEA</h1>
        </a>
      </span>
      <nav>
        <ul class="nav-links">
            <li><a href="index.html">Home</a></li>
          <li><a href="Gallery.html">Gallery</a></li>
          <li><a href="ContactUS.html">Contact us</a></li>
          <li><a href="AboutUS.html">About</a></li>
          <li><a href="SignUp.jsp" class="this-page">Sign UP</a></li>
        </ul>
      </nav>
      <a href="Login.jsp"><button>Login</button></a>
    </header>
      
  <center>
    <div class="container">
        <div class="title" style="color: #04bd70;">Sign UP</div>
    <div class="content">
        <form action="StudentServlet" method="post" autocomplete="off">
        <div class="user-details">
          <div class="input-box">
            <span class="details">Full Name</span>
            <input type="text" name="name" placeholder="Enter your name" required>
          </div>
          <div class="input-box">
            <span class="details">Scheme</span>
            <input type="text" name="scheme" placeholder="e.g TE-BE-Comp-17" required>
          </div>
          <div class="input-box">
            <span class="details">Email</span>
            <input type="text" name="email" placeholder="Enter your email" required>
          </div>
          <div class="input-box">
            <span class="details">Phone Number</span>
            <input type="text" name="mobno" placeholder="Enter your number" required>
          </div>
          <div class="input-box">
            <span class="details">Password</span>
            <input type="text" name="pass" placeholder="Enter your password" required>
          </div>
          <div class="input-box">
            <span class="details">Date Of Birth</span>
            <input type="date" name="bdate" placeholder="Confirm your password" required>
          </div>
        </div>
        <div class="gender-details">
            <input type="radio" name="gender" value="male" id="dot-1">
          <input type="radio" name="gender" value="female" id="dot-2">
          <span class="gender-title">Gender</span>
          <div class="category">
            <label for="dot-1">
            <span class="dot one"></span>
            <span class="gender">&nbsp;&nbsp;Male</span>
          </label>
          <label for="dot-2">
            <span class="dot two"></span>
            <span class="gender">&nbsp;&nbsp;Female</span>
          </label>
          </div>
        </div> 
        <div class="button">
          <input type="submit" value="Register">
        </div>
      </form>
    </div>
  </div>  
  </center>
  </body>
</html>
