package lesson3;

public abstract class Package {

	protected String description;
	protected double weight;
	protected String zone;
	protected String sender;

	public Package(String desc, double weight, String zone, String sender) {

		this.description = desc;
		this.weight = weight;
		this.zone = zone;
		this.sender = sender;
	}

	public abstract double cost();

}
