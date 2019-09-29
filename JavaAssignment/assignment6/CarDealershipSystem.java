package assignment6;

import java.util.Scanner;

public class CarDealershipSystem {

	
	public static void main(String args[]) {
		
		//Create Employee Data
		 Employee emp1 = new Employee("Ram",1);
		 Employee emp2 = new Employee("Sita",2);
		 Employee emp3 = new Employee("Gita",3);
		
		//get Input from Customer
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello, Pease enter your name");
		String customerName = sc.next();
		System.out.println("Please enter the model that you want to buy");
		String modelName = sc.next();
		System.out.println("Please enter YES if you are looking for financing options else enter NO");
		String financingOption = sc.next();
		System.out.println("Please enter the cash in hand");
		double budget  = sc.nextDouble();
		Customer c = new Customer(customerName,modelName,financingOption,budget);
		
		//Check if the Vehicle Model requested by the customer exists & if yes, get Vehicle Cost
		double vehicleCost = VehicleModel.getVehicleCost(modelName);
		
		if (vehicleCost> 0) {
			
			c.setTotalVehicleCost(vehicleCost);
			
			//create a deal & assign to employee
			 Deal d1 = new Deal(emp1,c);
			 		
		    
			//employee handles the deal (open/arrange financing option if applicable)
			emp1.opendDeal(d1);
			if (c.isFinancing()) {
				double loanAmount =  emp1.arrangeFinance(c.getBudget(),c.getModelName());
				c.setLoanAmount(loanAmount);
				d1.setLoanAvailed(loanAmount);
			}
			
					
				
		   // Employee closes the deal
			emp1.closeDeal(d1);
			
			//print the deal info
			System.out.println("Congrats - Deal Successful!");
			System.out.println("Customer Name: " +d1.getCustomerName());
			System.out.println("Vehicle Model Sold: "+d1.getVehicleModel());
			System.out.println("Sale Price: "+d1.getTotalVehicleCost());
			System.out.println("Customer Availing Loan: "+c.isFinancing());
			if (c.isFinancing()) {
				System.out.println("Total Loan Amount: "+ d1.getLoanAvailed());
			}
			System.out.println("Deal Handled by: "+d1.getEmployeeName());
			System.out.println("Current Deal State: "+d1.getDealStatus());
		
			
			
		} else {
			System.out.println("Requested Model not available, good bye");
		}
		
		
	}
		 
	
}

