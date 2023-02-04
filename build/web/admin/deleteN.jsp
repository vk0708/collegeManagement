<%@page import="com.dao.NoticeDao"%>
<%@page import="com.model.NoticeModel"%>
<%

String fid=request.getParameter("id");
long idf=Long.parseLong(fid);

NoticeModel cm=new NoticeModel();
cm.setId(idf);

NoticeDao ado=new NoticeDao();
ado.deleteMsg(cm);

response.sendRedirect("NoticeBoard.jsp");

%>