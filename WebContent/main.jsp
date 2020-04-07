<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<title>Enterprise Resource Planning System</title>
	<!-- 부트스트랩 CSS 추가하기 -->
	<link rel="stylesheet" href="./css/bootstrap.min.css">
	<!-- 커스텀 CSS 추가하기 -->
	<link rel="stylesheet" href="./css/custom.css">
	
	<!-- 테이블 검색 스크립트 -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<!-- 
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script> 
	-->
</head>

<body>
<div class="container-fluid">
	<!-- 상단메뉴 -->
	<div class="row">
		<div class="col-md-12">
			<ul class="nav">
				<li class="nav-item">
					<a class="nav-link active" href="main.jsp"><h3>ERP System</h3></a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="#">프로필</a>
				</li>
				<li class="nav-item"> 
					<a class="nav-link disabled" href="#">메세지</a>
				</li>
				<li class="nav-item dropdown ml-md-auto">
					 <a class="nav-link dropdown-toggle" href="http://example.com" id="navbarDropdownMenuLink" data-toggle="dropdown">회원정보</a>
					<div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownMenuLink">
						 <a class="dropdown-item" href="userLogin.jsp">로그인</a>
						 <a class="dropdown-item" href="userLogout.jsp">로그아웃</a>
						<div class="dropdown-divider">
						</div> <a class="dropdown-item" href="#">회원정보수정</a>
					</div>
				</li>
			</ul>
		</div>
	</div>
	
	<div class="row" style="font-size: 14px;">
		<!-- 좌측메뉴 -->
		<div class="col-md-2 mt-3">	
			<div id="card-214190">
				<div class="card">
					<div class="card-header">
						 <a class="card-link collapsed" data-toggle="collapse" data-parent="#card-214190" href="#card-element-1">자재구매</a>
					</div>
					<div id="card-element-1" class="collapse">
						<div class="card-body">
							<ul class="nav flex-column">
								<li class="nav-item">
									<a class="nav-link active" href="materials.jsp">자재관리</a>
									<a class="nav-link active" href="purchase.jsp">구매관리</a>
								</li>
							</ul>
						</div>
					</div>
				</div>
				
				<div class="card">
					<div class="card-header">
						 <a class="card-link collapsed" data-toggle="collapse" data-parent="#card-214190" href="#card-element-2">제품생산</a>
					</div>
					<div id="card-element-2" class="collapse">
						<div class="card-body">
							<ul class="nav flex-column">
								<li class="nav-item">
									<a class="nav-link active" href="product.jsp">제품관리</a>
									<a class="nav-link active" href="produce_list.jsp">생산목록</a>
									<a class="nav-link active" href="produce.jsp">생산관리</a>
								</li>
							</ul>
						</div>
					</div>
				</div>
				
				<div class="card">
					<div class="card-header">
						 <a class="card-link collapsed" data-toggle="collapse" data-parent="#card-214190" href="#card-element-3">판매관리</a>
					</div>
					<div id="card-element-3" class="collapse">
						<div class="card-body">
							<ul class="nav flex-column">
								<li class="nav-item">
									<a class="nav-link active" href="sale.jsp">판매관리</a>
								</li>
							</ul>
						</div>
					</div>
				</div>
				
				<div class="card">
					<div class="card-header">
						 <a class="card-link collapsed" data-toggle="collapse" data-parent="#card-214190" href="#card-element-4">회사관리</a>
					</div>
					<div id="card-element-4" class="collapse">
						<div class="card-body">
							<ul class="nav flex-column">
								<li class="nav-item">
									<a class="nav-link active" href="client.jsp">거래처관리</a>
									<a class="nav-link active" href="employee.jsp">사원관리</a>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- 좌측메뉴 끝 -->
		<div class="col-md-10 mt-3">ㄴ
			<h1>안녕하세요 semi-ERP 시스템입니다 ^^</h1>
			<a href="Xclientcode_manage.jsp">거래처코드관리</a><a>Xclientcode_manage.jsp</a><br>
			<a href="Xfactory_manage.jsp">공장관리</a><a>Xfactory_manage.jsp</a><br>
			<a href="Xindex.jsp">index</a><a>Xindex.jsp</a><br>
			<a href="Xindex1.jsp">index1</a><a>Xindex1.jsp</a><br>
			<a href="Xindex3.jsp">index3</a><a>Xindex3.jsp</a><br>
			<a href="Xobjectcode_manage.jsp">제품코드관리</a><a>Xobjectcode_manage.jsp</a><br>
			<a href="Xobject_manage.jsp">제품관리</a><a>Xobject_manage.jsp</a><br>
			<a href="Xpay_inform.jsp">호봉관리</a><a>Xpay_inform.jsp</a><br>
			<a href="Xpersonal_inform.jsp">사원관리</a><a>Xpersonal_inform.jsp</a><br>
			<a href="Xpersonal_search.jsp">사원검색</a><a>Xpersonal_search.jsp</a><br>
			<a href="Xsale_manage.jsp">판매관리</a><a>Xsale_manage.jsp</a><br>
			<a href="Xunitprice_manage.jsp">판매단가관리</a><a>Xunitprice_manage.jsp</a><br>
			<h1>안녕하세요. semi-ERP 시스템입니다. </h1>
		</div>
	</div>
	<!-- 페이지내용 -->
	<div class="col-md-10 mt-6">
		
	</div>
 <!-- 			<div class="panel-group">
		    <div class="panel panel-default">
		      <div class="panel-heading">
		        <h4 class="panel-title">
		          <a data-toggle="collapse" href="#collapse1">Collapsible list group</a>
		        </h4>
		      </div>
		      <div id="collapse1" class="panel-collapse collapse">
		        <ul class="list-group">
		          <li class="list-group-item">One</li>
		          <li class="list-group-item">Two</li>
		          <li class="list-group-item">Three</li>
		        </ul>
		        <div class="panel-footer">Footer</div>
		      </div>
		    </div>
		  </div>  -->
</div>  
		

	<footer class="bg-dark mt-4 p-5 text-center" style="color: #FFFFFF;">
		Copyright &copy; Semi-Colon All Rights Reserved.
	</footer>
	<!-- 제이쿼리 자바스크립트 추가하기 -->
	<script src="./js/jquery.min.js"></script>
	<!-- 파퍼 자바스크립트 추가하기 -->
	<script src="./js/popper.js"></script>
	<!-- 부트스트랩 자바스크립트 추가하기 -->
	<script src="./js/bootstrap.min.js"></script>
</body>
</html>