package assignment6;

public class VehicleModel {
	

	private static double vehicleCost;
	


	public static double getVehicleCost(String modelName) {
		
		switch(modelName) {
		case "Fiesta":
			vehicleCost = 1000000;	
			break;
			
		case "Figo":
			vehicleCost = 700000;
			break;
			
		case "EcoSport":
			vehicleCost = 1200000;
			break;
			
		default:
			vehicleCost = 0;
			
		}
			
		return vehicleCost;
		
	}


	

}
