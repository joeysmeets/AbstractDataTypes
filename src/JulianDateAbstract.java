import java.time.LocalDateTime;
import java.time.temporal.JulianFields;

public abstract class JulianDateAbstract {
	
	//Pre lab 1: methods the Julian Date Class should have:
	public abstract int getYear();
	public abstract int getMonth();
	public abstract int getDay();
	public abstract int getHours();
	public abstract int getMinutes();
	public abstract int getSeconds();
	public abstract double getJulianDate();
	public abstract double generateJulianDateNumber(int year, int month, int date, int hrs, int min, int sec);
	public abstract double getTomorrow();
	public abstract double getYesterday();
	public abstract int daysBetween(JulianDate dateOne, JulianDate dateTwo );
	public abstract double generateJulianDate(int year, int month, int date);
	
}

public class JulianDate() extends JulianDateAbstract {
	
	//class & instance variables
	private int year;
	private int month;
	private int day;
	private int hours;
	private int minutes;
	private int seconds;
	private double julianDate;
	private static final LocalDateTime START_DATE = LocalDateTime.of(-4712,1,1,12,0,0,0);
	private JulianFields 
	
	
	//constructors
	public JulianDate(int year, int month, int day, int hours, int minutes, int seconds) {
		this.year = year;
		this.month = month;
		this.day = day;
		this.hours = hours;
		this.hours = minutes;
		this.seconds = seconds;
	
	}
	
	//main method
	public static void main(String[] args) {		
		JulianDate julianDate1 = new JulianDate(2021, 5, 20, 12, 44, 3);
		
		
		
	}
	
	
	//Converting Gregorian calendar date to Julian Date
	public double generateJulianDateNumber(int year, int month, int day) {
				return (1461 * (year + 4800 + (month - 14)/12))/4 +(367 * (month -2 -12 * ((month - 14)/12)))/12 - (3 * ((year + 4900 + (month - 14)/12)/100))/4 + day - 32075;
			}
	
	

	// getters
	public int getYear() {
		
		return year;
	}

	public int getMonth() {
		
		return month;
	}

	public int getDay() {
		
		return day;
	}

	public int getHours() {
		
		return hours;
	}
	
	public int getMinutes() {
	
		return minutes;
	}

	
	public int getSeconds() {
		
		return seconds;
	}

	
	public double getJulianDate() {
		
		return julianDate;
	}



		
		public double getTomorrow(JulianDate julianDate) {
			date = julianDate.getDayOfMonth(julianDate) + 1;
		
		//Increment the year when needed
			if(month ==12 && day ==32) {
				year ++;
				month ++;
				day = 1;
			}
		//increments the month when needed
			if(month == 1 && day == 32|| month == 3 && day == 32|| 
				month == 5 && day == 32|| month == 7 &&  day == 32|| 
				month == 8 &&  day == 32||
				month == 10 && julianDate.getDayOfMonth(julianDate) == 32) {
					month ++;
					day = 1;
			}
			if(month == 4 && day == 31|| month == 6 && day == 31|| 
				month== 9 && day == 31|| month == 11 && day == 31) {
					month ++;
					day = 1;
				}
			if(month == 2 && day== 29) {
				month ++;
				day = 1;
			}
			//takes care of leap years
			//the first leap year was 1752 --> https://www.rmg.co.uk/stories/topics/which-years-are-leap-years-can-you-have-leap-seconds
			if(year >= 1752 && year % 4 == 0 && month == 3 && day == 1) {
					month = 2;
					day = 29;
			}
			return this.julianDate = generateJulianDate(year, month, day, hours, minutes, seconds);
		}

	
		public double getYesterday() {
		
			return 0;
		}
	
		
		public int daysBetween(JulianDate dateOne, JulianDate dateTwo) {
		
			return 0;
		}
	
}
