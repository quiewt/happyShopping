<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="${HTTP_URL}css/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="${HTTP_URL}css/bootstrap/css/bootstrap-theme.min.css">
    <link rel="stylesheet" href="${HTTP_URL}css/main.css"/>
</head>
<script type="application/javascript">
    var HTTP_URL = '${HTTP_URL}';
</script>
<body>
    <div class="top">
        <nav  class="navbar navbar-inverse container" role="navigation">
                <div class="navbar-header">
                    <a class="navbar-brand" href="#">OOS</a>
                </div>
                <div>
                    <ul class="nav navbar-nav navbar-left">
                        <li class="menu-item menu-item-menu"><a href="#"><span class="glyphicon glyphicon-eye-open" style="padding-right:10px;"></span>浏览菜单</a></li>
                        <li class="menu-item menu-item-account"><a href="#"><span class="glyphicon glyphicon-user" style="padding-right:10px;"></span>我的账户</a></li>
                        <li class="dropdown menu-item menu-item-help">
                            <a class="dropdown-toggle"  data-toggle="dropdown" href="#"><span class="glyphicon glyphicon-earphone" style="padding-right:10px;"></span>帮助<span class="caret"></span></a>
                            <ul class="dropdown-menu" role="menu">
                                <li><a href="#">网站条款</a></li>
                                <li><a href="#">隐私政策</a></li>
                                <li><a href="#">订餐须知</a></li>
                                <li><a href="#">常见问题</a></li>
                                <li><a href="#">关于30分钟必达</a></li>
                                <li><a href="#">手机网站</a></li>
                                <li><a href="#">经营公示</a></li>
                            </ul>
                        </li>
                    </ul>
                </div>
                <div>
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="#" data-toggle="modal" data-target="#loginModal">登录</a></li>
                        <li style="padding-top:14px; color:grey;;">|</li>
                        <li><a href="#">注册</a></li>
                    </ul>
                </div>
        </nav>
    </div>
    <div class="main container" style="padding:0;">
        <div class="left col-md-2" style="padding:0;">
            <div class="list-group">
                <span class="list-group-item list-group-item-info">
                    正餐菜单
                </span>
                <a href="#" class="list-group-item">促销产品和热卖产品</a>
                <a href="#" class="list-group-item">主食和超值套餐</a>
                <a href="#" class="list-group-item">小食</a>
                <a href="#" class="list-group-item">甜点</a>
                <a href="#" class="list-group-item">饮品</a>
                <a href="#" class="list-group-item">开心乐园餐</a>
            </div>
        </div>
        <div class="content jumbotron " id="content" style="width:960px; padding-left:10px;float:right;">
            <span>${pageContext.getAttribute("HTTP_URL")}</span>

        </div>
    </div>
    <div class="global-footer"></div>

    <div class="modal fade" id="loginModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="false" >
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
                    <h4 class="modal-title">登录</h4>
                </div>
                <div class="modal-body">
                    <form role="form">
                        <div class="form-group">
                            <%--<label for="exampleInputEmail1">Email address</label>--%>
                            <input type="email" class="form-control" id="userName" placeholder="用户名">
                        </div>
                        <div class="form-group">
                            <%--<label for="exampleInputPassword1">Password</label>--%>
                            <input type="password" class="form-control" id="password" placeholder="密码">
                        </div>
                        <%--<div class="form-group">--%>
                            <%--<label for="exampleInputFile">File input</label>--%>
                            <%--<input type="file" id="exampleInputFile">--%>
                            <%--<p class="help-block">Example block-level help text here.</p>--%>
                        <%--</div>--%>
                        <div class="checkbox">
                            <label>
                                <input type="checkbox">记住我
                            </label>
                        </div>
                    </form>

                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                    <button type="button" class="btn btn-primary" onclick="checkLogin()">确认</button>
                </div>
            </div>
        </div>
    </div>
<script type="application/javascript" src="${HTTP_URL}/js/bootstrap/jquery-3.1.1.min.js"></script>
<script type="application/javascript" src="${HTTP_URL}js/bootstrap/bootstrap.min.js"></script>
<script type="application/javascript" src="${HTTP_URL}/js/oos/index.js"></script>
</body>
</html>