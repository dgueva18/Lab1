import java.util.Scanner; //scanner
public class assignmentone1 {

	public static void main(String[] args) {
		double windspeed, temp;
		double windchill;
		String output;
		
		System.out.print("Wind Chill Calculator\n");//Title
		Scanner type = new Scanner(System.in); //scanner
		
		System.out.print("Enter the temperature in Fahrenheit (must be >= -45 and <= 40):\n"); //asks user for temp
		 temp = type.nextDouble(); //reads number
		 
			System.out.print("Enter the wind speed (must be >= 5 and <= 60):\n"); //ask user for wind speed
			 windspeed = type.nextDouble(); //reads number
			 
			 windchill=35.74+(.6215*temp)-35.75*(Math. pow(windspeed, .16))+.4275*temp*(Math. pow(windspeed, .16));
			 
			 output = "Wind chill temperature:  " + windchill + " degrees Fahrenheit"; //outputs results
				System.out.println(output);
				
				System.out.print("Programmer: Dwight Guevara\n");
				
		// TODO Auto-generated method stub

	}

}
