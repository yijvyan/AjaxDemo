function ajax_post() {
	//1.创建异步对象；
	var xhr = createXMLHttp();
	//2.设置状态改变的监听；(回调函数)。
	xhr.onreadystatechange = function(){
		//2.1.请求发送成功；
		if (xhr.readyState == 4) {
			//2.2.响应也成功；
			if (xhr.status == 200) {
				//2.3.获得响应的数据；
				var data = xhr.responseText;
				//2.4.将数据写入到DIV中；
				document.getElementById("div").innerHTML = data;
			}
		}
	};
	//3.设置请求（打开）路径；
	xhr.open("POST","/AjaxDemo/AjaxServlet",true);
	
	//5.设置请求头；
	xhr.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
	
	//4.发送请求，post请求这里写参数；
	//xhr.send("name=Alice&pass=123");
	
	//7.发送中文参数；
	xhr.send("name=中文参数&pass=123");
}
function createXMLHttp(){
   var xmlHttp;
   try{ // Firefox, Opera 8.0+, Safari
        xmlHttp=new XMLHttpRequest();
    }
    catch (e){
	   try{// Internet Explorer
	         xmlHttp=new ActiveXObject("Msxml2.XMLHTTP");
	      }
	    catch (e){
	      try{
	         xmlHttp=new ActiveXObject("Microsoft.XMLHTTP");
	      }
	      catch (e){}
	      }
    }

	return xmlHttp;
 }