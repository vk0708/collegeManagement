<%@page import="com.dao.StudentDao"%>
<%@page import="com.model.StudentModel"%>
<%

String fid=request.getParameter("id");
long idf=Long.parseLong(fid);

StudentModel am=new StudentModel();
am.setId(idf);

StudentDao ado=new StudentDao();
ado.deleteStud(am);

response.sendRedirect("../admin/sdata.jsp");

%>