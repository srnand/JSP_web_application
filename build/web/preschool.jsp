<!doctype html>
<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>

<%
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
%>
    
<html class="no-js" lang="">
<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>index</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="apple-touch-icon" href="apple-touch-icon.png">
    <!-- Place favicon.ico in the root directory -->

    <link rel="stylesheet" href="css/normalize.css">
    <link rel="stylesheet" href="slick-1.6.0/slick/slick.css">
    <link rel="stylesheet" href="flexboxgrid-6.3.1/flexboxgrid-6.3.1/css/flexboxgrid.css">
    <link rel="stylesheet" href="css/main.css">
    <script src="js/vendor/modernizr-2.8.3.min.js"></script>
    <script src="js/vendor/jquery-3.1.1.min.js"></script>
    <script src="jquery-ui-1.12.1.custom/jquery-ui.min.js"></script>
    <script src="slick-1.6.0/slick/slick.min.js"></script>
    <script src="js/plugins.js"></script>
    <script src="js/main.js"></script>
    </head>
<body>
<header>
    <nav id="top-nav">
        <ul>
            <li class="selected"><a href="index.jsp">SHOP</a></li>
            <%//out.println(yyt);%>
            <li><a href="cart.jsp">CART</a></li>
            <li><a href="wishlist.jsp">WISHLIST</a></li>
        </ul>
        <%
        if (session.getAttribute("live")==null)
        out.println("<a href='login.jsp' id='logout-button'>Login</a>");
        else{
        out.println("<a href='logout.jsp' id='logout-button'>Logout</a>");
        //session.invalidate();
        }
                %>
    </nav>
    <div class="top-bar"></div>
</header>
<section class="main-container">
    <nav>
        <ul>
            <li class="selected" style="background-color: #B49759"><a href="index.jsp">Shop Home</a></li>
            <li style="background-color: #D8007B"><a href="#">Preschool</a></li>
            <li style="background-color: #73C026"><a href="#">Soft Toys</a></li>
            <li style="background-color: #00A0EE"><a href="#">Arts Crafts</a></li>
        </ul>
    </nav>
    <ul class="heading-tags">
        <li><a href="#">The star wars collection</a></li>
        <li><a href="#">Free delivery</a></li>
        <li><a href="#">Gift vouchers</a></li>
    </ul>
    <div style="background-color: #EDF8FA;padding-top:20px;">
        <div class="item-container">
            <div class="nav-bar">
                Home
                <svg width="20" height="20" viewBox="0 0 120 120" fill="#fff"
                     xmlns="http://www.w3.org/2000/svg">
                    <polygon points="0 0, 100 50, 50 50"/>
                    <polygon points="50 50, 110 50, 0 100"/>
                </svg>
                Preschool
            </div>
            <br>
            <div class="row">
                <div class="col-xs-3 item-nav">
                    <div id="side-nav-accordion" class="accordion">
                        <h4>Refine by category</h4>
                        <div>
                            <p>
                                Baby (72)<br>
                                Bath Toys (23)<br>
                                Learning Toys (112)<br>
                                Playsets (52)<br>
                                Traditional & Wooden (73)
                            </p>
                        </div>
                        <h4>Refine by brand</h4>
                        <div>
                            <p>
                                BRIO (18)<br>
                                Baby Einstein (5)<br>
                                Barbie (1)<br>
                                Ben & Holly (2)<br>
                                Bigjigs Rail (15)<br>
                                Bing (2)<br>
                                Bloomy (4)<br>
                            </p>
                        </div>
                    </div>
                </div>
                <div class="col-xs-9 item-container">
                    <img src="img/Banner-Preschool2jpg.jpg" alt="">
                    <div class="pagination">
                        <form action="preschool.jsp">
                        <label for="search-bar">Search Item</label>
                        <input type="text" id="search-bar" name="search" placeholder="search">
                        <label for="sorting-items">Sort by</label>
                        <select id="sorting-items" name="sort" class="sorting-item">
                            <option value="" selected>Name</option>
                            <option value="ASC">low to high</option>
                            <option value="DESC">high to low</option>
                        </select>
                        <button type="submit" >Click Here</button>
                        </form>
                        <div class="pages">
          <%
                 
                 ResultSet rss1=st.executeQuery("select count(*) from item where name like '%"+asdf+"%'");
            rss1.next();
        int count=Integer.parseInt(rss1.getString(1));
        int pagecount=count/total;
        if (count%total!=0)pagecount++;
        for(int i=0;i<pagecount;i++){
        
       // out.println("<a href='preschool.jsp?pageno="+(i+1)+"'>"+(i+1)+"</a>");
        %>
        
                        
                        
                            <%out.println("<a class='page' href='preschool.jsp?pageno="+(i+1)+"'>"+(i+1)+"</a>");%>
                       
                    
                   
        <%
        }  
        ResultSet rs1;
        if (sorts!=null && sorts!="name"){
        //out.println(sorts);
        rs1=st.executeQuery("select * from item where name like '%"+asdf+"%' order by price "+sorts+" limit "+(pageid-1)+","+total);
        }
        else{
        rs1=st.executeQuery("select * from item where name like '%"+asdf+"%' limit "+(pageid-1)+","+total);
        }
        %>
 </div>
        <%
        if(rs1!=null){
         %>
         </div>
    <div class="item-cards row">

         <%
        while(rs1.next()){
        flavordb=rs1.getString(1);
        pricedb=rs1.getInt(2);
        //out.println(""+flavordb);
        //out.println("<a href='icecream.jsp?flavor="+flavordb+"'>Add to WishList</a>");
        //out.println("<a href='icecream.jsp?flavorc="+flavordb+"'>Add to Cart</a><br/>");
       /* <a href="icecream.jsp?flavor=chocolate">Chocolate</a><br>
        <a href="icecream.jsp?flavor=strawberry">Strawberry</a> */
        %>
        
        
        
                   
                        <div class="item-card col-xs-3">
                            <div class="item-card-img">
                                <img src="img/item1.jpg" alt="">
                                <div class="item-card-title"><%out.println(""+flavordb);%></div>
                                <div class="item-card-price">₹<%out.println(""+pricedb);%></div>
                            </div>
                            <div class="item-card-footer">
                                <%out.println("<a href='preschool.jsp?flavor="+flavordb+"'><button>Add to WishList</button></a>");%>
                                <%
                                    String ii=(String)session.getAttribute("name");
                                    if(ii!=null)
                                    out.println("<a href='preschool.jsp?flavorc="+flavordb+"'><button>Add to Cart</button></a><br/>");
                                    
                                %>
                               
                            </div>
                        </div>
                    
                     <%}
        
        }
        else
{
out.println("DATABASE EMPTY");
}
        %>
        <%
//                 out.println("<p>TOTAL OUTSTANDING "+session.getAttribute("price")+"</p>");
        %>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<br>
<footer>
    <header>..and there's more</header>
    <br>
    <div class="footer-container">
        <img src="img/footer-img.png" alt="">
        <br><br><br>
        <div class="row">
            <div class="col-xs-2">
                Shop<br><br>
                <span class="small-text">
                Preschool<br>
                Soft Toys<br>
                Arts & Crafts<br>
                Dolls<br>
                Build It<br>
                Action Toys<br>
                Games<br>
                Outdoor<br>
                Vehicles<br>
                Offers
                </span>
            </div>
            <div class="col-xs-2">
                Gifting<br><br>
                <span class="small-text">
                Gift Vouchers
                </span>
            </div>
            <div class="col-xs-2">
                Explore<br><br>
                <span class="small-text">
                Find a Store<br>
                What's On at Hamleys<br>
                Birthday Parties<br>
                Competitions
                </span>
            </div>
            <div class="col-xs-2">
                About Us<br><br>
                <span class="small-text">
                A Life at Hamleys<br>
                Hamleys Careers<br>
                Hamleys History<br>
                Supplier Transparency
                </span>
            </div>
            <div class="col-xs-4">
                <a href="#"><img src="img/fb.png" alt=""></a>
                <a href="#"><img src="img/twitter.png" alt=""></a>
                <a href="#"><img src="img/youtube.png" alt=""></a>
                <a href="#"><img src="img/instagram.png" alt=""></a>
            </div>
        </div>
    </div>
</footer>
</body>
</html>
