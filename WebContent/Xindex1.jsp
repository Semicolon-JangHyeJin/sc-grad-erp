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
		<div class="col-md-2 mt-3 sidenav">
			<div class="modal fade" id="modal-container-260607" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
				<div class="modal-dialog" role="document">
					<div class="modal-content">
						<div class="modal-header">
							<h5 class="modal-title" id="myModalLabel">
								Modal title
							</h5> 
							<button type="button" class="close" data-dismiss="modal">
								<span aria-hidden="true">×</span>
							</button>
						</div>
						<div class="modal-body">
								...
						</div>
						<div class="modal-footer">
								 
							<button type="button" class="btn btn-primary">
								Save changes
							</button> 
							<button type="button" class="btn btn-secondary" data-dismiss="modal">
								Close
							</button>
						</div>
					</div>
				</div>
			</div>
					
			<div id="card-214190">
				<div class="card">
					<div class="card-header">
						 <a class="card-link collapsed" data-toggle="collapse" data-parent="#card-214190" href="#card-element-1">공통관리</a>
					</div>
					<div id="card-element-1" class="collapse">
						<div class="card-body">
							<ul class="nav flex-column">
								<li class="nav-item">
									<a class="nav-link active" href="#">거래처코드 관리</a>
									<a class="nav-link active" href="#">품목코드 관리</a>
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
									<a class="nav-link active" href="#">인사정보 등록</a>
									<a class="nav-link active" href="#">호봉테이블 등록</a>
									<a class="nav-link active" href="#">인사발령 등록</a>
									<a class="nav-link active" href="#">인사 현황</a>
								</li>
							</ul>
						</div>
					</div>
				</div>
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
		<div class="col-md-10 mt-6">
			<div class="tabbable" id="tabs-886810">
				<ul class="nav nav-tabs">
					<li class="nav-item">
						<a class="nav-link active" href="#tab1" data-toggle="tab">입고관리</a>
					</li>
					<li class="nav-item">
						<a class="nav-link" href="#tab2" data-toggle="tab">출고관리</a>
					</li>
					<li class="nav-item">
						<a class="nav-link" href="#tab3" data-toggle="tab">거래처관리</a>
					</li>
				</ul>
				<div class="tab-content">
					<div class="tab-pane active" id="tab1">
						<br>
						<div class="row">
						<div class="col-md-10"><input class="form-control" id="itemListInput" type="text" placeholder="Search.."></div>
						<div class="col-md-2"><a id="modal-260607" href="#registerModal" role="button" class="btn btn-block" data-toggle="modal">재고등록</a></div>
 						</div>
 						<br>
						<table class="table table-condensed table-bordered table-hover">
							 <thead>
							   <tr>
							      <th>분류</th>
							      <th>상품명</th>
							      <th>수량</th>
							      <th>책임자</th>
							   </tr>
							 </thead>
							 <tbody id="itemList">
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
					
<script>
$(document).ready(function(){
  $("#itemListInput").on("keyup", function() {
    var value = $(this).val().toLowerCase();
    $("#itemList tr").filter(function() {
      $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
    });
  });
});
</script>
					
					<div class="tab-pane" id="tab2">
						<br>
						<table class="table table-condensed table-bordered table-hover">
							 <thead>
							   <tr>
							      <th>분류</th>
							      <th>상품명</th>
							      <th>가격</th>
							      <th>거래처</th>
							   </tr>
							 </thead>
							 <tbody>
							   <tr>
							      <td>SIM Card</td>
							      <td>SIM-01</td>
							      <td>1,000</td>
							      <td>상명대학교</td>
							   </tr>
							   <tr>
							      <td>SIM Card</td>
							      <td>SIM-02</td>
							      <td>8,000</td>
							      <td>서울우유</td>
							   </tr>
							   <tr>
							      <td>Memory Card</td>
							      <td>Memory-01</td>
							      <td>12,000</td>
							      <td>-</td>
							   </tr>
							 </tbody> 
						</table>
					</div>
					
					<div class="tab-pane" id="tab3">
						<br>
						<table class="table table-condensed table-bordered table-hover">
							 <thead>
							   <tr>
							      <th>분류</th>
							      <th>상품명</th>
							      <th>가격</th>
							      <th>거래처</th>
							   </tr>
							 </thead>
							 <tbody>
							   <tr>
							      <td>SIM Card</td>
							      <td>SIM-01</td>
							      <td>1,000</td>
							      <td>상명대학교</td>
							   </tr>
							   <tr>
							      <td>SIM Card</td>
							      <td>SIM-02</td>
							      <td>8,000</td>
							      <td>서울우유</td>
							   </tr>
							   <tr>
							      <td>Memory Card</td>
							      <td>Memory-01</td>
							      <td>12,000</td>
							      <td>-</td>
							   </tr>
							 </tbody> 
						</table>
					</div>
				</div>
			</div>

		</div>
	</div>
</div>
<section>
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