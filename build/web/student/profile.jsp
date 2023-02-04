<%@page import="com.model.StudentModel"%>
<html>
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="../css/Style.css" />
    <title>Student Panel</title>
    <style>
             .right-sec{	
        margin-bottom: 40px;
        margin-left: 950px;
        padding-bottom: 25px;
        position: relative;
        margin-top: 20px;
        }
        .right-sec h4{
            font-size: 18px;
            font-weight: lighter;
	color: whitesmoke;
        }
        .right-sec h3{
            font-size: 20px;
            font-weight: lighter;
	color: whitesmoke;
        }
        
        .ubtn button{
            padding: 5px 20px;
	text-align: center;
	font-size: 13px;
	color: #fff;
	border: none;
	background: #04bd70; 
	border-radius: 10px;
	margin-top: 0px;
	margin-left: 1000px;
	cursor: pointer;
        }
         </style>
  </head>
  <body>
    <header>
      <span class="image-clickable">
        <a href="index.html">
          <h1>VACOEA-Student</h1>
        </a>
      </span>
      <nav>
        <ul class="nav-links">
            <li><a href="StudUI.jsp">Home</a></li>
          <li><a href="ViewNotice.jsp">Notice Board</a></li>
          <li><a href="../ContactUS.html">Contact</a></li>
          <li><a href="profile.jsp" class="this-page">Profile</a></li>
        </ul>
      </nav>
      <a href="../index.html"><button>LogOut</button></a>
    </header>
      

<%
    StudentModel Student=(StudentModel)session.getAttribute("Student");
        %>
        <br><br>
         <div class="right-sec">
         <h2 style="color: #04bd70"> PROFILE </h2><br>
         <b>     <h3>Name: <%=Student.getName()%></h3></b>
        <h4>Scheme: <%=Student.getScheme()%></h4>
        <h4>Email: <%=Student.getEmail()%></h4>
        <h4>Mobile No.: <%=Student.getMobno()%></h4>
        <h4>Birth Date: <%=Student.getBdate()%></h4>
        <h4>Gender: <%=Student.getGender()%></h4><br>
        <a href="../ContactUS.html" style="color: #2691d9;">Note: Want any profile changes contact admin</a>
         </div>
        
       <!-- <div class="ubtn">
                    <a href="#"><button>Update Profile</button></a>
		</div>
-->

  </body>
</html>