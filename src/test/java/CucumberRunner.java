import io.cucumber.testing.TestNGCucumberRunner;
import org.testng.annotations.*;
@CucuberOptions(feature={"src/test/resources/features/Login.feature"})
public class CucumberRunner extends AbstractTestNGCucumberTests {
    private TestNGCucumberRunner testNGCucumberRunner;
    @BeforeClass(alwaysRun = true)
    public void setupCucumber()
    {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }
    @DataProvider
    public Object[][] features()
    {
        return testNGCucumberRunner.provideScenarios();
    }

}
