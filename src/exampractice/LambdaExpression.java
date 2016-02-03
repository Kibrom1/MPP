package exampractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import functionalProgrammingEx.TriFunction;

public class LambdaExpression {

	public List<String> listStartsWith(List<String> lst, char c) {
		List<String> startsWith = new ArrayList<String>();
		String start = "" + c;
		lst.stream().filter(e -> e.startsWith(start)).map(e -> e.toUpperCase()).collect(Collectors.toList());

		return startsWith;

	}

	public static void prints(String str) {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 3, 5, 6, 7, 8 };

		// System.out.println(Arrays.asList(arr).stream());

		Consumer<String> consumer = st -> System.out.println(st);
		BiFunction<Integer, Integer, Double> ff = (x, y) -> Math.pow(x, y);
		System.out.println(ff.apply(2, 3));

	}

}
