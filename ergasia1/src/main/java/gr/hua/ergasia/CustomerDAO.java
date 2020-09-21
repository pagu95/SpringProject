package gr.hua.ergasia;
import gr.hua.ergasia.Customer;

import java.util.List;
import gr.hua.ergasia.Custo;

public interface CustomerDAO {
	
	public Custo check(int x,int y, String z);
	
	public void update(int a,int b,int c,String d,int e,String f,String g,int h,int i);
	
	public String calc(int x);
	
	public void save(Custo custo);

	public String CheckUser(String x, String y);

	public void savesub(String x);
	
    public void create(int a, String b,String c);
}
