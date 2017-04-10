<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <!-- Bootstrap -->

        <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
        <!-- home style -->
        <link href="<c:url value="/resources/css/home.css" />" rel="stylesheet">
        <script src="<c:url value="/resources/js/jquery-3.2.0.js" />"></script>
        <script src="<c:url value="/resources/js/home.js" />"></script>


    </head>
    <body>
    <div class="header-area">
        <div class="container">
            <div class="row">
                <div class="col-md-8">
                    <div class="user-menu">

                            <li><a href="#"><i class="fa fa-user"></i> My Account</a></li>
                            <li><a href="#"><i class="fa fa-heart"></i> Wishlist</a></li>
                            <li><a href="cart.html"><i class="fa fa-user"></i> My Cart</a></li>
                            <li><a href="checkout.html"><i class="fa fa-user"></i> Checkout</a></li>
                            <li><a href="#"><i class="fa fa-user"></i> Login</a></li>

                    </div>
                </div>

                <div class="col-md-4">
                    <div class="header-right">
                        <ul class="list-unstyled list-inline">
                            <li class="dropdown dropdown-small">
                                <a data-toggle="dropdown" data-hover="dropdown" class="dropdown-toggle" href="#"><span class="key">currency :</span><span class="value">USD </span><b class="caret"></b></a>
                                <ul class="dropdown-menu">
                                    <li><a href="#">USD</a></li>
                                    <li><a href="#">INR</a></li>
                                    <li><a href="#">GBP</a></li>
                                </ul>
                            </li>

                            <li class="dropdown dropdown-small">
                                <a data-toggle="dropdown" data-hover="dropdown" class="dropdown-toggle" href="#"><span class="key">language :</span><span class="value">English </span><b class="caret"></b></a>
                                <ul class="dropdown-menu">
                                    <li><a href="#">English</a></li>
                                    <li><a href="#">French</a></li>
                                    <li><a href="#">German</a></li>
                                </ul>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div> <!-- End header area -->

<form:form modelAttribute="availableItems"  >
    <div class="simpleCart_shelfItem" id="shopping_item">

 <c:forEach items="${ItemList}" var="item" varStatus="count">
    <h2 class="item_name"> ${item.itemName}</h2>
        <p>    <select class="item_size">
            <option value="Small"> Small </option>
            <option value="Medium"> Medium </option>
            <option value="Large"> Large </option>
        </select><br>
            <input type="text" value="1" class="item_Quantity"><br>
            <img src={item.itemImage};base64  ><br>
            <span class="item_description">${item.itemDescription}</span><br>
            <span class="item_available_quantity">${item.availableQuantity}</span><br>
            <span class="item_price">${item.itemPrice}</span><br>

            <a class="item_add" href="javascript:;"> Add to Cart </a></p>

</c:forEach>
    </div>

</form:form>
    <div class="json_print">
        <p class="json_class" ></p>
    </div>
    </body>
</html>
