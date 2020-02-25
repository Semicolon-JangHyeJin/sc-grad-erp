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
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<a class="navbar-brand" href="index.jsp">Enterprise Resource Planning System</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbar">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div id="navbar" class="collapse navbar-collapse">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active">
					<a class="nav-link" href="index.jsp">메인</a>
				</li>
				<li class="nav-item dropdown">
					<a class="nav-link dropdown-toggle" id="dropdown" data-toggle="dropdown">
						회원정보
					</a>
					<div class="dropdown-menu" aria-labelledby="dropdown">
						<a class="dropdown-item" href="userLogin.jsp">로그인</a>
						<a class="dropdown-item" href="userJoin.jsp">회원가입</a>
						<a class="dropdown-item" href="userLogout.jsp">로그아웃</a>
					</div>
				</li>
			</ul>
			<form class="form-inline my-2 my-lg-0">
				<input class="form-control mr-sm-2" type="search" placeholder="내용을 입력하세요." aria-label="search">
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">검색</button>
			</form>
		</div>
	</nav>
<!-- 	<div class="container-fluid">
		<div class="row-fluid">
    		<div class="span2">
    			사이드바내용
      			<div class="row-md-2">.row-md-1</div>
				<div class="row-md-2">.row-md-1</div>
				<div class="row-md-2">.row-md-1</div>
				<div class="row-md-2">.row-md-1</div>
    		</div>
    		<div class="span10">
    			본문내용
      			<div class="row-md-10">.row-md-1</div>
				<div class="row-md-10">.row-md-1</div>
				<div class="row-md-10">.row-md-1</div>
				<div class="row-md-10">.row-md-1</div>
    		</div>
  		</div>
	</div> -->
	<section class="container">
		<form method="get" action="./index.jsp" class="form-inline mt-3">
			<select name="lectureDivide" class="form-control mx-1 mt-2">
				<option value="전체">전체</option>
				<option value="전공">분류</option>
				<option value="교양">상품명</option>
				<option value="기타">수량</option>
			</select>
			<input type="text" name="search" class="form-control mx-1 mt-2" placeholder="내용을 입력하세요.">
			<button type="submit" class="btn btn-primary mx-1 mt-2">검색</button>
			<a class="btn btn-primary mx-1 mt-2" data-toggle="modal" href="#registerModal">재고등록</a>
			<a class="btn btn-danger mx-1 mt-2">삭제</a>
		</form>

		<!-- 메뉴버튼그룹 -->	
		<div class="row">
			<!-- <div class="col-md-1 mt-2">ERP 메뉴</div>  -->
			<div class="btn-group role=”group” aria-label=”…” mx-1 mt-2">
				<a href="#" class="btn btn-primary">공통관리</a>
				<a href="#" class="btn btn-primary">입출고</a>
				<a href="#" class="btn btn-primary">회계관리</a>
				<a href="#" class="btn btn-primary">발주</a>
				<a href="#" class="btn btn-primary">수주</a>
				<a href="#" class="btn btn-primary">생산</a>
				<a href="#" class="btn btn-primary">자재</a>
				<a href="#" class="btn btn-primary">인사관리</a>
			</div>
			
		</div>
<!-- 	<div class="row">
		<div class="col-md-1">
			<div class="row-md-1">.row-md-1</div>
			<div class="row-md-1">.row-md-1</div>
			<div class="row-md-1">.row-md-1</div>
			<div class="row-md-1">.row-md-1</div>
		</div>-->
		<div class="mt-3">
		<table class="table table-condensed table-bordered table-hover">
		 <thead>
		   <tr>
		      <th>분류</th>
		      <th>상품명</th>
		      <th>수량</th>
		      <th>책임자</th>
		   </tr>
		 </thead>
		 <tbody>
		   <tr>
		      <td>SIM Card</td>
		      <td>SIM-01</td>
		      <td>72</td>
		      <td>장연수</td>
		   </tr>
		   <tr>
		      <td>SIM Card</td>
		      <td>SIM-02</td>
		      <td>182</td>
		      <td>장연수</td>
		   </tr>
		   <tr>
		      <td>Memory Card</td>
		      <td>Memory-01</td>
		      <td>2114</td>
		      <td>문준식</td>
		   </tr>
		   <tr>
		      <td>DSP</td>
		      <td>DSP-01</td>
		      <td>1516</td>
		      <td>장혜진</td>
		   </tr>
		   <tr>
		      <td>DSP</td>
		      <td>DSP-02</td>
		      <td>3234</td>
		      <td>장혜진</td>
		   </tr>
		   <tr>
		      <td>DSP</td>
		      <td>DSP-03</td>
		      <td>58</td>
		      <td>장혜진</td>
		   </tr>
		   <tr>
		      <td>AD converter</td>
		      <td>AD-01</td>
		      <td>2116</td>
		      <td>장연수</td>
		   </tr>
		   <tr>
		      <td>AD converter</td>
		      <td>AD-02</td>
		      <td>1571</td>
		      <td>장연수</td>
		   </tr>
		    <tr>
		      <td>MCU</td>
		      <td>MCU-01</td>
		      <td>2196</td>
		      <td>문준식</td>
		   </tr>
		   <tr>
		      <td>MotionDetector</td>
		      <td>MD-01</td>
		      <td>123</td>
		      <td>문준식</td>
		   </tr>
		   <tr>
		      <td>MotionDetector</td>
		      <td>MD-02</td>
		      <td>283</td>
		      <td>문준식</td>
		   </tr>
		 </tbody> 
		</table>
		</div>
		<!-- 테이블끝 -->

		<!-- <div class="col-md-2">
			<div class="row-md-4">할말을해보세요 ^^</div>
		</div>
		<div class="col-md-1">.col-md-1</div>
		<div class="col-md-1">.col-md-1</div>
		<div class="col-md-1">.col-md-1</div>
		<div class="col-md-1">.col-md-1</div>
		<div class="col-md-1">.col-md-1</div>
		<div class="col-md-1">.col-md-1</div>
		<div class="col-md-1">.col-md-1</div>
		<div class="col-md-1">.col-md-1</div>
		<div class="col-md-1">.col-md-1</div>
	</div>
	<div class="row">
		<div class="col-md-3">.col-md-3</div>
		<div class="col-md-3">.col-md-3</div>
		<div class="col-md-3">.col-md-3</div>
		<div class="col-md-3">.col-md-3</div>
	</div> -->
		<!-- 테이블예제 참고용으로 넣어봣다 -->	
	</section>
	<!-- 등록하기 기능 -->
	<div class="modal fade" id="registerModal" tabindex="-1" role="dialog" aria-labelledby="modal" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="modal">재고 등록</h5>
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<form action="./evaluationRegisterAction.jsp" method="post">
						<div class="form-row">
							<div class="form-group col-sm-6">
								<label>제품명</label>
								<input type="text" name="lectureName" class="form-control" maxlength="20">
							</div>
							<div class="form-group col-sm-6">
								<label>책임자</label>
								<input type="text" name="professorName" class="form-control" maxlength="20">
							</div>
						</div>
						<div class="form-row">
							<div class="form-group col-sm-4">
								<label>생산년도</label>
								<select name="lectureYear" class="form-control">
									<option value="2011">2011</option>
									<option value="2012">2012</option>
									<option value="2013">2013</option>
									<option value="2014">2014</option>
									<option value="2015">2015</option>
									<option value="2016">2016</option>
									<option value="2017">2017</option>
									<option value="2018">2018</option>
									<option value="2019" selected>2019</option>
									<option value="2020">2020</option>
									<option value="2021">2021</option>
									<option value="2022">2022</option>
									<option value="2023">2023</option>
								</select>
							</div>
							<div class="form-group col-sm-4">
								<label>생산월</label>
								<select name="lectureYear" class="form-control">
									<option value="1" selected>1</option>
									<option value="2">2</option>
									<option value="3">3</option>
									<option value="4">4</option>
									<option value="5">5</option>
									<option value="6">6</option>
									<option value="7">7</option>
									<option value="8">8</option>
									<option value="9">9</option>
									<option value="10">10</option>
									<option value="11">11</option>
									<option value="12">12</option>
								</select>
							</div>
							<div class="form-group col-sm-4">
								<label>생산일</label>
								<select name="lectureYear" class="form-control">
									<option value="1" selected>1</option>
									<option value="2">2</option>
									<option value="3">3</option>
									<option value="4">4</option>
									<option value="5">5</option>
									<option value="6">6</option>
									<option value="7">7</option>
									<option value="8">8</option>
									<option value="9">9</option>
									<option value="10">10</option>
									<option value="11">11</option>
									<option value="12">12</option>
									<option value="13">3</option>
									<option value="14">4</option>
									<option value="15">5</option>
									<option value="16">6</option>
									<option value="17">7</option>
									<option value="18">8</option>
									<option value="19">9</option>
									<option value="20">10</option>
									<option value="21">11</option>
									<option value="22">12</option>
									<option value="23">3</option>
									<option value="24">4</option>
									<option value="25">5</option>
									<option value="26">6</option>
									<option value="27">7</option>
									<option value="28">8</option>
									<option value="29">9</option>
									<option value="30">10</option>
									<option value="31">11</option>
								</select>
							</div>
						</div>
						<div class="form-group">
							<label>설명</label>
							<textarea name="evaluationContent" class="form-control" maxlength="2048" style="height: 180px;"></textarea>
						</div>
						
						<div class="modal-footer">
							<button type="button" class="btn btn-secondary" data-dismiss="modal">취소</button>
							<button type="submit" class="btn btn-primary">등록하기</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	<!-- 신고 기능 -->
	<div class="modal fade" id="reportModal" tabindex="-1" role="dialog" aria-labelledby="modal" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="modal">신고하기</h5>
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<form action="./reportAction.jsp" method="post">
						<div class="form-group">
							<label>신고 제목</label>
							<input type="text" name="reportTitle" class="form-control" maxlength="30">
						</div>
						<div class="form-group">
							<label>신고 내용</label>
							<textarea name="reportContent" class="form-control" maxlength="2048" style="height: 180px;"></textarea>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-secondary" data-dismiss="modal">취소</button>
							<button type="submit" class="btn btn-danger">신고하기</button>
						</div>
					</form>
				</div>
			</div>
		</div>
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