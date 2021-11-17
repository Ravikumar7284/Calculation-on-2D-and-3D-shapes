package important;

import java.util.Arrays;
import java.util.Scanner;

public class StatisticsFormulas {

	public static void main(String[] args) {
		/*
		 * x is the given items n is the total number of items then mean = sum of all x
		 * / n median = (n + 1 ) / 2 value if n = odd = (n / 2) + (n / 2 + 1) / 2 value
		 * if n = even mode = most frequently occured value
		 * 
		 */

		int option, i = 1;
		do {
			System.out.println("Basic Statistics Calculation:");
			System.out.println("Press 1 for Calculation of Mean");
			System.out.println("Press 2 for Calculation of Median");
			System.out.println("Press 3 for Calculation of Mode");
			System.out.println("Press 4 for Calculation of Standard Deviation");
			System.out.println("Press 5 for Calculation of Variance");
			System.out.println("Press 6 for Calculation of Exit");

			Scanner sc = new Scanner(System.in);
			option = sc.nextInt();

			switch (option) {
			case 1:

				double mean;
				int size1, i1;
				System.out.println("Calculation of Mean of given items");
				System.out.println("Enter the size of items:");
				size1 = sc.nextInt();

				double array1[] = new double[size1];
				double sum = 0;
				double count = 0;
				System.out.println("Enter the values for items:");
				for (i1 = 0; i1 < size1; i1++) {
					array1[i1] = sc.nextDouble();
				}

				for (i1 = 0; i1 < size1 - 1; i1++) {
					sum = Double.sum(array1[i1], array1[i1 + 1]);
					array1[i1 + 1] = sum;
				}

				count = size1;
				System.out.println("Total no. of items :" + count);
				System.out.println("Sum of all items :" + sum);

				mean = sum / count;

				System.out.println("Mean of given items is :" + mean);

				break;

			case 2:
				double median;
				int size2, i2;
				System.out.println("Calculation of Median of given items");
				System.out.println("Enter the size of items:");
				size2 = sc.nextInt();

				double array2[] = new double[size2];
				System.out.println("Enter the values for items:");
				for (i2 = 0; i2 < size2; i2++) {
					array2[i2] = sc.nextDouble();
				}

				Arrays.sort(array2);

				if (size2 % 2 == 0) {
					double midelement = array2[size2 / 2] + array2[size2 / 2 - 1];
					median = midelement / 2;

					System.out.println("Median of given items is:" + median);
				} else {

					median = array2[size2 / 2];

					System.out.println("Median of given items is:" + median);
				}

				break;

			case 3:
				double mode;
				int size3, i3, j3;
				System.out.println("Calculation of Mode of given items");
				System.out.println("Enter the size of items:");
				size3 = sc.nextInt();

				double array3[] = new double[size3];
				System.out.println("Enter the values for items:");
				for (i3 = 0; i3 < size3; i3++) {
					array3[i3] = sc.nextDouble();
				}

				double maxcount = 0;
				mode = 0;

				for (i3 = 0; i3 < size3; i3++) {
					double occured = 0;
					for (j3 = 0; j3 < size3; j3++) {
						if (array3[i3] == array3[j3]) {
							occured++;
						}
					}

					if (occured > maxcount) {
						maxcount = occured;
						mode = array3[i3];
					}

				}

				System.out.println("Mode of given items is :" + mode);

				break;

			case 4:

				System.out.println("Calculation of Standard Deviation of given items:");
				int size4, i4;
				System.out.println("Enter the size of items:");
				size4 = sc.nextInt();

				double array4[] = new double[size4];
				System.out.println("Enter the value of items:");
				for (i4 = 0; i4 < size4; i4++) {
					array4[i4] = sc.nextDouble();
				}

				double sumofitems = 0;

				for (i4 = 0; i4 < size4; i4++) {
					sumofitems = sumofitems + array4[i4];
				}

				mean = sumofitems / size4;

				double sqrdifference = 0;

				for (i4 = 0; i4 < size4; i4++) {
					sqrdifference = sqrdifference + (array4[i4] - mean) * (array4[i4] - mean);
				}

				double variance1 = sqrdifference / size4;

				double standardDeviation = Math.sqrt(variance1);

				System.out.println("Standard Deviation of given items is:" + standardDeviation);

				break;

			case 5:

				System.out.println("Calculation of Variance of given items:");
				int size5, i5;
				System.out.println("Enter the size of items:");
				size5 = sc.nextInt();

				double array5[] = new double[size5];
				System.out.println("Enter the value of items:");
				for (i5 = 0; i5 < size5; i5++) {
					array5[i5] = sc.nextDouble();
				}

				double sumofelements = 0;

				for (i5 = 0; i5 < size5; i5++) {
					sumofelements = sumofelements + array5[i5];
				}

				mean = sumofelements / size5;

				double sqrdiff = 0;

				for (i5 = 0; i5 < size5; i5++) {
					sqrdiff = sqrdiff + (array5[i5] - mean) * (array5[i5] - mean);
				}

				double variance = sqrdiff / size5;

				System.out.println("Variance of given items is:" + variance);

				break;

			case 6:
				System.out.println("Exit");
				i = 0;
				break;

			default:
				System.out.println("Enter Correct Choice");
				break;
			}
		} while (i > 0);
	}
}
