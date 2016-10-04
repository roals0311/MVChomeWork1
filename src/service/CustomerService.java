package service;

import java.util.HashMap;
import java.util.Map;

import model.Customer;

public class CustomerService {
	 
	private Map<String, Customer> customers;
	
	private static final CustomerService instance = new CustomerService();

	private CustomerService() {
	
		customers = new HashMap<String, Customer>();
		
		
	}
	
	public static CustomerService getInstance(){
		return instance;
	}
	
	
	public void addCustomer(Customer customer){
		
		customers.put(customer.getId(), customer);
	}

	public Customer findCustomer(String id) {
		
		if(id != null)
			return(customers.get(id.toLowerCase()));
		else
			return null;
		
	}
	
	public Customer login(String id, String password){


	
		if(id != null || password != null)
			
		return (customers.get(id.toLowerCase()));
		
		else
			return null;
		
		
		
	//if(id != null && id.equals(id) && password != null && password.equals(password))
	//	return customers.get(instance);
	//else
	//	return null;
	//�ʿ� �����ϴ���, �α信 �����ϴ��� 
		
		}
		
	}
	

