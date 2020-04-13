package com.db;
public class InventoryReceiptsDTO {
	private String D_DATE;
	private int P_AMOUNT;
	private int P_UNIT_PRICE;
	private int P_PRICE;
	private int S_AMOUNT;
	private int S_UNIT_PRICE;
	private int S_PRICE;
	private int STOCK_AMOUNT;
	private int STOCK_UNIT_PRICE;
	private int STOCK_PRICE;
	private String DESCRIPTION;

	public String getD_DATE() {
		return D_DATE;
	}

	public void setD_DATE(String d_DATE) {
		D_DATE = d_DATE;
	}

	public int getP_AMOUNT() {
		return P_AMOUNT;
	}

	public void setP_AMOUNT(int p_AMOUNT) {
		P_AMOUNT = p_AMOUNT;
	}

	public int getP_UNIT_PRICE() {
		return P_UNIT_PRICE;
	}

	public void setP_UNIT_PRICE(int p_UNIT_PRICE) {
		P_UNIT_PRICE = p_UNIT_PRICE;
	}

	public int getP_PRICE() {
		return P_PRICE;
	}

	public void setP_PRICE(int p_PRICE) {
		P_PRICE = p_PRICE;
	}

	public int getS_AMOUNT() {
		return S_AMOUNT;
	}

	public void setS_AMOUNT(int s_AMOUNT) {
		S_AMOUNT = s_AMOUNT;
	}

	public int getS_UNIT_PRICE() {
		return S_UNIT_PRICE;
	}

	public void setS_UNIT_PRICE(int s_UNIT_PRICE) {
		S_UNIT_PRICE = s_UNIT_PRICE;
	}

	public int getS_PRICE() {
		return S_PRICE;
	}

	public void setS_PRICE(int s_PRICE) {
		S_PRICE = s_PRICE;
	}

	public int getSTOCK_AMOUNT() {
		return STOCK_AMOUNT;
	}

	public void setSTOCK_AMOUNT(int sTOCK_AMOUNT) {
		STOCK_AMOUNT = sTOCK_AMOUNT;
	}

	public int getSTOCK_UNIT_PRICE() {
		return STOCK_UNIT_PRICE;
	}

	public void setSTOCK_UNIT_PRICE(int sTOCK_UNIT_PRICE) {
		STOCK_UNIT_PRICE = sTOCK_UNIT_PRICE;
	}

	public int getSTOCK_PRICE() {
		return STOCK_PRICE;
	}

	public void setSTOCK_PRICE(int sTOCK_PRICE) {
		STOCK_PRICE = sTOCK_PRICE;
	}

	public String getDESCRIPTION() {
		return DESCRIPTION;
	}

	public void setDESCRIPTION(String dESCRIPTION) {
		DESCRIPTION = dESCRIPTION;
	}

	public InventoryReceiptsDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InventoryReceiptsDTO(String d_DATE, int p_AMOUNT, int p_UNIT_PRICE, int p_PRICE, int s_AMOUNT,
			int s_UNIT_PRICE, int s_PRICE, int sTOCK_AMOUNT, int sTOCK_UNIT_PRICE, int sTOCK_PRICE,
			String dESCRIPTION) {
		super();
		D_DATE = d_DATE;
		P_AMOUNT = p_AMOUNT;
		P_UNIT_PRICE = p_UNIT_PRICE;
		P_PRICE = p_PRICE;
		S_AMOUNT = s_AMOUNT;
		S_UNIT_PRICE = s_UNIT_PRICE;
		S_PRICE = s_PRICE;
		STOCK_AMOUNT = sTOCK_AMOUNT;
		STOCK_UNIT_PRICE = sTOCK_UNIT_PRICE;
		STOCK_PRICE = sTOCK_PRICE;
		DESCRIPTION = dESCRIPTION;
	}

	@Override
	public String toString() {
		return "InventoryReceiptsDTO [D_DATE=" + D_DATE + ", P_AMOUNT=" + P_AMOUNT + ", P_UNIT_PRICE=" + P_UNIT_PRICE
				+ ", P_PRICE=" + P_PRICE + ", S_AMOUNT=" + S_AMOUNT + ", S_UNIT_PRICE=" + S_UNIT_PRICE + ", S_PRICE="
				+ S_PRICE + ", STOCK_AMOUNT=" + STOCK_AMOUNT + ", STOCK_UNIT_PRICE=" + STOCK_UNIT_PRICE
				+ ", STOCK_PRICE=" + STOCK_PRICE + ", DESCRIPTION=" + DESCRIPTION + "]";
	}
}
