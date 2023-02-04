<%@page import="java.util.List"%>
<%@page import="com.model.ContactModel"%>
<%@page import="com.dao.ContactDao"%>
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
          <li><a href="ViewQuery.jsp" class="this-page">View Queries</a></li>
          <li><a href="sdata.jsp">Student Data</a></li>
          <li><a href="NoticeBoard.jsp">Notice Board</a></li>
        </ul>
      </nav>
      <a href="../index.html"><button>LogOut</button></a>
    </header>
      
  <center><br>
        <h1 style="color: #04bd70;">Student Messages</h1> <br><br>
        <table border="2">
            <thead>
                <tr>
                    <th>Sr.No</th>
                    <th>Name</th>
                    <th>Scheme</th>
                    <th>Email</th>
                    <th>Mobile No.</th>
                    <th>Message</th>
                    <th>Remove</th>
                </tr>
            </thead>
            <%
            ContactDao sd=new ContactDao();
            int i = 0;
            List<ContactModel> sm=sd.getAlldata();
            for(ContactModel f : sm){
            i++;
            
            %>
            <tbody>  
                <tr>
                    
                    <td><%=i%></td>
                    <td><%=f.getName()%></td>
                    <td><%=f.getScheme()%></td>
                    <td><%=f.getEmail()%></td>
                    <td><%=f.getMobno()%></td>
                    <td><%=f.getMsg()%></td>
                    
                    <td><a href="deleteQ.jsp?id=<%=f.getId()%>" style="color: cyan;">Remove</a></td>
                    
                    
                </tr>
            </tbody>
            <%}%>
            
            
        </table>
    </center>
  </body>
</html>