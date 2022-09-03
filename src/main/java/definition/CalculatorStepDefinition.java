package definition;

import base.AppBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

public class CalculatorStepDefinition extends AppBase {
    @Given("user is on the calculator page")
    public void userLaunchTheBrowser() throws InterruptedException {
     driver.get("https://www.calculatorsoup.com/calculators/math/basic.php");
     TimeUnit.SECONDS.sleep(3);
    }

 @When("user perform addition of {int} plus {int}")
 public void userPerformAdditionOfPlus(int numOne, int arg1) throws InterruptedException {

     driver.findElement(By.xpath("/html/body/div[1]/div/main/div[3]/div[1]/div[2]/form/div[4]/input[2]")).sendKeys();
     TimeUnit.SECONDS.sleep(2);


     // Click on 8
  driver.findElement(By.xpath("/html/body/div[1]/div/main/div[3]/div[1]/div[2]/form/div[4]/input[2]")).click();
  TimeUnit.SECONDS.sleep(2);

  // Click on Addition
  driver.findElement(By.xpath("/html/body/div[1]/div/main/div[3]/div[1]/div[2]/form/div[6]/input[4]")).click();
  TimeUnit.SECONDS.sleep(2);

  // Click on 8 again
  driver.findElement(By.xpath("/html/body/div[1]/div/main/div[3]/div[1]/div[2]/form/div[4]/input[2]")).click();
   TimeUnit.SECONDS.sleep(2);
  //Click on equal
   driver.findElement(By.xpath("/html/body/div[1]/div/main/div[3]/div[1]/div[2]/form/div[7]/input[4]")).click();
 }

 @Then("User should be able to see the expected result {int}")
 public void userShouldBeAbleToSeeTheExpectedResult(int expectedAns) {
    // FIND THE ELEMENT

 }

    @When("user perform subtraction of {int} minus {int}")
    public void userPerformSubtractionOfMinus(int arg0, int arg1) {
      // click on 9
        driver.findElement(By.cssSelector("input[name='nine']")).click();
        // click on minus
      driver.findElement(By.cssSelector("input[name='subtract']")).click();

      // click on 1
        driver.findElement(By.cssSelector("input[name='one']")).click();

        //click =
        driver.findElement(By.cssSelector("input[name='calculate']")).click();

    }

    @Then("user should be able to see the expected result of {int}")
    public void userShouldBeAbleToSeeTheExpectedResultOf(int arg0) {
        WebElement result = driver.findElement(By.cssSelector("input#display"));
        //
        String actualResult = result.getAttribute("value");
        String expectedResult = "8";
        //
        assertEquals(actualResult,expectedResult);
        System.out.println(expectedResult);
    }

    @When("user perform multiplication of {int} multiply {int}")
    public void userPerformMultiplicationOfMultiply(int arg0, int arg1) {
        //click 5
        driver.findElement(By.cssSelector("input[name='five']")).click();

        // click multiply
        driver.findElement(By.cssSelector("input[name='multiply']")).click();

        //click 2
        driver.findElement(By.cssSelector("input[name='two']")).click();
        //click =
        driver.findElement(By.cssSelector("input[name='calculate']")).click();
    }

    @Then("user should be able to view the expected result of {int}")
    public void userShouldBeAbleToViewTheExpectedResultOf(int arg0) {
        WebElement result = driver.findElement(By.cssSelector("input#display"));
        //
        String actualResult = result.getAttribute("value");
        String expectedResult = "10";
        //
        assertEquals(actualResult,expectedResult);
        System.out.println(expectedResult);
    }

    @Then("User should be able to see the expected result {string}")
    public void userShouldBeAbleToSeeTheExpectedResult(String expectedResult) {
        WebElement result = driver.findElement(By.cssSelector("input#display"));

//Get the value from the web page and storing it in a Java variable
        String actualResult = result.getAttribute("value");

        System.out.println(expectedResult);

        // jUNIT assert to check if my test is pass/fail
        assertEquals(expectedResult,actualResult);
    }
}







    

    

