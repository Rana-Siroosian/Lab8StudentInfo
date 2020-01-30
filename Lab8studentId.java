import java.io.IOException;
import java.util.Scanner;
/**
 * 
 * @author >>RanaSiroosian<<
 *
 */
public class Lab8studentId {

	public static void main(String[] args)  {
		
		Scanner scnr = new Scanner (System.in);
		
		int stuId = 0;
		
		System.out.println("Welcome to our Java class. "
				+ "Which student would you like to learn more about? (enter  a number 1-10):  ");
		
		stuId= scnr.nextInt();
		
		String firstName = studentFirstName(stuId);
		String lastName = studentLastName(stuId);
		
		System.out.println("student " +stuId + " is "+ firstName + " " + lastName + ". what would you like to "
				+"know about "+ firstName +
				"? (enter or “Favorite food” or “Age” or “Hometown” or “Hobby”):");
		
		scnr.nextLine();
		String info = scnr.nextLine();
		userChoices(info, stuId);
		
		scnr.close();
	}
	public static void userChoices(String choice, int id) {
		
		Scanner scnr = new Scanner (System.in);
		
		String[] firstName = {"Rana ","Fernanda ", "Jennifer ", "Sarah ", 
				 "Enrique ","Shahin ", "Pete ", "Mina ",
				"Brad "};
		int [] studentAge = {30, 24, 36, 26, 38, 44, 44, 13,64};
		
		String yesOrNo = "";
		boolean valid = true;
		
		while (valid) {
			
			if (choice.equalsIgnoreCase("Favorite food")) 
			
				System.out.print(studentFirstName(id) +"'s favorite food is " + favoriteFood(id)+".");
		
			else if (choice.equalsIgnoreCase("Age")) 
			
				System.out.print(firstName + "is " + studentAge[id-1] +".");
		
			else if (choice.equalsIgnoreCase("Hometown")) 
			
				System.out.print(studentFirstName(id) + "'s hometown is " + studentHomeTown(id) + ".");
		
			else if (choice.equalsIgnoreCase("Hobby")) 
			
				System.out.print(studentFirstName(id) + "'s hobby is " + studentHobby(id) + ".");
		
			else {
				
				System.out.println("That data does not exist. "
						+ "Please try again. (enter or “Favorite food” or “Age” or"
						+ "'s “Hometown” or “Hobby”):");
				
				choice = scnr.nextLine();
				userChoices(choice,id);
				
			}
			try {
			System.out.println(" Would you like to know more? (enter “yes” or “no“): ");
			yesOrNo = scnr.nextLine();
			
			if (yesOrNo.equalsIgnoreCase("yes")) {
				
				System.out.println("What would you like to know about " + studentFirstName(id) + 
						"? (enter or “Favorite food” or “Age” or “Hometown” or “Hobby”):");
				
			choice = scnr.nextLine();
			userChoices(choice,id);
			
		}}catch (Exception e) {
			
		valid = false;
		System.out.println("Thanks!");

		}
		}
//		System.out.println("Thanks!");

		scnr.close();
	}
			
	public static String studentFirstName(int id) {
		
		Scanner scan = new Scanner (System.in);
//		String name="";
//		boolean valid1 = true;
		String[] firstName = {"Rana ","Fernanda ", "Jennifer ", "Sarah ", 
				 "Enrique ","Shahin ", "Pete ", "Mina ",
				"Brad "};
		
		if (id>10 || id <0) {
			System.out.println("doesn't exist. please enter a number between 1-10: ");
//			scan.next();
			id = scan.nextInt();
//			studentFirstName(id);
//			name = firstName[id-1];
		}
		return firstName[id-1];

	}
	
	public static String studentLastName(int id) {
		
		String[] lastName = {"Siroosian","Franco", "Brown", "Green","Iglesias","Bouzari",
				"McGarty","Akbari","Pitt"};
		
		return lastName[id-1];
	}
	
	public static String favoriteFood(int x) {
		
	
		String[] favFood = {"Sushi", "Taco", "Pizza", "Mac&Cheese", "Pasta","Hamburger", "Chicken Alfredo",
				"Steak","BBQ chicken"};
		
		return favFood[x-1];
	}
	

	public static String studentHomeTown(int home) {
		
		String [] homeTown = {"Westland,MI", "Taylor,MI", "Romulus,MI","Dearborn,MI","Westland,MI",
				"Livonia,MI", "Ann Arbor,MI","Plymouth,MI", "Westland,MI"};
		
		return homeTown[home-1];
	}
	
	public static String studentHobby(int hobby) {
		
		String [] stuHobby = {"Drawing", "Traveling", "Writing", "Dancing", "Shopping", "Reading books",
				"Watching NBA games", "Playing video games","Cooking"};
		
		return stuHobby[hobby-1];
	}

}
