package com.fico.loanapp.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fico.loanapp.repository.*;
import com.fico.loanapp.model.*;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class CustomerController {

	/**This class manages the REST API (GET, POST)and calculates FICO score
     * using Logistic regression algorithm.**/
	
	
	
	@Autowired
	CustomerRepository repository;

	BureauData bureauDataObj;
	
	@Autowired
	BureauRepository Brepo;
	
	
	
	
	@GetMapping("/bureau")//for reference
	public List<BureauData> getAllCBureauData() {
		System.out.println("Get all BureauData...");

		List<BureauData> bureau = new ArrayList<>();
		Brepo.findAll().forEach(bureau::add);

		return bureau;
	}

	
	/** This method fetches the corresponding features of the user using "ssn" as a key.
     * The features found with the method are then used in modeling of the dataset.
     * @param ssn .This the only parameter to the method.
     * @return bureau data of the user **/
	@GetMapping("/bureau/sid/{sid}")
	public BureauData findBySid(@PathVariable long sid)
	{
		BureauData b = Brepo.findBysid(sid);
		bureauDataObj = b;
		return b;
	}
	
	
	
	
	/**This method is for the reference of the developer.
     *@param no parameters
     *@return list of all customers**/
	@GetMapping("/customers")
	public List<Customer> getAllCustomers() {
		System.out.println("Get all Customers...");

		List<Customer> customers = new ArrayList<>();
		repository.findAll().forEach(customers::add);

		return customers;
	}

	
	
	
	
	@PostMapping(value = "/customers/create")
	public Customer postCustomer(@RequestBody Customer c) {
		/**setting ssn @ WORKING 3.0.In this method bureauObj and Customer c object are used to evaluate algorithm.
         * Then the features are scaled in order to give the score.The put the score back into the data table.
         * The customer entered data in stored in the database.
         * @param data entered in the application form.
         * @return customer object**/
		
		Customer customer = new Customer(c.getSsn(), c.getLoanprp(), c.getFirstName(), c.getMiddleName(), c.getDesc(),
				c.getLastName(), c.getMaritial(), c.getLoanamt(), c.getLine1(), c.getLine2(), c.getCity(), c.getState(),
				c.getZip(), c.getPhHome(),  c.getPhOff(), c.getPhMob(), c.getEmplen(),  c.getEmail(), c.getEmpName(), c.getAnnual(),
				c.getEmpline1(), c.getEmpline2(), c.getEmpcity(), c.getEmpstate(), c.getEmpzip(), c.getDesig(), c.getAge());
		
		
		
		
		//MODEL
		
		int p_LoanAmount;
		int p_AnnualIncome;
		int p_Delinq;
		int p_EmpLength;
		int p_TotalAcc;
		int p_RevolUtil;
		int p_RevolBal;
		int p_MonthsLastDel;
		int p_MonthsLastRec;
		int p_OpenAcc;
		String purpose;
		
		int x1 = 0;
		int x2 = 0;
		int x3 = 0;
		int x4 = 0;
		int x5 = 0;
		int x6 = 0;
		int x7 = 0;
		int x8 = 0;
		int x9 = 0;
		int x10 = 0;
		int x11 = 0;
		int x12 = 0;
		int x13 = 0;
		int x14 = 0;
		
		p_LoanAmount = c.getLoanamt();
		p_AnnualIncome = c.getAnnual();
		p_Delinq = bureauDataObj.getDelinq();
		p_EmpLength = c.getEmplen();
		p_TotalAcc = bureauDataObj.getTotalacc();
		purpose = c.getLoanprp();
		
		p_RevolUtil = bureauDataObj.getRevolutil();
		p_RevolBal = bureauDataObj.getRevolbal();
		p_MonthsLastDel = bureauDataObj.getLastdelinq();
		p_MonthsLastRec = bureauDataObj.getLastpubrec();
		p_OpenAcc = bureauDataObj.getOpenacc();
		
		double intercept = 1.65798794;
		System.out.println("WORKING RA");
		switch(purpose)
		{
		case "car":
			x1 = 1;
			break;
		
		case "credit_card":
			x2 = 1;
			break;
			
		case "debt_consolidation":
			x3 = 1;
			break;
			
		case "educational":
			x4 = 1;
			break;
			
		case "home_improvement":
			x5 = 1;
			break;
			
		case "house":
			x6 = 1;
			break;
		
		case "major_purchase":
			x7 = 1;
			break;
		
		case "medical":
			x8 = 1;
			break;
			
		case "moving":
			x9 = 1;
			break;
			
		case "other":
			x10 = 1;
			break;
			
		case "renewable_energy":
			x11 = 1;
			break;
			
		case "small_business":
			x12 = 1;
			break;
			
		case "vacation":
			x13 = 1;
			break;
			
		case "wedding":
			x14 = 1;
			break;
		
		
		}
		
		
		
		double z = 	 intercept
					-(0.220118*(p_LoanAmount - 11228.4)/(7418.86) )
				 	+(0.359526*(p_AnnualIncome -  68245.6)/51600.1 )
					-(0.0636717*(p_Delinq - 0.145625)/0.482198)
					+(0.00736944*(p_EmpLength - 5.04723)/3.36382)
					+(0.0435917*(p_TotalAcc - 22.2689)/11.5217)
					+0.157262*x1
					+0.816103*x2
					+0.392622*x3
					-0.494768*x4
					+0.346118*x5
					+0.174268*x6
					+0.307688*x7
					-0.075268*x8
					+0.00259589*x9
					+0.146735*x10
					-0.252731*x11
					-0.67735*x12
					+0.136527*x13
					+0.678571*x14
					-(0.382994*(p_RevolUtil - 0.490956)/2.282016)
					+(0.0742917*(p_RevolBal - 13515.8)/16118.3)
					+(0.0360954*(p_MonthsLastDel - 90.1744)/42.34)
					+(0.0518442*(p_MonthsLastRec - 128.91)/18.9857)
					-(0.110721*(p_OpenAcc - 9.32239)/4.43161);
		
		
		double deno = Math.pow(Math.E, -z);
		
		double tempscore = 1.0/(1.0+deno);
		

		
		int age = customer.getAge();
		int empLen = customer.getEmplen();
		int salary = customer.getAnnual();
		
		
		

		customer.setScore(tempscore);
		
		if(age < 18 || age > 65)
			customer.setScore(0);
		
		if(empLen < 1)
			customer.setScore(0);
		
		if(salary < 10000)
			customer.setScore(0);
		
		
		Customer _customer = repository.save(customer);
		
		
		
		return _customer;
	}
	
	
	/**This is deleted find by age -->>Working 1.0.
     * @param ssn of the customer.
     * @return customer data**/
	@GetMapping(value = "customers/ssn/{ssn}")
	public Customer findBySSN(@PathVariable int ssn) {

		return repository.findByssn(ssn);
	}

	

}
