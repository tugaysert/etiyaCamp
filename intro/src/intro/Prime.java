package intro;

import java.util.stream.IntStream;

public class Prime {

	public static void main(String[] args) {

		IntStream.rangeClosed(2, 1000)
		.filter(num -> isPrime(num))
		.forEach(num -> System.out.println(num));
		
		printPrimesTwo(1000);
	}

	public static boolean isPrime(int number) {
		return !IntStream.rangeClosed(2, number / 2)
				.anyMatch(i -> number % i == 0);
	}
	
	public static void printPrimesTwo(int number) {
	     for (int num = 2; num <= number; num++) {
	            boolean isPrime = true;

	            for (int j = 2; j <= num / 2; j++) {
	                if(num%j==0) {
	                    isPrime = false;
	                    break;
	                }

	            }
	            if(isPrime) System.out.println(num);

	        }
	}

}
