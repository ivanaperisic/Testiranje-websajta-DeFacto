import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.Rule;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.rules.Timeout;

class ListaStudenataTest {
	 private static final int GLOBAL_TIMEOUT_VALUE = 6;

	 @Rule
	    protected Timeout globalTimeout = Timeout.seconds(GLOBAL_TIMEOUT_VALUE);
	@BeforeAll
	public static void osTest()
	{
		assertTrue(System.getProperty("os.name").contains("Windows"));
	}
	
	@ParameterizedTest
	@MethodSource("addToListArguments")
	public void addToListTest(Student s) {
		if (s == null)
			assertThrows(NullPointerException.class, () -> ListaStudenata.dodajStudent(s));
		else if (ListaStudenata.lista.contains(s))
			assertThrows(RuntimeException.class, () -> ListaStudenata.dodajStudent(s));
		else
			ListaStudenata.dodajStudent(s);
	}
	
	private static Stream<Arguments> addToListArguments(){
		Student s1 = null;
		Student s2 = new Student ("Nebojsa",4,180);
		return Stream.of(
				Arguments.of(s1),
				Arguments.of(s2),
				Arguments.of(s2));
	}

}
