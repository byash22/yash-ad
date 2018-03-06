/**
 * Author @ Yash
 * Date Created 06-03-2018
 */

import java.util.Scanner;

public class Add_Sub {

	public static void main(String[] args) {
	Scanner value = new Scanner(System.in);
	
	System.out.println("Enter value 1");
	double value1 = value.nextDouble();
	
	System.out.println("Enter error term");
	double errorTerm1 = value.nextDouble();
	
	System.out.println("Enter value 2");
	double value2 = value.nextDouble();
	
	System.out.println("Enter error term");
	double errorTerm2 = value.nextDouble();
	
	double value_final_add = value1+value2;
	double errorTerm_final_add = errorTerm1 + errorTerm2;
	
	double value_final_sub = value1-value2;
	double errorTerm_final_sub = errorTerm1 + errorTerm2;


while (true) {
	System.out.println("");
	System.out.println("Enter the function you want to perform, \nWrite either add or subtract");
	System.out.println("");
	System.out.println("Write quit to exit calculator");

	String method = value.next();
	if (method.equals("add")) {
	System.out.println("Here's the answer " + value_final_add + " ± " + errorTerm_final_add);
	}
	else if (method.equals("subtract")) {
		System.out.println("Here's the answer " + value_final_sub + " ± " + errorTerm_final_sub);
	}
	else if (method.equals("quit")) {
		System.out.println("Run program again for further calculation");
		break;
	}
	else{
		System.out.println("Write either addition or subtraction");
	}
	}
value.close();
	}
}
