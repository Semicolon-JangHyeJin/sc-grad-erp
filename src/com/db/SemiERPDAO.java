package com.db;
import java.sql.*;
import java.util.ArrayList;

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
	// CreateOrChanegDatabase("semiERP");
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
				if (tName == "MATERIALS") {
					sql = "CREATE TABLE " + tName + "(" + "CREATE TABLE MATERIALS("
							+ "MATERIALS_ID VARCHAR(10) NOT NULL," + "MATERIALS_NAME VARCHAR(30) NOT NULL,"
							+ "AMOUNT INT NOT NULL DEFAULT 0," + "PRIMARY KEY (MATERIALS_ID)" + ")";
				} else if (tName == "PRODUCT") {
					sql = "CREATE TABLE " + tName + "(" + "PRODUCT_ID VARCHAR(10) NOT NULL,"
							+ "PRODUCT_NAME VARCHAR(30) NOT NULL," + "AMOUNT INT NOT NULL DEFAULT 0,"
							+ "MATERIALS_ID VARCHAR(10)," + "PRIMARY KEY (PRODUCT_ID),"
							+ "FOREIGN KEY(MATERIALS_ID) REFERENCES MATERIALS (MATERIALS_ID)" + ")";
				} else if (tName == "ACCOUNT_LIST") {
					sql = "CREATE TABLE " + tName + "(" + "ACCOUNT_BID VARCHAR(10) NOT NULL,"
							+ "BUSINESS_NAME VARCHAR(30) NOT NULL," + "CEO VARCHAR(30) NOT NULL,"
							+ "ADDRESS VARCHAR(50)," + "EMAIL VARCHAR(30)," + "PHONE_NUMBER INT NOT NULL,"
							+ "PRIMARY KEY (ACCOUNT_BID)" + ")";
				} else if (tName == "EMPLOYEE") {
					sql = "CREATE TABLE " + tName + "(" + "EID VARCHAR(10) NOT NULL," + "E_NAME VARCHAR(20) NOT NULL,"
							+ "E_PASSWORD INT NOT NULL DEFAULT 0000," + "DEPARTMENT VARCHAR(4) NOT NULL,"
							+ "E_POSITION VARCHAR(10) NOT NULL," + "PHONE_NUMBER VARCHAR(13) DEFAULT '000-0000-0000',"
							+ "SALARY INT NOT NULL DEFAULT 0," + "JOIN_DATE VARCHAR(10) NOT NULL DEFAULT '0000-00-00',"
							+ "PRIMARY KEY (EID)" + ")";
				} else if (tName == "PURCHASE") {
					sql = "CREATE TABLE " + tName + "(" + "PURCHASE_CODE VARCHAR(10) NOT NULL,"
							+ "MATERIALS_ID VARCHAR(10) NOT NULL," + "SELLER_BID VARCHAR(10) NOT NULL,"
							+ "P_AMOUNT INT NOT NULL DEFAULT 0," + "P_UNIT_PRICE INT NOT NULL DEFAULT 0,"
							+ "P_PRICE INT NOT NULL DEFAULT 0," + "DEAL_ITEM_ID VARCHAR(30) NOT NULL,"
							+ "D_DATE VARCHAR(10) NOT NULL DEFAULT '0000-00-00'," + "PURCHASE_EID VARCHAR(10),"
							+ "PRIMARY KEY (PURCHASE_CODE),"
							+ "FOREIGN KEY (MATERIALS_ID) REFERENCES MATERIALS (MATERIALS_ID),"
							+ "FOREIGN KEY (SELLER_BID) REFERENCES ACCOUNT_LIST (ACCOUNT_BID),"
							+ "FOREIGN KEY (PURCHASE_EID) REFERENCES EMPLOYEE (EID)" + ")";
				} else if (tName == "SALE") {
					sql = "CREATE TABLE " + tName + "(" + "SALE_CODE VARCHAR(10) NOT NULL,"
							+ "VENDOR_BID VARCHAR(10) NOT NULL," + "PRODUCT_ID VARCHAR(10) NOT NULL,"
							+ "S_AMOUNT INT NOT NULL DEFAULT 0," + "S_UNIT_PRICE INT NOT NULL DEFAULT 0,"
							+ "S_PRICE INT NOT NULL DEFAULT 0," + "DEAL_ITEM_ID VARCHAR(30) NOT NULL,"
							+ "D_DATE VARCHAR(10) NOT NULL DEFAULT '0000-00-00'," + "SALE_EID VARCHAR(10),"
							+ "PRIMARY KEY (SALE_CODE),"
							+ "FOREIGN KEY (VENDOR_BID) REFERENCES ACCOUNT_LIST (ACCOUNT_BID),"
							+ "FOREIGN KEY (PRODUCT_ID) REFERENCES PRODUCT (PRODUCT_ID),"
							+ "FOREIGN KEY (SALE_EID) REFERENCES EMPLOYEE (EID)" + ")";
				} else if (tName == "PRODUCTION") {
					sql = "CREATE TABLE " + tName + "(" + "PRODUCTION_CODE VARCHAR(10) NOT NULL,"
							+ "PRODUCT_ID VARCHAR(10) NOT NULL," + "PRODUCT_NAME VARCHAR(30) NOT NULL,"
							+ "P_AMOUNT INT NOT NULL DEFAULT 0," + "MATERIALS_ID VARCHAR(10) NOT NULL,"
							+ "MATERIALS_NAME VARCHAR(30) NOT NULL," + "M_AMOUNT INT NOT NULL DEFAULT 0,"
							+ "P_PRICE INT NOT NULL DEFAULT 0," + "P_DATE VARCHAR(10) NOT NULL DEFAULT '0000-00-00',"
							+ "PRODUCTION_EID VARCHAR(10) NOT NULL," + "PRIMARY KEY (PRODUCTION_CODE)" + ")";
				} else if (tName == "INVENTORY_RECEIPTS") {
					sql = "CREATE TABLE " + tName + "(" + "D_DATE VARCHAR(10) NOT NULL DEFAULT '0000-00-00',"
							+ "P_AMOUNT INT NOT NULL DEFAULT 0," + "P_UNIT_PRICE INT NOT NULL DEFAULT 0,"
							+ "P_PRICE INT NOT NULL DEFAULT 0," + "S_AMOUNT INT NOT NULL DEFAULT 0,"
							+ "S_UNIT_PRICE INT NOT NULL DEFAULT 0," + "S_PRICE INT NOT NULL DEFAULT 0,"
							+ "STOCK_AMOUNT INT NOT NULL DEFAULT 0," + "STOCK_UNIT_PRICE INT NOT NULL DEFAULT 0,"
							+ "STOCK_PRICE INT NOT NULL DEFAULT 0," + "DESCRIPTION VARCHAR(50),"
							+ "PRIMARY KEY (D_DATE)" + ")";
				} else {
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

	public void InsertMaterialsData(String mATERIALS_ID, String mATERIALS_NAME, int aMOUNT) {
		try {
			conn = dbConn();
			pstmt = conn
					.prepareStatement("INSERT INTO MATERIALS(MATERIALS_ID, MATERIALS_NAME, AMOUNT) VALUES (?, ?, ?)");
			pstmt.setString(1, mATERIALS_ID);
			pstmt.setString(2, mATERIALS_NAME);
			pstmt.setInt(3, aMOUNT);
			pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public void InsertProductData(String pRODUCT_ID, String pRODUCT_NAME, int aMOUNT, String mATERIALS_ID) {
		try {
			conn = dbConn();
			pstmt = conn.prepareStatement(
					"INSERT INTO PRODUCT(PRODUCT_ID, PRODUCT_NAME, AMOUNT, MATERIALS_ID) VALUES (?, ?, ?, ?)");
			pstmt.setString(1, pRODUCT_ID);
			pstmt.setString(2, pRODUCT_NAME);
			pstmt.setInt(3, aMOUNT);
			pstmt.setString(4, mATERIALS_ID);
			pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public void InserAccountListtData(String aCCOUNT_BID, String bUSINESS_NAME, String cEO, String aDDRESS,
			String eMAIL, int pHONE_NUMBER) {
		try {
			conn = dbConn();
			pstmt = conn.prepareStatement(
					"INSERT INTO ACCOUNT_LIST(ACCOUNT_BID, BUSINESS_NAME, CEO, ADDRESS, EMAIL, PHONE_NUMBER) VALUES (?, ?, ?, ?, ?, ?)");
			pstmt.setString(1, aCCOUNT_BID);
			pstmt.setString(2, bUSINESS_NAME);
			pstmt.setString(3, cEO);
			pstmt.setString(4, aDDRESS);
			pstmt.setString(5, eMAIL);
			pstmt.setInt(6, pHONE_NUMBER);
			pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public void InsertEmployeeData(String eID, String e_NAME, int e_PASSWORD, String dEPARTMENT, String e_POSITION,
			String pHONE_NUMBER, int sALARY, String jOIN_DATE) {
		try {
			conn = dbConn();
			pstmt = conn.prepareStatement(
					"INSERT INTO EMPLOYEE(EID, E_NAME, E_PASSWORD, DEPARTMENT, E_POSITION, PHONE_NUMBER, SALARY, JOIN_DATE) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
			pstmt.setString(1, eID);
			pstmt.setString(2, e_NAME);
			pstmt.setInt(3, e_PASSWORD);
			pstmt.setString(4, dEPARTMENT);
			pstmt.setString(5, e_POSITION);
			pstmt.setString(6, pHONE_NUMBER);
			pstmt.setInt(7, sALARY);
			pstmt.setString(8, jOIN_DATE);
			pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public void InsertPurchaseData(String pURCHASE_CODE, String mATERIALS_ID, String sELLER_BID, int p_AMOUNT,
			int p_UNIT_PRICE, int p_PRICE, String dEAL_ITEM_ID, String d_DATE, String pURCHASE_EID) {
		try {
			conn = dbConn();
			pstmt = conn.prepareStatement(
					"INSERT INTO PURCHASE(PURCHASE_CODE, MATERIALS_ID, SELLER_BID, P_AMOUNT, P_UNIT_PRICE, P_PRICE, DEAL_ITEM_ID, D_DATE, PURCHASE_EID) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
			pstmt.setString(1, pURCHASE_CODE);
			pstmt.setString(2, mATERIALS_ID);
			pstmt.setString(3, sELLER_BID);
			pstmt.setInt(4, p_AMOUNT);
			pstmt.setInt(5, p_UNIT_PRICE);
			pstmt.setInt(6, p_PRICE);
			pstmt.setString(7, dEAL_ITEM_ID);
			pstmt.setString(8, d_DATE);
			pstmt.setString(9, pURCHASE_EID);
			pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public void InsertSaleData(String sALE_CODE, String vENDOR_BID, String pRODUCT_ID, int s_AMOUNT, int s_UNIT_PRICE,
			int s_PRICE, String dEAL_ITEM_ID, String d_DATE, String sALE_EID) {
		try {
			conn = dbConn();
			pstmt = conn.prepareStatement(
					"INSERT INTO SALE(SALE, VENDOR_BID, PRODUCT_ID, S_AMOUNT, S_NUIT_PRICE, S_PRICE, DEAL_ITEM_ID, D_DATE, SALE_EDI) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
			pstmt.setString(1, sALE_CODE);
			pstmt.setString(2, vENDOR_BID);
			pstmt.setString(3, pRODUCT_ID);
			pstmt.setInt(4, s_AMOUNT);
			pstmt.setInt(5, s_UNIT_PRICE);
			pstmt.setInt(6, s_PRICE);
			pstmt.setString(7, dEAL_ITEM_ID);
			pstmt.setString(8, d_DATE);
			pstmt.setString(9, sALE_EID);
			pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public void InsertProductionData(String pRODUCTION_CODE, String pRODUCT_ID, String pRODUCT_NAME, int p_AMOUNT,
			String mATERIALS_ID, String mATERIALS_NAME, int m_AMOUNT, int p_PRICE, String p_DATE,
			String pRODUCTION_EID) {
		try {
			conn = dbConn();
			pstmt = conn.prepareStatement(
					"INSERT INTO PRODUCTION(PRODUCTION_CODE, PRODUCT_ID, PRODUCT_NAME, P_AMOUNT, MATERIALS_ID, MATERIALS_NAME, M_AMOUNT, P_PRICE, P_DATE, PRODUCTION_EID) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			pstmt.setString(1, pRODUCTION_CODE);
			pstmt.setString(2, pRODUCT_ID);
			pstmt.setString(3, pRODUCT_NAME);
			pstmt.setInt(4, p_AMOUNT);
			pstmt.setString(5, mATERIALS_ID);
			pstmt.setString(6, mATERIALS_NAME);
			pstmt.setInt(7, m_AMOUNT);
			pstmt.setInt(8, p_PRICE);
			pstmt.setString(9, p_DATE);
			pstmt.setString(10, pRODUCTION_EID);
			pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public void InsertInventoryReceiptsData(String d_DATE, int p_AMOUNT, int p_UNIT_PRICE, int p_PRICE, int s_AMOUNT,
			int s_UNIT_PRICE, int s_PRICE, int sTOCK_AMOUNT, int sTOCK_UNIT_PRICE, int sTOCK_PRICE,
			String dESCRIPTION) {
		try {
			conn = dbConn();
			pstmt = conn.prepareStatement(
					"INSERT INTO INVENTORY_RECEIPTS(D_DATE, P_AMOUNT, P_UNIT_PRICE, P_PRICE, S_AMOUNT, S_UNIT_PRICE, S_PRICE, STOCK_AMOUNT, STOCK_UNIT_PRICE, STOCK_PRICE, DESCRIPITION) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			pstmt.setString(1, d_DATE);
			pstmt.setInt(2, p_AMOUNT);
			pstmt.setInt(3, p_UNIT_PRICE);
			pstmt.setInt(4, p_PRICE);
			pstmt.setInt(5, s_AMOUNT);
			pstmt.setInt(6, s_UNIT_PRICE);
			pstmt.setInt(7, s_PRICE);
			pstmt.setInt(8, sTOCK_AMOUNT);
			pstmt.setInt(9, sTOCK_UNIT_PRICE);
			pstmt.setInt(10, sTOCK_PRICE);
			pstmt.setString(11, dESCRIPTION);
			pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public ArrayList<MaterialsDTO> MaterialsList() {
		ArrayList<MaterialsDTO> list = new ArrayList<MaterialsDTO>();
		ResultSet rs = null;

		try {
			conn = dbConn();
			String sql = "SELECT * FROM MATERIALS";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				MaterialsDTO dto = new MaterialsDTO();

				dto.setMATERIALS_ID(rs.getString("MATERIALS_ID"));
				dto.setMATERIALS_NAME(rs.getString("MATERIALS_NAME"));
				dto.setAMOUNT(rs.getInt("AMOUNT"));

				list.add(dto);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return list;
	}

	public ArrayList<ProductDTO> ProductList() {
		ArrayList<ProductDTO> list = new ArrayList<ProductDTO>();
		ResultSet rs = null;

		try {
			conn = dbConn();
			String sql = "SELECT * FROM PRODUCT";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				ProductDTO dto = new ProductDTO();

				dto.setPRODUCT_ID(rs.getString("PRODUCT_ID"));
				dto.setPRODUCT_NAME(rs.getString("PRODUCT_NAME"));
				dto.setAMOUNT(rs.getInt("AMOUNT"));
				dto.setMATERIALS_ID(rs.getString("MATERIALS_ID"));

				list.add(dto);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return list;
	}

	public ArrayList<AccountListDTO> AccountListList() {
		ArrayList<AccountListDTO> list = new ArrayList<AccountListDTO>();
		ResultSet rs = null;

		try {
			conn = dbConn();
			String sql = "SELECT * FROM ACCOUNT_LIST";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				AccountListDTO dto = new AccountListDTO();

				dto.setACCOUNT_BID(rs.getString("ACCOUNT_BID"));
				dto.setBUSINESS_NAME(rs.getString("BUSINESS_NAME"));
				dto.setCEO(rs.getString("CEO"));
				dto.setADDRESS(rs.getString("ADDRESS"));
				dto.setEMAIL(rs.getString("EMAIL"));
				dto.setPHONE_NUMBER(rs.getInt("PHONE_NUMBER"));

				list.add(dto);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return list;
	}

	public ArrayList<EmployeeDTO> EmployeeList() {
		ArrayList<EmployeeDTO> list = new ArrayList<EmployeeDTO>();
		ResultSet rs = null;

		try {
			conn = dbConn();
			String sql = "SELECT * FROM EMPLOYEE";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				EmployeeDTO dto = new EmployeeDTO();

				dto.setEID(rs.getString("EID"));
				dto.setE_NAME(rs.getString("E_NAME"));
				dto.setE_PASSWORD(rs.getInt("E_PASSWORD"));
				dto.setDEPARTMENT(rs.getString("DEPARTMENT"));
				dto.setE_POSITION(rs.getString("E_POSITION"));
				dto.setPHONE_NUMBER(rs.getString("PHONE_NUMBER"));
				dto.setSALARY(rs.getInt("SALARY"));
				dto.setJOIN_DATE(rs.getString("JOIN_DATE"));

				list.add(dto);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return list;
	}

	public ArrayList<PurchaseDTO> PurchaseList() {
		ArrayList<PurchaseDTO> list = new ArrayList<PurchaseDTO>();
		ResultSet rs = null;

		try {
			conn = dbConn();
			String sql = "SELECT * FROM PURCHASE";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				PurchaseDTO dto = new PurchaseDTO();

				dto.setPURCHASE_CODE(rs.getString("PURCHASE_CODE"));
				dto.setMATERIALS_ID(rs.getString("MATERIALS_ID"));
				dto.setSELLER_BID(rs.getString("SELLER_BID"));
				dto.setP_AMOUNT(rs.getInt("P_AMOUNT"));
				dto.setP_UNIT_PRICE(rs.getInt("P_UNIT_PRICE"));
				dto.setP_PRICE(rs.getInt("P_PRICE"));
				dto.setDEAL_ITEM_ID(rs.getString("DEAL_ITEM_ID"));
				dto.setD_DATE(rs.getString("D_DATE"));
				dto.setPURCHASE_EID(rs.getString("PURCHASE_EID"));

				list.add(dto);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return list;
	}

	public ArrayList<SaleDTO> SaleList() {
		ArrayList<SaleDTO> list = new ArrayList<SaleDTO>();
		ResultSet rs = null;

		try {
			conn = dbConn();
			String sql = "SELECT * FROM SALE";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				SaleDTO dto = new SaleDTO();

				dto.setSALE_CODE(rs.getString("SALE_CODE"));
				dto.setVENDOR_BID(rs.getString("VENDOR_BID"));
				dto.setPRODUCT_ID(rs.getString("PRODUCT_ID"));
				dto.setS_AMOUNT(rs.getInt("S_AMOUNT"));
				dto.setS_UNIT_PRICE(rs.getInt("S_UNIT_PRICE"));
				dto.setS_PRICE(rs.getInt("S_PRICE"));
				dto.setDEAL_ITEM_ID(rs.getString("DEAL_ITEM_ID"));
				dto.setD_DATE(rs.getString("D_DATE"));
				dto.setSALE_EID(rs.getString("SALE_EID"));

				list.add(dto);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return list;
	}

	public ArrayList<ProductionDTO> ProductionList() {
		ArrayList<ProductionDTO> list = new ArrayList<ProductionDTO>();
		ResultSet rs = null;

		try {
			conn = dbConn();
			String sql = "SELECT * FROM PRODUCTION";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				ProductionDTO dto = new ProductionDTO();

				dto.setPRODUCTION_CODE(rs.getString("PRODUCTION_DOCE"));
				dto.setPRODUCT_ID(rs.getString("PRODUCT_ID"));
				dto.setPRODUCT_NAME(rs.getString("PRODUT_NAME"));
				dto.setP_AMOUNT(rs.getInt("P_AMOUNT"));
				dto.setMATERIALS_ID(rs.getString("MATERIALS_ID"));
				dto.setMATERIALS_NAME(rs.getString("MATERIALS_NAME"));
				dto.setM_AMOUNT(rs.getInt("M_AMOUNT"));
				dto.setP_PRICE(rs.getInt("P_PRICE"));
				dto.setP_DATE(rs.getString("P_DATE"));
				dto.setPRODUCTION_EID(rs.getString("PRODUCTION_EID"));

				list.add(dto);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return list;
	}

	public ArrayList<InventoryReceiptsDTO> InventoryReceiptsList() {
		ArrayList<InventoryReceiptsDTO> list = new ArrayList<InventoryReceiptsDTO>();
		ResultSet rs = null;

		try {
			conn = dbConn();
			String sql = "SELECT * FROM INVENTORY_RECEIPTS";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				InventoryReceiptsDTO dto = new InventoryReceiptsDTO();

				dto.setD_DATE(rs.getString("D_DATE"));
				dto.setP_AMOUNT(rs.getInt("P_AMOUNT"));
				dto.setP_UNIT_PRICE(rs.getInt("P_UNIT_PRICE"));
				dto.setP_PRICE(rs.getInt("P_PRICE"));
				dto.setS_AMOUNT(rs.getInt("S_AMOUNT"));
				dto.setS_UNIT_PRICE(rs.getInt("S_UNIT_PRICE"));
				dto.setS_PRICE(rs.getInt("S_PRICE"));
				dto.setSTOCK_AMOUNT(rs.getInt("STOCK_AMOUNT"));
				dto.setSTOCK_UNIT_PRICE(rs.getInt("STOCK_UNIT_PRICE"));
				dto.setSTOCK_PRICE(rs.getInt("STOCK_PRICE"));
				dto.setDESCRIPTION(rs.getString("DESCRIPTION"));

				list.add(dto);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return list;
	}
}
