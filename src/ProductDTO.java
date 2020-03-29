public class ProductDTO {
	private String PRODUCT_ID;
	private String PRODUCT_NAME;
	private int AMOUNT;
	private int P_PRICE;
	private String P_DATE;
	
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
	
	public int getP_PRICE() {
		return P_PRICE;
	}
	
	public void setP_PRICE(int p_PRICE) {
		P_PRICE = p_PRICE;
	}
	
	public String getP_DATE() {
		return P_DATE;
	}
	
	public void setP_DATE(String p_DATE) {
		P_DATE = p_DATE;
	}
		
	public ProductDTO() {
		
	}
	
	public ProductDTO(String pRODUCT_ID, String pRODUCT_NAME, int aMOUNT, int p_PRICE, String p_DATE) {
		super();
		PRODUCT_ID = pRODUCT_ID;
		PRODUCT_NAME = pRODUCT_NAME;
		AMOUNT = aMOUNT;
		P_PRICE = p_PRICE;
		P_DATE = p_DATE;
	}
	
	@Override
	public String toString() {
		return "ProductDTO [PRODUCT_ID=" + PRODUCT_ID + ", PRODUCT_NAME=" + PRODUCT_NAME + ", AMOUNT=" + AMOUNT
				+ ", P_PRICE=" + P_PRICE + ", P_DATE=" + P_DATE + "]";
	}
}
