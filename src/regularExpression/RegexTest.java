package regularExpression;

import java.util.regex.*;

public class RegexTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String pattern = "[^jbtz]*";
		String text = "Now is the time";
		
		Pattern pt = Pattern.compile(pattern);
		Matcher match =pt.matcher(text);
		while(match.find()){
			System.out.print(text.substring(match.start(), match.end()) + "*");
		}

	}

}
