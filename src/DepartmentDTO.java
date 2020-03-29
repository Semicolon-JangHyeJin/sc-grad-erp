public class DepartmentDTO {
	private int D_ID;
	private String D_NAME;
	
	public int getD_ID() {
		return D_ID;
	}
	
	public void setD_ID(int d_ID) {
		D_ID = d_ID;
	}
	
	public String getD_NAME() {
		return D_NAME;
	}
	
	public void setD_NAME(String d_NAME) {
		D_NAME = d_NAME;
	}
	
	public DepartmentDTO() {

	}
	
	public DepartmentDTO(int d_ID, String d_NAME) {
		super();
		D_ID = d_ID;
		D_NAME = d_NAME;
	}
	
	@Override
	public String toString() {
		return "DepartmentDTO [D_ID=" + D_ID + ", D_NAME=" + D_NAME + "]";
	}
}
