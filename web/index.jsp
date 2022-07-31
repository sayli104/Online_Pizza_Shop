<%@ include file="includes/header.jsp" %>
<%@ include file="includes/slider.jsp" %>
<%@ page import= "java.util.*" %>
<%@ page import= "Model.*" %>

<%
	Product productDetails = new Product();
	ArrayList allProduct = productDetails.getAllProduct(0);
%>
<div class="wrapper row3">
  <div class="rounded">
    <main class="container clear"> 
      <!-- main body --> 
      <!-- ################################################################################################ -->
      <div class="group btmspace-30"> 
        <!-- Left Column -->
        <div class="one_quarter first"> 
          <!-- ################################################################################################ -->
          <ul class="nospace">
            <li class="btmspace-15"><a href="#"><em class="heading">NEW MENU</em> 
		<img class="borderedbox" src="images/demo/slider/cake.jpg" alt=""></a></li>
            <li class="btmspace-15"><a href="#"><em class="heading">FREE DELIVERY</em> 
		<img class="borderedbox" src="images/demo/slider/3.jpg" alt=""></a></li>
            <li class="btmspace-15"><a href="#"><em class="heading">ONLINE PAYMENTS</em> 
		<img class="borderedbox" src="images/demo/slider/4.png" alt=""></a></li>
            <li><a href="#"><em class="heading">GREAT DISCOUNT</em> 
		<img class="borderedbox" src="images/demo/slider/5.png" alt=""></a></li>
          </ul>
          <!-- ################################################################################################ --> 
        </div>
        <!-- / Left Column --> 
        <!-- Middle Column -->
        <div class="one_half" style="width:70%"> 
          <!-- ################################################################################################ -->
          <h2>ONLINE PIZZA SHOP</h2>          
          <ul class="nospace listing">
          <% for(int i=0;i<allProduct.size();i++) 
			{ 
				HashMap ProductDetails = new HashMap();
				ProductDetails = (HashMap)allProduct.get(i);
			%>
				<li class="product-listing">
					<div class="imgl borderedbox">
					<a href="product-details.jsp?product_id=<% out.print(ProductDetails.get("product_id")); %>">
						<img src="productImages/<% out.print(ProductDetails.get("product_image")); %>" style="height:110px; width:110px;">
					</a>
					</div>
					<div class="product-price">
						<b><% out.print(ProductDetails.get("product_name")); %></b> <br>
						&#8377; <% out.print(ProductDetails.get("product_price")); %>
					</div>
				</li>
			<%
			}
			%>
          </ul>
          
       <!-- ################################################################################################ --> 
        </div>
        <!-- / Middle Column --> 
      </div>
      
      <!-- ################################################################################################ --> 
      <!-- ################################################################################################ -->
      
      <!-- ################################################################################################ --> 
      <!-- / main body -->
      <div class="clear"></div>
    </main>
  </div>
</div>

<%@ include file="includes/footer.jsp" %>
