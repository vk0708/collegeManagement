<%@page import="com.dao.ContactDao"%>
<%@page import="com.model.ContactModel"%>
<%

String fid=request.getParameter("id");
long idf=Long.parseLong(fid);

ContactModel cm=new ContactModel();
cm.setId(idf);

ContactDao ado=new ContactDao();
ado.deleteMsg(cm);

response.sendRedirect("ViewQuery.jsp");

%>