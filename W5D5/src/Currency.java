
	import java.text.NumberFormat;

	public class Currency {
		
		public static void main(String[] args) {
			NumberFormat money = NumberFormat.getCurrencyInstance();
			NumberFormat percent = NumberFormat.getPercentInstance();
			
			double initialValue, total, interestRate;
			
			initialValue = 1000;
			interestRate = .25;
			
			total = initialValue + initialValue*interestRate;
			
			System.out.println(money.format(total));
		}
	}

