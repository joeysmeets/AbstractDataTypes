import java.time.LocalDateTime;

public class JulianDate {
	private int year;
	private int month;
	private int date;
	private int hrs;
	private int min;
	private int sec;
	private double julianDate;
	private LocalDateTime localDateTime;
	
	public static final LocalDateTime TODAY = LocalDateTime.now();
	
	//private static final LocalDateTime START_Date = LocalDateTime.of(-4712,1,1,12,0,0,0);

	public static void main(String[] args) {		
		JulianDate julianDate1 = new JulianDate(2021, 5, 20, 12, 44, 3);
		System.out.println(julianDate1.getJulianDate(julianDate1));
	}
	
	public JulianDate() {
		
	}
	
	public JulianDate(int year, int month, int date, int hrs) {
		this.year = year;
		this.month = month;
		this.date = date;
		this.hrs = hrs;
		min = 0;
		sec = 0;
		localDateTime = LocalDateTime.of(this.year, this.month, this.date, this.hrs, min, sec);
		julianDate = generateJulianDate( this.year, this.month, this.date, this.hrs, min, sec);
	}
	
	public JulianDate(int year, int month, int date, int hrs, int min) {
		this.year = year;
		this.month = month;
		this.date = date;
		this.hrs = hrs;
		this.min = min;
		sec = 0;
		localDateTime = LocalDateTime.of(this.year, this.month, this.date, this.hrs, this.min, sec);
		julianDate = generateJulianDate( this.year, this.month, this.date, this.hrs, this.min, sec);
	}
//	
	public JulianDate(int year, int month, int date, int hrs, int min, int sec) {
		this.year = year;
		this.month = month;
		this.date = date;
		this.hrs = hrs;
		this.min = min;
		this.sec = sec;
		localDateTime = LocalDateTime.of(this.year, this.month, this.date, this.hrs, this.min, this.sec);
		julianDate = generateJulianDate( this.year, this.month, this.date, this.hrs, this.min, this.sec);
	}
	
	public JulianDate(LocalDateTime date) {
		year = date.getYear();
		month = date.getMonthValue();
		this.date = date.getDayOfMonth();
		hrs = date.getHour();
		min = date.getMinute();
		sec = date.getSecond();
		localDateTime = LocalDateTime.of(year, month, this.date, hrs, min, sec);
		julianDate = generateJulianDate(year, month, this.date, hrs, min, sec);
	}
	
	
	//@parameter date has to be put in as YYYYMMDDHHMMSS
	//max year is 9999
	public JulianDate(String date) {
		year = Integer.parseInt(date.substring(0,3));
		month = Integer.parseInt(date.substring(4,5));
		this.date = Integer.parseInt(date.substring(6,7));
		hrs = Integer.parseInt(date.substring(8,9));
		min = Integer.parseInt(date.substring(10,11));
		sec = Integer.parseInt(date.substring(12,13));
		localDateTime = LocalDateTime.of(year, month, this.date, hrs, min, sec);
		julianDate = generateJulianDate(year, month, this.date, hrs, min, sec);
	}
	
	//Finding Julian date given Julian day number and time of day
	public double generateJulianDate(int year, int month, int date, int hrs, int min, int sec) {
		double JDN = 0;
		JDN = generateJulianDateNumber(year, month, date);
		return julianDate = JDN + (((hrs-12)/24) + (min/1440) + (sec/86400));
	}
	
	//Converting Gregorian calendar date to Julian Day Number
	public double generateJulianDateNumber(int year, int month, int date) {
		return (1461 * (year + 4800 + (month - 14)/12))/4 +(367 * (month -2 -12 * ((month - 14)/12)))/12 - (3 * ((year + 4900 + (month - 14)/12)/100))/4 + date - 32075;
	}
	
	public LocalDateTime generateLocalDateTime() {
		
	}

	public double Tomorrow(JulianDate julianDate) {
		date = julianDate.getDayOfMonth(julianDate) + 1;
	
	//Increment the year when needed
		if(month ==12 && date ==32) {
			year ++;
			month ++;
			date = 1;
		}
	//increments the month when needed
		if(month == 1 && date == 32|| month == 3 && date == 32|| 
			month == 5 && date == 32|| month == 7 &&  date == 32|| 
			month == 8 &&  date == 32||
			month == 10 && julianDate.getDayOfMonth(julianDate) == 32) {
				month ++;
				date = 1;
		}
		if(month == 4 && date == 31|| month == 6 && date == 31|| 
			month== 9 && date == 31|| month == 11 && date == 31) {
				month ++;
				date = 1;
			}
		if(month == 2 && date== 29) {
			month ++;
			date = 1;
		}
		//takes care of leap years
		//the first leap year was 1752 --> https://www.rmg.co.uk/stories/topics/which-years-are-leap-years-can-you-have-leap-seconds
		if(year >= 1752 && year % 4 == 0 && month == 3 && date == 1) {
				month = 2;
				date = 29;
		}
		return this.julianDate = generateJulianDate(year, month, date, hrs, min, sec);
	}
	
	public int getYear(JulianDate julianDate) { 
		return year;
	}
	
	public int getMonth(JulianDate julianDate) {
		return month;
	}
	
	public int getDayOfMonth(JulianDate julianDate) {
		return month;
	}
	
	public int getHour(JulianDate julianDate) {
		return hrs;
	}
	
	public int getMinute(JulianDate julianDate) {
		return min;
	}
	
	public int getSecond(JulianDate julianDate) {
		return sec;
	}
	
	public double getJulianDate(JulianDate julianDate) {
		return this.julianDate;
	}
}

