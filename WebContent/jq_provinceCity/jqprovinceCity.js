$(function() {
	//1.为省份下拉列表绑定事件；
	$("#province").change(function(){
		//2.获得选中的省份的id；
		var pid = $(this).val();
		//alert(pid);
		$.post("/AjaxDemo/CityServlet",{"pid":pid},function(data){
			//alert(data);
			//5.获得第二个下拉文本框；
			var $city = $("#city");
			
			//6.在添加文本之前，对第二个下拉框的内容进行覆盖；
			$city.html("<option>-请选择-</option>");
			
			//3.返回的数据中找到city标签，再遍历其子标签；
			$(data).find("city").each(function() {
				//4.获得子标签，并得到文本值；
				var cid = $(this).children("cid").text();
				var cname = $(this).children("cname").text();
				
				$city.append("<option value='"+cid+"'>"+cname+"</option>");
			});
		});
	});
});