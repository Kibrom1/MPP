package lesson3;

import java.util.ArrayList;
import java.util.Scanner;

public class CarrierApp {

	public static void getCost() {

		String desc;
		String zone;
		double weight;
		// double cost;
		Package pck; // upsPck, usMailPck, fedexPck;
		ArrayList<Package> packageList;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Descripton of the package");
		desc = sc.nextLine();
		System.out.println("Enter zone");
		zone = sc.nextLine();
		System.out.println("Enter the weight of the package");
		weight = sc.nextDouble();
		pck = new UPS(desc, weight, zone);
		double upsCost = pck.cost();
		pck = new USMail(desc, weight, zone);
		double usMailCost = pck.cost();
		pck = new FedEx(desc, weight, zone);
		double fedexCost = pck.cost();

		if (upsCost > usMailCost && upsCost > fedexCost)
			System.out.println(pck.description + "\t" + upsCost + "\t" + "UPS");
		else if (usMailCost > upsCost && usMailCost > fedexCost)
			System.out.println(pck.description + "\t" + usMailCost + "\t" + "USMail");
		else
			System.out.println(pck.description + "\t" + fedexCost + "\t" + "FedEx");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			while (true) {
				getCost();
				System.out.println("Enter q to finish c to continue");
				String quite = sc.nextLine();
				char ch = quite.charAt(0);
				if (ch == 'q' || ch == 'Q')
					break;
			}

		} catch (

		Exception ex)

		{
			ex.printStackTrace();
		}

	}
}
