package lesson5;

import java.util.Calendar;
import java.util.Date;

public class DateRange {

	private final Calendar startDate;
	private final Calendar endDate;

	public DateRange(Calendar start, Calendar end) {
		this.startDate = start;
		this.endDate = end;
	}

	public boolean isInRange(Date date) {

		Date startD = this.startDate.getInstance().getTime();
		Date endD = this.endDate.getInstance().getTime();
		return ((date.getTime() > startD.getTime()) && (date.getTime() > endD.getTime()));
	}

	public String toString() {

		return this.startDate.getTime() + " - " + this.endDate.getTime();
	}

	public static Date getFirstDayOfMonth(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, 1);
		return cal.getTime();
	}

	public static Date getLatDayOfMonth(Date date) {

		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, Calendar.getInstance().getActualMaximum(Calendar.DAY_OF_MONTH));

		return cal.getTime();

	}
}
