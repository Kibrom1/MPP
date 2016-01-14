package lesson3;

public abstract class Package {

	protected String description;
	protected double weight;
	protected String zone;

	public Package(String desc, double weight, String zone) {

		this.description = desc;
		this.weight = weight;
		this.zone = zone;
	}

	public abstract double cost();

}
