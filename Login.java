package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login extends ComFunc{

   // private WebDriver driver;


    @Given("^user on facebook login page$")
    public void user_on_facebook_login_page() throws Throwable {

        //WebDriverManager.chromedriver().setup();
        //driver= new ChromeDriver();
        driver.get("https://en-gb.facebook.com/");
        //driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@data-cookiebanner=\"accept_button\"]")).click();


    }

    @When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enters_and(String arg1, String arg2) throws Throwable {

driver.findElement(By.name("email")).sendKeys(arg1);
        driver.findElement(By.id("pass")).sendKeys(arg2);

    }

    @When("^click on login button$")
    public void click_on_login_button() throws Throwable {
        driver.findElement(By.name("login")).click();
    }

    @Then("^user should be able to see error message\"([^\"]*)\"$")
    public void user_should_be_able_to_see_error_message(String arg1) throws Throwable {
       String A= driver.findElement(By.xpath("//*[@id=\"email_container\"]/div[2]")).getText();
        System.out.println(A);
        Assert.assertEquals(A,arg1);

    }



}
