<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>
<a href="save.jsp">添加用户</a>
<a href="/user/find.do">查询用户</a>
<a href="/user/findById.do?id=1">通过id查询</a><br>
<a href="/user/findByIds.do">通过多个id查询</a><br>
<h2>通过条件检索</h2>
<form action="/user/findUser.do" method="post">
    用户名:<input name="username" type="text"><br>
    <input value="提交" type="submit">
</form>
<h2>文件上传</h2>
<form action="/file/upload.do"enctype="multipart/form-data"  method="post">
        <input type="file" name="upload" lable="选择文件">
        <input type="submit" value="上传文件">
    </form>
</body>
<a href="/file/download">文件下载</a>

<h2>延迟加载</h2>
<a href="/order/find.do">延迟加载测试</a>

<h2>测试过滤器</h2>
<a href="/user/error.do">spring mvc过滤器测试</a>
</html>
