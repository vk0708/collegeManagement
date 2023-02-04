package org.apache.jsp.student;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.model.StudentModel;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\" />\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/Style.css\" />\n");
      out.write("    <title>Student Panel</title>\n");
      out.write("    <style>\n");
      out.write("        .right-sec{\n");
      out.write("\tpadding-right: 70px;\t\n");
      out.write("}\n");
      out.write("\n");
      out.write("        .right-sec h2{\n");
      out.write("\tfont-size: 20px;\n");
      out.write("\ttext-transform: uppercase;\n");
      out.write("\tfont-weight: lighter;\n");
      out.write("\tcolor: #242424;\n");
      out.write("\tmargin-top: 150px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".right-sec h1{\n");
      out.write("\tfont-size: 72px;\n");
      out.write("    font-weight: 700;\n");
      out.write("    margin-bottom: 40px;\n");
      out.write("    padding-bottom: 25px;\n");
      out.write("    position: relative;\n");
      out.write("    margin-top: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".right-sec h1:before {\n");
      out.write("    background: #212121;\n");
      out.write("    height: 4px;\n");
      out.write("    width: 150px;\n");
      out.write("    position: absolute;\n");
      out.write("    right: 0;\n");
      out.write("    bottom: 0;\n");
      out.write("    content: \"\";\n");
      out.write("}\n");
      out.write("\n");
      out.write(".right-sec button{\n");
      out.write("\tpadding: 8px 30px;\n");
      out.write("\ttext-align: center;\n");
      out.write("\tfont-size: 14px;\n");
      out.write("\tcolor: #fff;\n");
      out.write("\tborder: none;\n");
      out.write("\tbackground-image: linear-gradient(to right,#649bff,#0070fa,#649bff); \n");
      out.write("\tborder-radius: 10px;\n");
      out.write("\tmargin-top: 30px;\n");
      out.write("\tmargin-left: 250px;\n");
      out.write("\tcursor: pointer;\n");
      out.write("\ttransition: all 0.4s;\n");
      out.write("\t-webkit-transition: all 0.4s;\n");
      out.write("  -o-transition: all 0.4s;\n");
      out.write("  -moz-transition: all 0.4s;\n");
      out.write("}\n");
      out.write(".right-sec button:hover {\n");
      out.write("    color: #00ccff;\n");
      out.write("    border-color: #008fb3;\n");
      out.write("    text-decoration: none;\n");
      out.write("    -ms-transform: scale(1.3);\n");
      out.write("\t-webkit-transform: scale(1.3);\n");
      out.write("}\n");
      out.write("    </style>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <header>\n");
      out.write("      <span class=\"image-clickable\">\n");
      out.write("        <a href=\"index.html\">\n");
      out.write("          <h1>VACOEA-Student</h1>\n");
      out.write("        </a>\n");
      out.write("      </span>\n");
      out.write("      <nav>\n");
      out.write("        <ul class=\"nav-links\">\n");
      out.write("            <li><a href=\"StudUI.jsp\">Home</a></li>\n");
      out.write("          <li><a href=\"ViewNotice.jsp\">Notice Board</a></li>\n");
      out.write("          <li><a href=\"../ContactUS.html\">Contact</a></li>\n");
      out.write("          <li><a href=\"profile.jsp\" class=\"this-page\">Profile</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </nav>\n");
      out.write("      <a href=\"../index.html\"><button>LogOut</button></a>\n");
      out.write("    </header>\n");
      out.write("      \n");
      out.write("<h1>Profile</h1>     \n");
      out.write("\n");

    StudentModel Student=(StudentModel)session.getAttribute("Student");
        
      out.write("\n");
      out.write("    \n");
      out.write("         <div class=\"right-sec\">\n");
      out.write("         <h2 style=\"color: red\"> PROFILE </h2><br>\n");
      out.write("        <h3>");
      out.print(Student.getName());
      out.write("</h3><br>\n");
      out.write("        <h4>");
      out.print(Student.getScheme());
      out.write("</h4>\n");
      out.write("        <h4>");
      out.print(Student.getEmail());
      out.write("</h4>\n");
      out.write("        <h4>");
      out.print(Student.getMobno());
      out.write("</h4>\n");
      out.write("        <h4>");
      out.print(Student.getPass());
      out.write("</h4>\n");
      out.write("        <h4>");
      out.print(Student.getBdate());
      out.write("</h4>\n");
      out.write("        <h4>");
      out.print(Student.getGender());
      out.write("</h4>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"ubtn\">\n");
      out.write("                    <a href=\"#\"><button>Update Profile</button></a>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\n");
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
