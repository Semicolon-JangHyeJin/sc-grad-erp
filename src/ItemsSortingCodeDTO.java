public class ItemsSortingCodeDTO {
	private String SORT_ID;
	private String SORT_NAME;
	private String PRODUCT_ID;
	private String PRODUCT_NAME;
	private String P_FACTORY;
	
	public String getSORT_ID() {
		return SORT_ID;
	}
	
	public void setSORT_ID(String sORT_ID) {
		SORT_ID = sORT_ID;
	}
	
	public String getSORT_NAME() {
		return SORT_NAME;
	}
	
	public void setSORT_NAME(String sORT_NAME) {
		SORT_NAME = sORT_NAME;
	}
	
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
	
	public String getP_FACTORY() {
		return P_FACTORY;
	}
	
	public void setP_FACTORY(String p_FACTORY) {
		P_FACTORY = p_FACTORY;
	}
	
	public ItemsSortingCodeDTO() {
		
	}
	
	public ItemsSortingCodeDTO(String sORT_ID, String sORT_NAME, String pRODUCT_ID, String pRODUCT_NAME,
			String p_FACTORY) {
		super();
		SORT_ID = sORT_ID;
		SORT_NAME = sORT_NAME;
		PRODUCT_ID = pRODUCT_ID;
		PRODUCT_NAME = pRODUCT_NAME;
		P_FACTORY = p_FACTORY;
	}
	
	@Override
	public String toString() {
		return "ItemsSortingCodeDTO [SORT_ID=" + SORT_ID + ", SORT_NAME=" + SORT_NAME + ", PRODUCT_ID=" + PRODUCT_ID
				+ ", PRODUCT_NAME=" + PRODUCT_NAME + ", P_FACTORY=" + P_FACTORY + "]";
	}
}
