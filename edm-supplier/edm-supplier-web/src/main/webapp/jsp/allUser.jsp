<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<jsp:include page="common.jsp"/>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">
    <title>用户列表</title>
</head>

<body>
<button class="layui-btn" onclick="addUser()" >添加用户</button>
    <div class="layui-form">
        <table class="layui-table">
            <colgroup>
                <col width="150">
                <col width="150">
                <col width="200">
            </colgroup>
            <thead>
            <tr>
                <th>姓名</th>
                <th>备注</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody>
            <c:if test="${!empty userList }">
                <c:forEach items="${userList}" var="user">
                    <tr>
                        <td>${user.userUsername }</td>
                        <td>${user.userRemark }</td>
                        <td>
                            <div class="layui-btn-group">
                                <button class="layui-btn" onclick="editUserById(${user.userId})">编辑</button>
                                <button class="layui-btn" onclick="del('${user.userId }')">删除</button>
                            </div>
                        </td>
                    </tr>
                </c:forEach>
            </c:if>
            </tbody>
        </table>
    </div>

<script type="text/javascript">

    //使用jquery ajsx
    $(document).ready(function () {
        alert("1111");
    })

    function del(id){

        window.location.href = "<%=basePath%>user/delUser?userId=" + id ;
        //js 不能引入 先使用href跳转
        /*$.get("< %=basePath%>user/delUser?userId=" + id,function(data){
            if("success" == data.result){
                alert("删除成功");
                window.location.reload();
            }else{
                alert("删除失败");
            }
        });*/
    }

    function  addUser() {
        window.location.href = "<%=basePath%>user/toAddUser";
    }

    function editUserById(useid) {
        window.location.href = "<%=basePath%>user/getUser?userId=" + useid;
    }

    function deleteUserById(useid) {
        window.location.href = "<%=basePath%>user/getUser?userId=" + useid ;
    }

</script>

</body>
</html>