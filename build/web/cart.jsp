<!doctype html>
<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>

<%
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/raxitshah","root","");
    Statement st=con.createStatement();
    String name=request.getParameter("name");
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
    <script src="slick-1.6.0/slick/slick.min.js"></script>
    <script src="js/plugins.js"></script>
    <script src="js/main.js"></script>
</head>
<body>
<header>
    <nav id="top-nav">
        <ul>
            <li><a href="index.jsp">SHOP</a></li>
            <li class="selected"><a href="#">CART</a></li>
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
<section class="cart-container">
    <h3>Your Shopping Basket</h3>
    <div class="cart-items">
        <div class="cart-heading row">
            <div class="col-xs-7">
                Item
            </div>
            <div class="cart-item-price col-xs-1">Price</div>
            <div class="cart-item-qty col-xs-1">Qty</div>
            <div class="cart-item-remove col-xs-1">Remove</div>
            <div class="cart-item-total col-xs-1">Total</div>
        </div>
        
        <%
        //String id=session.getId();
        int total=0;
        int temp=0;
        String hht=(String)session.getAttribute("name");
        if (hht!=null){
        ResultSet rs=st.executeQuery("select * from cart where name like '"+hht+"'");
        while(rs.next()){
            total=total+rs.getInt(3);
        %>
          
        
        
        
        <div class="cart-item row">
            <div class="cart-item-image col-xs-1">
                <img src="img/item1.jpg" alt="" height="50" width="50">
            </div>
            <div class="cart-item-title col-xs-6"><%out.print(rs.getString(2));%></div>
            <div class="cart-item-price col-xs-1"><%out.print(rs.getInt(3));%></div>
            <div class="cart-item-qty col-xs-1">1</div>
            <div class="cart-item-remove col-xs-1"><%out.println("<a href='remove.jsp?name="+rs.getString(2)+"'><button class='btn'>Remove</button></a></div>");%>
            <div class="cart-item-total col-xs-1"><%out.print(rs.getInt(3));%></div>
        </div>
        <%}}%>
        <div class="cart-footer row">
            <div class="col-xs-10">
                Sopping Basket Total
            </div>
            <div class="cart-item-total col-xs-1">₹<%out.println(total);%></div>
        </div>

    </div>
</section>
<br>
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
                <a href="#"><img src="img/fb.png" alt=""></>
                <a href="#"><img src="img/twitter.png" alt=""></>
                <a href="#"><img src="img/youtube.png" alt=""></>
                <a href="#"><img src="img/instagram.png" alt=""></>
            </div>
        </div>
    </div>
</footer>
</body>
</html>
