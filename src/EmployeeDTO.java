public class EmployeeDTO {
	private String EID;
	private String 	E_NAME;
	private int PASSWORD;
	private String D_ID;
	private String POSITION;
	private String PHONE_NUMBER;
	private String P_SALARY_CODE;
	private int SALARY;
	private String JOIN_DATE;
	
	public String getEID() {
		return EID;
	}
	
	public void setEID(String eID) {
		EID = eID;
	}
	
	public String getE_NAME() {
		return E_NAME;
	}
	
	public void setE_NAME(String e_NAME) {
		E_NAME = e_NAME;
	}
	
	public int getPASSWORD() {
		return PASSWORD;
	}
	
	public void setPASSWORD(int pASSWORD) {
		PASSWORD = pASSWORD;
	}
	
	public String getD_ID() {
		return D_ID;
	}
	
	public void setD_ID(String d_ID) {
		D_ID = d_ID;
	}
	
	public String getPOSITION() {
		return POSITION;
	}
	
	public void setPOSITION(String pOSITION) {
		POSITION = pOSITION;
	}
	
	public String getPHONE_NUMBER() {
		return PHONE_NUMBER;
	}
	
	public void setPHONE_NUMBER(String pHONE_NUMBER) {
		PHONE_NUMBER = pHONE_NUMBER;
	}
	
	public String getP_SALARY_CODE() {
		return P_SALARY_CODE;
	}
	
	public void setP_SALARY_CODE(String p_SALARY_CODE) {
		P_SALARY_CODE = p_SALARY_CODE;
	}
	
	public int getSALARY() {
		return SALARY;
	}
	
	public void setSALARY(int sALARY) {
		SALARY = sALARY;
	}
	
	public String getJOIN_DATE() {
		return JOIN_DATE;
	}
	
	public void setJOIN_DATE(String jOIN_DATE) {
		JOIN_DATE = jOIN_DATE;
	}
	
	public EmployeeDTO() {
		
	}
	
	public EmployeeDTO(String eID, String e_NAME, int pASSWORD, String d_ID, String pOSITION, String pHONE_NUMBER,
			String p_SALARY_CODE, int sALARY, String jOIN_DATE) {
		super();
		EID = eID;
		E_NAME = e_NAME;
		PASSWORD = pASSWORD;
		D_ID = d_ID;
		POSITION = pOSITION;
		PHONE_NUMBER = pHONE_NUMBER;
		P_SALARY_CODE = p_SALARY_CODE;
		SALARY = sALARY;
		JOIN_DATE = jOIN_DATE;
	}
	
	@Override
	public String toString() {
		return "EmployeeDTO [EID=" + EID + ", E_NAME=" + E_NAME + ", PASSWORD=" + PASSWORD + ", D_ID=" + D_ID
				+ ", POSITION=" + POSITION + ", PHONE_NUMBER=" + PHONE_NUMBER + ", P_SALARY_CODE=" + P_SALARY_CODE
				+ ", SALARY=" + SALARY + ", JOIN_DATE=" + JOIN_DATE + "]";
	}
}
