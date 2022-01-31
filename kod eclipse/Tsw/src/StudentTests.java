import static org.junit.jupiter.api.Assertions.*;

import org.junit.Rule;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.rules.Timeout;

class StudentTests {
	Student s;
	 private static final int GLOBAL_TIMEOUT_VALUE = 6;
	 @Rule
	    protected Timeout globalTimeout = Timeout.seconds(GLOBAL_TIMEOUT_VALUE);
	@BeforeAll
	public static void osTest()
	{
		assertTrue(System.getProperty("os.name").contains("Windows"));
	}
	@BeforeEach
	public void init() {
		s = new Student("Nebojsa Nikolic",4,180);
	}
	@Test
	public void getSetGodinaStudijaTest() {
		assertEquals(4, s.getGodinaStudija());
		int newValue = 3;
		s.setGodinaStudija(newValue);
		assertEquals(newValue, s.getGodinaStudija());
	}
	@Test
	public void getSetGodinaStudijaFirstInvalidTest() {
		assertEquals(4, s.getGodinaStudija());
		int newValue = -1;
		assertThrows(RuntimeException.class, () -> s.setGodinaStudija(newValue));
	}
	@Test
	public void getSetGodinaStudijaSecondInvalidTest() {
		assertEquals(4, s.getGodinaStudija());
		int newValue = 5;
		assertThrows(RuntimeException.class, () -> s.setGodinaStudija(newValue));
	}
	@Test
	public void getSetESPTest() {
		assertEquals(180, s.getBrojESPB());
		int newValue = 190;
		s.setBrojESPB(newValue);
		assertEquals(newValue, s.getBrojESPB());
	}
	@Test
	public void getSetESPFirstInvalidTest() {
		assertEquals(180, s.getBrojESPB());
		int newValue = -30;
		assertThrows(RuntimeException.class, () -> s.setBrojESPB(newValue));
	}
	@Test
	public void getSetESPSecondInvalidTest() {
		assertEquals(180, s.getBrojESPB());
		int newValue = 500;
		assertThrows(RuntimeException.class, () -> s.setBrojESPB(newValue));
	}
	
	@Test
	public void getSetImePrezimeTest() {
		assertEquals("Nebojsa Nikolic", s.getImeIPrezime());
		String newValue = "Nenad Nikolic";
		s.setImeIPrezime(newValue);
		assertEquals(newValue, s.getImeIPrezime());
	}
	
	@Test
	public void getSetImePrezimeInvalidTest() {
		assertEquals("Nebojsa Nikolic", s.getImeIPrezime());
		String newValue = null;
		assertThrows(RuntimeException.class, () -> s.setImeIPrezime(newValue));
	}
	@Test
	public void prosekESPBTest() {
		assertEquals(s.getBrojESPB()/s.getGodinaStudija(), s.prosekESPB());
	}
	
	@Test
	public void redovniCetvrteGodineTest() {
		s.setBrojESPB(190);
		assertTrue(s.redovniCetvrteGod());
		s.setGodinaStudija(3);
		assertFalse(s.redovniCetvrteGod());
		s.setBrojESPB(60);
		assertFalse(s.redovniCetvrteGod());
	}
	
	@AfterEach
	public void destroy() {
		s = null;
	}
}
