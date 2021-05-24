import java.time.LocalDateTime;
import java.util.Scanner;

/*
 * Now make a little program that uses your Julian Date class. The program should ask for a birthday and 
 * figure out how many days old the person is and what weekday they were born on. If today is their birthday, 
 * then write out a special message. If you have lived a number of days that is divisible by 100, print a special 
 * message! Check your program using both of your birthdays. Which of you is the oldest? Is there a Sunday's Child?
 */
public class Birthday extends JulianDate {
	
	public Birthday(int year, int month, int day) {
		super(year, month, day);
	}

	public static final LocalDateTime TODAY = LocalDateTime.now();

	public void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter your birthday.");
		System.out.println( "Write it as YYYYMMDD.");
		
		if(in.hasNext()){
			String birthday = in.nextLine();
			int year = Integer.parseInt(birthday.substring(0, 3));
			int month = Integer.parseInt(birthday.substring(4, 5));
			int day = Integer.parseInt(birthday.substring(6, 7));
			Birthday birthday1 = new Birthday(year, month, day);
			System.out.println("Right now it is " + TODAY.toString());
			if (BirthdayChecker(birthday1) == true) {
				System.out.println("Happy birthday <3");
			} else {
				System.out.println("You have to wait a little longer for your birthday to come.");
			}
			in.close();
		}
	}

	public boolean BirthdayChecker(Birthday birthday) {
		if (TODAY.getMonthValue() == super.getMonth() &&
			TODAY.getDayOfMonth() == super.getDay()) {
			return true;
		} else {
			return false;
		}
	}
	
	public int DaysLived(Birthday birthday) {
		
	}
}
