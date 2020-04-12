public class ProductionDTO {
	private String PRODUCTION_CODE;
	private String PRODUCT_ID;
	private String PRODUCT_NAME;
	private int P_AMOUNT;
	private String MATERIALS_ID;
	private String MATERIALS_NAME;
	private int M_AMOUNT;
	private int P_PRICE;
	private String P_DATE;
	private String PRODUCTION_EID;

	public String getPRODUCTION_CODE() {
		return PRODUCTION_CODE;
	}

	public void setPRODUCTION_CODE(String pRODUCTION_CODE) {
		PRODUCTION_CODE = pRODUCTION_CODE;
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

	public int getP_AMOUNT() {
		return P_AMOUNT;
	}

	public void setP_AMOUNT(int p_AMOUNT) {
		P_AMOUNT = p_AMOUNT;
	}

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

	public int getM_AMOUNT() {
		return M_AMOUNT;
	}

	public void setM_AMOUNT(int m_AMOUNT) {
		M_AMOUNT = m_AMOUNT;
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

	public String getPRODUCTION_EID() {
		return PRODUCTION_EID;
	}

	public void setPRODUCTION_EID(String pRODUCTION_EID) {
		PRODUCTION_EID = pRODUCTION_EID;
	}

	public ProductionDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductionDTO(String pRODUCTION_CODE, String pRODUCT_ID, String pRODUCT_NAME, int p_AMOUNT,
			String mATERIALS_ID, String mATERIALS_NAME, int m_AMOUNT, int p_PRICE, String p_DATE,
			String pRODUCTION_EID) {
		super();
		PRODUCTION_CODE = pRODUCTION_CODE;
		PRODUCT_ID = pRODUCT_ID;
		PRODUCT_NAME = pRODUCT_NAME;
		P_AMOUNT = p_AMOUNT;
		MATERIALS_ID = mATERIALS_ID;
		MATERIALS_NAME = mATERIALS_NAME;
		M_AMOUNT = m_AMOUNT;
		P_PRICE = p_PRICE;
		P_DATE = p_DATE;
		PRODUCTION_EID = pRODUCTION_EID;
	}

	@Override
	public String toString() {
		return "ProductionDTO [PRODUCTION_CODE=" + PRODUCTION_CODE + ", PRODUCT_ID=" + PRODUCT_ID + ", PRODUCT_NAME="
				+ PRODUCT_NAME + ", P_AMOUNT=" + P_AMOUNT + ", MATERIALS_ID=" + MATERIALS_ID + ", MATERIALS_NAME="
				+ MATERIALS_NAME + ", M_AMOUNT=" + M_AMOUNT + ", P_PRICE=" + P_PRICE + ", P_DATE=" + P_DATE
				+ ", PRODUCTION_EID=" + PRODUCTION_EID + "]";
	}
}
