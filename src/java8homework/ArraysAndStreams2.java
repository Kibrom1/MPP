package java8homework;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysAndStreams2 {
	
	public static List<String> startsWith(List<String> lst, char c){
		String letter = "" + c;
		List<String> startsWith = lst.stream()
				.filter(name->name.startsWith(letter))
				.map(name->name.toUpperCase())
				.collect(Collectors.toList());
		return startsWith;
	}
	
	public static void main(String[] args) {
		String[] strings = { "Red", "orange", "Yellow", "green", "Blue", "indigo", "Violet" };

		// display original strings
		System.out.printf("Original strings: %s%n", Arrays.asList(strings));

		// strings in uppercase
		System.out.printf("strings in uppercase: %s%n",
				Arrays.stream(strings).map(String::toUpperCase).collect(Collectors.toList()));

		// strings greater than "m" (case insensitive) sorted ascending
		System.out.printf("strings greater than m sorted ascending: %s%n",
				Arrays.stream(strings).filter(s -> s.compareToIgnoreCase("m") > 0).sorted(String.CASE_INSENSITIVE_ORDER)
						.collect(Collectors.toList()));

		// strings greater than "m" (case insensitive) sorted descending
		System.out.printf("strings greater than m sorted descending: %s%n",
				Arrays.stream(strings).filter(s -> s.compareToIgnoreCase("m") > 0)
						.sorted(String.CASE_INSENSITIVE_ORDER.reversed()).collect(Collectors.toList()));
	}
} // end class ArraysAndStreams2