package com.db;
public class ProductDTO {
	private String PRODUCT_ID;
	private String PRODUCT_NAME;
	private int AMOUNT;
	private String MATERIALS_ID;

	public String getPRODUCT_ID() {
		return PRODUCT_ID;
	}

	public void setPRODUCT_ID(String pRODUCT_ID) {
		PRODUCT_ID = pRODUCT_ID;
	}

	public String getPRODUCT_NAME() {
		return PRODUCT_NAME;
	}

	public void setPRODUCT_NAME(String pRODUCT_NAME) {
		PRODUCT_NAME = pRODUCT_NAME;
	}

	public int getAMOUNT() {
		return AMOUNT;
	}

	public void setAMOUNT(int aMOUNT) {
		AMOUNT = aMOUNT;
	}

	public String getMATERIALS_ID() {
		return MATERIALS_ID;
	}

	public void setMATERIALS_ID(String mATERIALS_ID) {
		MATERIALS_ID = mATERIALS_ID;
	}

	public ProductDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductDTO(String pRODUCT_ID, String pRODUCT_NAME, int aMOUNT, String mATERIALS_ID) {
		super();
		PRODUCT_ID = pRODUCT_ID;
		PRODUCT_NAME = pRODUCT_NAME;
		AMOUNT = aMOUNT;
		MATERIALS_ID = mATERIALS_ID;
	}

	@Override
	public String toString() {
		return "ProductDTO [PRODUCT_ID=" + PRODUCT_ID + ", PRODUCT_NAME=" + PRODUCT_NAME + ", AMOUNT=" + AMOUNT
				+ ", MATERIALS_ID=" + MATERIALS_ID + "]";
	}
}
