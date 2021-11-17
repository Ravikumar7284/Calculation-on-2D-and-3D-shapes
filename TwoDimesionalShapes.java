package important;

import java.util.Scanner;

public class TwoDimesionalShapes {

	public static void main(String[] args) {
		/*
		 * area of square = side*side perimeter of square = 4 * side area of rectangle =
		 * length * breadth perimeter of rectangle = 2(length + breadth) area of
		 * triangle = 1/2 * base * height perimeter of triangle = a + b + c (side of
		 * triangle) area of circle = pie * radius * radius perimeter of circle = 2 *
		 * pie * radius
		 */

		final double pie = 3.14d;
		int side, length, breadth, height, base, option;
		float radius;
		int i = 1;

		do {
			System.out.println("Calculaton for 2D shapes:");
			System.out.println("Press 1 for Calculaton of Square");
			System.out.println("Press 2 for Calculaton of Rectangle");
			System.out.println("Press 3 for Calculation of Triangle");
			System.out.println("Press 4 for Calculaton of Circle");
			System.out.println("Press 5 for exit");

			Scanner sc = new Scanner(System.in);
			option = sc.nextInt();

			switch (option) {
			case 1:
				System.out.println("Calculation of Square:");
				System.out.println("Enter value for side of Square:");
				side = sc.nextInt();

				int sqrarea = side * side;
				int sqrperm = 4 * side;

				System.out.println("Area of given Square is :" + sqrarea);
				System.out.println("Perimeter of given Square is :" + sqrperm);

				break;

			case 2:
				System.out.println("Calculation of Rectangle:");
				System.out.println("Enter value for length of Rectangle:");
				System.out.println("Enter value for breadth of Rectangle:");
				length = sc.nextInt();
				breadth = sc.nextInt();

				int recarea = length * breadth;
				int recperm = 2 * (length + breadth);

				System.out.println("Area of given Rectangle is :" + recarea);
				System.out.println("Perimeter of given Rectangle is :" + recperm);

				break;

			case 3:
				System.out.println("Calcultion of Triangle:");
				System.out.println("Enter value for sides of Trianlge");
				System.out.println("Enter value for base of Triangle:");
				System.out.println("Enter value for height of Triangle:");
				int side1 = sc.nextInt();
				int side2 = sc.nextInt();
				int side3 = sc.nextInt();
				base = sc.nextInt();
				height = sc.nextInt();

				int triarea = (1 / 2) * base * height;
				int triperm = (side1 + side2 + side3);

				System.out.println("Area of given Triangle is :" + triarea);
				System.out.println("Perimeter of given Triangle is :" + triperm);

				break;

			case 4:
				System.out.println("Calculation of Circle:");
				System.out.println("Enter value for radius of Circle:");
				radius = sc.nextFloat();

				double cirarea = pie * radius * radius;
				double cirperm = 2 * pie * radius;

				System.out.println("Area of given Square is :" + cirarea);
				System.out.println("Perimeter of given Square is :" + cirperm);

				break;

			case 5:
				System.out.println("Exit");
				i = 0;
				break;

			default:
				System.out.println("Enter correct option");
			}
		} while (i > 0);

	}
}
