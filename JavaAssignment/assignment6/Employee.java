package assignment6;

public class Employee {
	
	private  String employeeName;
	private  int employeeID;
	
	public Employee(String employeeName,int employeeID ) {
		this.employeeName = employeeName;
		this.employeeID = employeeID;
	}
    	
	
	public void opendDeal(Deal d1) {
		d1.setDealStatus("OPEN");
		
	}
	
	public double arrangeFinance(double budget, String modelName) {
		 double loanAmount = VehicleModel.getVehicleCost(modelName)-budget;
		return loanAmount;

	}
	
	
	
	public void closeDeal(Deal d1) {
		d1.setDealStatus("CLOSED");
	}



	public String getEmployeeName() {
		return employeeName;
	}




    
}
