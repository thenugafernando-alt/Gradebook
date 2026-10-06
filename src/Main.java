import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		int count = 0;
		double highest = 0;
		double lowest = 100;

		Scanner in = new Scanner(System.in);
		System.out.println("Hey there Welcome Grade book");
		System.out.println("Enter grades (1-100). Enter -1 to stop");

		System.out.println("Enter your grade");
		int number = in.nextInt();

		while (number >= 0) {

			count++;

			if (number > 100) {

				System.out.println("Not valid");
				count--;
				System.out.println("Enter your grade");
				number = in.nextInt();

			} else if (number > 0) {

				total += number;
				
				if (number < lowest) {

					lowest = number;
				}

				if (number > highest) {

					highest = number;
				}

				System.out.println("Enter your grade");
				number = in.nextInt();
			}
			
		}

		System.out.println("All done");
		System.out.println("Total Grades " + count);
		System.out.println("Highest Grade " + highest);
		System.out.println("Lowest Grade " + lowest);
		System.out.println("Average  " + total / count);

	}

}
