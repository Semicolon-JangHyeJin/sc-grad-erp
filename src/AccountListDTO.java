public class AccountListDTO {
	private String ACCOUNT_BID;
	private String 	BUSINESS_NAME;
	private String CEO;
	private String ADDRESS;
	private String EMAIL;
	private int PHONE_NUMBER;
	private int FAX;
	private int DEAL_TYPE;
	private String DEAL_ITEM_ID;
	
	public String getACCOUNT_BID() {
		return ACCOUNT_BID;
	}
	
	public void setACCOUNT_BID(String aCCOUNT_BID) {
		ACCOUNT_BID = aCCOUNT_BID;
	}
	
	public String getBUSINESS_NAME() {
		return BUSINESS_NAME;
	}
	
	public void setBUSINESS_NAME(String bUSINESS_NAME) {
		BUSINESS_NAME = bUSINESS_NAME;
	}
	
	public String getCEO() {
		return CEO;
	}
	
	public void setCEO(String cEO) {
		CEO = cEO;
	}
	
	public String getADDRESS() {
		return ADDRESS;
	}
	
	public void setADDRESS(String aDDRESS) {
		ADDRESS = aDDRESS;
	}
	
	public String getEMAIL() {
		return EMAIL;
	}
	
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}
	
	public int getPHONE_NUMBER() {
		return PHONE_NUMBER;
	}
	
	public void setPHONE_NUMBER(int pHONE_NUMBER) {
		PHONE_NUMBER = pHONE_NUMBER;
	}
	
	public int getFAX() {
		return FAX;
	}
	
	public void setFAX(int fAX) {
		FAX = fAX;
	}
	
	public int getDEAL_TYPE() {
		return DEAL_TYPE;
	}
	
	public void setDEAL_TYPE(int dEAL_TYPE) {
		DEAL_TYPE = dEAL_TYPE;
	}
	
	public String getDEAL_ITEM_ID() {
		return DEAL_ITEM_ID;
	}
	
	public void setDEAL_ITEM_ID(String dEAL_ITEM_ID) {
		DEAL_ITEM_ID = dEAL_ITEM_ID;
	}
	
	public AccountListDTO() {
		
	}
	
	public AccountListDTO(String aCCOUNT_BID, String bUSINESS_NAME, String cEO, String aDDRESS, String eMAIL,
			int pHONE_NUMBER, int fAX, int dEAL_TYPE, String dEAL_ITEM_ID) {
		super();
		ACCOUNT_BID = aCCOUNT_BID;
		BUSINESS_NAME = bUSINESS_NAME;
		CEO = cEO;
		ADDRESS = aDDRESS;
		EMAIL = eMAIL;
		PHONE_NUMBER = pHONE_NUMBER;
		FAX = fAX;
		DEAL_TYPE = dEAL_TYPE;
		DEAL_ITEM_ID = dEAL_ITEM_ID;
	}
	
	@Override
	public String toString() {
		return "AccountListDTO [ACCOUNT_BID=" + ACCOUNT_BID + ", BUSINESS_NAME=" + BUSINESS_NAME + ", CEO=" + CEO
				+ ", ADDRESS=" + ADDRESS + ", EMAIL=" + EMAIL + ", PHONE_NUMBER=" + PHONE_NUMBER + ", FAX=" + FAX
				+ ", DEAL_TYPE=" + DEAL_TYPE + ", DEAL_ITEM_ID=" + DEAL_ITEM_ID + "]";
	}
}
