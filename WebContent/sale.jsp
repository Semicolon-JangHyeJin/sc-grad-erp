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
	<!-- 상단메뉴 영역 시작 -->
	<div class="row" id="row1">
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
	<!-- 상단메뉴 영역 끝 -->
	
	<div class="row" style="font-size: 14px;" id="row2">
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
		<!-- 구매관리 폼 시작 -->
		<div class="col-md-3 mt-6" style="font-size: 13px;">
			<form method='post'>
			<br>
				<h2>판매 관리</h2>
				<hr>
			  	  <div class="form-row">
				  	  <div class="form-group col-sm-8">
				    	<label>판매코드</label>
				    	<input type="number" min="0" name="saleId" class="form-control form-control-sm" id="saleId" placeholder="판매ID">
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
				    <div class="form-group col-sm-6">
				    	<label>제품</label>
				    	<input type="text" name="productsearch" class="form-control form-control-sm" id="productsearch" placeholder="제품 검색">
				    </div>
				    <div class="form-group col-sm-6">
				    	<label>　</label>
				    	<select name="productlist" class="form-control form-control-sm" id="productlist">
									<option value="제품1">제품1</option>
									<option value="제품2">제품2</option>
									<option value="제품3">제품3</option>
						</select>
				    </div>
				  </div>
				  
				  <div class="form-row">
				  	<label>생산단가</label><!-- 제품선택에 따라 생산단가 보여주기 -->
				  	<input type="number" name="productprice" class="form-control form-control-sm" id="productprice" placeholder="12,300원" disabled>
				  </div>
				  <br>
				  <div class="form-row">
				    <div class="form-group col-sm-6">
				    	<label>거래처</label>
				    	<input type="text" name="clientsearch" class="form-control form-control-sm" id="clientsearch" placeholder="거래처 검색">
				    </div>
				    <div class="form-group col-sm-6">
				    	<label>　</label>
				    	<select name="clientlist" class="form-control form-control-sm" id="clientlist">
									<option value="거래처1">거래처1</option>
									<option value="거래처2">거래처2</option>
									<option value="거래처3">거래처3</option>
						</select>
				    </div>
				  </div>
				 
				  <div class="form-row">
				    <div class="form-group col-sm-6">
				    	<label>판매수량</label>
				    	<input type="number" name="amount" class="form-control form-control-sm" id="amount" placeholder="구매수량">
				    </div>
				    <div class="form-group col-sm-6">
				    	<label>판매단가</label>
				    	<input type="number" name="unitprice" class="form-control form-control-sm" id="unitprice" placeholder="구매단가">
				   	</div>
				  </div>
				  
				  <div class="form-row">
				  	    <label>판매금액 (판매수량x판매단가)</label>
				    	<input type="number" name="price" class="form-control form-control-sm" id="price" placeholder="" disabled>
				  </div>
				  <br>
				  
				  <div class="form-row">
				  	<label>순수익</label><!-- ( 판매단가-생산단가 )*수량 -->
				  	<input type="number" name="profit" class="form-control form-control-sm" id="profit" placeholder="9,876,543원" disabled>
				  </div>
				  <br>	
				  	  
				  <div class="form-row">
				 	 <label>거래일</label>
				     <input type="date" name="saleDate" class="form-control form-control-sm" id="saleDate">
				  </div>
				  
				  <br>
				  <div class="form-row">
				    <div class="form-group col-sm-6">
				    	<label>담당자</label>
				    	<input type="text" name="employeesearch" class="form-control form-control-sm" id="employeesearch" placeholder="사원 검색">
				    </div>
				    <div class="form-group col-sm-6">
				    	<label>　</label>
				    	<select name="employeelist" class="form-control form-control-sm" id="employeelist">
									<option value="사원1">사원1</option>
									<option value="사원2">사원2</option>
									<option value="사원3">사원3</option>
						</select>
				    </div>
				  </div>
				  
				  <hr>
				  <div class="form-row">
				  	<div class="form-group col-sm-9"></div>
				  	<div class="form-group col-sm-3">
				  		<button type="submit" class="btn btn-primary btn-sm">판매 등록</button>
				  	</div>
				  </div>
				  
			</form>
		</div>
		<!-- 판매관리 폼 끝 -->
		
		<!-- 검색/열람영역 -->
		<div class="col-md-6 mt-6" style="font-size: 13px;">
			<!-- 검색옵션 -->
			<form>
			<h3>검색</h3>
			<div class="form-row">
				<div class="form-group col-sm-4">
					<label>제품명</label>
					<input type="text" name="productsearch" class="form-control form-control-sm" id="productsearch" placeholder="제품 검색">    
				</div>
				<div class="form-group col-sm-4">
					<label>거래처</label>
					<input type="text" name="clientsearch" class="form-control form-control-sm" id="clientsearch" placeholder="거래처 검색">
				</div>
				<div class="form-group col-sm-4">
					<label>담당자</label>
					<input type="text" name="employeesearch" class="form-control form-control-sm" id="employeesearch" placeholder="사원 검색">
				</div>
			</div>
			<label>거래일</label>
			<div class="form-row">
				<div class="form-group col-sm-5">
					<input type="date" name="saleDate" class="form-control form-control-sm" id="saleDate">
				</div>	
				<div class="form-group col-sm-2" style="text-align:center">
					<p>~</p>
				</div>		
				<div class="form-group col-sm-5">
					<input type="date" name="saleDate" class="form-control form-control-sm" id="saleDate">
				</div>			
			</div>
			<div class="form-group">
				<button type="submit" class="btn btn-primary btn-sm">검색</button>
			</div>
			
			<hr>
			</form>
			<!-- 검색옵션끝 -->
		</div>
		<!-- 검색/열람영역끝 -->
		
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