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
	<div class="row" id="row1">
	<!-- 메뉴 영역 시작 -->
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
	<div class="row" style="font-size: 14px;" id="row2">
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
									<a class="nav-link active" href="clientcode_manage.jsp">거래처코드 관리</a>
									<a class="nav-link active" href="objectcode_manage.jsp">품목코드 관리</a>
									<a class="nav-link active" href="#">공장 관리</a>
									<a class="nav-link active" href="#">제품 관리</a>
									<a class="nav-link active" href="#">거래처단가 관리</a>
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
									<a class="nav-link active" href="#">출고 관리</a>
									<a class="nav-link active" href="#">입고 관리</a>
									<a class="nav-link active" href="#">창고이동 관리</a>
									<a class="nav-link active" href="#">현재고 조회</a>
									<a class="nav-link active" href="#">재고 분석</a>
									<a class="nav-link active" href="#">재고수불부 조회</a>
									<a class="nav-link active" href="#">입출고 현황</a>
									<a class="nav-link active" href="#">입출고 분석</a>
								</li>
							</ul>
						</div>
					</div>
				</div>
				<div class="card">
					<div class="card-header">
						 <a class="card-link collapsed" data-toggle="collapse" data-parent="#card-214190" href="#card-element-3">회계관리</a>
					</div>
					<div id="card-element-3" class="collapse">
						<div class="card-body">
							<ul class="nav flex-column">
								<li class="nav-item">
									<a class="nav-link active" href="#">계산서 관리</a>
									<a class="nav-link active" href="#">계산서 현황 조회</a>
									<a class="nav-link active" href="#">입출금 관리</a>
									<a class="nav-link active" href="#">거래처잔액 조회</a>
									<a class="nav-link active" href="#">결산손익표 조회</a>
								</li>
							</ul>
						</div>
					</div>
				</div>
				<div class="card">
					<div class="card-header">
						 <a class="card-link collapsed" data-toggle="collapse" data-parent="#card-214190" href="#card-element-4">발주</a>
					</div>
					<div id="card-element-4" class="collapse">
						<div class="card-body">
							<ul class="nav flex-column">
								<li class="nav-item">
									<a class="nav-link active" href="#">발주 관리</a>
									<a class="nav-link active" href="#">발주 생성</a>
									<a class="nav-link active" href="#">발주현황 조회</a>
								</li>
							</ul>
						</div>
					</div>
				</div>
				<div class="card">
					<div class="card-header">
						 <a class="card-link collapsed" data-toggle="collapse" data-parent="#card-214190" href="#card-element-5">수주</a>
					</div>
					<div id="card-element-5" class="collapse">
						<div class="card-body">
							<ul class="nav flex-column">
								<li class="nav-item">
									<a class="nav-link active" href="#">수주 관리</a>
									<a class="nav-link active" href="#">수주현황 조회</a>
									<a class="nav-link active" href="#">수주대비재고 조회</a>
								</li>
							</ul>
						</div>
					</div>
				</div>
				<div class="card">
					<div class="card-header">
						 <a class="card-link collapsed" data-toggle="collapse" data-parent="#card-214190" href="#card-element-6">생산</a>
					</div>
					<div id="card-element-6" class="collapse">
						<div class="card-body">
							<ul class="nav flex-column">
								<li class="nav-item">
									<a class="nav-link active" href="#">작업지시현황</a>
									<a class="nav-link active" href="#">생산자재청구 및 출고</a>
									<a class="nav-link active" href="#">작업실적등록</a>
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
									<a class="nav-link active" href="#">자재 현황</a>
									<a class="nav-link active" href="#">자재사용 현황</a>
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
									<a class="nav-link active" href="personal_inform.jsp">인사정보 등록</a>
									<a class="nav-link active" href="pay_inform.jsp">호봉테이블 등록</a>
									<a class="nav-link active" href="personal_search.jsp">인사 현황</a>
								</li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- 메뉴 목록 끝 -->
		<!-- 인사정보등록 폼 시작 -->
		<div class="col-md-3 mt-6" style="font-size: 13px;">
			<form>
			<br>
				<h2>인사정보 등록</h2>
				<hr>
			  	  <div class="form-row">
				  	  <div class="form-group col-sm-8">
				    	<label>사원코드</label>
				    	<input type="number" min="0" name="personalId" class="form-control form-control-sm" id="personalId" placeholder="사원코드">
				    </div>
				    <div class="form-group col-sm-4">
				    	<br>
					    <div class="checkbox">
				    		<label>
				      		<input type="checkbox" id="autoIncrease">자동 생성
				    		</label>
				  	  	</div>
				  	</div>
				  </div>
				  
				  <div class="form-row">
				    <div class="form-group col-sm-8">
				    	<label>패스워드</label>
				    	<input type="password" name="password" class="form-control form-control-sm" id="password" placeholder="패스워드">
				    </div>
				    <div class="form-group col-sm-4">
				    	<br>
					    <div class="checkbox">
				    		<label>
				      		<input type="checkbox" id="randomPassword">랜덤 암호 생성
				    		</label>
				  	  	</div>
				  	</div>
				  </div>
				  
				  <div class="form-row">
				    <div class="form-group col-sm-6">
				    	<label>성명</label>
				    	<input type="text" name="name" class="form-control form-control-sm" id="name" placeholder="성명">
				    </div>
				    
				    <div class="form-group col-sm-6">
				    	<label>소속</label>
				    	<select name="department" class="form-control form-control-sm" id="department">
									<option value="인사관리">인사관리</option>
									<option value="생산관리">생산관리</option>
									<option value="영업관리">영업관리</option>
						</select>
				  	</div>
				  </div>
				  
				  <div class="form-row">
				  	<div class="form-group col-sm-6">
				    	<label>입사일자</label>
				    	<input type="date" name="joinDate" class="form-control form-control-sm" id="joinDate">
				    </div>
				    <div class="form-group col-sm-6">
				    	<label>생년월일</label>
				    	<input type="date" name="birthday" class="form-control form-control-sm" id="birthday">
				    </div>
				  </div>
				  
				  <div class="form-row">
				    <div class="form-group col-sm-6">
				    	<label>직급</label>
				    	<select name="rank" class="form-control form-control-sm" id="rank">
									<option value="사원">사원</option>
									<option value="대리">대리</option>
									<option value="과장">과장</option>
									<option value="차장">차장</option>
									<option value="부장">부장</option>
									<option value="사장">사장</option>
						</select>
				    </div>
				    <div class="form-group col-sm-6">
				    	<label>호봉</label>
				    	<input type="number" min="0" max="32" name="payNum" class="form-control form-control-sm" id="payNum" placeholder="호봉">
				  	</div>
				  </div>
				  
				  <div class="form-row">
				   	<label>전화번호</label>
				    <input type="text" name="phoneNum" class="form-control form-control-sm" id="phoneNum" placeholder="000-0000-0000">
				  </div>
				  <hr>
				  
				  <div class="form-row">
				  	<div class="form-group col-sm-9"></div>
				  	<div class="form-group col-sm-3">
				  		<button type="submit" class="btn btn-primary btn-sm">사원 등록</button>
				  	</div>
				  </div>
			</form>
			<!-- 인사정보등록 폼 끝 -->
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