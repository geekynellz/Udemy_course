package programming;

import java.util.List;

public class FP01FunctionalExercises {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12,14,12,13,15,3,2,7,9);
		List<String> courses = 
				List.of("Spring", "Spring Boot", "API","Microservices",
						"AWS", "Kubernetes", "Azure", "Docker");
		//printAllCourses(courses);//don't always have to have a method
		//printAllOddNumbersInListFunctional(numbers);
		printCubesOfOddNumbersInListFunctional(numbers);
		
		
		/*courses.stream()
		.filter(course -> course.contains("Spring"))
		.forEach(System.out::println);
		*/
		
		courses.stream()
		//.filter(course -> course.length()>= 4)
		.map(course -> course + " "+ course.length())
		.forEach(System.out::println);

	}

	private static void printAllCourses(List<String> courses) { //number2
		courses.stream()
		.forEach(System.out:: println);
		
		
	}

	/*private static void printAllOddNumbersInListFunctional(List<Integer> numbers) { //number1
		numbers.stream()
		.filter(number -> number % 2 == 1)
		.forEach(System.out::println);
		
		
		
	}
	*/
	private static void printCubesOfOddNumbersInListFunctional(List<Integer> numbers) { 
		numbers.stream()
		.filter(number -> number % 2 == 1)
		.map(number -> number * number * number)
		.forEach(System.out::println);
	
	

}
}
