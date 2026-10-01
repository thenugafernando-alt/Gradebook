import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Hey there Welcome Grade book");
		System.out.println("Enter grades (1-100). Enter -1 to stop");
		
		System.out.println("Enter your grade");
		int number = in.nextInt();  

		while (number<100) {
			
			System.out.println("Enter your grade");
			number = in.nextInt(); 
			
		
			if (number > 100){
			
			System.out.println("Not valid");
		}
		
		
		
            else if  (number == -1) {
			
			System.out.println("All done");
			
		}
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
