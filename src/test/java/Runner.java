import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Feature/",
        glue = "definition",
        tags= "@CalculatorToye"
)
public class Runner {
}
