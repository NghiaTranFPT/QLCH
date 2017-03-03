<%-- 
    Document   : chitietsanpham
    Created on : Oct 21, 2016, 12:43:51 PM
    Author     : NghiaTran
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="header.jsp"></jsp:include>
   <jsp:include page="menu.jsp"></jsp:include>
    <body>
        <div class="single contact">
		<div class="container">
			<div class="single-main">
			  <div class="col-md-9 single-main-left">
				<div class="sngl-top">
					<div class="col-md-5 single-top-left">	
						<div class="flexslider">
							<ul class="slides">
								<li data-thumb="images/sonyXZ1.jpg"><img src="images/sonyXZ1.jpg" width="700" height="830"></li>
								<li data-thumb="images/sonyXZ1.jpg"><img src="images/SonyXZ2.jpg" width="700" height="830"></li>
								<li data-thumb="images/sonyXZ1.jpg"><img src="images/SonyXZ4.png" width="700" height="830"></li>								
								<li data-thumb="images/sonyXZ1.jpg"><img src="images/SonyXZ3.jpeg" width="700" height="830">
								</li>
							</ul>
						</div>
<!-- FlexSlider -->
  <script defer src="js/jquery.flexslider.js"></script>
<link rel="stylesheet" href="css/flexslider.css" type="text/css" media="screen" />

	<script>
// Can also be used with $(document).ready()
$(window).load(function() {
  $('.flexslider').flexslider({
    animation: "slide",
    controlNav: "thumbnails"
  });
});
</script>
				</div>	
				<div class="col-md-7 single-top-right">
					<div class="details-left-info simpleCart_shelfItem">
						<h3>Sony ZX</h3>
						<p class="availability">Trạng thái: <span class="color">Còn hàng</span></p>
						<div class="price_single">
							<span class="reducedfrom">15.000.00 VND</span>
							<span class="actual item_price">$13.000.000</span>
						</div>
						<h2 class="quick">Đánh giá:</h2>
						<p class="quick_desc"> Là một trong những siêu phẩm mới ra của Sony sở hữu camera vói 2 cảm biến với cấu hình khủng, dường như Sony đã đánh bật các đối thủ cảnh tranh khác. </p>
						<ul class="product-colors">
							<h3>available Colors ::</h3>
							<li><a class="color1" href="#"><span> </span></a></li>
							<li><a class="color2" href="#"><span> </span></a></li>
							<li><a class="color3" href="#"><span> </span></a></li>
							<li><a class="color4" href="#"><span> </span></a></li>
							<li><a class="color5" href="#"><span> </span></a></li>
							<li><a class="color6" href="#"><span> </span></a></li>
							<li><a class="color7" href="#"><span> </span></a></li>
							<li><a class="color8" href="#"><span> </span></a></li>
							<div class="clear"> </div>
						</ul>
						
						<div class="quantity_box">
							<ul class="product-qty">
								<span>Số lượng</span>
								<select>
									<option>1</option>
									<option>2</option>
									<option>3</option>
									<option>4</option>
									<option>5</option>
									<option>6</option>
								</select>
							</ul>
						</div>
					<div class="clearfix"> </div>
				<div class="single-but item_add">
					<input type="submit" value="add to cart"/>
				</div>
			</div>
		</div>
		<div class="clearfix"></div>
	</div>
					<div class="latest products">
						<div class="product-one">
							<div class="col-md-4 product-left single-left"> 
								<div class="p-one simpleCart_shelfItem">
									
									<a href="#">
								<img src="images/5383031480_nokia-lumia-1020-.jpg" width="200" height="180"" alt="" />
								<div class="mask mask1">
									<span>NOKIA 1020</span>
								</div>
							</a>
									<h4>NOKIA 1020</h4>
									<p><a class="item_add" href="#"><i></i> <span class=" item_price">5.000.000 VND</span></a></p>
									
								</div>
							</div>
							<div class="col-md-4 product-left single-left"> 
								<div class="p-one simpleCart_shelfItem">
									<a href="#">
								<img src="images/m8_vang.jpg" width="200" height="180"" alt="" />
								<div class="mask mask1">
									<span>HTC M8 Gold</span>
								</div>
							</a>
									<h4>HTC M8 Gold</h4>
									<p><a class="item_add" href="#"><i></i> <span class=" item_price">3.500.000 VND</span></a></p>
									
								</div>
							</div>
							<div class="col-md-4 product-left single-left"> 
								<div class="p-one simpleCart_shelfItem">
									<a href="#">
								<img src="images/Xperia-Z3-e1409696535911.jpg" width="200" height="180" alt="" />
								<div class="mask mask1">
									<span>Sony Xperia Z3</span>
								</div>
							</a>
									<h4>Sony Xperia Z3</h4>
									<p><a class="item_add" href="#"><i></i> <span class=" item_price">8.000.000 VND</span></a></p>									
								</div>
							</div>
							<div class="clearfix"> </div>
						</div>
						<div class="product-one">
							<div class="col-md-4 product-left single-left"> 
								<div class="p-one simpleCart_shelfItem">
									<a href="#">
								<img src="images/htc-10-global-glacier-silver-black-phone-listing.png" width="200" height="180" alt="" />
								<div class="mask mask1">
									<span>HTC 10</span>
								</div>
							</a>
									<h4>HTC 10</h4>
									<p><a class="item_add" href="#"><i></i> <span class=" item_price">13.000.000 VND</span></a></p>									
								</div>
							</div>
							<div class="col-md-4 product-left single-left"> 
								<div class="p-one simpleCart_shelfItem">
									<a href="#">
								<img src="images/lg v10.jpg" width="200" height="180" alt="" />
								<div class="mask mask1">
									<span>LG V10</span>
								</div>
							</a>
									<h4>LG V10</h4>
									<p><a class="item_add" href="#"><i></i> <span class=" item_price">6.000.000 VND</span></a></p>									
								</div>
							</div>
							<div class="col-md-4 product-left single-left"> 
								<div class="p-one simpleCart_shelfItem">
									<a href="#">
								<img src="images/lg-g3.jpg" width="200" height="180" alt="" />
								<div class="mask mask1">
									<span>LG G3</span>
								</div>
								</a>
									<h4>LG G3</h4>
									<p><a class="item_add" href="#"><i></i> <span class=" item_price">3.500.000 VND</span></a></p>				
								</div>
							</div>
							<div class="clearfix"> </div>
						</div>
					</div>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
	</div>
    </body>
    <jsp:include page="footer.jsp"></jsp:include>
</html>
