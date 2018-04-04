package recursionPuzzles;

public class PowerOf3 {
	public static int powerof3 (int a, int n)
	{
	if (n == 0) return 1;
	return a * powerof3(a,n-1);              // logic of power of 3 
	}
	 
	public static void main(String [] args) {
	// Local variables used for testing
	int actualResult;
	int expectedResult;
	// Test Number 1
	actualResult = powerof3(0,0); // Test the Base Case
	expectedResult = 1;
	if (actualResult == expectedResult)
	System.out.println("Test 1: Pass; Result: " + actualResult);
	else
	System.out.println("Test 1: Fail; Result: " + actualResult + "; Expected: " + expectedResult);
	 
	// Test Number 2
	actualResult = powerof3(4,3); // Test one away from the Base Case
	expectedResult = 64;
	if (actualResult == expectedResult)
	System.out.println("Test 2: Pass; Result: " + actualResult);
	else
	System.out.println("Test 2: Fail; Result: " + actualResult + "; Expected: " + expectedResult);
	 
	// Test Number 3
	actualResult = powerof3(8,3); // Test a number of iterations away from the Base Case
	expectedResult = 512;
	if (actualResult == expectedResult)
	System.out.println("Test 3: Pass; Result: " + actualResult);
	else
	System.out.println("Test 3: Fail; Result: " + actualResult + "; Expected: " + expectedResult);
	}
}

