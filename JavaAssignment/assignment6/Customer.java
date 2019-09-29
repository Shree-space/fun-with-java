package assignment6;

public class Customer {
	
	private String customerName;


	private String modelName;

	private boolean isFinancing;
	private double LoanAmount;
	


	private double totalVehicleCost;
	private double budget;
	
	public Customer(String customerName, String modelName, String financingOption,double budget) {
		this.customerName = customerName;
		this.modelName = modelName;
		this.budget = budget;
		if (financingOption.equalsIgnoreCase("yes")) {
			this.isFinancing = true;
			
		} else if (financingOption.equalsIgnoreCase("no")) {
			this.isFinancing = false;
		}
		
	}
	
	
	public String getCustomerName() {
		return customerName;
	}

	public String getModelName() {
		return modelName;
	}

	
	public double getBudget() {
		return budget;
	}


	public boolean isFinancing() {
		return isFinancing;
	}


	public double getTotalVehicleCost() {
		return totalVehicleCost;
	}


	public void setTotalVehicleCost(double totalVehicleCost) {
		this.totalVehicleCost = totalVehicleCost;
	}

	
	public void setLoanAmount(double loanAmount) {
		LoanAmount = loanAmount;
	}

	
	
}

