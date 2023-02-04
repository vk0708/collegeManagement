<%@page import="java.util.List"%>
<%@page import="com.model.NoticeModel"%>
<%@page import="com.dao.NoticeDao"%>
<html>
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="../css/Style.css" />
    <link href="../css/TableCSS.css" rel="stylesheet" type="text/css"/>
    <title>Student Panel</title>
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
          <li><a href="ViewNotice.jsp" class="this-page">Notice Board</a></li>
          <li><a href="../ContactUS.html">Contact</a></li>
          <li><a href="profile.jsp">Profile</a></li>
        </ul>
      </nav>
      <a href="../index.html"><button>LogOut</button></a>
    </header>
      
      <center><br>
        <h1 style="color: #04bd70;">Notice Board</h1> <br><br>
        <table border="2">
            <thead>
                <tr>
                    <th>Sr.No</th>
                    <th>Subject</th>
                    <th>Date</th>
                    <th>Message</th>
                </tr>
            </thead>
            <%
            NoticeDao sd=new NoticeDao();
            int i = 0;
            List<NoticeModel> sm=sd.getAlldata();
            for(NoticeModel f : sm){
            i++;
            
            %>
            <tbody>  
                <tr>
                    
                    <td><%=i%></td>
                    <td><%=f.getSub()%></td>
                    <td><%=f.getNdate()%></td>
                    <td><%=f.getMsg()%></td>                   
                    
                </tr>
            </tbody>
            <%}%>
            
            
        </table>
    </center>
  </body>
</html>