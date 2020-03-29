public class MaterialsDTO {
	private String MATERIALS_ID;
	private String MATERIALS_NAME;
	private int AMOUNT;
	private String PRODUCT_ID;
	private int W_UNIT_PRICE;
	private String W_DATE;
	
	public String getMATERIALS_ID() {
		return MATERIALS_ID;
	}
	
	public void setMATERIALS_ID(String mATERIALS_ID) {
		MATERIALS_ID = mATERIALS_ID;
	}
	
	public String getMATERIALS_NAME() {
		return MATERIALS_NAME;
	}
	
	public void setMATERIALS_NAME(String mATERIALS_NAME) {
		MATERIALS_NAME = mATERIALS_NAME;
	}
	
	public int getAMOUNT() {
		return AMOUNT;
	}
	
	public void setAMOUNT(int aMOUNT) {
		AMOUNT = aMOUNT;
	}
	
	public String getPRODUCT_ID() {
		return PRODUCT_ID;
	}
	
	public void setPRODUCT_ID(String pRODUCT_ID) {
		PRODUCT_ID = pRODUCT_ID;
	}
	
	public int getW_UNIT_PRICE() {
		return W_UNIT_PRICE;
	}
	
	public void setW_UNIT_PRICE(int w_UNIT_PRICE) {
		W_UNIT_PRICE = w_UNIT_PRICE;
	}
	
	public String getW_DATE() {
		return W_DATE;
	}
	
	public void setW_DATE(String w_DATE) {
		W_DATE = w_DATE;
	}
	
	public MaterialsDTO() {
		
	}
	
	public MaterialsDTO(String mATERIALS_ID, String mATERIALS_NAME, int aMOUNT, String pRODUCT_ID, int w_UNIT_PRICE,
			String w_DATE) {
		super();
		MATERIALS_ID = mATERIALS_ID;
		MATERIALS_NAME = mATERIALS_NAME;
		AMOUNT = aMOUNT;
		PRODUCT_ID = pRODUCT_ID;
		W_UNIT_PRICE = w_UNIT_PRICE;
		W_DATE = w_DATE;
	}
	
	@Override
	public String toString() {
		return "MaterialsDTO [MATERIALS_ID=" + MATERIALS_ID + ", MATERIALS_NAME=" + MATERIALS_NAME + ", AMOUNT="
				+ AMOUNT + ", PRODUCT_ID=" + PRODUCT_ID + ", W_UNIT_PRICE=" + W_UNIT_PRICE + ", W_DATE=" + W_DATE + "]";
	}
}
