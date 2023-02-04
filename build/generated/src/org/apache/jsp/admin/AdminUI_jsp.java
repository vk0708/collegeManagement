package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminUI_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\" />\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/Style.css\" />\n");
      out.write("    <title>Admin Panel</title>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <header>\n");
      out.write("      <span class=\"image-clickable\">\n");
      out.write("        <a href=\"index.html\">\n");
      out.write("          <h1>VACOEA-Admin</h1>\n");
      out.write("        </a>\n");
      out.write("      </span>\n");
      out.write("      <nav>\n");
      out.write("        <ul class=\"nav-links\">\n");
      out.write("            <li><a href=\"AdminUI.jsp\" class=\"this-page\">Home</a></li>\n");
      out.write("          <li><a href=\"ViewQuery.jsp\">View Queries</a></li>\n");
      out.write("          <li><a href=\"sdata.jsp\">Student Data</a></li>\n");
      out.write("          <li><a href=\"NoticeBoard.jsp\">Notice Board</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </nav>\n");
      out.write("      <a href=\"../index.html\"><button>LogOut</button></a>\n");
      out.write("    </header>\n");
      out.write("      \n");
      out.write("  \n");
      out.write("<h1 style=\"position: absolute; top: 50%; left: 25%;\">Welcome To ADMIN Panel</h1>\n");
      out.write("  \n");
      out.write("  </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
