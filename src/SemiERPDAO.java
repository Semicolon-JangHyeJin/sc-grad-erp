import java.sql.*;

public class SemiERPDAO {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet dbrs, tbrs;

	// Database Connection
	public Connection dbConn() {
		try {

			// Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			// Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(
					"jdbc:mysql://semierp.cmccxwv3gj1s.ap-northeast-2.rds.amazonaws.com/semierp:3306?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
					"admin", "semicolon");

			// close a connection
			conn.close();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		}

		return conn;
	}

	// 데이터베이스가 있는지 확인하고, 없으면 데이터베이스 생성 후 데이터베이스 전환
	// CreateOrChanegDAtabase("semiERP");
	public void CreateOrChangeDatabase(String dbName) {
		try {
			String dbSql = "SELECT * FROM Information_schema.SCHEMATA WHERE SCHEMA_NAME = ?";
			pstmt = conn.prepareStatement(dbSql);
			pstmt.setString(1, dbName);
			dbrs = pstmt.executeQuery();

			// 데이터베이스가 없다면 데이터베이스 생성
			if (!dbrs.next()) {
				Statement stmt = conn.createStatement();
				String sql = "CREATE DATABASE " + dbName;
				boolean re = stmt.execute(sql);

				if (!re)
					System.out.println("데이터베이스 생성 실패" + re);

				stmt.close();
			}

			// 데이터베이스를 변환 (use database)
			conn.setCatalog(dbName);
		} catch (Exception e) {
			System.out.println("CreateOrChangeDatabase err : " + e);
		} finally {
			try {
				if (dbrs != null)
					dbrs.close();

				if (pstmt != null)
					pstmt.close();

				if (conn != null)
					pstmt.close();

			} catch (Exception e) {
			}
		}
	}

	// 테이블이 있는지 확인하고 없으면 생성
	// CreateTable("semiERP", "MATERIALS");
	// CreateTable("semiERP", "PRODUCT");
	// CreateTable("semiERP", "ACCOUNT_LIST");
	// CreateTable("semiERP", "EMPLOYEE");
	// CreateTable("semiERP", "PURCHASE");
	// CreateTable("semiERP", "SALE");
	// CreateTable("semiERP", "PRODUCTION");
	// CreateTable("semiERP", "INVENTORY_RECEIPTS");
	public void CreateTable(String DbName, String tName) {
		try {
			// 데이터 베이스 생성 및 전환
			CreateOrChangeDatabase(DbName);

			// information_schema.tables 로 부터 테이블의 존재 유무 확인
			String tableSql = "SELECT table_name FROM information_schema.tables where table_schema = ? and table_name = ?";
			pstmt = conn.prepareStatement(tableSql);
			pstmt.setString(1, DbName);
			pstmt.setString(2, tName);
			dbrs = pstmt.executeQuery();

			// 테이블이 없다면 테이블 생성
			if (!dbrs.next()) {
				Statement stmt = conn.createStatement();
				String sql = null;
				if(tName == "MATERIALS") {
					sql = "CREATE TABLE " + tName + "(" 
							+ "CREATE TABLE MATERIALS(" + 
							"MATERIALS_ID VARCHAR(10) NOT NULL," + 
							"MATERIALS_NAME VARCHAR(30) NOT NULL," + 
							"AMOUNT INT NOT NULL DEFAULT 0," + 
							"PRIMARY KEY (MATERIALS_ID)"
							+ ")";
				}else if(tName =="PRODUCT") {
					sql = "CREATE TABLE " + tName + "(" 
							+ "PRODUCT_ID VARCHAR(10) NOT NULL," + 
							"PRODUCT_NAME VARCHAR(30) NOT NULL," + 
							"AMOUNT INT NOT NULL DEFAULT 0," + 
							"MATERIALS_ID VARCHAR(10)," + 
							"PRIMARY KEY (PRODUCT_ID)," + 
							"FOREIGN KEY(MATERIALS_ID) REFERENCES MATERIALS (MATERIALS_ID)"
							+ ")";
				}else if(tName =="ACCOUNT_LIST") {
					sql = "CREATE TABLE " + tName + "(" 
							+ "ACCOUNT_BID VARCHAR(10) NOT NULL," + 
							"BUSINESS_NAME VARCHAR(30) NOT NULL," + 
							"CEO VARCHAR(30) NOT NULL," + 
							"ADDRESS VARCHAR(50)," + 
							"EMAIL VARCHAR(30)," + 
							"PHONE_NUMBER INT NOT NULL," + 
							"PRIMARY KEY (ACCOUNT_BID)"
							+ ")";
				}else if(tName =="EMPLOYEE") {
					sql = "CREATE TABLE " + tName + "(" 
							+ "EID VARCHAR(10) NOT NULL," + 
							"E_NAME VARCHAR(20) NOT NULL," + 
							"E_PASSWORD INT NOT NULL DEFAULT 0000," + 
							"DEPARTMENT VARCHAR(4) NOT NULL," + 
							"E_POSITION VARCHAR(10) NOT NULL," + 
							"PHONE_NUMBER VARCHAR(13) DEFAULT '000-0000-0000'," + 
							"SALARY INT NOT NULL DEFAULT 0," + 
							"JOIN_DATE VARCHAR(10) NOT NULL DEFAULT '0000-00-00'," + 
							"PRIMARY KEY (EID)"
							+ ")";
				}else if(tName =="PURCHASE") {
					sql = "CREATE TABLE " + tName + "(" 
							+ "PURCHASE_CODE VARCHAR(10) NOT NULL," + 
							"MATERIALS_ID VARCHAR(10) NOT NULL," + 
							"SELLER_BID VARCHAR(10) NOT NULL," + 
							"P_AMOUNT INT NOT NULL DEFAULT 0," + 
							"P_UNIT_PRICE INT NOT NULL DEFAULT 0," + 
							"P_PRICE INT NOT NULL DEFAULT 0," + 
							"DEAL_ITEM_ID VARCHAR(30) NOT NULL," + 
							"D_DATE VARCHAR(10) NOT NULL DEFAULT '0000-00-00'," + 
							"PURCHASE_EID VARCHAR(10)," + 
							"PRIMARY KEY (PURCHASE_CODE)," + 
							"FOREIGN KEY (MATERIALS_ID) REFERENCES MATERIALS (MATERIALS_ID)," + 
							"FOREIGN KEY (SELLER_BID) REFERENCES ACCOUNT_LIST (ACCOUNT_BID)," + 
							"FOREIGN KEY (PURCHASE_EID) REFERENCES EMPLOYEE (EID)"
							+ ")";
				}else if(tName =="SALE") {
					sql = "CREATE TABLE " + tName + "(" 
							+ "SALE_CODE VARCHAR(10) NOT NULL," + 
							"VENDOR_BID VARCHAR(10) NOT NULL," + 
							"PRODUCT_ID VARCHAR(10) NOT NULL," + 
							"S_AMOUNT INT NOT NULL DEFAULT 0," + 
							"S_UNIT_PRICE INT NOT NULL DEFAULT 0," + 
							"S_PRICE INT NOT NULL DEFAULT 0," + 
							"DEAL_ITEM_ID VARCHAR(30) NOT NULL," + 
							"D_DATE VARCHAR(10) NOT NULL DEFAULT '0000-00-00'," + 
							"SALE_EID VARCHAR(10)," + 
							"PRIMARY KEY (SALE_CODE)," + 
							"FOREIGN KEY (VENDOR_BID) REFERENCES ACCOUNT_LIST (ACCOUNT_BID)," + 
							"FOREIGN KEY (PRODUCT_ID) REFERENCES PRODUCT (PRODUCT_ID)," + 
							"FOREIGN KEY (SALE_EID) REFERENCES EMPLOYEE (EID)"
							+ ")";
				}else if(tName =="PRODUCTION") {
					sql = "CREATE TABLE " + tName + "(" 
							+ "PRODUCTION_CODE VARCHAR(10) NOT NULL," + 
							"PRODUCT_ID VARCHAR(10) NOT NULL," + 
							"PRODUCT_NAME VARCHAR(30) NOT NULL," + 
							"P_AMOUNT INT NOT NULL DEFAULT 0," + 
							"MATERIALS_ID VARCHAR(10) NOT NULL," + 
							"MATERIALS_NAME VARCHAR(30) NOT NULL," + 
							"M_AMOUNT INT NOT NULL DEFAULT 0," + 
							"P_PRICE INT NOT NULL DEFAULT 0," + 
							"P_DATE VARCHAR(10) NOT NULL DEFAULT '0000-00-00'," + 
							"PRODUCTION_EID VARCHAR(10) NOT NULL," + 
							"PRIMARY KEY (PRODUCTION_CODE)"
							+ ")";
				}else if(tName =="INVENTORY_RECEIPTS") {
					sql = "CREATE TABLE " + tName + "(" 
							+ "D_DATE VARCHAR(10) NOT NULL DEFAULT '0000-00-00'," + 
							"P_AMOUNT INT NOT NULL DEFAULT 0," + 
							"P_UNIT_PRICE INT NOT NULL DEFAULT 0," + 
							"P_PRICE INT NOT NULL DEFAULT 0," + 
							"S_AMOUNT INT NOT NULL DEFAULT 0," + 
							"S_UNIT_PRICE INT NOT NULL DEFAULT 0," + 
							"S_PRICE INT NOT NULL DEFAULT 0," + 
							"STOCK_AMOUNT INT NOT NULL DEFAULT 0," + 
							"STOCK_UNIT_PRICE INT NOT NULL DEFAULT 0," + 
							"STOCK_PRICE INT NOT NULL DEFAULT 0," + 
							"DESCRIPTION VARCHAR(50)," + 
							"PRIMARY KEY (D_DATE)"
							+ ")";
				}else {
					sql = null;
				}				
				tbrs = stmt.executeQuery(sql);
				stmt.close();
				System.out.println(tbrs);
			}

		} catch (Exception e) {
			System.out.println("CreateTable err : " + e);
		} finally {
			try {
				if (dbrs != null)
					dbrs.close();
				
				if (pstmt != null)
					pstmt.close();
				
				if (conn != null)
					pstmt.close();
				
			} catch (Exception e) {
			}
		}
	}

}
