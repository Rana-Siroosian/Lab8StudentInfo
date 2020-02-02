import java.util.Scanner;
/**
 * 
 * 
 * @author >>RanaSiroosian<<
 *
 */
public class Lab8Student {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner (System.in);
		
		int studentId=0;
		System.out.print("Welcome to our Java class. ");
		boolean flag=false;
		boolean looping = true;
		boolean flag1 = false;
		String question="";
		boolean loop = false;
		
		do {
			
			System.out.println("Which student would you like to learn more about? (enter a number 1-10): ");
			studentId = scnr.nextInt();
		
			do {
				try {
			
					if (studentId>0 && studentId<11) {
						loop=true;
						System.out.println("Student " + studentId + " is " + studentName(studentId-1) + ". Would you like to know more? (enter \"yes\" or \"no\")");
						scnr.nextLine();
						question = scnr.nextLine();
						break;
					}
					throw new IndexOutOfBoundsException();
				}catch(Exception IndexOutOfBoundsException) {
					
				System.err.println("Please try again! (enter a number 1-10): ");
				studentId=scnr.nextInt();
				}
			}while(!loop);
		
			do {
		
				if (question.equalsIgnoreCase("yes")) {
					
					flag = true;
					System.out.println("What would you like to know about "+ studentName(studentId-1)+"? "
							+ "(enter \"Favorite food\" or \"Favorite country\" or \"Age\")");
					
					question = scnr.nextLine();
					
					do {
						
						try {
							if(question.equalsIgnoreCase("Favorite food")) {
								flag1 = true;
								favoriteFood(studentId-1);
								break;
							}
							if(question.equalsIgnoreCase("favorite country")){
								flag1 = true;
								favoriteCountry(studentId-1);
								break;
							}
							if(question.equalsIgnoreCase("Age")) {
								flag1 = true;
								age(studentId-1);
								break;
							}
							throw new IllegalArgumentException();
						}catch(Exception IllegalArgumentException) {
						
							System.err.println("Please try again! (enter\"Favorite food\" or \"Favorite country\" or \"Age\")");
							question = scnr.nextLine();
						}
					}while(!flag1);
					
					System.out.println(" Would you like to know more? (enter \"yes\" or \"no\")");
					question= scnr.nextLine();
					if(question.equalsIgnoreCase("no")) {
						flag = false;
					} 
				
				}
			}while (flag);
			System.out.println("Would you like to know about another student? "
					+ "(enter \"yes\" or \"no\")");
			question=scnr.nextLine();
			if(question.equalsIgnoreCase("no")) {
				looping = false;
			}
		}while (looping);
		
		System.out.println("Thank you, bye.");
		scnr.close();
	}
	
	public static String studentName(int num) {
		String [] name = {"Rana Siroosian", "John Clone", "Sara Green", "Mary French",
				"Pam Brown", "Sandy Ellen", "James Crowd", "Bill Dobald", "Drake Bryan", "Mike Anderson"};
		
		return name[num];
	}
	
	public static void favoriteFood (int stf) {
		String[] food = {"Sushi", "Pizza", "Spicy Chicken", "Tuna Salad", "Hamburger", "Mac & Cheese",
				"BBQ Chicken", "Smoked Salmon", "Steak","Chicken Sandwich"};
		
		System.out.print(studentName(stf) + "' favorite food is " + food[stf]+".");
	}
	
	public static void favoriteCountry(int stc) {
		String[] country = {"United States", "France", "Russia", "Brazil", "Paris", "Italy","Canada",
				"mexico","Spain","China"};
		System.out.print(studentName(stc) + "' favorite country is " + country[stc] + ".");
	}

	public static void age(int sta) {
		int[] ages = {30 , 32, 28, 24, 31, 29, 36, 30, 37, 33};
		
		System.out.print(studentName(sta) + " is " + ages[sta] + ".");
	}
	
}
	



