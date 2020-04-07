public class MaterialsUseDTO {
	private String MATERIALS_ID;
	private String MATERIALS_NAME;
	private int USED_AMOUNT;
	private String USED_DATE;
	
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
	
	public int getUSED_AMOUNT() {
		return USED_AMOUNT;
	}
	
	public void setUSED_AMOUNT(int uSED_AMOUNT) {
		USED_AMOUNT = uSED_AMOUNT;
	}
	
	public String getUSED_DATE() {
		return USED_DATE;
	}
	
	public void setUSED_DATE(String uSED_DATE) {
		USED_DATE = uSED_DATE;
	}
	
	public MaterialsUseDTO() {
		
	}
	
	public MaterialsUseDTO(String mATERIALS_ID, String mATERIALS_NAME, int uSED_AMOUNT, String uSED_DATE) {
		super();
		MATERIALS_ID = mATERIALS_ID;
		MATERIALS_NAME = mATERIALS_NAME;
		USED_AMOUNT = uSED_AMOUNT;
		USED_DATE = uSED_DATE;
	}
	
	@Override
	public String toString() {
		return "MaterialsUseDTO [MATERIALS_ID=" + MATERIALS_ID + ", MATERIALS_NAME=" + MATERIALS_NAME + ", USED_AMOUNT="
				+ USED_AMOUNT + ", USED_DATE=" + USED_DATE + "]";
	}	
}
