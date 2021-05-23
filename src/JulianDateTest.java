import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class JulianDateTest {
	private JulianDate j;
	private JulianDate k;
	
	@BeforeAll
	static void setUp() throws Exception {
		JulianDate j = new JulianDate(1997, 7, 13, 14, 50, 30);
		JulianDate k = new JulianDate(1997, 12, 24, 14, 50, 30);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	//Test Getters
	@Test
	public void test1() {	
		JulianDate j = new JulianDate(1997, 7, 13, 14, 50, 30);
		int outputYear = j.getYear();
		assertEquals(1997, outputYear);
	}
		
	public void test2() {
		JulianDate j = new JulianDate(1997, 7, 13, 14, 50, 30);
		int outputMonth = j.getMonth();
		assertEquals(7, outputMonth);
	}
	
	public void test3() {	
		JulianDate j = new JulianDate(1997, 7, 13, 14, 50, 30);
		int outputDay = j.getDay();
		assertEquals(13, outputDay);
	}
	
	public void test4() {
		JulianDate j = new JulianDate(1997, 7, 13, 14, 50, 30);
		int outputHours = j.getHours();
		assertEquals(14, outputHours);
	}
	
	public void test5() {	
		JulianDate j = new JulianDate(1997, 7, 13, 14, 50, 30);
		int outputMinutes = j.getMinutes();
		assertEquals(50, outputMinutes);
	}
	
	public void test6() {
		JulianDate j = new JulianDate(1997, 7, 13, 14, 50, 30);
		int outputSeconds = j.getSeconds();
		assertEquals(30, outputSeconds);	
	}
}
		
		//TestTomorrow
		//double outputTomorrow = j.getTomorrow(j);
		//assertEquals(j = j.get outputTomorrow); //day of j plus 1
		
		
		
		//TestYesterday
		
		
		//TestDaysBetween
	