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
		<div class="col-md-2 mt-3">	
			<div id="card-214190">
				<div class="card">
					<div class="card-header">
						 <a class="card-link collapsed" data-toggle="collapse" data-parent="#card-214190" href="#card-element-1">공통관리</a>
					</div>
					<div id="card-element-1" class="collapse">
						<div class="card-body">
							<ul class="nav flex-column">
								<li class="nav-item">
									<a class="nav-link active" href="clientcode_manage.jsp">5.거래처코드 관리</a>
									<a class="nav-link active" href="objectcode_manage.jsp">2.품목코드 관리</a>
									<a class="nav-link active" href="object_manage.jsp">1.제품 관리</a>
									<a class="nav-link active" href="unitprice_manage.jsp">6.거래처단가 관리</a>
							</ul>
						</div>
					</div>
				</div>
				<div class="card">
					<div class="card-header">
						 <a class="card-link collapsed" data-toggle="collapse" data-parent="#card-214190" href="#card-element-2">입출고</a>
					</div>
					<div id="card-element-2" class="collapse">
						<div class="card-body">
							<ul class="nav flex-column">
								<li class="nav-item">
									<a class="nav-link active" href="#">12.출고 관리</a>
									<a class="nav-link active" href="#">11.입고 관리</a>
									<a class="nav-link active" href="#">10.13.창고이동 관리</a>
									<a class="nav-link active" href="#">14.재고수불부 조회</a>
								</li>
							</ul>
						</div>
					</div>
				</div>
				
				<div class="card">
					<div class="card-header">
						 <a class="card-link collapsed" data-toggle="collapse" data-parent="#card-214190" href="#card-element-7">자재</a>
					</div>
					<div id="card-element-7" class="collapse">
						<div class="card-body">
							<ul class="nav flex-column">
								<li class="nav-item">
									<a class="nav-link active" href="#">3.자재 현황</a>
									<a class="nav-link active" href="#">4.자재사용 현황</a>
								</li>
							</ul>
						</div>
					</div>
				</div>
				<div class="card">
					<div class="card-header">
						 <a class="card-link collapsed" data-toggle="collapse" data-parent="#card-214190" href="#card-element-8">인사관리</a>
					</div>
					<div id="card-element-8" class="collapse">
						<div class="card-body">
							<ul class="nav flex-column">
								<li class="nav-item">
									<a class="nav-link active" href="pay_inform.jsp">7.8.호봉테이블 등록</a>
									<a class="nav-link active" href="personal_search.jsp">9.인사 현황</a>
								</li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="col-md-10 mt-3">	
			<h1>안녕하세요 semi-ERP 시스템입니다 ^^</h1>
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
		Copyright &copy; 세미콜론 All Rights Reserved.
	</footer>
	<!-- 제이쿼리 자바스크립트 추가하기 -->
	<script src="./js/jquery.min.js"></script>
	<!-- 파퍼 자바스크립트 추가하기 -->
	<script src="./js/popper.js"></script>
	<!-- 부트스트랩 자바스크립트 추가하기 -->
	<script src="./js/bootstrap.min.js"></script>
</body>
</html>