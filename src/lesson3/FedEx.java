package lesson3;

public class FedEx extends Package {

	public FedEx(String desc, double weight, String zone) {
		super(desc, weight, zone);
		// TODO Auto-generated constructor stub
	}

	public double cost() {
		zone = zone.toLowerCase();
		if (zone.equals("IA") || zone.equals("MT") || zone.equals("OR") || zone.equals("CA"))
			return 0.35 * weight;
		else if (zone.equals("TX") || zone.equals("UT"))
			return 0.3 * weight;
		else if (zone.equals("FL") || zone.equals("MA") || zone.equals("OH"))
			return 0.55 * weight;
		else
			return 0.43 * weight;
	}

}
