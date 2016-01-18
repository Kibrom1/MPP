package extralibrarysystem;

import java.util.Date;

public class Loan {

	private Date checkOutDate;
	private Date returnDate;
	private ItemCopy itemCopy;
	// private

	public Loan(Date checkOut, Date returnDate, ItemCopy copy) {

		this.checkOutDate = checkOut;
		this.returnDate = returnDate;
		this.itemCopy = copy;

	}

	public ItemCopy getItemCopy() {

		return itemCopy;
	}
}
