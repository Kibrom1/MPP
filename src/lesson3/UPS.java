package lesson3;

public class UPS extends Package {
	
	public UPS(String desc, double weight, String zone, String sender) {
		super(desc, weight, zone,sender);
		// TODO Auto-generated constructor stub
	}

	public double cost(){
		
		return 0.45 * weight;
	}

}
