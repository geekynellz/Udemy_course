package programming;

import java.util.List;

public class FP01Structured {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12,14,15,7,8,9,12,5,6);
		//printAllNumbersInListStructured(numbers);
		printAllEvenNumbersInListStructured(numbers);
		
		// TODO Auto-generated method stub

	}
	private static void printAllNumbersInListStructured(List<Integer> numbers) {
		for(int number:numbers) {
			System.out.println(number);
		}
	}

	private static void printAllEvenNumbersInListStructured(List<Integer> numbers) {
		for(int number:numbers) {
			if(number % 2 ==0) {
			System.out.println(number);
		}
		// TODO Auto-generated method stub
		
	}

}
}
