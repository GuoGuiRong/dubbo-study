<!DOCTYPE html>
<head>
    <meta charset="utf-8">
<body>
<h2>Hello World!</h2>
<script src="./banner/laydate.js"></script>
    <form action="/login">
    username:<input value="" type="text" name="username" id="username"/><br>
    password:<input value="" type="password" name="password"/><br>
    birthday:<input type="text" id="birthday"/>
    <input type="submit" value="submit"/>
</form>
</body>

<script>
    var names = document.getElementsByName("username");
    var username = names[0];


    var username = $("#username").val();



   /* lay('#birthday').html('-v'+ laydate.v);
    //执行一个laydate实例
    laydate.render({
        elem: '#birthday' //指定元素
    });*/
</script>

