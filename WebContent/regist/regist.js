function checkUsername() {
	//5.获得文本框的值；
	var username = document.getElementById("username").value;
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
				if (data == 1) {
					document.getElementById("usernameSpan").innerHTML = "<font color='green'>用户名可以使用</font>";
					document.getElementById("regBut").disabled = false;
				} else if (data == 2) {
					document.getElementById("usernameSpan").innerHTML = "<font color='red'>用户名已经被占用</font>";
					document.getElementById("regBut").disabled = true;
				} 
			}
		}
	};
	//3.设置请求路径；
	xhr.open("GET","/AjaxDemo/UsernameServlet?username="+username,true);
	//4.发送请求，get请求使用地址栏拼接传参数，这里不写参数；
	xhr.send(null);
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