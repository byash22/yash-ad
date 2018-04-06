package day5;

public class IntSum {
        static int sum;
        public static void main(String[] args) {
                     int data[] = {17, 43, 74, 82, 19, 15, 53, 4, 21, 25, 11};        
                    
                     System.out.println("Sum of the Given Array = " + sum(data, data.length));
                    
        }
        private static int sum(int numbers[], int s) {

                     if(s-1< 0) return sum;
                    
                     sum+=numbers[s-1];
                                                             
                     return sum(numbers, --s);                                 
        }
}

