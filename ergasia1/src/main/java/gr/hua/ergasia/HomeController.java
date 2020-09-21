package gr.hua.ergasia;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import org.springframework.web.client.HttpClientErrorException;
import gr.hua.ergasia.Customer;
import gr.hua.ergasia.CustomerDAO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
	// Get the CustomerDAO Bean
	CustomerDAO CustomerDAO = ctx.getBean("CustomerDAO", CustomerDAO.class);
	
	
	@RequestMapping("/")
	public String home(Model model) {
		try{
	
	}catch(NullPointerException e){
		
	}
		
		return "home";
	}
	


	
	
	@RequestMapping(value="/result", method = RequestMethod.POST)
	public String result(@ModelAttribute("theid") Integer theid ,Integer theafm ,String theadt, BindingResult result, Model model) {
		try{
			
			if(theadt==null){theadt="a";}
			if(theafm==null){theafm=100000000;}
			
				
			if(CustomerDAO.check(theid,theafm,theadt)==null){return "redirect:/";}
			
		}catch(NullPointerException e){
				
			}
		return "result";
	}
	
	@RequestMapping(value="/result/add", method = RequestMethod.POST)
	public String add(@ModelAttribute("cid") Integer cid,Integer applyid,Integer loanam, String loantype, Integer year, String emp,String empad,Integer wag, Integer sal,BindingResult result, Model model){
		
		model.addAttribute("cw",wag);	
		CustomerDAO.update(applyid,cid,loanam,loantype,year,emp,empad,wag, sal);
		
		return "add";
	}
	
	@RequestMapping(value="/result/add/amount", method = RequestMethod.POST)
	public String add(@ModelAttribute("custowag") Integer custowag,BindingResult result, Model model){
		try{
			System.out.println(CustomerDAO.calc(custowag));
		model.addAttribute("output",CustomerDAO.calc(custowag));
		}catch(NullPointerException e){		
		}
		return "amount";
	}
}

