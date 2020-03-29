public class UnitSalePriceDTO {
	private String SALE_CODE;
	private String 	STORE_BID;
	private String PRODUCT_ID;
	private int AMOUNT;
	private int S_UNIT_PRICE;
	
	public String getSALE_CODE() {
		return SALE_CODE;
	}
	
	public void setSALE_CODE(String sALE_CODE) {
		SALE_CODE = sALE_CODE;
	}
	
	public String getSTORE_BID() {
		return STORE_BID;
	}
	
	public void setSTORE_BID(String sTORE_BID) {
		STORE_BID = sTORE_BID;
	}
	
	public String getPRODUCT_ID() {
		return PRODUCT_ID;
	}
	
	public void setPRODUCT_ID(String pRODUCT_ID) {
		PRODUCT_ID = pRODUCT_ID;
	}
	
	public int getAMOUNT() {
		return AMOUNT;
	}
	
	public void setAMOUNT(int aMOUNT) {
		AMOUNT = aMOUNT;
	}
	
	public int getS_UNIT_PRICE() {
		return S_UNIT_PRICE;
	}
	
	public void setS_UNIT_PRICE(int s_UNIT_PRICE) {
		S_UNIT_PRICE = s_UNIT_PRICE;
	}
	
	public UnitSalePriceDTO() {
		
	}
	
	public UnitSalePriceDTO(String sALE_CODE, String sTORE_BID, String pRODUCT_ID, int aMOUNT, int s_UNIT_PRICE) {
		super();
		SALE_CODE = sALE_CODE;
		STORE_BID = sTORE_BID;
		PRODUCT_ID = pRODUCT_ID;
		AMOUNT = aMOUNT;
		S_UNIT_PRICE = s_UNIT_PRICE;
	}
	
	@Override
	public String toString() {
		return "UnitSalePriceDTO [SALE_CODE=" + SALE_CODE + ", STORE_BID=" + STORE_BID + ", PRODUCT_ID=" + PRODUCT_ID
				+ ", AMOUNT=" + AMOUNT + ", S_UNIT_PRICE=" + S_UNIT_PRICE + "]";
	}
}
