package important;

import java.util.Scanner;

public class ThreeDimensionalShapes {

	public static void main(String[] args) {
		/*
		 * volume of cube = side * side * side lateral surface area(LSA) of cube = 4 *
		 * side * side total surface area(TSA) of cube = 6 * side * side volume of
		 * cuboid = length + width + height LSA of cuboid = 2 * height * (length +
		 * width) TSA of cuboid = 2 * (length * width + width * height + length *
		 * height) volume of sphere = 4/3 * pie * radius * radius * radius surface area
		 * (SA) = 4 * pie * radius * radius volume of hemisphere = 2/3 * pie * radius *
		 * radius * radius volume of cylinder = pie * radius * radius * height curved
		 * surface area (CSA) of cylinder = 2 * pie * radius * height total surface area
		 * (TSA) of cylinder = (2 * pie * radius * height + 2 * pie * radius * radius)
		 * volume of cone = 1/3 * pie * radius * radius * height CSA of cone = pie *
		 * radius * height TSA of cone = pie * radius * (length + height)
		 */

		final double pie = 3.14d;
		int side, length, width, height, option;
		float radius;
		int i = 1;

		do {
			System.out.println("Calculation for 3D shapes");
			System.out.println("Press 1 for Calculation of Cube");
			System.out.println("Press 2 for Calculation of Cuboid");
			System.out.println("Press 3 for Calculation of Sphere");
			System.out.println("Press 4 for Calculation of Hemisphere");
			System.out.println("Press 5 for Calculation of Cylinder");
			System.out.println("Press 6 for Calculation of Cone");
			System.out.println("Press 7 for Exit");

			Scanner Scanner = new Scanner(System.in);
			option = Scanner.nextInt();

			switch (option) {
			case 1:
				System.out.println("Calculation of Cube :");
				System.out.println("Enter value for side of Cube :");
				side = Scanner.nextInt();
				int volcube = side * side * side;
				int lsacube = 4 * side * side;
				int tsacube = 6 * side * side;

				System.out.println("Volume of given Cube : " + volcube);
				System.out.println("Lateral Surface Area(LSA) of Cube :" + lsacube);
				System.out.println("Total Surface Area(TSA) of Cube :" + tsacube);

				break;

			case 2:
				System.out.println("Calculation of Cuboid :");
				System.out.println("Enter value for length of Cuboid :");
				System.out.println("Enter value for width of Cuboid :");
				System.out.println("Enter value for height of Cuboid :");
				length = Scanner.nextInt();
				width = Scanner.nextInt();
				height = Scanner.nextInt();
				int volcuboid = length + width + height;
				int lsacuboid = 2 * height * (length + width);
				int tsacuboid = 2 * (length * width + width * height + length * height);

				System.out.println("Volume of given Cube : " + volcuboid);
				System.out.println("Lateral Surface Area(LSA) of Cube :" + lsacuboid);
				System.out.println("Total Surface Area(TSA) of Cube :" + tsacuboid);

				break;

			case 3:
				System.out.println("Calculation of Sphere :");
				System.out.println("Enter value for radius of Sphere :");
				radius = Scanner.nextFloat();
				double volsphere = 4 / 3 * pie * radius * radius * radius;
				double sasphere = 4 * pie * radius * radius;

				System.out.println("Volume of given Sphere : " + volsphere);
				System.out.println(" Surface Area(SA) of Sphere :" + sasphere);

				break;

			case 4:
				System.out.println("Calculation of Hemisphere :");
				System.out.println("Enter value for radius of Hemisphere :");
				radius = Scanner.nextFloat();
				double volhemisphere = 2 / 3 * pie * radius * radius * radius;

				System.out.println("Volume of given Sphere : " + volhemisphere);

				break;

			case 5:
				System.out.println("Calculation of Cylinder :");
				System.out.println(" Enter value for radius of Cylinder :");
				radius = Scanner.nextFloat();
				System.out.println("Enter value for  height of Cylinder :");
				height = Scanner.nextInt();

				double volcylinder = pie * radius * radius * height;
				double csacylinder = 2 * pie * radius * height;
				double tsacylinder = (2 * pie * radius * height + 2 * pie * radius * radius);

				System.out.println("Volume of given Cylinder :" + volcylinder);
				System.out.println("Curved Surface Area(CSA) of Cylinder :" + csacylinder);
				System.out.println("Total Surface Area(TSA) of Cylinder :" + tsacylinder);

				break;

			case 6:
				System.out.println("Calculation of Cone :");
				System.out.println(" Enter value for radius of Cone :");
				radius = Scanner.nextFloat();
				System.out.println("Enter value for  height of Cone :");
				height = Scanner.nextInt();
				System.out.println("Enter value for  length of Cone :");
				length = Scanner.nextInt();

				double volcone = 1 / 3 * pie * radius * radius * height;
				double csacone = pie * radius * height;
				double tsacone = pie * radius * (length + height);

				System.out.println("Volume of given Cone :" + volcone);
				System.out.println("Curved Surface Area(CSA) of Cone :" + csacone);
				System.out.println("Total Surface Area(TSA) of Cone :" + tsacone);

				break;

			case 7:
				System.out.println("Exit");
				i = 0;
				break;

			default:
				System.out.println("Enter correct choice");

			}

		} while (i > 0);

	}
}
