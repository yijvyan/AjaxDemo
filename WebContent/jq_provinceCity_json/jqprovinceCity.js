$(function() {
	//1.为省份下拉列表绑定事件；
	$("#province").change(function(){
		//2.获得选中的省份的id；
		var pid = $(this).val();
		//alert(pid);
		$.post("/AjaxDemo/JSONCityServlet",{"pid":pid},function(data){
			//alert(data);
			
			//3.1.JS识别JSON的方式一：（以前的比较老的方式，现在基本不用了）
			//var json = eval(data);
			
			
			//5.获得第二个下拉文本框；
			var $city = $("#city");
			
			//6.在添加文本之前，对第二个下拉框的内容进行覆盖；
			$city.html("<option>-请选择-</option>");
			
			//4.遍历返回的json数据；
			$(data).each(function(i,n) {
				//alert(n.cname);
				
				$city.append("<option value='"+n.cid+"'>"+n.cname+"</option>");
				
			});
			
		//});
			//3.2.JS识别JSON的方式二：（直接在返回的参数里，指定json格式）
		},"json");	
	});
});