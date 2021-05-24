import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class JulianDateTest {

	//Test Getters
	@Test
	public void test1() {	
		JulianDate j = new JulianDate(1997, 7, 13, 14, 50, 30);
		int outputYear = j.getYear();
		assertEquals(1997, outputYear);
	}
	
	@Test
	public void test2() {
		JulianDate j = new JulianDate(1997, 7, 13, 14, 50, 30);
		int outputMonth = j.getMonth();
		assertEquals(7, outputMonth);
	}
	@Test
	public void test3() {	
		JulianDate j = new JulianDate(1997, 7, 13, 14, 50, 30);
		int outputDay = j.getDay();
		assertEquals(13, outputDay);
	}
	@Test
	public void test4() {
		JulianDate j = new JulianDate(1997, 7, 13, 14, 50, 30);
		int outputHours = j.getHours();
		assertEquals(14, outputHours);
	}
	@Test
	public void test5() {	
		JulianDate j = new JulianDate(1997, 7, 13, 14, 50, 30);
		int outputMinutes = j.getMinutes();
		assertEquals(50, outputMinutes);
	}
	@Test
	public void test6() {
		JulianDate j = new JulianDate(1997, 7, 13, 14, 50, 30);
		int outputSeconds = j.getSeconds();
		assertEquals(30, outputSeconds);	
	}
	@Test
	public void test7() {
		JulianDate k = new JulianDate(1997, 12, 24, 14, 50, 30);
		assertEquals(2450807.1, k.getJulianDate());
	}
	@Test
	public void test8() {
		JulianDate k = new JulianDate(1997, 12, 24, 14, 50, 30);
		assertEquals(2450808.1, k.getTomorrow(k));
	}
	@Test
	public void test9() {
		JulianDate k = new JulianDate(1997, 12, 24, 14, 50, 30);
		assertEquals(2450806.1, k.getYesterday(k));
	}
}