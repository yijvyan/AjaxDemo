<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ajax的GET请求</title>
<script type="text/javascript" src="${ pageContext.request.contextPath }/ajax/get.js" ></script>
</head>
<body>
<h1>AJAX的GET方式的异步请求</h1>
<div id="div" style="width: 300px;height: 300px;border: 1px solid blue; " >
</div>
<input id="butt" type="button" value="AJAX的GET请求" onclick="ajax_get()">
</body>
</html>