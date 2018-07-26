package pairProgramming;

import java.util.Scanner;

import funGame.RandomGame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Translate t = new Translate(); System.out.println(t.morseTxt("-..."));
		 * System.out.println(t.sentenceMorse("My name is Melvin")); t.beep(2);
		 */
		// System.out.println(new Calculator().calculate(2, 4, 8, 16));

		Scanner sc = new Scanner(System.in);
		boolean gameOver = false;
		int userInput;
		RandomGame r = new RandomGame();
		int rand = r.generateNumber();
		while (!gameOver) {
			userInput = sc.nextInt(); 
					gameOver = r.guessNumber(userInput, rand);
		}

	}

}
