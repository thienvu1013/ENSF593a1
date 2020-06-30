
/**
 * @author Thien Nguyen
 * Class: Temperature
 * 
 * This class represent a temperature in degree Fahrenheit. 
 * It is able to convert the temperature to degree Celsius and output the result to the console.  
 */
public class Temperature {
	
	private double degrees;
	private double degreesC; //declare an additional variable to store degree Celsius, this will help for future expansion and modification
	
	public Temperature(double t) { //This is the constructor
		this.degrees = t;
	}
	public double getFahrenheit() { //This method returns the temperature in degree F
		 return (degrees);
	}
	public double getCelsius() { //This method convert and return the temperature in degree C
		this.degreesC =(5*(degrees-32)/9);
		return (degreesC);
	}

	public static void main(String[] args) { //Testing
		Temperature thermometer1 = new Temperature(20);
		System.out.printf("The Fahrenheit temperature of thermometer1 is %.2f",thermometer1.getFahrenheit());
		System.out.println(" degrees.");
		System.out.printf("The Celsius temperature of thermometer1 is %.2f",thermometer1.getCelsius());
		System.out.println(" degrees.");
	
		Temperature thermometer2 = new Temperature(98.6);
		System.out.printf("The Fahrenheit temperature of thermometer2 is %.2f",thermometer2.getFahrenheit());
		System.out.println(" degrees.");
		System.out.printf("The Celsius temperature of thermometer2 is %.2f",thermometer2.getCelsius());
		System.out.println(" degrees.");
	}

}
