package com.tdtc.carnumber.web;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import com.tdtc.carnumber.pojo.Customer;
import com.tdtc.carnumber.service.CustomerService;


@Controller
@RequestMapping(value = "/cust")
public class CustomerController {

	private static final Logger logger = LoggerFactory
			.getLogger(CustomerController.class);
	
	@Autowired
	private CustomerService customer;
	
	public void setCustomer(CustomerService customer) {
		this.customer = customer;
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String findAll(Model model) {
		List<Customer> custList = new ArrayList<Customer>();
		
		custList = 	this.customer.getCustomerList();
		model.addAttribute("customers", custList);
		
		for (Customer customer : custList) {
			logger.info(customer.getEmail() + " " + customer.getName());
		}
		//return "custList.jsp";
		return "custList.html";
	}	
	
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String saveCustomerPage(Model model) {
		logger.info("Returning custSave.jsp page");
		model.addAttribute("customer", new Customer());
		return "custSave";
	}
	
	@RequestMapping(value = "/insert.do", method = RequestMethod.POST)
	public String saveCustomerAction(
		@ModelAttribute("customer") @Valid Customer customer,
		BindingResult result, SessionStatus status) {

		if (result.hasErrors()) {
			logger.info("Returning custSave.jsp page");
			return "custSave";
		}
		
		this.customer.insertCustomer(customer);
		
		//clear the command object from the session
		status.setComplete();

		//return form success view
		return "custSaveSuccess";
	}
	
	@RequestMapping(value = "update/{id}", method = RequestMethod.GET)
	public String updateCustomerPage(
			@PathVariable int id,
			Model model) {
		logger.info("getCustomerById- " + Integer.toString(id));
		Customer cust = this.customer.getCustomerById(id);

		model.addAttribute("customer", cust);
		
		logger.info("Returning custUpdate.jsp page");
		return "custUpdate";
	}		
	
	@RequestMapping(value = "update/{id}", method = RequestMethod.POST)
	public String updateCustomerAction(
		@ModelAttribute("customer") @Valid Customer customer,
		BindingResult result) {
		
		logger.info("update.do");
		
		if (result.hasErrors()) {
			logger.info("Returning custUpdate.jsp page");
			return "/update/{id}";
		}
		
		logger.info("Returning custSaveSuccess.jsp page");

		this.customer.updateCustomer(customer);
		
		return "custSaveSuccess";
	}
	
	
	@RequestMapping(value = "/del/{id}", method = RequestMethod.GET)
    public String delCustomer(@PathVariable int id){
		logger.info(Integer.toString(id));
		this.customer.deleteCustomer(id);
		
		logger.info("Returning delSuccess.jsp page");
		
		return "forward:/cust/list";
    }  

}
