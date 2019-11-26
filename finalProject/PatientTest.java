package finalProject;
import java.util.*;
public class PatientTest {

	public static void main(String[] args) {
	  	//Scanner Object
		Scanner input = new Scanner(System.in);
		//Date
		Date today = new Date();
		//Welcome the User using a Loop
		//Initialize the variable
		int welcome;
		//Use the "for" loop to welcome the user once
		for (welcome = 0; welcome < 1; welcome++) {
			System.out.println("Welcome to the Hospital! ");
		}
		//Tell the user the day of the week, the date, and the current time
		System.out.print("Today is " + today + "\n");	
		//Ask Question 1
		System.out.println("\n" + "What is your first name?");
		String firstName = input.next();
		//Ask Question 2
		System.out.println("What is your last name?");
		String lastName = input.next();
		//Ask Question 3
		System.out.println("What is your height in inches?");
		Patient.getHeight();
		//Ask Question 4
		System.out.println("What is your weight in pounds?");
		String typedWeight = input.next();
		Patient.getWeight(typedWeight);
		//Ask Question 5 & Associate a number with the blood type
		System.out.println("There are eight blood types: A+, A-, B+, B-, O+, O-, AB+, AB- \n\nEnter in the number assoicated with your blood type: " + "\n (A+ = 1, A- = 2, B+ = 3, B- = 4, O+ = 5, O- = 6, AB+ = 7, AB- = 8");
		int bloodResult = input.nextInt();
		//Say Hello
		System.out.println("Hello " + firstName + " " + lastName + ".");
		System.out.print("Your height is " + Patient.getHeight() + " inches and your weight is " + Patient.getWeight(typedWeight) + " pounds. ");
		System.out.println("Your BMI is " + Patient.getBMI(typedWeight) + ".");
				//Say whether or not you are underweight, normal weight, overweight, or obese
				if (Patient.getBMI(typedWeight) < 18.5) {
					System.out.println("You are underweight.");
				}
				else if (18.49 < Patient.getBMI(typedWeight) && Patient.getBMI(typedWeight) < 25.00) {
					System.out.println("You have a normal weight.");
					}
				else if (Patient.getBMI(typedWeight) > 25.00 && Patient.getBMI(typedWeight) < 30.00) {
					System.out.println("You are overweight.");
					}
				else
					System.out.println("You are obese.");
		//Create an array with all eight of the blood types in it
		//String[] blood = {"A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-"};
		//Maybe subtract those variables depending on which switch case number it is associated with
		//Copy the array in each case instance then create a new array but with one less data point (Depending on the case number
		//Switch
		switch(bloodResult) {
		//A+
		case 1: System.out.println("Your blood type can recieve blood from people with " + " A+, A-, O+, and O-" +" blood.");
		break;
		//A-
		case 2: System.out.println("Your blood type can recieve blood from people with the O- and A- blood.");
		break;
		//B+
		case 3: System.out.println("Your blood type can recieve blood from people with the O-, O+, B+ and B- blood.");
		break;
		//B-
		case 4: System.out.println("Your blood type can recieve blood from people with the O- and B- blood.");
		break;
		//O+
		case 5: System.out.println("Your blood type can recieve blood from people with the O- and O+ blood.");
		break;
		//O-
		case 6: System.out.println("Your blood type can recieve blood from people with the O- blood.");
		break;
		//AB+
		case 7: System.out.println("Your blood type can recieve blood from people with the O-, O+, AB+, AB-, A+, A-, B+ and B- blood.");
		break;
		//AB-
		case 8: System.out.println("Your blood type can recieve blood from people with the O-, AB-, A+ and B- blood.");
		break;
		//Error Message
		default: System.out.println("Error: Invalid Input");
		//Exit Switch
		System.exit(0);
		}
		//Ask a question to use conditional operator
		System.out.println();
		System.out.println("Now that we have some basic information, lets obtain a little more.");
		System.out.println("How old are you?");
		int age = input.nextInt();
		System.out.println("You have entered that your age is " + age + ".");
		String dependent = (age >= 18) ? "independent": "dependent";
		System.out.println("Based on your answer, you are declared a(n) " + dependent + ".");
		//Close scanner inputs
		input.close();
	}
	
	
}