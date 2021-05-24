import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/*
 * Now make a little program that uses your Julian Date class. The program should ask for a birthday and 
 * figure out how many days old the person is and what weekday they were born on. If today is their birthday, 
 * then write out a special message. If you have lived a number of days that is divisible by 100, print a special 
 * message! Check your program using both of your birthdays. Which of you is the oldest? Is there a Sunday's Child?
 */
public class Birthday extends JulianDate {
	public static final LocalDateTime TODAY = LocalDateTime.now();
	public long daysLived = 0;
	public LocalDateTime birthdayLDT;
	
	public Birthday(int year, int month, int day) {
		super(year, month, day);
	}

	public void birthdayMain() {
		Scanner in = new Scanner(System.in);
		String birthdayString = "";
		
		System.out.println("Please enter your birthday.");
		System.out.println("Write it as YYYYMMDD.");
		
		if(in.hasNext()){
			birthdayString = in.nextLine();
		}
		in.close();
		int year = Integer.parseInt(birthdayString.substring(0, 3));
		int month = Integer.parseInt(birthdayString.substring(4, 5));
		int day = Integer.parseInt(birthdayString.substring(6, 7));
		Birthday birthday = new Birthday(year, month, day);
		birthdayLDT = getBirthdayLDT(birthday);
		System.out.println("Right now it is " + TODAY.toString());
		if (BirthdayChecker(birthday) == true) {
			System.out.println("Happy birthday <3");
			System.out.println("Your were born on a " + birthday.getWeekdayString(birthdayLDT));
			System.out.println("You have already lived " + birthday.DaysLived(birthday));
			if (daysLived % 100 == 0) {
				System.out.println("It has been a certain amount of exactly 100 days since you were born");
			}
		} else {
			System.out.println("You have to wait a little longer for your birthday to come");
			System.out.println("Your were born on a " + birthday.getWeekdayString(birthdayLDT));
			System.out.println("You have already lived " + birthday.DaysLived(birthday));
			if (daysLived % 100 == 0) {
				System.out.println("It has been a certain amount of exactly 100 days since you were born");
			}
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
	
	public long DaysLived(Birthday birthday) {
		LocalDateTime dateOfBirth = LocalDateTime.of(super.getYear(), super.getMonth(), super.getDay(), 0, 0);
		daysLived = dateOfBirth.until(TODAY, ChronoUnit.DAYS);
		return daysLived;
	}
	
	public String getWeekdayString (LocalDateTime birthdayLDT) {
		DayOfWeek day = birthdayLDT.getDayOfWeek();
		return day.toString();
	}
	
	public LocalDateTime getBirthdayLDT(Birthday birthday) {
		return LocalDateTime.of(super.getYear(), super.getMonth(), super.getDay(), 0, 0);
	}
}
