package com.pradipta.passwordTester;

import java.util.Arrays;

public class BruteForce {
	public static void main(String[] args) {
		String password = "pass";
		char[] charset = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		char[] numberset = "1234567890".toCharArray();
		BruteForce bf = new BruteForce(charset, 1);

		String attempt = bf.toString();
		while (true) {
			if (attempt.equals(password)) {
				System.out.println("Password Found: " + attempt);
				break;
			}
			attempt = bf.toString();
			System.out.println("" + attempt);
			bf.increment();
		}
	}

	private char[] charecterSet; // Character Set
	private char[] numberSet; // Character Set
	private char[] currentGuess; // Current Guess

	public BruteForce(char[] characterSet, int guessLength) {
		charecterSet = characterSet;
		currentGuess = new char[guessLength];
		Arrays.fill(currentGuess, charecterSet[0]);
	}

	public void increment() {
		int index = currentGuess.length - 1;
		while (index >= 0) {
			if(index >= 3)
			{
				
				
			}
			else
			{
				
			}
			if (currentGuess[index] == charecterSet[charecterSet.length - 1]) {
				if (index == 0) {
					currentGuess = new char[currentGuess.length + 1];
					Arrays.fill(currentGuess, charecterSet[0]);
					break;
				} else {
					currentGuess[index] = charecterSet[0];
					index--;
				}
			} else {
				currentGuess[index] = charecterSet[Arrays.binarySearch(charecterSet, currentGuess[index]) + 1];
				break;
			}
		}
	}

	@Override
	public String toString() {
		return String.valueOf(currentGuess);
	}
}
