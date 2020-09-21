package gr.hua.ergasia;

public class Loan_par {
	
	private int APPLY_ID;
	private int C_ID;
	private int LOAN_AMOUNT;
	private String LOAN_TYPE;
	private int YEARS;

	public int getAPPLY_ID() {
		return APPLY_ID;
	}
	public void setAPPLY_ID(int APPLY_ID) {
		this.APPLY_ID = APPLY_ID;
	}
	public int getC_ID() {
		return C_ID;
	}
	public void setC_ID(int C_ID) {
		this.C_ID = C_ID;
	}
	public int getLOAN_AMOUNT() {
		return LOAN_AMOUNT;
	}
	public void setLOAN_AMOUNT(int LOAN_AMOUNT) {
		this.LOAN_AMOUNT = LOAN_AMOUNT;
	}
	public String getLOAN_TYPE() {
		return LOAN_TYPE;
	}
	public void setLOAN_TYPE(String LOAN_TYPE) {
		this.LOAN_TYPE = LOAN_TYPE;
	}
	public int getYEARS() {
		return YEARS;
	}
	public void setYEARS(int YEARS) {
		this.YEARS = YEARS;
	}
	@Override
	public String toString	() {
		return "Customer [APPLY_ID"+APPLY_ID+",C_ID="+C_ID+
				",LOAN_AMOUNT="+LOAN_AMOUNT+",LOAN_TYPE="+ LOAN_TYPE +
				",YEARS="+YEARS+"]";
	}
}
