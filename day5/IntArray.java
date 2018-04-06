package day5;

public class IntArray {
    static int min;
    
    private static int minarr(int num[], int a) {
        
        if(a-1<=0) return min;
       
        if (num[a-1] < min)  
                      min = num[a-1];  

return minarr(num, --a);
                     
}
    
    public static void main(String[] args) {
                 int data[] = {17, 43, 74, 82, 19, 15, 53, 0, 21, 25, 11};  
                
                
                 System.out.println("Smallest number in array is: = " + minarr(data, data.length));
                
    }


}