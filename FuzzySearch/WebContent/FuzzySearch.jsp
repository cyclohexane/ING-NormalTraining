<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>模糊搜索</title>
<link rel="stylesheet" href="css/font-awesome.min.css" />
<link rel="stylesheet" href="css/FuzzySearch.css" />
<script type="text/javascript">
	//var arr = JSON.parse('${empty students?"fasle":students}');
</script>
</head>

<body>
	<div id="main">
		<div id="nav">
			<i class="fa fa-bars" aria-hidden="true"></i> <i class="fa fa-user-circle" aria-hidden="true"></i>
		</div>
		<div id="banner">
			<img src="img/logo.png">
			<p>学生信息查询系统</p>
			<form id="query" name="query" method="post" action="QS">
				<div id="input-con">
					<input type="text" name="key" placeholder="请输入关键字" />
					<button class="btn btn-outline-success my-2 my-sm-0" type="submit">
						<i class="fa fa-search" aria-hidden="divue"></i>
					</button>
				</div>
			</form>
		</div>
		<c:if test="${not empty slist}">
			<div id="th">
				<div class="row-con">
					<div class="sno">学号</div>
					<span>/</span>
					<div class="sname">学生姓名</div>
					<span>/</span>
					<div class="sex">性别</div>
					<span>/</span>
					<div class="classname">所属班级</div>
					<span>/</span>
					<div class="tel">常用电话号码</div>
					<span>/</span>
					<div id="act">操作</div>
				</div>
			</div>
		</c:if>
		<div id="result">
			<div id="result-tb">
				<c:forEach items="${slist}" var="stu">
					<div class="row">
						<div class="row-con">
							<div class="dec-l"></div>
							<div class="sno">${stu.sno}</div>
							<span>/</span>
							<div class="sname">${stu.sname}</div>
							<span>/</span>
							<div class="sex">${stu.sex}</div>
							<span>/</span>
							<div class="classname">${stu.classname}</div>
							<span>/</span>
							<div class="tel">${stu.tel}</div>
							<span>/</span> <i class="fa fa-clone" aria-hidden="true"></i> <i class="fa fa-trash-o" aria-hidden="true"></i>
							<div class="dec-r"></div>
						</div>
					</div>
				</c:forEach>
			</div>
		</div>
</body>

</html>