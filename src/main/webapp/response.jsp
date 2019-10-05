<%--
  Created by IntelliJ IDEA.
  User: 机械革命
  Date: 2019/10/5
  Time: 11:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery-2.1.0.min.js"></script>
    <script>
        $(function(){
            $("#btn").click(function () {
                // alert("hello");
                $.ajax({
                    url:"/user/testAjax",
                    contentType:"application/json;charset=UTF-8",
                    data:'{"username":"hehe","password":"123456","age":30}',
                    dataJson:"json",
                    type:"post",
                    success:function (data) {
                        if(data!=null){
                            alert(data.username);
                        }
                    }

                });

            });
        });
    </script>

</head>
<body>
    <a href="user/testString">testString</a>

    <br>
    <a href="user/testMondelAndView">testString</a>

    <br/>
    <button id="btn">发送ajax请求</button>

</body>
</html>
