package gr.hua.ergasia;

import javax.validation.constraints.NotNull;

public class Customer {
		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAFM() {
		return AFM;
	}
	public void setAFM(int AFM) {
		this.AFM = AFM;
	}
	public String getADT() {
		return ADT;
	}
	public void setADT(String ADT) {
		this.ADT = ADT;
	}
	public String getEMPLOYER() {
		return EMPLOYER;
	}
	public void setEMPLOYER(String EMPLOYER) {
		this.EMPLOYER = EMPLOYER;
	}
	public String getEMPLOYER_ADDRESS() {
		return EMPLOYER_ADDRESS;
	}
	public void setEMPLOYER_ADDRESS(String EMPLOYER_ADDRESS) {
		this.EMPLOYER_ADDRESS = EMPLOYER_ADDRESS;
	}
	public int getWAGE() {
		return WAGE;
	}
	public void setWAGE(int WAGE) {
		this.WAGE = WAGE;
	}
	public int getSALARY() {
		return SALARY;
	}
	public void setSALARY(int SALARY) {
		this.SALARY = SALARY;
	}
	private int id;
	private int AFM;
	private String ADT;
	private String EMPLOYER;
	private String EMPLOYER_ADDRESS;
	private int WAGE;
	private int SALARY;
	

	@Override
	public String toString	() {
		return "Customer [id=" + id + ", AFM=" + AFM + ", ADT=" + ADT +
",EMPLOYER="+ EMPLOYER + ",EMPLOYER_ADDRESS=" + EMPLOYER_ADDRESS +
",WAGE"+ WAGE + ",SALARY"+ SALARY +"]";
	}
	
}
