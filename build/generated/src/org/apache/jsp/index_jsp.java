package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import Model.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/includes/header.jsp");
    _jspx_dependants.add("/includes/slider.jsp");
    _jspx_dependants.add("/includes/footer.jsp");
  }

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

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Online Pizza Shop</title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\">\n");
      out.write("<link href=\"layout/styles/layout.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/jquery-ui.css\">\n");
      out.write("<script src=\"js/jquery-1.10.2.js\"></script>\n");
      out.write("<script src=\"js/jquery-ui.js\"></script>\n");
      out.write("<script src=\"js/jquery.validate.js\"></script>\n");
      out.write("<style>\n");
      out.write(".ui-datepicker {\n");
      out.write("\tfont-family: \"Trebuchet MS\", \"Helvetica\", \"Arial\",  \"Verdana\", \"sans-serif\";\n");
      out.write("\tfont-size: 12px;\n");
      out.write("}\n");
      out.write(".ui-datepicker select.ui-datepicker-month, .ui-datepicker select.ui-datepicker-year {\n");
      out.write("\tfloat:left;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<script>\n");
      out.write("jQuery('document').ready(function() {\n");
      out.write("\tjQuery(\"#Form\").validate();\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body id=\"top\">\n");
      out.write("<div class=\"wrapper row0\">\n");
      out.write("  <div id=\"topbar\" class=\"clear\"> \n");
      out.write("    <nav>\n");
      out.write("      <ul>\n");
      out.write("\t\t");
 if(session.getAttribute("login_id")!=null) { 
      out.write("\n");
      out.write("\t\t<li>Welcome ");
 out.print(session.getAttribute("login_name")); 
      out.write("</li>\n");
      out.write("        <li><a href=\"model/login.jsp?act=logout\">Logout</a></li>\n");
      out.write("\t\t");
 } else { 
      out.write("\n");
      out.write("\t\t<li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("        <li><a href=\"about-us.jsp\">About Us</a></li>\n");
      out.write("        <li><a href=\"contact-us.jsp\">Contact Us</a></li>\n");
      out.write("        <li><a href=\"customer-login.jsp?customer_id=0\">Customer Registration</a></li>\n");
      out.write("\t\t<li><a href=\"customer-login.jsp\">Customer Login</a></li>\n");
      out.write("\t\t<li><a href=\"login.jsp?title=Adminstrator\">Admin Login</a></li>\n");
      out.write("\t\t");
 } 
      out.write("\n");
      out.write("      </ul>\n");
      out.write("    </nav>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"wrapper row1\">\n");
      out.write("  <header id=\"header\" class=\"clear\"> \n");
      out.write("    <div id=\"logo\" class=\"fl_left\">\n");
      out.write("        <div style=\"float:left; margin-top:-10px;\"><marquee><h1 style=\"font-size:40px;\"><a href=\"index.jsp\"><h1>online pizza shop</h1></a></h1></marquee>   \n");
      out.write("            <p style=\"color:#ffffff\">Free delivery, great discounts, variety of Products</p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"fl_right\">\n");
      out.write("      <form class=\"clear\" method=\"post\" action=\"#\">\n");
      out.write("        <fieldset>\n");
      out.write("          <legend>Search:</legend>\n");
      out.write("          <input type=\"text\" value=\"\" placeholder=\"Search Here\">\n");
      out.write("          <button class=\"fa fa-search\" type=\"submit\" title=\"Search\"><em>Search</em></button>\n");
      out.write("        </fieldset>\n");
      out.write("      </form>\n");
      out.write("    </div>\n");
      out.write("  </header>\n");
      out.write("</div>\n");
      out.write("<div class=\"wrapper row2\">\n");
      out.write("  <div class=\"rounded\">\n");
      out.write("    <nav id=\"mainav\" class=\"clear\"> \n");
      out.write("      <ul class=\"clear\">\n");
      out.write("        <li class=\"active\"><a href=\"index.jsp\">Home</a></li>\n");
      out.write("        <!-- Menu System for Super Admin Login -->\n");
      out.write("        ");
 if(session.getAttribute("login_level") != null && session.getAttribute("login_level").equals("1")) { 
      out.write("\n");
      out.write("\t\t<li><a href=\"product.jsp?product_id=0\">Product Management</a></li>\n");
      out.write("\t\t<li><a href=\"#\" class=\"drop\" >Reports</a>\n");
      out.write("         <ul>\n");
      out.write("            <li><a href=\"report-product.jsp?type_id=0\">Product Reports</a></li>\n");
      out.write("            <li><a href=\"report-stock.jsp?type_id=0\">Stock Report</a></li>\n");
      out.write("            <li><a href=\"report-customer.jsp\">Customer Report</a></li>\n");
      out.write("            <li><a href=\"report-order.jsp?customer_id=0\">Order Report</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("        <li><a href=\"change-password.jsp\">Change Password</a></li>\n");
      out.write("        <li><a href=\"model/login.jsp?act=logout\">Logout</a></li>\n");
      out.write("\t\t");
 } 
      out.write("\n");
      out.write("\t\t<!-- End of the Super Admin Menu Section -->\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- Menu System for Customer Login -->\n");
      out.write("\t\t");
 if(session.getAttribute("login_level") != null && session.getAttribute("login_level").equals("4")) { 
      out.write("\t\t\n");
      out.write("\t\t<li><a href=\"#\" class=\"drop\" >Shopping More</a>\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li><a href=\"list-product.jsp?type_id=5\">Pasta</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"list-product.jsp?type_id=1\">Starters</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"list-product.jsp?type_id=2\">Pizzas</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"list-product.jsp?type_id=3\">Desserts</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"list-product.jsp?type_id=4\">Soups</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"list-product.jsp?type_id=6\">Beverages</a></li>\t        \n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</li>\n");
      out.write("\t\t<li><a href=\"report-order.jsp?customer_id=");
      out.print(session.getAttribute("customer_id"));
      out.write("\">My Orders</a></li>\n");
      out.write("\t\t<li><a href=\"customer.jsp?customer_id=");
      out.print(session.getAttribute("customer_id"));
      out.write("\">My Account</a></li>\n");
      out.write("\t\t<li><a href=\"contact-us.jsp\">Contact Us</a></li>\n");
      out.write("        <li><a href=\"model/customer.jsp?act=logout\">Logout</a></li>\n");
      out.write("\t\t");
 } 
      out.write("\n");
      out.write("\t\t<!-- End of Employee Menu Section -->\n");
      out.write("\t\t\n");
      out.write("\t\t");
 if(session.getAttribute("login_level") == null) { 
      out.write("\n");
      out.write("\t\t\t<li><a href=\"list-product.jsp?type_id=0\">All Products</a></li>\n");
      out.write("\t\t\t<li><a href=\"list-product.jsp?type_id=5\">Pasta</a></li>\n");
      out.write("\t\t\t<li><a href=\"list-product.jsp?type_id=1\">Starters</a></li>\n");
      out.write("\t\t\t<li><a href=\"list-product.jsp?type_id=2\">Pizzas</a></li>\n");
      out.write("\t\t\t<li><a href=\"list-product.jsp?type_id=3\">Desserts</a></li>\n");
      out.write("\t\t\t<li><a href=\"list-product.jsp?type_id=4\">Soups</a></li>\n");
      out.write("\t\t\t<li><a href=\"list-product.jsp?type_id=6\">Bravrages</a></li>\n");
      out.write("\t        <li><a href=\"contact-us.jsp\">Contact Us</a></li>\n");
      out.write("\n");
      out.write("\t\t");
 } 
      out.write("\n");
      out.write("      </ul>\n");
      out.write("    </nav>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write('\r');
      out.write('\n');
      out.write("<div class=\"wrapper\" style=\"margin-top:-18px\">\n");
      out.write("  <div id=\"slider\">\n");
      out.write("    <div id=\"slide-wrapper\" class=\"rounded clear\" align=\"center\"> \n");
      out.write("      <!-- ################################################################################################ -->\n");
      out.write("      <figure id=\"slide-1\"><a class=\"view\" href=\"#\"><img src=\"images/demo/slider/slider1.gif\" alt=\"\"></a>\n");
      out.write("      </figure>\n");
      out.write("      <figure id=\"slide-2\"><a class=\"view\" href=\"#\"><img src=\"images/demo/slider/cake.jpg\" alt=\"\"></a>\n");
      out.write("      </figure>\n");
      out.write("      <figure id=\"slide-3\"><a class=\"view\" href=\"#\"><img src=\"images/demo/slider/3.jpg\" alt=\"\"></a>\n");
      out.write("      </figure>\n");
      out.write("      <figure id=\"slide-4\"><a class=\"view\" href=\"#\"><img src=\"images/demo/slider/4.png\" alt=\"\"></a>\n");
      out.write("      </figure>\n");
      out.write("      <figure id=\"slide-5\"><a class=\"view\" href=\"#\"><img src=\"images/demo/slider/5.png\" alt=\"\"></a>\n");
      out.write("      </figure>\n");
      out.write("      <!-- ################################################################################################ -->\n");
      out.write("      <ul id=\"slide-tabs\">\n");
      out.write("        <li><a href=\"#slide-1\">PIZZA SHOPPING</a></li>\n");
      out.write("        <li><a href=\"#slide-2\">NEW MENU</a></li>\n");
      out.write("        <li><a href=\"#slide-3\">FREE DELIVERY</a></li>\n");
      out.write("        <li><a href=\"#slide-4\">ONLINE PAYMENT</a></li>\n");
      out.write("        <li><a href=\"#slide-5\">GREAT DISCOUNT</a></li>\n");
      out.write("      </ul>\n");
      out.write("      <!-- ################################################################################################ --> \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	Product productDetails = new Product();
	ArrayList allProduct = productDetails.getAllProduct(0);

      out.write("\r\n");
      out.write("<div class=\"wrapper row3\">\r\n");
      out.write("  <div class=\"rounded\">\r\n");
      out.write("    <main class=\"container clear\"> \r\n");
      out.write("      <!-- main body --> \r\n");
      out.write("      <!-- ################################################################################################ -->\r\n");
      out.write("      <div class=\"group btmspace-30\"> \r\n");
      out.write("        <!-- Left Column -->\r\n");
      out.write("        <div class=\"one_quarter first\"> \r\n");
      out.write("          <!-- ################################################################################################ -->\r\n");
      out.write("          <ul class=\"nospace\">\r\n");
      out.write("            <li class=\"btmspace-15\"><a href=\"#\"><em class=\"heading\">NEW MENU</em> \r\n");
      out.write("\t\t<img class=\"borderedbox\" src=\"images/demo/slider/cake.jpg\" alt=\"\"></a></li>\r\n");
      out.write("            <li class=\"btmspace-15\"><a href=\"#\"><em class=\"heading\">FREE DELIVERY</em> \r\n");
      out.write("\t\t<img class=\"borderedbox\" src=\"images/demo/slider/3.jpg\" alt=\"\"></a></li>\r\n");
      out.write("            <li class=\"btmspace-15\"><a href=\"#\"><em class=\"heading\">ONLINE PAYMENTS</em> \r\n");
      out.write("\t\t<img class=\"borderedbox\" src=\"images/demo/slider/4.png\" alt=\"\"></a></li>\r\n");
      out.write("            <li><a href=\"#\"><em class=\"heading\">GREAT DISCOUNT</em> \r\n");
      out.write("\t\t<img class=\"borderedbox\" src=\"images/demo/slider/5.png\" alt=\"\"></a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("          <!-- ################################################################################################ --> \r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- / Left Column --> \r\n");
      out.write("        <!-- Middle Column -->\r\n");
      out.write("        <div class=\"one_half\" style=\"width:70%\"> \r\n");
      out.write("          <!-- ################################################################################################ -->\r\n");
      out.write("          <h2>ONLINE PIZZA SHOP</h2>          \r\n");
      out.write("          <ul class=\"nospace listing\">\r\n");
      out.write("          ");
 for(int i=0;i<allProduct.size();i++) 
			{ 
				HashMap ProductDetails = new HashMap();
				ProductDetails = (HashMap)allProduct.get(i);
			
      out.write("\r\n");
      out.write("\t\t\t\t<li class=\"product-listing\">\r\n");
      out.write("\t\t\t\t\t<div class=\"imgl borderedbox\">\r\n");
      out.write("\t\t\t\t\t<a href=\"product-details.jsp?product_id=");
 out.print(ProductDetails.get("product_id")); 
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"productImages/");
 out.print(ProductDetails.get("product_image")); 
      out.write("\" style=\"height:110px; width:110px;\">\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"product-price\">\r\n");
      out.write("\t\t\t\t\t\t<b>");
 out.print(ProductDetails.get("product_name")); 
      out.write("</b> <br>\r\n");
      out.write("\t\t\t\t\t\t&#8377; ");
 out.print(ProductDetails.get("product_price")); 
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t");

			}
			
      out.write("\r\n");
      out.write("          </ul>\r\n");
      out.write("          \r\n");
      out.write("       <!-- ################################################################################################ --> \r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- / Middle Column --> \r\n");
      out.write("      </div>\r\n");
      out.write("      \r\n");
      out.write("      <!-- ################################################################################################ --> \r\n");
      out.write("      <!-- ################################################################################################ -->\r\n");
      out.write("      \r\n");
      out.write("      <!-- ################################################################################################ --> \r\n");
      out.write("      <!-- / main body -->\r\n");
      out.write("      <div class=\"clear\"></div>\r\n");
      out.write("    </main>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"wrapper row5\">\n");
      out.write("  <div id=\"copyright\" class=\"clear\"> \n");
      out.write("  \n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<!-- JAVASCRIPTS --> \n");
      out.write("<script src=\"layout/scripts/jquery.fitvids.min.js\"></script> \n");
      out.write("<script src=\"layout/scripts/jquery.mobilemenu.js\"></script> \n");
      out.write("<script src=\"layout/scripts/tabslet/jquery.tabslet.min.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write('\r');
      out.write('\n');
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
