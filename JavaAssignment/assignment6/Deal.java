package assignment6;

public class Deal {
	
	private String employeeName;
	private String customerName;
	private String dealStatus;
	private String vehicleModel;
	private boolean financingOption;
	private double totalVehicleCost;
	private double loanAvailed;
	
	public Deal(Employee emp,Customer c) {
		this.employeeName =emp.getEmployeeName();
		this.customerName = c.getCustomerName();
		this.dealStatus = "NEW";
		this.vehicleModel = c.getModelName();
		this.financingOption = c.isFinancing();
		this.totalVehicleCost = c.getTotalVehicleCost();
		
	}
	public String getEmployeeName() {
		return employeeName;
	}

	public String getCustomerName() {
		return customerName;
	}
	
	public void setDealStatus(String dealStatus) {
		this.dealStatus = dealStatus;
	}
	
	public String getDealStatus() {
		return dealStatus;
	}
	
	public String getVehicleModel() {
		return vehicleModel;
	}

	public boolean isFinancingOption() {
		return financingOption;
	}
	
	public double getTotalVehicleCost() {
		return totalVehicleCost;
	}
	
	public double getLoanAvailed() {
		return loanAvailed;
	}
	public void setLoanAvailed(double loanAvailed) {
		this.loanAvailed = loanAvailed;
	}
	
	
	
	
	
	

}
