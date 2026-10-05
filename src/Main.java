import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Hey there Welcome Grade book");
		System.out.println("Enter grades (1-100). Enter -1 to stop");
		
		System.out.println("Enter your grade");
		double number = in.nextDouble();
		
		int total = 0;  
		int count = 0;
		double highest = 0;
		double lowest = 100;
		

		while (number > 0) {
			
			
			System.out.println("Enter your grade");
			number = in.nextDouble();
			count++;
			
			
			if (number > 100){
				
				
			System.out.println("Not valid");
			count--;
		}
		
			
			
			if (number > highest) {
				
				highest = number;
			}
			
			if (number < lowest) {
				
				lowest = number;
			}
			
			

            if  (number < 0  ) {
            	
            	
            count--;
	
			
		}
		
		
		
		}
		
		
		
		
		
		System.out.println("All done");
		System.out.println("Total Grades "+ count);
		System.out.println("Highest Grade "+ highest);
		System.out.println("Lowest Grade "+ lowest);
		

		
		
		
		
		
		
		
		
	}

}
