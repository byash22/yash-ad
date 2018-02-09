import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
	
	   public static void main(String args[]) {
		      Date dateToday = new Date( );
		      SimpleDateFormat dateFormat = 
		      new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

		      System.out.println("Current Date: " + dateFormat.format(dateToday));
		   }
	}

