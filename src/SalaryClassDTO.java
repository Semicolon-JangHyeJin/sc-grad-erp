public class SalaryClassDTO {
	private String P_SALARY_CODE;
	private int SALARY;
	
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
	
	public SalaryClassDTO() {
		
	}
	
	public SalaryClassDTO(String p_SALARY_CODE, int sALARY) {
		super();
		P_SALARY_CODE = p_SALARY_CODE;
		SALARY = sALARY;
	}
	
	@Override
	public String toString() {
		return "SalaryClassDTO [P_SALARY_CODE=" + P_SALARY_CODE + ", SALARY=" + SALARY + "]";
	}
}
