public class JulianDate extends JulianDateAbstract {
			
			//class & instance variables
			protected int year;
			protected int month;
			protected int day;
			protected int hours;
			protected int minutes;
			protected int seconds;
			protected double julianDate;
			protected double julianDateNumber;
//			private static final LocalDateTime START_DATE = LocalDateTime.of(-4712,1,1,12,0,0,0);
//			private JulianFields;
			
			
			//constructors
			public JulianDate(int year, int month, int day, int hours, int minutes, int seconds) {
				this.year = year;
				this.month = month; 
				this.day = day;
				this.hours = hours;
				this.minutes = minutes;
				this.seconds = seconds;	
				julianDate = generateJulianDate(year, month, day, hours, minutes, seconds);
				julianDateNumber = generateJulianDateNumber(year, month, day);
			}
			
			public JulianDate(int year, int month, int day) {
				this.year = year;
				this.month = month;
				this.day = day; 
				hours = 12;
				minutes = 00;
				seconds = 00;	
				julianDate = generateJulianDate(year, month, day, hours, minutes, seconds);
				julianDateNumber = generateJulianDateNumber(year, month, day);
			}
			
			
			//Converting Gregorian calendar date to Julian Date
			public double generateJulianDateNumber(int year, int month, int day) {
				return julianDateNumber = (1461 * (year + 4800 + (month - 14)/12))/4 +(367 * (month -2 -12 * ((month - 14)/12)))/12 - (3 * ((year + 4900 + (month - 14)/12)/100))/4 + day - 32075;
			}
			
			
			public double generateJulianDate(int year, int month, int day, int hours, int minutes, int seconds) {
				double JDN = 0;
				JDN = generateJulianDateNumber(year, month, day);
				return julianDate = JDN + (((hours-12)/24) + (minutes/1440) + (seconds/86400));
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
			
			public double getJulianDateNumber() {
				return julianDateNumber;
			}
			
			
			public double getTomorrow(JulianDate julianDate) {
				day = julianDate.getDay() + 1;
			
				//Increment the year when needed
				if(month == 12 && day == 32) {
					year ++;
					month = 1;
					day = 1;
				}
				//increments the month when needed
				if(month == 1 && day == 32|| month == 3 && day == 32|| 
					month == 5 && day == 32|| month == 7 &&  day == 32|| 
					month == 8 &&  day == 32||
					month == 10 && day == 32) {
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
				
				if(month == 2 && day == 30) {
					month = 3;
					day = 1;
				}
				return this.julianDate = generateJulianDate(year, month, day, hours, minutes, seconds);
			}
			
			
			public double getYesterday(JulianDate julianDate) {
				day = julianDate.getDay() - 1;
				
				// goes back one month to the last day when needed
				if(month == 1 && day == 0) {
					year --;
					month = 12;
					day = 31;
				}
				//increments the month when needed
				if(month == 2 && day == 0|| month == 4 && day == 0|| 
					month == 6 && day == 0|| month == 8 &&  day == 0|| 
					month == 9 &&  day == 0||
					month == 11 && day == 0) {
						month --;
						day = 31;
				}
				if(month == 5 && day == 0|| month == 7 && day == 0|| 
					month== 10 && day == 0|| month == 12 && day == 0) {
						month --;
						day = 30;
					}
				if(month == 3 && day== 0) {
					month --;
					day = 28;
				}
				//takes care of leap years
				//the first leap year was 1752 --> https://www.rmg.co.uk/stories/topics/which-years-are-leap-years-can-you-have-leap-seconds
				if(year >= 1752 && year % 4 == 0 && month == 2 && day == 28) {
						month = 2;
						day = 29;
				}
				return this.julianDate = generateJulianDate(year, month, day, hours, minutes, seconds);
			}

//			public int daysBetween(JulianDate julianDatNumber, JulianDate julianDateNumber) {
//				return 0;
//			}
		}
