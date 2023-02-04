<%@page import="java.util.List"%>
<%@page import="com.model.StudentModel"%>
<%@page import="com.dao.StudentDao"%>
<html>
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="../css/Style.css" />
    <link href="../css/TableCSS.css" rel="stylesheet" type="text/css"/>
    <title>Admin Panel</title>
  </head>
  <body>
    <header>
      <span class="image-clickable">
        <a href="index.html">
          <h1>VACOEA-Admin</h1>
        </a>
      </span>
      <nav>
        <ul class="nav-links">
            <li><a href="AdminUI.jsp">Home</a></li>
          <li><a href="ViewQuery.jsp">View Queries</a></li>
          <li><a href="sdata.jsp"  class="this-page">Student Data</a></li>
          <li><a href="NoticeBoard.jsp">Notice Board</a></li>
        </ul>
      </nav>
      <a href="../index.html"><button>LogOut</button></a>
    </header>
      
      <center><br>
        <h1 style="color: #04bd70;">Student Data</h1> <br><br>
        <table border="2">
            <thead>
                <tr>
                    <th>Sr.No</th>
                    <th>Name</th>
                    <th>Scheme</th>
                    <th>Email</th>
                    <th>Mobile No.</th>
                    <th>Password</th>
                    <th>Birth Date</th>
                    <th>Gender</th>
                    <th>Remove</th>
                </tr>
            </thead>
            <%
            StudentDao sd=new StudentDao();
            int i = 0;
            List<StudentModel> sm=sd.getAlldata();
            for(StudentModel f : sm){
            i++;
            
            %>
            <tbody>  
                <tr>
                    
                    <td><%=i%></td>
                    <td><%=f.getName()%></td>
                    <td><%=f.getScheme()%></td>
                    <td><%=f.getEmail()%></td>
                    <td><%=f.getMobno()%></td>
                    <td><%=f.getPass()%></td>
                    <td><%=f.getBdate()%></td>
                    <td><%=f.getGender()%></td>
                    
                    <td><a href="../student/delete.jsp?id=<%=f.getId()%>" style="color: cyan;">Remove</a></td>
                    
                    
                </tr>
            </tbody>
            <%}%>
            
            
        </table>
            <br>
               <a href="../SignUp.jsp"> <button>ADD Student</button> </a> 
    </center>
      
  </body>
</html>