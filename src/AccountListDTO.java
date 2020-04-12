public class AccountListDTO {
	private String ACCOUNT_BID;
	private String BUSINESS_NAME;
	private String CEO;
	private String ADDRESS;
	private String EMAIL;
	private int PHONE_NUMBER;

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

	public AccountListDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AccountListDTO(String aCCOUNT_BID, String bUSINESS_NAME, String cEO, String aDDRESS, String eMAIL,
			int pHONE_NUMBER) {
		super();
		ACCOUNT_BID = aCCOUNT_BID;
		BUSINESS_NAME = bUSINESS_NAME;
		CEO = cEO;
		ADDRESS = aDDRESS;
		EMAIL = eMAIL;
		PHONE_NUMBER = pHONE_NUMBER;
	}

	@Override
	public String toString() {
		return "AccountListDTO [ACCOUNT_BID=" + ACCOUNT_BID + ", BUSINESS_NAME=" + BUSINESS_NAME + ", CEO=" + CEO
				+ ", ADDRESS=" + ADDRESS + ", EMAIL=" + EMAIL + ", PHONE_NUMBER=" + PHONE_NUMBER + "]";
	}
}
