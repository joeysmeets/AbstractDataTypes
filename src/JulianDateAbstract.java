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
	public abstract double generateJulianDate(int year, int month, int date, int hours, int minutes, int seconds);
	public abstract double generateJulianDateNumber(int year, int month, int date);
	public abstract double getTomorrow(JulianDate julianDate);
	public abstract double getYesterday(JulianDate julianDate);
	public abstract int daysBetween(JulianDate dateOne, JulianDate dateTwo);
}
