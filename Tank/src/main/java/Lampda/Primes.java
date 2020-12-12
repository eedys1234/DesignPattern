package Lampda;

import java.util.stream.IntStream;

public class Primes {

	public static boolean isPrimes(int number) {
		return IntStream.rangeClosed(2, (int) Math.sqrt(number))
						.noneMatch((divisor)->number % divisor == 0);
	}
}
