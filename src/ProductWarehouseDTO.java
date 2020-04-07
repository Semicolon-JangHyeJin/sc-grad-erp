public class ProductWarehouseDTO {
	private String PRODUCT_ID;
	private String 	PRODUCT_NAME;
	private int AMOUNT;
	private String P_DATE;
	private String PRODUCT_EID;
	
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
	
	public String getP_DATE() {
		return P_DATE;
	}
	
	public void setP_DATE(String p_DATE) {
		P_DATE = p_DATE;
	}
	
	public String getPRODUCT_EID() {
		return PRODUCT_EID;
	}
	
	public void setPRODUCT_EID(String pRODUCT_EID) {
		PRODUCT_EID = pRODUCT_EID;
	}
	
	public ProductWarehouseDTO() {
		
	}
	
	public ProductWarehouseDTO(String pRODUCT_ID, String pRODUCT_NAME, int aMOUNT, String p_DATE, String pRODUCT_EID) {
		super();
		PRODUCT_ID = pRODUCT_ID;
		PRODUCT_NAME = pRODUCT_NAME;
		AMOUNT = aMOUNT;
		P_DATE = p_DATE;
		PRODUCT_EID = pRODUCT_EID;
	}
	
	@Override
	public String toString() {
		return "ProductWarehouseDTO [PRODUCT_ID=" + PRODUCT_ID + ", PRODUCT_NAME=" + PRODUCT_NAME + ", AMOUNT=" + AMOUNT
				+ ", P_DATE=" + P_DATE + ", PRODUCT_EID=" + PRODUCT_EID + "]";
	}
}
