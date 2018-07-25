<%--
  Created by IntelliJ IDEA.
  User: leshang
  Date: 2018/7/25
  Time: 11:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>添加用户</title>
</head>

<body>
 <form action="saveOrUpdateUser" method="post">
     姓名<input name="name" type="text" value=""/><br>
     姓别<input name="sex" type="text" value=""/><br>
     年龄<input name="age" type="text" value="" /><br>
     <button>保存</button>
 </form>

</body>
</html>