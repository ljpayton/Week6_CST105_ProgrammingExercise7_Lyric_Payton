/** Program: Programming Exercise 7

* File: ProgrammingExercise7.java 
* Summary: This program reads palindromes and primes up to 100,000.

* Author: Lyric Payton

* Date: October 17 , 2018

**/

import java.util.Scanner;

public class ProgrammingExercise7 {

	public static void main(String[] args) {
		System.out.println("Palindrome & Prime");
		printNumber();
	}// main method ends

	public static void printNumber() {
		final int numPerLine = 10;
		int count = 0, number = 2;
		while (number < 100000) {
			// System.out.println("TEST");
			if (isPalindrome(number) && isPrime(number)) {
				count++;
				if (count % numPerLine == 0) {
					System.out.println("\t" + number);
				} else {
					System.out.print("\t" + number);
				}
			}
			number++;
		}

	}

	public static boolean isPrime(int number) {
		for (int divisor = 2; divisor <= number / 2; divisor++) {
			if (number % divisor == 0) {
				return false;
			}
		}
		return true;
	}// end of prime

	public static boolean isPalindrome(int number) {
		int palindrome = number;
		int reverse = 0;

		while (palindrome > 0) {
			int remainder = palindrome % 10;
			reverse = reverse * 10 + remainder;
			palindrome = palindrome / 10;
		}
		if (number == reverse) {
			return true;
		}
		return false;
	}// end palindrom

}