<%-- 
    Document   : index
    Created on : Oct 21, 2016, 11:49:43 AM
    Author     : NghiaTran
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Free Style A Ecommerce Category Flat Bootstarp Resposive Website Template | Home :: w3layouts</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery-1.11.0.min.js"></script>
<!-- Custom Theme files -->
<!--theme-style-->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />	
<!--//theme-style-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Free Style Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--fonts-->
<link href='http://fonts.googleapis.com/css?family=Alegreya+Sans+SC:100,300,400,500,700,800,900,100italic,300italic,400italic,500italic,700italic,800italic,900italic' rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Lato:100,300,400,700,900,100italic,300italic,400italic,700italic,900italic' rel='stylesheet' type='text/css'>
<!--//fonts-->
<script type="text/javascript" src="js/move-top.js"></script>
<script type="text/javascript" src="js/easing.js"></script>	
<!-- start menu -->
<script src="js/simpleCart.min.js"> </script>
<link href="css/memenu.css" rel="stylesheet" type="text/css" media="all" />
<script type="text/javascript" src="js/memenu.js"></script>
<script>$(document).ready(function(){$(".memenu").memenu();});</script>				
</head>
<body> 
	<!--top-header-->
	<div class="top-header">
            <div class="topbar">
			<div class="container">
				<div class="col-xs-12 col-sm-6 p0 hotline-top">
                                    <li <%=Controller.LoginServlet.display%> class="DN"><a href="Login.jsp" class="DK">Login</a><span class="gachngang"> - </span><a class="DK" href="Dangky.jsp">Register account</a></li>
                                    <li class="lidn" style="color: red;<%=Controller.LoginServlet.displayDN%>"><%=Controller.LoginServlet.userN%> </li>
                                       
				</div>
			</div>
		</div>
	<div class="container">
		<div class="top-header-main">
			<div class="col-md-4 top-header-left">
				<div class="search-bar">
					<input type="text" value="Search" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Search';}">
					<input type="submit" value="">
				</div>
			</div>
			<div class="col-md-4 top-header-middle"><img src="images/logo.jpg" width="488" height="129"></div>
			<div class="col-md-4 top-header-right">
				
		  </div>
			<div class="clearfix"></div>
		</div>
	</div>
</div>
<!--top-header-->
	<!--bottom-header-->
	<div class="header-bottom">
		<div class="container">
			<div class="top-nav">
				<ul class="memenu skyblue">
				  <li class="active"><a href="index.html">Home</a></li>
					<li class="grid"><a href="#">MOBILE</a>
						<div class="mepanel">
							<div class="row">
								<div class="col1 me-one">
									<h4>Shop</h4>
									<ul>
										<li><a href="#">SONY</a></li>
										<li><a href="#">HTC</a></li>
										<li><a href="#">LG</a></li>
										<li><a href="#">SAMSUNG</a></li>
										<li><a href="#">SKY</a></li>
										<li><a href="#">MOBISTAR</a></li>
										<li><a href="#">LENOVO</a></li>
										<li><a href="#">BLACK BERRY</a></li>
									</ul>
								</div>
								<div class="col1 me-one">
									<h4>AUDIO</h4>
									<ul>
										<li><a href="#">SONY</a></li>
										<li><a href="#">JBL</a></li>
										<li><a href="#">AUDI</a></li>
										<li><a href="#">LG</a></li>
										<li><a href="#">BEATS</a></li>
										<li><a href="#">OTHER</a></li>
									</ul>	
								</div>
								<div class="col1 me-one">
									<h4>CAMERA</h4>
									<ul>
										<li><a href="#">SONY</a></li>
										<li><a href="#">CANON</a></li>
										<li><a href="#">NIKEN</a></li>
										<li><a href="#">PANASONIC</a></li>
										<li><a href="#">OTHER</a></li>
									
									</ul>	
								</div>
							</div>
						</div>
					</li>
					<li class="grid"><a href="#">TABLET</a>
						<div class="mepanel">
							<div class="row">
								<div class="col1 me-one">
									<h4>Shop</h4>
									<ul>
										<li><a href="#">SONY</a></li>
										<li><a href="#">HTC</a></li>
										<li><a href="#">LG</a></li>
										<li><a href="#">SAMSUNG</a></li>
										<li><a href="#">SKY</a></li>
										<li><a href="#">MOBISTAR</a></li>
										<li><a href="#">LENOVO</a></li>
										<li><a href="#">BLACK BERRY</a></li>
									</ul>
								</div>
								<div class="col1 me-one">
									<h4>AUDIO</h4>
									<ul>
										<li><a href="#">SONY</a></li>
										<li><a href="#">JBL</a></li>
										<li><a href="#">AUDI</a></li>
										<li><a href="#">LG</a></li>
										<li><a href="#">BEATS</a></li>
										<li><a href="#">OTHER</a></li>
									</ul>	
								</div>
								<div class="col1 me-one">
									<h4>CAMERA</h4>
									<ul>
										<li><a href="#">SONY</a></li>
										<li><a href="#">CANON</a></li>
										<li><a href="#">NIKEN</a></li>
										<li><a href="#">PANASONIC</a></li>
										<li><a href="#">OTHER</a></li>
									
									</ul>	
								</div>
							</div>
						</div>
					</li>
					<li class="grid"><a href="#">CAMERA</a>
						<div class="mepanel">
							<div class="row">
								<div class="col1 me-one">
									<h4>Shop</h4>
									<ul>
										<li><a href="#">SONY</a></li>
										<li><a href="#">HTC</a></li>
										<li><a href="#">LG</a></li>
										<li><a href="#">SAMSUNG</a></li>
										<li><a href="#">SKY</a></li>
										<li><a href="#">MOBISTAR</a></li>
										<li><a href="#">LENOVO</a></li>
										<li><a href="#">BLACK BERRY</a></li>
									</ul>
								</div>
								<div class="col1 me-one">
									<h4>AUDIO</h4>
									<ul>
										<li><a href="#">SONY</a></li>
										<li><a href="#">JBL</a></li>
										<li><a href="#">AUDI</a></li>
										<li><a href="#">LG</a></li>
										<li><a href="#">BEATS</a></li>
										<li><a href="#">OTHER</a></li>
									</ul>	
								</div>
								<div class="col1 me-one">
									<h4>CAMERA</h4>
									<ul>
										<li><a href="#">SONY</a></li>
										<li><a href="#">CANON</a></li>
										<li><a href="#">NIKEN</a></li>
										<li><a href="#">PANASONIC</a></li>
										<li><a href="#">OTHER</a></li>
									
									</ul>	
								</div>
							</div>
						</div>
					</li>
					<li class="grid"><a href="#">Sports</a>
						<div class="mepanel">
							<div class="row">
								<div class="col1 me-one">
									<h4>Shop</h4>
									<ul>
										<li><a href="#">SONY</a></li>
										<li><a href="#">HTC</a></li>
										<li><a href="#">LG</a></li>
										<li><a href="#">SAMSUNG</a></li>
										<li><a href="#">SKY</a></li>
										<li><a href="#">MOBISTAR</a></li>
										<li><a href="#">LENOVO</a></li>
										<li><a href="#">BLACK BERRY</a></li>
									</ul>
								</div>
								<div class="col1 me-one">
									<h4>AUDIO</h4>
									<ul>
										<li><a href="#">SONY</a></li>
										<li><a href="#">JBL</a></li>
										<li><a href="#">AUDI</a></li>
										<li><a href="#">LG</a></li>
										<li><a href="#">BEATS</a></li>
										<li><a href="#">OTHER</a></li>
									</ul>	
								</div>
								<div class="col1 me-one">
									<h4>CAMERA</h4>
									<ul>
										<li><a href="#">SONY</a></li>
										<li><a href="#">CANON</a></li>
										<li><a href="#">NIKEN</a></li>
										<li><a href="#">PANASONIC</a></li>
										<li><a href="#">OTHER</a></li>
									
									</ul>	
								</div>
							</div>
						</div>
					</li>
					<li class="grid"><a href="#">SUPPor</a>
						<div class="mepanel">
							<div class="row">
								<div class="col1 me-one">
									<h4>Shop</h4>
									<ul>
										<li><a href="#">SONY</a></li>
										<li><a href="#">HTC</a></li>
										<li><a href="#">LG</a></li>
										<li><a href="#">SAMSUNG</a></li>
										<li><a href="#">SKY</a></li>
										<li><a href="#">MOBISTAR</a></li>
										<li><a href="#">LENOVO</a></li>
										<li><a href="#">BLACK BERRY</a></li>
									</ul>
								</div>
								<div class="col1 me-one">
									<h4>AUDIO</h4>
									<ul>
										<li><a href="#">SONY</a></li>
										<li><a href="#">JBL</a></li>
										<li><a href="#">AUDI</a></li>
										<li><a href="#">LG</a></li>
										<li><a href="#">BEATS</a></li>
										<li><a href="#">OTHER</a></li>
									</ul>	
								</div>
								<div class="col1 me-one">
									<h4>CAMERA</h4>
									<ul>
										<li><a href="#">SONY</a></li>
										<li><a href="#">CANON</a></li>
										<li><a href="#">NIKEN</a></li>
										<li><a href="#">PANASONIC</a></li>
										<li><a href="#">OTHER</a></li>
									
									</ul>	
								</div>
							</div>
						</div>
					</li>
				</ul>
			</div>
			<div class="clearfix"> </div>
		</div>
	</div>
	<!--bottom-header-->
	<!--banner-starts-->
	<div class="bnr" id="home">
		<div  id="top" class="callbacks_container">
			<ul class="rslides" id="slider4">
			    <li>
					<div class="banner-1"></div>
				</li>
				<li>
					<div class="banner-2"></div>
				</li>
				<li>
					<div class="banner-3"></div>
				</li>
			</ul>
		</div>
		<div class="clearfix"> </div>
	</div>
	<!--banner-ends--> 
	<!--Slider-Starts-Here-->
				<script src="js/responsiveslides.min.js"></script>
			 <script>
			    // You can also use "$(window).load(function() {"
			    $(function () {
			      // Slideshow 4
			      $("#slider4").responsiveSlides({
			        auto: true,
			        pager: true,
			        nav: false,
			        speed: 500,
			        namespace: "callbacks",
			        before: function () {
			          $('.events').append("<li>before event fired.</li>");
			        },
			        after: function () {
			          $('.events').append("<li>after event fired.</li>");
			        }
			      });
			
			    });
			  </script>
			<!--End-slider-script-->
	<!--start-banner-bottom--> 
	<div class="banner-bottom">
		<div class="container">
			<div class="banner-bottom-top">
				<div class="col-md-6 banner-bottom-left">
					<div class="bnr-one">
						<div class="bnr-left">
							<h1>SONY XZ</h1>
							<p>Sony XZ là một những sản phẩm đánh dấu sự trở lại của Sony...</p>
							<div class="b-btn"> 
							<a href="chitietsanpham.jsp">SHOP NOW </a></div>
						</div>
						<div class="bnr-right"><img src="images/Xperia-XZ_forestBlue_group_SCR1.png" width="200" height="119"></div>
						<div class="clearfix"> </div>
					</div>
				</div>
				<div class="col-md-6 banner-bottom-right">
					<div class="bnr-two">
						<div class="bnr-left">
							<h2>NOKIA lUMIA 1020</h2>
							<p>Nokia  lumia 1020 là một chiếc smarphone sở hữu camera...</p>
							<div class="b-btn"> 
							<a href="#">SHOP NOW </a></div>
						</div>
						<div class="bnr-right"><img src="images/5383031480_nokia-lumia-1020-.jpg" width="196" height="119"></div>
						<div class="clearfix"> </div>
					</div>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
	</div>
	<!--end-banner-bottom--> 
	<!--start-shoes--> 
	<div class="shoes"> 
		<div class="container"> 
			<div class="product-one">
				<div class="col-md-3 product-left"> 
					<div class="p-one simpleCart_shelfItem">							
							<a href="single.html">
							<div class="mask">
								<span>Quick View</span>
							  </div>
							</a>
						<h4><img src="images/m8_vang.jpg" width="99%" height="167">HTC M8 Gold</h4>
						<p><a class="item_add" href="#"><i></i>5.000.000 VNĐ</a></p>
					
					</div>
				</div>
				<div class="col-md-3 product-left"> 
					<div class="p-one simpleCart_shelfItem">
						
						<a href="single.html">
						<div class="mask">
							<span>Quick View</span>
						  </div>
							</a>
						<h4><img src="images/Xperia-Z3-e1409696535911.jpg" width="92%" height="167">SONY Z3 AU</h4>
						<p><a class="item_add" href="#"><i></i>8.000.000 VNĐ</a></p>
						
					</div>
				</div>
				<div class="col-md-3 product-left"> 
					<div class="p-one simpleCart_shelfItem">
						
						<a href="single.html">
						<div class="mask">
							<span>Quick View</span>
						  </div>
							</a>
						<h4><img src="images/htc-10-global-glacier-silver-black-phone-listing.png" width="101%" height="167">HTC 10</h4>
						<p><a class="item_add" href="#"><i></i> <span class=" item_price">13.000.000 VNĐ</span></a></p>
						
					</div>
				</div>
				<div class="col-md-3 product-left"> 
					<div class="p-one simpleCart_shelfItem">
						
						<a href="single.html">
						<div class="mask">
							<span>Quick View</span>
						  </div>
							</a>
						<h4><img src="images/lg v10.jpg" width="101%" height="168">LG V10</h4>
						<p><a class="item_add" href="#"><i></i>7.000.000 VND</a></p>
						
					</div>
				</div>
				<div class="clearfix"> </div>
			</div>
			<div class="product-one">
				<div class="col-md-3 product-left"> 
					<div class="p-one simpleCart_shelfItem">
						
						<a href="single.html">
						<div class="mask">
							<span>Quick View</span>
						  </div>
							</a>
						<h4><img src="images/lg-g3.jpg" width="86%" height="185">LG G3</h4>
						<p><a class="item_add" href="#"><i></i> <span class=" item_price">3.500.000 VND</span></a></p>
						
					</div>
				</div>
				<div class="col-md-3 product-left"> 
					<div class="p-one simpleCart_shelfItem">
						
						<a href="single.html">
						<div class="mask">
							<span>Quick View</span>
						  </div>
							</a>
						<h4><img src="images/LG_G5.jpg" width="102%" height="183">LG G5</h4>
						<p><a class="item_add" href="#"><i></i>7.300.000 VND</a></p>
						
					</div>
				</div>
				<div class="col-md-3 product-left"> 
					<div class="p-one simpleCart_shelfItem">
						
						<a href="single.html">
						<div class="mask">
							<span>Quick View</span>
						  </div>
							</a>
						<h4><img src="images/lumia 730.jpg" width="99%" height="182">LUMIA 730</h4>
						<p><a class="item_add" href="#"><i></i>1.700.000 VND</a></p>
						
					</div>
				</div>
				<div class="col-md-3 product-left"> 
					<div class="p-one simpleCart_shelfItem">
						
						<a href="single.html">
						<div class="mask">
							<span>Quick View</span>
						  </div>
							</a>
						<h4><img src="images/m7.jpg" width="93%" height="185">HTC M7 Blue</h4>
						<p><a class="item_add" href="#"><i></i>2.100.000 VND</a></p>
						
					</div>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
	</div>
	<!--end-shoes-->
	<!--start-abt-shoe-->
	<div class="abt-shoe">
		<div class="container"> 
			<div class="abt-shoe-main">
				<div class="col-md-4 abt-shoe-left">
					<div class="abt-one">
					  <h4><img src="images/sony xa.jpg" width="101%" height="219"><a href="#">ĐiỆN ThOẠI</a></h4>
						<p>HTC, Sony, LG, Sky, Lenovo,....</p>
					</div>
				</div>
				<div class="col-md-4 abt-shoe-left">
					<div class="abt-one">
					  <h4><img src="images/XB 450.jpg" width="99%" height="219"><a href="#">TAI NGHE</a></h4>
					  <p>Sony, HTC, SamSung, JBL,...</p>
					</div>
				</div>
				<div class="col-md-4 abt-shoe-left">
					<div class="abt-one">
					  <h4><img src="images/Loa Sony.jpg" width="600" height="219"><a href="#">LOA NGOÀI</a></h4>
					  <p>JBL, Sony, LG, Audi,...					</p>
					</div>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
	</div>
	<!--end-abt-shoe-->
	<!--start-footer-->
	<div class="footer">
		<div class="container">
			<div class="footer-top">
				<div class="col-md-3 footer-left">
					<h3>Thông Tin</h3>
					<ul>
						<li><a href="#">Who We Are</a></li>
						<li><a href="#"> Contact Us </a></li>
						<li><a href="#">Our Sites</a></li>
						<li><a href="#">In The News</a></li>
						<li><a href="#">Team</a></li>
						<li><a href="#">Carrers</a></li>					 
					</ul>
				</div>
				<div class="col-md-3 footer-left">
					<h3>TÀI KHOẢN CỦA BẠN</h3>
					<ul>
						<li><a href="account.html">Your Account</a></li>
						<li><a href="#">Personal Information</a></li>
						<li><a href="#">Addresses</a></li>
						<li><a href="#">Discount</a></li>
						<li><a href="#">Track your order</a></li>					 					 
					</ul>
				</div>
				<div class="col-md-3 footer-left">
					<h3>TƯ VẤN</h3>
					<ul>
						<li><a href="#">FAQ</a></li>
						<li><a href="#">Shipping</a></li>				 
					</ul>
					<div class="sub">
						<form>
							<input type="text" value="Your Email" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Your Email';}">
							<input type="submit" value="Subscribe">
						</form>
					</div>
				</div>
				<div class="col-md-3 footer-left footer-right">
					<h3>LIÊN HỆ</h3>
					<ul>
						<li><a href="#"><span class="fb"> </span></a></li>
						<li><a href="#"><span class="twit"> </span></a></li>
						<li><a href="#"><span class="drbl"> </span></a></li>
						<li><a href="#"><span class="google"> </span></a></li>				 
					</ul>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
	</div>
	<!--end-footer-->
	<!--end-footer-text-->
	<div class="footer-text">
		<div class="container">
			<div class="footer-main">
				<p class="footer-class">© 2016 QUOCNGHIAMOBILE| Design by  <a href="http://w3layouts.com/" target="_blank">NghiaTran</a> </p>
			</div>
		</div>
		<script type="text/javascript">
									$(document).ready(function() {
										/*
										var defaults = {
								  			containerID: 'toTop', // fading element id
											containerHoverID: 'toTopHover', // fading element hover id
											scrollSpeed: 1200,
											easingType: 'linear' 
								 		};
										*/
										
										$().UItoTop({ easingType: 'easeOutQuart' });
										
									});
								</script>
		<a href="#home" id="toTop" class="scroll" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>
	</div>
	<!--end-footer-text-->	
</body>
</html>