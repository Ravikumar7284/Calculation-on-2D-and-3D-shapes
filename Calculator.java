package important;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		int counter = 1;
		do {
			System.out.println("Press 1 for Addition");
			System.out.println("Press 2 for Subtraction");
			System.out.println("Press 3 for Multiplication");
			System.out.println("Press 4 for Division");
			System.out.println("Press 5 for Modulus");
			System.out.println("Press 6 for Simple Interest");
			System.out.println("Press 7 for Complex Interest");
			System.out.println("Press 8 for Square");
			System.out.println("Press 9 for Cube");
			System.out.println("Press 0 for Exit");

			int option = reader.nextInt();

			switch (option) {
			case 1:
				System.out.println("Enter Two Numbers:");
				double num1 = reader.nextDouble();
				double num2 = reader.nextDouble();
				double add = num1 + num2;
				System.out.println(num1 + " + " + num2 + " = " + add);
				break;

			case 2:
				System.out.println("Enter Two Numbers:");
				double num3 = reader.nextDouble();
				double num4 = reader.nextDouble();
				double sub = num3 - num4;
				System.out.println(num3 + " - " + num4 + " = " + sub);
				break;

			case 3:
				System.out.println("Enter Two Numbers:");
				double num5 = reader.nextDouble();
				double num6 = reader.nextDouble();
				double mul = num5 * num6;
				System.out.println(num5 + " * " + num6 + " = " + mul);
				break;

			case 4:
				System.out.println("Enter Two Numbers:");
				double num7 = reader.nextDouble();
				double num8 = reader.nextDouble();
				double div = num7 / num8;
				System.out.println(num7 + " / " + num8 + " = " + div);
				break;

			case 5:
				System.out.println("Enter Two Numbers:");
				double num9 = reader.nextDouble();
				double num10 = reader.nextDouble();
				double mod = num9 % num10;
				System.out.println(num9 + " % " + num10 + " = " + mod);
				break;

			case 6:
				System.out.println("Enter Prinicipal Amount");
				double principal = reader.nextDouble();
				System.out.println("Enter Rate per anum");
				double rate = reader.nextDouble();
				System.out.println("Enter Time in years");
				double time = reader.nextDouble();
				double SI = (principal * rate * time) / 100;
				System.out.println("Simple Interest =" + SI);
				break;

			case 7:
				System.out.println("Enter Principal Amount");
				double amount = reader.nextDouble();
				System.out.println("Enter Rate per anum");
				double intrate = reader.nextDouble();
				System.out.println("Enter Time in years");
				double timeyear = reader.nextDouble();
				double numberofcompound = reader.nextDouble();
				double amountafterinterest = amount
						* Math.pow((1 + intrate / numberofcompound), numberofcompound * timeyear);
				double CI = amountafterinterest - amount;
				System.out.println("Compound Interest =" + CI);
				break;

			case 8:
				System.out.println("Enter Any Number");
				double number1 = reader.nextDouble();
				double square = Math.pow(number1, 2);
				System.out.println("Square =" + square);
				break;

			case 9:
				System.out.println("Enter Any Number");
				double number2 = reader.nextDouble();
				double cube = Math.pow(number2, 3);
				System.out.println("Cube = " + cube);
				break;

			case 0:
				counter = 0;
				break;

			default:
				System.out.println("Enter Correct Choice");
			}
		} while (counter > 0);

	}

}
