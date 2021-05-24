import java.time.LocalDateTime;

/*
 * A metric system is proposed to reform the calendar. It will have 10 regular days are a week, 10 weeks a month, 
 * 10 months a year. Extend your JulianDate class to a class MetricDate that has a method for converting from JulianDate 
 * to metric and from metric to JulianDate. How old are both of you on this metric system in years??
 */
public class MetricDate extends JulianDate {
	public static final LocalDateTime TODAY = LocalDateTime.now(); 
	public LocalDateTime metricDate;
	public String metricString;
	public long daysLived;
	public int metricYears;
	public int metricMonths;
	public int metricWeeks;
	public int metricDays;

	public MetricDate(int year, int month, int day, int hours, int minutes, int seconds) {
		super(year, month, day, 12, 0, 0); 	
	}
	
	public MetricDate(int year, int month, int day) {
		super(year, month, day); 	
	}
	
	public MetricDate(int year, int month, int weeks, int day) {
		super(year, month, day);
		metricYears = year; 
		metricMonths = month;
		metricWeeks = weeks;
		metricDays = day;
		metricString = generateMetricString();
	}
	
	public String generateMetricString() {
		return "Years: " + metricYears + " Months: " + metricMonths + " Weeks: " + metricWeeks + " Days: " + metricDays;
	}
		
//		float yNow = (float)(TODAY.getYear()* 365.25)/1000;
//		float mNow = (float)(TODAY.getMonth().getValue()* 12)/100;
//		float dNow = (float)(TODAY.getDayOfMonth()* 7)/10;
		
	public String julianToMetric() {
		metricYears =  (int)       (julianDate/1000);
		metricMonths = (int)     (((julianDate/1000)-metricYears)*10);
		metricWeeks =  (int)   (((((julianDate/1000)-metricYears)*10)-metricMonths)*10);
		metricDays =   (int) (((((((julianDate/1000)-metricYears)*10)-metricMonths)*10)-metricWeeks)*10);
		return generateMetricString();
	}
	
	public double metricToJulian(int day, int week, int month, int year) {
		this.year = 1000*year; 
		this.month = 100*month;
		this.day = (10*week)+day;
		julianDate = this.year + this.month + this.day;
		return julianDate;
	}
	
	public int getMetricYear() {			
		return metricYears;
	}

	public int getMetricMonth() {				
		return metricMonths;
	}
	
	public int getMetricWeeks() {
		return metricWeeks;
	}
	public int getMetricDay() {				
		return metricDays;
	}
}
