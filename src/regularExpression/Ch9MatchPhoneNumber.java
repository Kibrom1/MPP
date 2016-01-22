package regularExpression;

import javax.swing.JOptionPane;

public class Ch9MatchPhoneNumber {

	private static final String STOP = "0";
	private static final String VALID = "Valid phone number";
	private static final String INVALID = "Not a valid phone number";

	private static final String VALID_PHONE_PATTERN = "\\d{3}-\\d{3}-\\d{4}";

	// "[0-9][0-9][0-9]-[0-9][0-9][0-9]-[0-9][0-9][0-9][0-9]";

	// = "[0-9]{3}-[0-9]{3}-[0-9]{4}";

	// = "\\d{3}-\\d{3}-\\d{4}";

	public static void main(String[] args) {

		String phoneStr, reply;

		while (true) {

			phoneStr = JOptionPane.showInputDialog(null, "Phone#:");

			if (phoneStr.equals(STOP))
				break;

			if (phoneStr.matches(VALID_PHONE_PATTERN)) {
				reply = VALID;

			} else {
				reply = INVALID;
			}

			JOptionPane.showMessageDialog(null, phoneStr + ":\n" + reply);
		}
	}

}
