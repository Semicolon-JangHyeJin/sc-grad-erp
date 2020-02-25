<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<title>강의평가 웹 사이트</title>
	<!-- 부트스트랩 CSS 추가하기 -->
	<link rel="stylesheet" href="./css/bootstrap.min.css">
	<!-- 커스텀 CSS 추가하기 -->
	<link rel="stylesheet" href="./css/custom.css">
</head>
<body>
		<div class="col-md-12">
			<ul class="nav">
				<li class="nav-item">
					<a class="nav-link active" href="index1.jsp"><h3>ERP System</h3></a>
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
	<section class="container mt-3" style="max-width: 560px;">
		<form method="post" action="./userRegisterAction.jsp">
			<div class="form-group">
				<label>아이디</label>
				<input type="text" name="userID" class="form-control">
			</div>
			<div class="form-group">
				<label>비밀번호</label>
				<input type="password" name="userPassword" class="form-control">
			</div>
			<button type="submit" class="btn btn-primary">로그인</button>
		</form>
	</section>
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