<%@ page contentType="text/html; charset= utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt"    uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
<title>Car number List View</title>
<meta content="text/html; charset=utf-8" http-equiv="Content-Type" />
</head>

<body>

<table>
  <tbody>
  <tr>
    <td><a href="<c:url value="/shop/index.do"/>"><img src="../images/logo-topbar.gif" /></a></td>
    <td><a href="<c:url value="/shop/viewCart.do"/>"><img id="img_cart" src="../images/cart.gif" /></a>
      <img src="../images/separator.gif" />

<c:if test="${empty userSession.account}" >
      <a href="<c:url value="/shop/signonForm.do"/>"><img id="img_signin" src="../images/sign-in.gif" /></a>
</c:if>

<c:if test="${!empty userSession.account}" >
      <a href="<c:url value="/shop/signoff.do"/>"><img id="img_signout" src="../images/sign-out.gif" /></a>
      <img src="../images/separator.gif" />
      <a href="<c:url value="/shop/editAccount.do"/>"><img id="img_myaccount" src="../images/my_account.gif" /></a>
</c:if>

      <img src="../images/separator.gif" /><a href="../help.html"><img id="img_help" src="../images/help.gif" /></a>
    </td>
    <td>
      <form action="<c:url value="/shop/searchProducts.do"/>" method="post">
			  <input type="hidden" name="search" value="true"/>
        <input name="keyword" size="14" />&nbsp;<input src="../images/search.gif" type="image"/>
      </form>
    </td>
  </tr>
  </tbody>
</table>
