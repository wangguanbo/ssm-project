<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>commonJspHead</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
</head>

<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
    <jsp:include page="common.jsp"/>
    <div class="layui-body">
        <!-- 内容主体区域 -->
        <div style="padding: 15px;">
            <button class="layui-btn" data-method="notice" onclick="addUser()" >添加用户</button>

            <div class="layui-btn-group demoTable">
                <button class="layui-btn" data-type="getCheckData">获取选中行数据</button>
                <button class="layui-btn" data-type="getCheckLength">获取选中数目</button>
                <button class="layui-btn" data-type="isAll">验证是否全选</button>
            </div>

            <table class="layui-table" lay-data="{height:788, url:'<%=basePath%>user/ajaxGetUserList', page:true, id:'idTest',limit:18,done:function(){$('span').remove('.layui-laypage-limits');}}" lay-filter="demo">
                <thead>
                <tr>
                    <th lay-data="{type:'checkbox', fixed: 'left'}"></th>
                    <th lay-data="{field:'userId', sort: true, fixed: true}">ID</th>
                    <th lay-data="{field:'userRemark'}">备注</th>
                    <th lay-data="{field:'userUsername'}">用户名</th>
                    <th lay-data="{fixed: 'right', align:'center', toolbar: '#barDemo'}">操作</th>
                </tr>
                </thead>
            </table>
            <script type="text/html" id="barDemo">
                <%--<a class="layui-btn layui-btn-primary layui-btn-xs" lay-event="detail">查看</a>--%>
                <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
                <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
            </script>
        </div>
    </div>

    <div class="layui-footer">
    </div>

</div>
<script src="${pageContext.request.contextPath}/js/layui.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery.js"></script>
<script>

    layui.use('table', function(){
        var table = layui.table;
        //监听表格复选框选择
        table.on('checkbox(demo)', function(obj){
            console.log(obj)
        });

        //监听工具条
        table.on('tool(demo)', function(obj){
            var data = obj.data;
            if(obj.event === 'del'){
                if(confirm("确定要删除吗?"))
                {
                    del(data.userId);
                }else{
                    return;
                }
            } else if(obj.event === 'edit'){
                editUserById(data.userId);
            }
        });

        var $ = layui.$, active = {
            getCheckData: function(){ //获取选中数据
                var checkStatus = table.checkStatus('idTest')
                    ,data = checkStatus.data;
                alert(JSON.stringify(data));
            }
            ,getCheckLength: function(){ //获取选中数目
                var checkStatus = table.checkStatus('idTest')
                    ,data = checkStatus.data;
                alert('选中了：'+ data.length + ' 个');
            }
            ,isAll: function(){ //验证是否全选
                var checkStatus = table.checkStatus('idTest');
                alert(checkStatus.isAll ? '全选': '未全选');
            }
        };

        $('.demoTable .layui-btn').on('click', function(){
            var type = $(this).data('type');
            active[type] ? active[type].call(this) : '';
        });
    });


    function del(id){
        $.get("<%=basePath%>user/delUser?userId=" + id,function(data){
            if("success" === data.result){
                alert("删除成功");
                window.location.reload();
            }else{
                alert("删除失败");
            }
        });
    }

    function  addUser() {
        window.location.href = "<%=basePath%>user/toAddUser";
    }

    function editUserById(useid) {
        window.location.href = "<%=basePath%>user/getUser?userId=" + useid;
    }

</script>
</body>
</html>