<!doctype html>
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
            <li class="selected"><a href="#">SHOP</a></li>
            <li><a href="cart.jsp">CART</a></li>
            <li><a href="wishlist.jsp">WISHLIST</a></li>
        </ul>
        <%
        if (session.getAttribute("live")==null)
        out.println("<a href='login.jsp' id='logout-button'>Login</a>");
        else{
        //out.println(session.getAttribute("name"));
        out.println("<a href='logout.jsp' id='logout-button'>Logout</a>");
        //session.invalidate();
        }
                %>
    </nav>
    <div class="top-bar"><br><br><span style="font-size: 70px; color:white;font-family: cursive;margin:0 0 0 150px;">H<sub>2</sub>O</span></div>
</header>
<section class="main-container">
    <nav>
        <ul>
            <li class="selected" style="background-color: #B49759"><a href="#">Shop Home</a></li>
            <li style="background-color: #D8007B"><a href="preschool.jsp">Preschool</a></li>
            <li style="background-color: #73C026"><a href="#">Soft Toys</a></li>
            <li style="background-color: #00A0EE"><a href="#">Arts Crafts</a></li>
        </ul>
    </nav>
    <ul class="heading-tags">
        <li><a href="#">The star wars collection</a></li>
        <li><a href="#">Free delivery</a></li>
        <li><a href="#">Gift vouchers</a></li>
    </ul>

    <div class="carousel-container">
        <div class="carousel">
            <div class="carousel-item">
                <img src="img/car1.jpg" alt="">
            </div>
            <div class="carousel-item">
                <img src="img/car2.jpg" alt="">
            </div>
        </div>
        <div class="adv-cards">
            <div class="adv-card">
                <div class="adv-card-img">
                    <img src="img/adv-card1.jpg" alt="">
                </div>
                <div class="adv-card-footer">
                    Shop Now
                </div>
            </div>
            <div class="adv-card">
                <div class="adv-card-img">
                    <img src="img/adv-card2.jpg" alt="">
                </div>
                <div class="adv-card-footer">
                    Shop Now
                </div>
            </div>
            <div class="adv-card">
                <div class="adv-card-img">
                    <img src="img/adv-card3.jpg" alt="">
                </div>
                <div class="adv-card-footer">
                    Shop Now
                </div>
            </div>
            <div class="adv-card">
                <div class="adv-card-img">
                    <img src="img/adv-card4.jpg" alt="">
                </div>
                <div class="adv-card-footer">
                    Shop Now
                </div>
            </div>
            <div class="adv-card">
                <div class="adv-card-img">
                    <img src="img/adv-card1.jpg" alt="">
                </div>
                <div class="adv-card-footer">
                    Shop Now
                </div>
            </div>
            <div class="adv-card">
                <div class="adv-card-img">
                    <img src="img/adv-card2.jpg" alt="">
                </div>
                <div class="adv-card-footer">
                    Shop Now
                </div>
            </div>
            <div class="adv-card">
                <div class="adv-card-img">
                    <img src="img/adv-card3.jpg" alt="">
                </div>
                <div class="adv-card-footer">
                    Shop Now
                </div>
            </div>
            <div class="adv-card">
                <div class="adv-card-img">
                    <img src="img/adv-card4.jpg" alt="">
                </div>
                <div class="adv-card-footer">
                    Shop Now
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
