//In this Class: Create a method so I can create an object and then use the constructor to call that object from this method to the main method in "PatientTest" using "this"
package finalProject;
import java.util.*;
public class Patient {
	
	public static double getHeight() {
		Scanner input = new Scanner(System.in);
		String typedHeight = input.next();
		double height = Integer.parseInt(typedHeight);
		input.close();
		return height;
	}
	public static double getWeight(String typedWeight) {
		double weight = Integer.parseInt(typedWeight);
		return weight;
	}
	public static double getBMI(String typedWeight) {
		//Declare constants (English Units to Metric Units)
		final double METERPERINCH = 0.0254;
		final double POUNDPERKILO = 0.453592;
		//BMI
		//Converting entered information (height and weight) to Metric Units using arithmetical operators, the constant variables and String to Int conversion
		double bmi = (getWeight(typedWeight) * POUNDPERKILO) / ((getHeight() * METERPERINCH) * (getHeight()) * METERPERINCH);
		double bmiRounded = Math.round(bmi);
		return bmiRounded;
	}
}