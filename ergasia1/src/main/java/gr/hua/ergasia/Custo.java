package gr.hua.ergasia;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class Custo {

	private int id;
	private int AFM;
	private String ADT;
	
	
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

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", AFM=" + AFM + ", ADT=" + ADT + "]";
	}

	
}
