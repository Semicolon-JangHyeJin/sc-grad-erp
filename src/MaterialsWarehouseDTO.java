public class MaterialsWarehouseDTO {
	private String MATERIALS_ID;
	private String 	MATERIALS_NAME;
	private int AMOUNT;
	private String W_DATE;
	private String MATERIALS_EID;
	
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
	
	public String getW_DATE() {
		return W_DATE;
	}
	
	public void setW_DATE(String w_DATE) {
		W_DATE = w_DATE;
	}
	
	public String getMATERIALS_EID() {
		return MATERIALS_EID;
	}
	
	public void setMATERIALS_EID(String mATERIALS_EID) {
		MATERIALS_EID = mATERIALS_EID;
	}
	
	public MaterialsWarehouseDTO() {
		
	}
	
	public MaterialsWarehouseDTO(String mATERIALS_ID, String mATERIALS_NAME, int aMOUNT, String w_DATE,
			String mATERIALS_EID) {
		super();
		MATERIALS_ID = mATERIALS_ID;
		MATERIALS_NAME = mATERIALS_NAME;
		AMOUNT = aMOUNT;
		W_DATE = w_DATE;
		MATERIALS_EID = mATERIALS_EID;
	}
	
	@Override
	public String toString() {
		return "MaterialsWarehouseDTO [MATERIALS_ID=" + MATERIALS_ID + ", MATERIALS_NAME=" + MATERIALS_NAME
				+ ", AMOUNT=" + AMOUNT + ", W_DATE=" + W_DATE + ", MATERIALS_EID=" + MATERIALS_EID + "]";
	}
}
