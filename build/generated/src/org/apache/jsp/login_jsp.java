package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html class=\"no-js\" lang=\"\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\n");
      out.write("    <title>index</title>\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link rel=\"apple-touch-icon\" href=\"apple-touch-icon.png\">\n");
      out.write("    <!-- Place favicon.ico in the root directory -->\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/normalize.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"slick-1.6.0/slick/slick.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"flexboxgrid-6.3.1/flexboxgrid-6.3.1/css/flexboxgrid.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/main.css\">\n");
      out.write("    <script src=\"js/vendor/modernizr-2.8.3.min.js\"></script>\n");
      out.write("    <script src=\"js/vendor/jquery-3.1.1.min.js\"></script>\n");
      out.write("    <script src=\"jquery-ui-1.12.1.custom/jquery-ui.min.js\"></script>\n");
      out.write("    <script src=\"slick-1.6.0/slick/slick.min.js\"></script>\n");
      out.write("    <script src=\"js/plugins.js\"></script>\n");
      out.write("    <script src=\"js/main.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("<header>\n");
      out.write("    <nav id=\"top-nav\">\n");
      out.write("        <ul>\n");
      out.write("            <li class=\"selected\"><a href=\"index.jsp\">SHOP</a></li>\n");
      out.write("            <li><a href=\"cart.jsp\">CART</a></li>\n");
      out.write("            <li><a href=\"wishlist.html\">WISHLIST</a></li>\n");
      out.write("        </ul>\n");
      out.write("        <a href=\"#\" id=\"logout-button\">Logout</a>\n");
      out.write("    </nav>\n");
      out.write("    <div class=\"top-bar\"></div>\n");
      out.write("</header>\n");
      out.write("        <h1 style=\"font-family: cursive; text-align:center\"> ICE CREAM PARLOR</h1>\n");
      out.write("        <form method=\"get\" action=\"who.jsp\" id=\"login-form\" style=\"padding:80px;\">\n");
      out.write("            <table style=\"margin:0 auto;\">\n");
      out.write("                <tr><td>Enter Name: </td><td><input type=\"text\" name=\"name\" style=\"margin:10px;padding: 12px 20px;box-sizing: border-box;border: 2px solid #ccc;border-radius: 4px;background-color: #f8f8f8;\"></td></tr>\n");
      out.write("\t\t\t\t\n");
      out.write("                <tr><td>Enter Password: </td><td><input type=\"password\" name=\"pass\" style=\"margin:10px;padding: 12px 20px;box-sizing: border-box;border: 2px solid #ccc;border-radius: 4px;background-color: #f8f8f8;\"></td></tr>\n");
      out.write("                <tr><td></td><td><input type=\"submit\" name=\"name1\" value=\"LOGIN\" style=\"background-color: #4CAF50;border: none;color: white;padding: 15px 32px;text-align: center;text-decoration: none;display: inline-block;font-size: 16px;margin: 4px 2px;cursor: pointer;\"></td>\n");
      out.write("                   \n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("          <!--  <a href=\"manager.jsp\">Manager</a>-->\n");
      out.write("        </form>\n");
      out.write("        <footer>\n");
      out.write("    <header>..and there's more</header>\n");
      out.write("    <br>\n");
      out.write("    <div class=\"footer-container\">\n");
      out.write("        <img src=\"img/footer-img.png\" alt=\"\">\n");
      out.write("        <br><br><br>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-xs-2\">\n");
      out.write("                Shop<br><br>\n");
      out.write("                <span class=\"small-text\">\n");
      out.write("                Preschool<br>\n");
      out.write("                Soft Toys<br>\n");
      out.write("                Arts & Crafts<br>\n");
      out.write("                Dolls<br>\n");
      out.write("                Build It<br>\n");
      out.write("                Action Toys<br>\n");
      out.write("                Games<br>\n");
      out.write("                Outdoor<br>\n");
      out.write("                Vehicles<br>\n");
      out.write("                Offers\n");
      out.write("                </span>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xs-2\">\n");
      out.write("                Gifting<br><br>\n");
      out.write("                <span class=\"small-text\">\n");
      out.write("                Gift Vouchers\n");
      out.write("                </span>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xs-2\">\n");
      out.write("                Explore<br><br>\n");
      out.write("                <span class=\"small-text\">\n");
      out.write("                Find a Store<br>\n");
      out.write("                What's On at Hamleys<br>\n");
      out.write("                Birthday Parties<br>\n");
      out.write("                Competitions\n");
      out.write("                </span>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xs-2\">\n");
      out.write("                About Us<br><br>\n");
      out.write("                <span class=\"small-text\">\n");
      out.write("                A Life at Hamleys<br>\n");
      out.write("                Hamleys Careers<br>\n");
      out.write("                Hamleys History<br>\n");
      out.write("                Supplier Transparency\n");
      out.write("                </span>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xs-4\">\n");
      out.write("                <a href=\"#\"><img src=\"img/fb.png\" alt=\"\"></a>\n");
      out.write("                <a href=\"#\"><img src=\"img/twitter.png\" alt=\"\"></a>\n");
      out.write("                <a href=\"#\"><img src=\"img/youtube.png\" alt=\"\"></a>\n");
      out.write("                <a href=\"#\"><img src=\"img/instagram.png\" alt=\"\"></a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</footer>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
