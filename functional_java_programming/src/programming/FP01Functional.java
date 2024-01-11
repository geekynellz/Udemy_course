package programming;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12,14,12,13,15,3,2,7,9);
		//printAllNumbersInListFunctional(numbers);
		//printAllEvenNumbersInListFunctional(numbers);
		printAllSquaredEvenNumbersInListFunctional(numbers);
		


	}
	//public static void print(int number) {
		//System.out.println(number);
	//}

	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		
		numbers.stream()
		.forEach(System.out::println);//Method Reference
		
		
	}
	
private static void printAllEvenNumbersInListFunctional(List<Integer> numbers) {
		
		numbers.stream()
		.filter(number -> number % 2 == 0)//Lambda Expression
		.forEach(System.out::println);//Method Reference
		
		
	}
private static void printAllSquaredEvenNumbersInListFunctional(List<Integer> numbers) {
	
	numbers.stream()
	.filter(number -> number % 2 == 0)//Lambda Expression
	//mapping- x -> x* x
	.map(number -> number * number)
	.forEach(System.out::println);//Method Reference
	
	
}

	
}
