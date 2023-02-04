<%@page import="java.util.List"%>
<%@page import="com.model.NoticeModel"%>
<%@page import="com.dao.NoticeDao"%>
<html>
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="../css/Style.css" />
    <link href="../css/SignupCSS.css" rel="stylesheet" type="text/css"/>
    <link href="../css/TableCSS.css" rel="stylesheet" type="text/css"/>
    <title>Notice Board</title>
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
          <li><a href="sdata.jsp">Student Data</a></li>
          <li><a href="NoticeBoard.jsp" class="this-page">Notice Board</a></li>
        </ul>
      </nav>
      <a href="../index.html"><button>LogOut</button></a>
    </header>
      
  <center><br>
      <h1>Notice Board</h1>
      <div class="container">
        <div class="title" style="color: #04bd70;">Notice Board</div>
    <div class="content">
        <form action="../NoticeServlet" method="post" autocomplete="off">
        <div class="user-details">
          <div class="input-box">
            <span class="details">Notice Subject</span>
            <input type="text" name="sub" placeholder="Enter your name" required>
          </div>
          <div class="input-box">
            <span class="details">Date</span>
            <input type="date" name="ndate" required>
          </div>
          <div class="input-box">
            <span class="details">Message</span>
            <textarea id="subject" name="msg" placeholder="Write your Notice...(under 250 Words)" style="height:100px; width: 650px; color: white; font-size: 20px;" required="" autocomplete="off"></textarea>
          </div>
          
        </div>
       
        <div class="button">
          <input type="submit" value="Send">
        </div>
      </form>
        
        
    </div>
  </div>
  </center>    
  
  <center><br>
        <h1 style="color: #04bd70;">Notice Board</h1> <br><br>
        <table border="2">
            <thead>
                <tr>
                    <th>Sr.No</th>
                    <th>Subject</th>
                    <th>Date</th>
                    <th>Message</th>
                    <th>Remove</th>
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
                    
                    <td><a href="deleteN.jsp?id=<%=f.getId()%>" style="color: cyan;">Remove</a></td>
                    
                    
                </tr>
            </tbody>
            <%}%>
            
            
        </table>
    </center>
  
  </body>
</html>