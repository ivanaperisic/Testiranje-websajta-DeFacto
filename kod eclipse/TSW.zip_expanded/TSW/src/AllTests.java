import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({RegisterTudorsTest.class,LoginTudorsTest.class, ProfileTudorsTest.class,
	CartTudorsTest.class,TotalPriceTudorsTest.class,
	FacebookTudorsTest.class, InstagramTudorsTest.class, SearchTudorsTest.class })
public class AllTests {

}
