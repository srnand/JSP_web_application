package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class preschool_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");

    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/raxitshah","root","");
    Statement st=con.createStatement();
    //String name=request.getParameter("name");
    
    String search=request.getParameter("search");
    String asdf="";
    if (search!=null){
    //out.println("hello");
    asdf=search;
    }
    
    String sorts=request.getParameter("sort");
    
    
    String flavorc=request.getParameter("flavorc");
    if (flavorc!=null){
        ResultSet rs11=st.executeQuery("select price from item where name like '"+flavorc+"'");
        rs11.next();
        int price11=rs11.getInt(1);

    st.executeUpdate("insert into cart values('"+session.getAttribute("name")+"','"+flavorc+"','"+price11+"')");
    ResultSet rs=st.executeQuery("select price from item where name like '"+flavorc+"'");
    rs.next();
    int price=rs.getInt(1);
    session.setAttribute("price",(Integer)session.getAttribute("price")+price);
    }
    
    int pageid=0;
    if (session.getAttribute("pageid")==null){
    pageid=1;
    }
    else{
        pageid=(Integer)session.getAttribute("pageid");
    }
    int total=6;  
    String spageid=request.getParameter("pageno");
    if (spageid!=null){
    pageid=Integer.parseInt(spageid);  
    
    if(pageid==1){}  
    else{  
        pageid=pageid-1;  
        pageid=pageid*total+1;  
    }
    session.setAttribute("pageid", pageid);
    }
    
    String name;
    String flavordb;
    int pricedb;
String flavor=request.getParameter("flavor");
if(flavor!=null){

ResultSet rs=st.executeQuery("select price from item where name like '"+flavor+"'");
rs.next();
int price=rs.getInt(1);
String id=session.getId();
st.executeUpdate("insert into wishlist values('"+id+"','"+flavor+"','"+price+"')");
}
else if (flavor==null && spageid==null && flavorc==null)
{
//name=request.getParameter("name");
//session.setAttribute("name",name);
session.setAttribute("price",0);
session.setAttribute("pageid",1);
//st.executeUpdate("delete from items where 1");
}

      out.write("\n");
      out.write("    \n");
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
      out.write("<body>\n");
      out.write("<header>\n");
      out.write("    <nav id=\"top-nav\">\n");
      out.write("        <ul>\n");
      out.write("            <li class=\"selected\"><a href=\"index.jsp\">SHOP</a></li>\n");
      out.write("            ");
//out.println(yyt);
      out.write("\n");
      out.write("            <li><a href=\"cart.jsp\">CART</a></li>\n");
      out.write("            <li><a href=\"wishlist.jsp\">WISHLIST</a></li>\n");
      out.write("        </ul>\n");
      out.write("        ");

        if (session.getAttribute("live")==null)
        out.println("<a href='login.jsp' id='logout-button'>Login</a>");
        else{
        out.println("<a href='logout.jsp' id='logout-button'>Logout</a>");
        //session.invalidate();
        }
                
      out.write("\n");
      out.write("    </nav>\n");
      out.write("    <div class=\"top-bar\"></div>\n");
      out.write("</header>\n");
      out.write("<section class=\"main-container\">\n");
      out.write("    <nav>\n");
      out.write("        <ul>\n");
      out.write("            <li class=\"selected\" style=\"background-color: #B49759\"><a href=\"index.jsp\">Shop Home</a></li>\n");
      out.write("            <li style=\"background-color: #D8007B\"><a href=\"#\">Preschool</a></li>\n");
      out.write("            <li style=\"background-color: #73C026\"><a href=\"#\">Soft Toys</a></li>\n");
      out.write("            <li style=\"background-color: #00A0EE\"><a href=\"#\">Arts Crafts</a></li>\n");
      out.write("        </ul>\n");
      out.write("    </nav>\n");
      out.write("    <ul class=\"heading-tags\">\n");
      out.write("        <li><a href=\"#\">The star wars collection</a></li>\n");
      out.write("        <li><a href=\"#\">Free delivery</a></li>\n");
      out.write("        <li><a href=\"#\">Gift vouchers</a></li>\n");
      out.write("    </ul>\n");
      out.write("    <div style=\"background-color: #EDF8FA;padding-top:20px;\">\n");
      out.write("        <div class=\"item-container\">\n");
      out.write("            <div class=\"nav-bar\">\n");
      out.write("                Home\n");
      out.write("                <svg width=\"20\" height=\"20\" viewBox=\"0 0 120 120\" fill=\"#fff\"\n");
      out.write("                     xmlns=\"http://www.w3.org/2000/svg\">\n");
      out.write("                    <polygon points=\"0 0, 100 50, 50 50\"/>\n");
      out.write("                    <polygon points=\"50 50, 110 50, 0 100\"/>\n");
      out.write("                </svg>\n");
      out.write("                Preschool\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-xs-3 item-nav\">\n");
      out.write("                    <div id=\"side-nav-accordion\" class=\"accordion\">\n");
      out.write("                        <h4>Refine by category</h4>\n");
      out.write("                        <div>\n");
      out.write("                            <p>\n");
      out.write("                                Baby (72)<br>\n");
      out.write("                                Bath Toys (23)<br>\n");
      out.write("                                Learning Toys (112)<br>\n");
      out.write("                                Playsets (52)<br>\n");
      out.write("                                Traditional & Wooden (73)\n");
      out.write("                            </p>\n");
      out.write("                        </div>\n");
      out.write("                        <h4>Refine by brand</h4>\n");
      out.write("                        <div>\n");
      out.write("                            <p>\n");
      out.write("                                BRIO (18)<br>\n");
      out.write("                                Baby Einstein (5)<br>\n");
      out.write("                                Barbie (1)<br>\n");
      out.write("                                Ben & Holly (2)<br>\n");
      out.write("                                Bigjigs Rail (15)<br>\n");
      out.write("                                Bing (2)<br>\n");
      out.write("                                Bloomy (4)<br>\n");
      out.write("                            </p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-xs-9 item-container\">\n");
      out.write("                    <img src=\"img/Banner-Preschool2jpg.jpg\" alt=\"\">\n");
      out.write("                    <div class=\"pagination\">\n");
      out.write("                        <form action=\"preschool.jsp\">\n");
      out.write("                        <label for=\"search-bar\">Search Item</label>\n");
      out.write("                        <input type=\"text\" id=\"search-bar\" name=\"search\" placeholder=\"search\">\n");
      out.write("                        <label for=\"sorting-items\">Sort by</label>\n");
      out.write("                        <select id=\"sorting-items\" name=\"sort\" class=\"sorting-item\">\n");
      out.write("                            <option value=\"\" selected>Name</option>\n");
      out.write("                            <option value=\"ASC\">low to high</option>\n");
      out.write("                            <option value=\"DESC\">high to low</option>\n");
      out.write("                        </select>\n");
      out.write("                        <button type=\"submit\">  Click Here</button>\n");
      out.write("                        </form>\n");
      out.write("                        <div class=\"pages\">\n");
      out.write("          ");

                 
                 ResultSet rss1=st.executeQuery("select count(*) from item where name like '%"+asdf+"%'");
            rss1.next();
        int count=Integer.parseInt(rss1.getString(1));
        int pagecount=count/total;
        if (count%total!=0)pagecount++;
        for(int i=0;i<pagecount;i++){
        
       // out.println("<a href='preschool.jsp?pageno="+(i+1)+"'>"+(i+1)+"</a>");
        
      out.write("\n");
      out.write("        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                            ");
out.println("<a class='page' href='preschool.jsp?pageno="+(i+1)+"'>"+(i+1)+"</a>");
      out.write("\n");
      out.write("                       \n");
      out.write("                    \n");
      out.write("                   \n");
      out.write("        ");

        }  
        ResultSet rs1;
        if (sorts!=null && sorts!="name"){
        //out.println(sorts);
        rs1=st.executeQuery("select * from item where name like '%"+asdf+"%' order by price "+sorts+" limit "+(pageid-1)+","+total);
        }
        else{
        rs1=st.executeQuery("select * from item where name like '%"+asdf+"%' limit "+(pageid-1)+","+total);
        }
        
      out.write("\n");
      out.write(" </div>\n");
      out.write("        ");

        if(rs1!=null){
         
      out.write("\n");
      out.write("         </div>\n");
      out.write("    <div class=\"item-cards row\">\n");
      out.write("\n");
      out.write("         ");

        while(rs1.next()){
        flavordb=rs1.getString(1);
        pricedb=rs1.getInt(2);
        //out.println(""+flavordb);
        //out.println("<a href='icecream.jsp?flavor="+flavordb+"'>Add to WishList</a>");
        //out.println("<a href='icecream.jsp?flavorc="+flavordb+"'>Add to Cart</a><br/>");
       /* <a href="icecream.jsp?flavor=chocolate">Chocolate</a><br>
        <a href="icecream.jsp?flavor=strawberry">Strawberry</a> */
        
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("                   \n");
      out.write("                        <div class=\"item-card col-xs-3\">\n");
      out.write("                            <div class=\"item-card-img\">\n");
      out.write("                                <img src=\"img/item1.jpg\" alt=\"\">\n");
      out.write("                                <div class=\"item-card-title\">");
out.println(""+flavordb);
      out.write("</div>\n");
      out.write("                                <div class=\"item-card-price\">₹");
out.println(""+pricedb);
      out.write("</div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"item-card-footer\">\n");
      out.write("                                ");
out.println("<a href='preschool.jsp?flavor="+flavordb+"'><button>Add to WishList</button></a>");
      out.write("\n");
      out.write("                                ");

                                    String ii=(String)session.getAttribute("name");
                                    if(ii!=null)
                                    out.println("<a href='preschool.jsp?flavorc="+flavordb+"'><button>Add to Cart</button></a><br/>");
                                    
                                
      out.write("\n");
      out.write("                               \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    \n");
      out.write("                     ");
}
        
        }
        else
{
out.println("DATABASE EMPTY");
}
        
      out.write("\n");
      out.write("        ");

//                 out.println("<p>TOTAL OUTSTANDING "+session.getAttribute("price")+"</p>");
        
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</section>\n");
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
      out.write("                <a href=\"#\"><img src=\"img/fb.png\" alt=\"\"></a>\n");
      out.write("                <a href=\"#\"><img src=\"img/twitter.png\" alt=\"\"></a>\n");
      out.write("                <a href=\"#\"><img src=\"img/youtube.png\" alt=\"\"></a>\n");
      out.write("                <a href=\"#\"><img src=\"img/instagram.png\" alt=\"\"></a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</footer>\n");
      out.write("</body>\n");
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
