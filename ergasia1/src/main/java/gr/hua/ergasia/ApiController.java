package gr.hua.ergasia;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RequestBody;


import gr.hua.ergasia.CustomerDAO;
import gr.hua.ergasia.Customer;
import gr.hua.ergasia.Custo;
import gr.hua.ergasia.User;

@Controller
public class ApiController {

	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
	// Get the EmployeeDAO Bean
	CustomerDAO CustomerDAO = ctx.getBean("CustomerDAO", CustomerDAO.class);

	@RequestMapping(value = "/signup/home2", method = RequestMethod.POST, produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED) 
    public @ResponseBody void paramaddUserInJSON(@RequestParam("id") String id,@RequestParam("username")
    											String username,@RequestParam("password") String password)  {
		int z=Integer.parseInt(id);
		User user=new User();
    CustomerDAO.create(z,username,password);
    
    System.out.println("USER saved id = " +z);                
       
	}
	@RequestMapping(value = "/signup", method = RequestMethod.POST, produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED) 
    public @ResponseBody Integer paramcheckJSON(@RequestParam("id") String id)  {
		int z=Integer.parseInt(id);
    if(CustomerDAO.check(z,0,null)==null){z=0;}
    System.out.println("customer exist id = " +z);
	return z;                
       
	}
	@RequestMapping(value = "/sub", method = RequestMethod.POST, produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED) 
    public @ResponseBody void paramaddSubInJSON(@RequestParam("mail") String mail)  {
		
    CustomerDAO.savesub(mail);
    
    System.out.println("SUB saved mail = " +mail);                
       
	}
	@RequestMapping(value = "/account2", method = RequestMethod.POST, produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED) 
    public @ResponseBody String paramcheckuJSON(@RequestParam("username") String username,@RequestParam("password") String password)  {
		String z =null;
    if(CustomerDAO.CheckUser(username,password)!=null){ z=username;}
    System.out.println("customer exist id = " +z);
	return z;                
       
	}
	@RequestMapping(value = "/account/calc2", method = RequestMethod.POST, produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED) 
    public @ResponseBody void paramaddUserInJSON(@RequestParam("cid") String cid,@RequestParam("applyid") String applyid,
    		@RequestParam("loanam")String loanam,@RequestParam("loantype") String loantype,@RequestParam("year") String year, 
    		@RequestParam("emp") String emp, @RequestParam("empad") String empad,@RequestParam("wag")String wag,@RequestParam("sal") String sal) {
		int a=Integer.parseInt(cid);
		int b=Integer.parseInt(applyid);
		int c=Integer.parseInt(loanam);
		int d=Integer.parseInt(year);
		int e=Integer.parseInt(wag);
		int f=Integer.parseInt(sal);
    CustomerDAO.update( a, b, c, loantype,d,emp,empad,e,f);
    
    System.out.println("loan applyed for user with id = " +a);                
       
	}
}
