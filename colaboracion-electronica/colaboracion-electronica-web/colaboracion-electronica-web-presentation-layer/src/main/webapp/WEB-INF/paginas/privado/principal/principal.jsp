<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"  %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<div class="container">
<div align="right"><a href="<c:url value='/logout' />"> LOGOUT</a></div>
	<form method="post" id="contact_form" action="<c:url value='authentication' />" class="well form-horizontal" >
		<fieldset>
			<legend>
				<span>Welcome </span><span>Colaboracion Electronica</span>
			</legend>
			
		</fieldset>
	</form>

</div>