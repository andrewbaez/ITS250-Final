package finalProject;

public class Blood {
	public static void Confirm(int bloodResult) {
		//Create a variable to associate int "bloodResult" from PatientTest to the correct array element in the array below
		int n = bloodResult - 1;
		String [] bloodType = {"A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-"};
		System.out.println("You have communicated to us that your blood type is " + bloodType[n] + ".");
	}
}
