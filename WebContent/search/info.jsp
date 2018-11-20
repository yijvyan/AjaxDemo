<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- <table border="1" width="100%"> -->
<table border="0" width="100%">
	<c:forEach var="w" items="${ list }">
		<tr>
			<td>${ w.word }</td>
		</tr>
	</c:forEach>
</table>