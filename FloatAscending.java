import java.util.ArrayList;
import java.util.Collections;

public class FloatAscending {
	 public static void main(String args[]){
		   ArrayList<Float> testList = new ArrayList<Float>();
		 

			testList.add(0.5f);
			testList.add(0.2f);
			testList.add(0.9f);
			testList.add(0.1f);
			testList.add(0.1f);
			testList.add(0.1f);
			testList.add(0.54f);
			testList.add(0.71f);
			testList.add(0.71f);
			testList.add(0.71f);
			testList.add(0.92f);
			testList.add(0.12f);
			testList.add(0.65f);
			testList.add(0.34f);
			testList.add(0.62f);
			
		   Collections.sort(testList);

		   for(Float str: testList){
				System.out.println(str);
		   }
	 }
}
