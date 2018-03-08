import java.text.DecimalFormat;
import java.util.Scanner;

public class Mpy_Div {

	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		
	while (true) {
		System.out.println("Enter value 1");
		double value1 = value.nextDouble();
		
		System.out.println("Enter error term");
		double errorTerm1 = value.nextDouble();
		
		System.out.println("Enter value 2");
		double value2 = value.nextDouble();
		
		System.out.println("Enter error term");
		double errorTerm2 = value.nextDouble();
		
		DecimalFormat result = new DecimalFormat("####.##");
		
		double errorFraction_V1 = errorTerm1 / Math.abs(value1);
		double errorFraction_V2 = errorTerm2 / Math.abs(value2);
		
		double value_final_mpy = value1*value2;
		double product_errorTerm = (errorFraction_V1 + errorFraction_V2) * Math.abs(value_final_mpy);
		
		double value_final_div = value1/value2;
		double division_errorTerm = (errorFraction_V1 + errorFraction_V2) * Math.abs(value_final_div);		

		
		System.out.println("");
		System.out.println("Enter the function you want to perform, \nWrite either multiply or divide");
		System.out.println("");


		String method = value.next();
		if (method.equals("multiply")) {
		System.out.println("Here's the answer " + result.format(value_final_mpy) + " ± " + result.format(product_errorTerm));
		System.out.println("");
		System.out.println("Write quit to exit calculator");
		System.out.println("OR");
		System.out.println("For Further Calculation:");

		}
	    if (method.equals("divide")) {
			System.out.println("Here's the answer " + result.format(value_final_div) + " ± " + result.format(division_errorTerm));
			System.out.println("");
			System.out.println("Write quit if you want to exit calculator");
			System.out.println("OR");
			System.out.println("For Further Calculation:");
		}
		else if (method.equals("quit")) {
			System.out.println("Run program again for further calculation");
			break;
		}
		else{
			System.out.println("Write either multiply or divide");
		}
		}
	value.close();
		}
	}

