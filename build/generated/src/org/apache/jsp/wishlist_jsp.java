package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class wishlist_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!doctype html>\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");

    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/raxitshah","root","");
    Statement st=con.createStatement();
    //String name=request.getParameter("name");
   // out.println(name);
    
      out.write("\n");
      out.write("\n");
      out.write("    <html class=\"no-js\" lang=\"\">\n");
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
      out.write("    <script src=\"slick-1.6.0/slick/slick.min.js\"></script>\n");
      out.write("    <script src=\"js/plugins.js\"></script>\n");
      out.write("    <script src=\"js/main.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<header>\n");
      out.write("    <nav id=\"top-nav\">\n");
      out.write("        <ul>\n");
      out.write("            <li><a href=\"index.jsp\">SHOP</a></li>\n");
      out.write("            <li><a href=\"cart.jsp\">CART</a></li>\n");
      out.write("            <li class=\"selected\"><a href=\"#\">WISHLIST</a></li>\n");
      out.write("        </ul>\n");
      out.write("        ");

        if (session.getAttribute("live")==null)
        out.println("<a href='login.jsp' id='logout-button'>Login</a>");
        else{
        out.println("<a href='index.jsp' id='logout-button'>Logout</a>");
        session.invalidate();
        }
                
      out.write("\n");
      out.write("\n");
      out.write("    </nav>\n");
      out.write("    <div class=\"top-bar\"></div>\n");
      out.write("</header>\n");
      out.write("<section class=\"cart-container\">\n");
      out.write("    <h3>Your Wish List</h3>\n");
      out.write("    <div class=\"cart-items\">\n");
      out.write("        <div class=\"cart-heading row\">\n");
      out.write("            <div class=\"col-xs-8\">\n");
      out.write("                Item\n");
      out.write("            </div>\n");
      out.write("            <div class=\"cart-item-price col-xs-1\">Price</div>\n");
      out.write("            <div class=\"cart-item-remove col-xs-1\">Remove</div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"cart-item row\">\n");
      out.write("            ");

        String id=session.getId();
        ResultSet rs=st.executeQuery("select * from wishlist where id like '"+id+"'");
        while(rs.next()){
        
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"cart-item-image col-xs-1\">\n");
      out.write("                <img src=\"img/item1.jpg\" alt=\"\" height=\"50\" width=\"50\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"cart-item-title col-xs-7\">");
out.println(rs.getString(2));
      out.write("</div>\n");
      out.write("            <div class=\"cart-item-price col-xs-1\">");
out.println(rs.getInt(3));
      out.write("</div>\n");
      out.write("            <div class=\"cart-item-remove col-xs-1\"><button class=\"btn\">Remove</button></div>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"cart-footer row\">\n");
      out.write("            <div class=\"col-xs-9\">\n");
      out.write("                wishlist total items\n");
      out.write("            </div>\n");
      out.write("            <div class=\"cart-item-total col-xs-1\">1</div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<footer>\n");
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
      out.write("                <a href=\"#\"><img src=\"img/fb.png\" alt=\"\"></>\n");
      out.write("                <a href=\"#\"><img src=\"img/twitter.png\" alt=\"\"></>\n");
      out.write("                <a href=\"#\"><img src=\"img/youtube.png\" alt=\"\"></>\n");
      out.write("                <a href=\"#\"><img src=\"img/instagram.png\" alt=\"\"></>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</footer>\n");
      out.write("</body>\n");
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
