package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>onine test in PEC</title>\r\n");
      out.write("<meta name=\"description\" content=\"online test for galatias'12\">\r\n");
      out.write("<meta name=\"keywords\" content=\"online test, symposium,galatias'12\">\r\n");
      out.write("<meta http-equiv=\"content-type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<meta name=\"author\" content=\"kirubanandhan\">\r\n");
      out.write("<meta name=\"generator\" content=\"Web Page Maker\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("/*----------Text Styles----------*/\r\n");
      out.write(".ws6 {font-size: 8px;}\r\n");
      out.write(".ws7 {font-size: 9.3px;}\r\n");
      out.write(".ws8 {font-size: 11px;}\r\n");
      out.write(".ws9 {font-size: 12px;}\r\n");
      out.write(".ws10 {font-size: 13px;}\r\n");
      out.write(".ws11 {font-size: 15px;}\r\n");
      out.write(".ws12 {font-size: 16px;}\r\n");
      out.write(".ws14 {font-size: 19px;}\r\n");
      out.write(".ws16 {font-size: 21px;}\r\n");
      out.write(".ws18 {font-size: 24px;}\r\n");
      out.write(".ws20 {font-size: 27px;}\r\n");
      out.write(".ws22 {font-size: 29px;}\r\n");
      out.write(".ws24 {font-size: 32px;}\r\n");
      out.write(".ws26 {font-size: 35px;}\r\n");
      out.write(".ws28 {font-size: 37px;}\r\n");
      out.write(".ws36 {font-size: 48px;}\r\n");
      out.write(".ws48 {font-size: 64px;}\r\n");
      out.write(".ws72 {font-size: 96px;}\r\n");
      out.write(".wpmd {font-size: 13px;font-family: Arial,Helvetica,Sans-Serif;font-style: normal;font-weight: normal;}\r\n");
      out.write("/*----------Para Styles----------*/\r\n");
      out.write("DIV,UL,OL /* Left */\r\n");
      out.write("{\r\n");
      out.write(" margin-top: 0px;\r\n");
      out.write(" margin-bottom: 0px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function vali()\r\n");
      out.write("{\r\n");
      out.write("\tif(document.register.pid.value==\"\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"Enter your Participant ID\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(document.register.name.value==\"\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\" Enter your name correctly \");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(document.register.college.value==\"\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"Enter your college name correctly\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(document.register.phone.value==\"\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"your phone number must be filled out\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("     \treturn true;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body bgColor=\"#3F3F3F\">\r\n");
      out.write("<center>\r\n");
      out.write("<div id=\"image2\" style=\"position:absolute; overflow:hidden; left:639px; top:1px; width:900px; height:195px; z-index:0\"><img src=\"images/sec.png\" alt=\"\" title=\"\" border=0 width=900 height=195></div>\r\n");
      out.write("<div id=\"image3\" style=\"position:absolute; overflow:hidden; left:0px; top:1px; width:640px; height:195px; z-index:1\"><img src=\"images/QUIZ.png\" alt=\"\" title=\"\" border=0 width=640 height=195></div>\r\n");
      out.write("<form name=\"register\" target=\"_self\" method=\"POST\" action=\"regserv\" autocomplete=\"off\" style=\"margin:0px\" onsubmit=\"return vali()\">\r\n");
      out.write("<input name=\"pid\" type=\"text\" maxlength=6 style=\"position:absolute;width:257px;left:689px;top:366px;z-index:2;border-radius:20px;\">\r\n");
      out.write("<input name=\"name\" type=\"text\" style=\"position:absolute;width:257px;left:690px;top:407px;z-index:5;border-radius:20px;\">\r\n");
      out.write("<input name=\"college\" type=\"text\" style=\"position:absolute;width:257px;left:691px;top:448px;z-index:7;border-radius:20px;\">\r\n");
      out.write("<input name=\"phone\" type=\"text\" maxlength=10 style=\"position:absolute;width:257px;left:691px;top:487px;z-index:10;border-radius:20px;\">\r\n");
      out.write("<input name=\"ENTER\" type=\"submit\" value=\"submit\" style=\"position:absolute;left:890px;top:545px;z-index:11;border-radius:20px;\">\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<div id=\"text1\" style=\"position:absolute; overflow:hidden; left:582px; top:368px; width:105px; height:25px; z-index:4\">\r\n");
      out.write("<div class=\"wpmd\">\r\n");
      out.write("<div><font color=\"#FFFFFF\" class=\"ws12\"><B>Participant ID</B></font></div>\r\n");
      out.write("</div></div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"text2\" style=\"position:absolute; overflow:hidden; left:640px; top:409px; width:47px; height:22px; z-index:6\">\r\n");
      out.write("<div class=\"wpmd\">\r\n");
      out.write("<div><font color=\"#FFFFFF\" class=\"ws12\"><B>Name</B></font></div>\r\n");
      out.write("</div></div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"text3\" style=\"position:absolute; overflow:hidden; left:630px; top:449px; width:59px; height:21px; z-index:8\">\r\n");
      out.write("<div class=\"wpmd\">\r\n");
      out.write("<div><font color=\"#FFFFFF\" class=\"ws12\"><B>college</B></font></div>\r\n");
      out.write("</div></div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"text4\" style=\"position:absolute; overflow:hidden; left:609px; top:490px; width:80px; height:22px; z-index:9\">\r\n");
      out.write("<div class=\"wpmd\">\r\n");
      out.write("<div><font color=\"#FFFFFF\" class=\"ws12\"><B>Phone No</B></font></div>\r\n");
      out.write("</div></div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"marquee1\" style=\"position:absolute; overflow:hidden; left:468px; top:309px; width:620px; height:26px; z-index:12\">\r\n");
      out.write("<marquee width=\"620\" height=\"26\" behavior=\"alternate\">\r\n");
      out.write("<div class=\"wpmd\">\r\n");
      out.write("<div><font color=\"#C0C0C0\" face=\"Arial Narrow\" class=\"ws12\">Enter your Registration correctly. unless your are not Eligible for the Prelims</font></div>\r\n");
      out.write("</div></marquee>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"image1\" style=\"position:absolute; overflow:hidden; left:615px; top:112px; width:297px; height:159px; z-index:13\"><img src=\"images/logo.png\" alt=\"\" title=\"\" height=\"159\" border=\"0\" width=\"297\"></div>\r\n");
      out.write("</center>\r\n");
      out.write("</body>\r\n");
      out.write("    ");

    String msg=request.getParameter("msg");
    if(msg!=null)
               {
    
      out.write("\r\n");
      out.write("    <script>alert(\"");
      out.print(msg);
      out.write("\");</script>\r\n");
      out.write("    ");
}
    
      out.write("\r\n");
      out.write("</html>\r\n");
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
