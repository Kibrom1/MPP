package lesson3;

public class USMail extends Package {

	public USMail(String desc, double weight, String zone, String sender) {
		super(desc, weight, zone, sender);
		// TODO Auto-generated constructor stub
	}

	public double cost() {
		if (weight <= 3)
			return 1;
		else
			return 0.55 * weight;
	}

}
