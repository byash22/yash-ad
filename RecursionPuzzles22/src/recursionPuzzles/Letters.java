package recursionPuzzles;

public class Letters {

	private static String letter (String str, int ndx) {
		if(str.length() <= 0) return "";
		return str + letter(str,ndx--);
	}
	public static void main(String [] args) {
		// Local variables used for testing
		String actualResult;
		String expectedResult;
		
		// Test Number 1
		actualResult = letter("a", 1);	// Test the Base Case
		expectedResult = "a";					// Replace this line with what the actual expected result should be
		if (actualResult == expectedResult)
			System.out.println("Test 1: Pass; Result: " + actualResult);
		else
			System.out.println("Test 1: Fail; Result: " + actualResult + "; Expected: " + expectedResult);

		// Test Number 2
		actualResult = letter("f", 6);	// Test one away from the Base Case
		expectedResult = "abcdef";				// Replace this line with what the actual expected result should be
		if (actualResult == expectedResult)
			System.out.println("Test 2: Pass; Result: " + actualResult);
		else
			System.out.println("Test 2: Fail; Result: " + actualResult + "; Expected: " + expectedResult);

		// Test Number 3
		actualResult = letter("j", 10);	// Test a number of iterations away from the Base Case
		expectedResult = "abcdefghij";			// Replace this line with what the actual expected result should be
		if (actualResult == expectedResult)
			System.out.println("Test 3: Pass; Result: " + actualResult);
		else
			System.out.println("Test 3: Fail; Result: " + actualResult + "; Expected: " + expectedResult);
	}

}
