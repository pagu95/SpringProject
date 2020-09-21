package gr.hua.ergasia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
 
import javax.sql.DataSource;

import com.mysql.jdbc.Statement;

import gr.hua.ergasia.Customer;
import gr.hua.ergasia.Custo;
import gr.hua.ergasia.User;

public class CustomerDAOimpl implements CustomerDAO{
	
	 private DataSource dataSource;
	 
	    public void setDataSource(DataSource dataSource) {
	        this.dataSource = dataSource;
	    }
	    public String CheckUser(String username,String password) {
			
			String query = "SELECT ID FROM USER WHERE USERNAME= ? AND CODE=?";
			String un = null;
		    Connection con = null;
		    PreparedStatement ps = null;
		    ResultSet rs = null;
		    try{
		    	con = dataSource.getConnection();
		        ps = con.prepareStatement(query);
		        ps.setString(1, username);
		        ps.setString(2, password);
		        rs = ps.executeQuery();
		        if(rs.next()){
		        	un = username;
		            System.out.println("found him");
		        }else System.out.println("No found "+un);
		    }catch(SQLException e){
		        e.printStackTrace();
		    }finally{
		        try {
		            ps.close();
		            con.close();
		        } catch (SQLException e) {
		            e.printStackTrace();
		        }
		    }
		    return un;
		}
	    
	    public void savesub(String mail) {
		    String query = "INSERT INTO SUBS  (EMAIL) values (?)";
		    Connection con = null;
		    PreparedStatement ps = null;
		    try{
		        con = dataSource.getConnection();
		        ps = con.prepareStatement(query);
		        ps.setString(1,mail);
		        int out = ps.executeUpdate();
		        if(out !=0){
		            System.out.println("added to newsletter"+mail);
		        }else System.out.println("FAIL TO ADD"+mail);
		    }catch(SQLException e){
		        e.printStackTrace();
		    }finally{
		        try {
		            ps.close();
		            con.close();
		        } catch (SQLException e) {
		            e.printStackTrace();
		        }
		    }
		}
public  Custo check(int theid,int theafm,String theadt) {
	
	String query = "SELECT ID FROM CUSTOMERS WHERE ID= ? OR AFM=? OR ADT=?";
	Custo custo = null;
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    try{
    	con = dataSource.getConnection();
        ps = con.prepareStatement(query);
        ps.setInt(1, theid);
        ps.setInt(2, theafm);
        ps.setString(3, theadt);
        rs = ps.executeQuery();
        if(rs.next()){
        	custo = new Custo();
        	custo.setId(theid);
        	custo.setADT(theadt);
        	custo.setAFM(theafm);
            System.out.println("found him");
        }else System.out.println("No found with id"+theid);
    }catch(SQLException e){
        e.printStackTrace();
    }finally{
        try {
            ps.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return custo;
}


public void update(int applyid, int cid, int loanam, String loantype, int year, String emp,String empad,int wag, int sal) {
    String query = "UPDATE CUSTOMERS SET EMPLOYER=?, EMPLOYER_ADDRESS=? , WAGE=?, SALARY=? WHERE ID=?";
    Connection con = null;
    PreparedStatement ps = null;
    Customer customer = null;
    try{
    	
        con = dataSource.getConnection();
        ps = con.prepareStatement(query);
        ps.setString(1, emp);
        ps.setString(2, empad);
        ps.setInt(3, wag);
        ps.setInt(4, sal);
        ps.setInt(5,cid);
        int out = ps.executeUpdate();
        if(out !=0){
            System.out.println("Employee updated ");
        }else System.out.println("Nop");
    }catch(SQLException e){
        e.printStackTrace();
    }finally{
        try {
            ps.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
        
        query = "INSERT INTO LOAN_PAR VALUES (?,?,?,?,?)";
        con = null;
        ps = null;
        try{
            con = dataSource.getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1, applyid);
            ps.setInt(2, cid);
            ps.setInt(3,loanam);
            ps.setString(4, loantype);
            ps.setInt(5, year);
            
            int out = ps.executeUpdate();
            if(out !=0){
                System.out.println("inserted");
            }else System.out.println("wtf2");
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            try {
                ps.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
    }
}


@Override
public String calc(int custowag) {
	String amount = null;
	if (custowag < 600){
		
		amount= "YOU ARE TOO POOR TO GET A LOAN YOU ÖÁÃÊÏÔÔ xD";
		
	}else if(custowag <=1500){
		
		amount= "THE MAXIMUM AMOUNT OF LOAN THAT YOU ARE ENTITLED IS 30.000 EUROS";
	
	}else if(custowag <=3000){
		
		amount= "THE MAXIMUM AMOUNT OF LOAN THAT YOU ARE ENTITLED IS 60.000 EUROS";
		
	}else if(custowag <=10000){
		
		amount= "THE MAXIMUM AMOUNT OF LOAN THAT YOU ARE ENTITLED IS 200.000 EUROS";
		
	}else{
		
		amount= "THE MAXIMUM AMOUNT OF LOAN THAT YOU ARE ENTITLED IS 1.000.000 EUROS";
		
	}
	return amount;
}

	public void save(Custo custo) {
	    String query = "INSERT INTO CUSTOMERS  (ID,AFM,ADT) values (?,?,?)";
	    Connection con = null;
	    PreparedStatement ps = null;
	    try{
	        con = dataSource.getConnection();
	        ps = con.prepareStatement(query);
	        ps.setInt(1, custo.getId());
	        ps.setString(2, custo.getADT());
	        ps.setInt(3, custo.getAFM());
	        int out = ps.executeUpdate();
	        if(out !=0){
	            System.out.println("Employee saved with id="+custo.getId());
	        }else System.out.println("Employee save failed with id="+custo.getId());
	    }catch(SQLException e){
	        e.printStackTrace();
	    }finally{
	        try {
	            ps.close();
	            con.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	} 
	public void create(int a, String b,String c) {
        String query = "INSERT INTO USER (ID,USERNAME,CODE) values (?,?,?)";
        Connection con = null;
        PreparedStatement ps = null;
        try{
            con = dataSource.getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1,a);
            ps.setString(2, b);
            ps.setString(3,c);
            int out = ps.executeUpdate();
            if(out !=0){
            	
                    if (out!=0){
                    	
                    	 System.out.println("signed up with id="+ a);
                    }
                    else {
                        throw new SQLException("Creating user failed, no ID obtained.");
                    }
               
                
            }else System.out.println("User save failed with id="+a);
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            try {
                ps.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
