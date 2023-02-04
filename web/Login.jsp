<%-- 
    Document   : Login
    Created on : May 11, 2022, 11:41:39 AM
    Author     : VK
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="css/Style.css" />
    <link href="css/LoginCSS.css" rel="stylesheet" type="text/css"/>
    <title>Login page</title>
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
          <li><a href="SignUp.jsp">Sign UP</a></li>
        </ul>
      </nav>
      <a href="Login.jsp"><button>Login</button></a>
    </header>
      
  <div class="center">
      <h1>Login</h1>
      <form action="LoginServlet" method="post">
        <div class="txt_field">
          <input type="text" required name="email">
          <span></span>
          <label>Username/ Email</label>
        </div>
        <div class="txt_field">
          <input type="password" required name="pass">
          <span></span>
          <label>Password</label>
        </div>
        <div class="pass">Forgot Password?</div>
        <input type="submit" value="Login">
        <div class="signup_link">
          Not a member? <a href="SignUp.jsp">Signup</a>
        </div>
      </form>
    </div>
  </body>
</html>
