$(function() {
	//1.为文本框绑定事件；
	$("#word").keyup(function() {
		//2.获取文本框的值；
		var word = $(this).val();
		//3.异步发送请求；
		/*$.post("/AjaxDemo/BaiduServlet",{"word":word},function(data){
			//alert(data);
			$("#downDiv").show().html(data);
		});*/
		
		//4.判断输入框的数据；
		if (word != "") {
			
			$.post("/AjaxDemo/BaiduServlet",{"word":word},function(data){
				$("#downDiv").show().html(data);
			});
			
		} else {
			$("#downDiv").hide();
		}
	});
});