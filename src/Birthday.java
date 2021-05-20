import java.time.LocalDateTime;

/*
 * Now make a little program that uses your Julian Date class. The program should ask for a birthday and 
 * figure out how many days old the person is and what weekday they were born on. If today is their birthday, 
 * then write out a special message. If you have lived a number of days that is divisible by 100, print a special 
 * message! Check your program using both of your birthdays. Which of you is the oldest? Is there a Sunday's Child?
 */
public class Birthday extends JulianDate {
	public static final LocalDateTime TODAY = LocalDateTime.now();

	public static void main(String[] args) {
		System.out.println(TODAY.toString());
	}

	
}
