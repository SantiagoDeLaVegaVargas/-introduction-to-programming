package main.fis.usta;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int v_number_1;
		int v_number_2;
		int v_operation;

		System.out.println("Calculator");
		Scanner Keyboard = new Scanner(System.in);

		System.out.println("Please enter the first number");
		v_number_1 = Keyboard.nextInt();
		System.out.println("Please enter the second number");
		v_number_2 = Keyboard.nextInt();
		System.out.println("Please type 1 for add, 2 for subtract, 3 for multiply or 4 for divide");
		v_operation = Keyboard.nextInt();

		System.out.println("the result is:" + p_operate_numbers(v_number_1, v_number_2, v_operation));

	}

	public static int p_operate_numbers(int v_number_1, int v_number_2, int v_operation) {

		return switch (v_operation) {
			case 1 -> v_number_1 + v_number_2;
			case 2 -> v_number_1 - v_number_2;
			case 3 -> v_number_1 * v_number_2;
			case 4 -> v_number_1 / v_number_2;
			default -> 0;
		};
	}
}

