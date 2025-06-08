package runners;

import io.cucumber.testng.*;
import org.testng.annotations.*;

@CucumberOptions(
  features = "src/test/resources/features",
  glue = "stepDefinitions",
  plugin = {"pretty", "html:target/cucumber-report.html", "json:target/cucumber.json"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
  @BeforeClass public static void beforeAll() {}
  @AfterClass public static void afterAll() {}
}
