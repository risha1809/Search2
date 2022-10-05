package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



    public class Search extends ComFunc{
       // private WebDriver driver;
        @Given("^User on the Amazon homepage$")
        public void user_on_the_Amazon_homepage() throws Throwable {

           // WebDriverManager.chromedriver().setup();
           // driver=new ChromeDriver();
            driver.get("https://www.amazon.co.uk/");
            //driver.manage().window().maximize();
            //driver.findElement(By.id("sp-cc-accept")).click();


        }



        @When("^User enters product \"([^\"]*)\"$")
        public void user_enters_product(String arg1) throws Throwable {
            driver.findElement(By.id("twotabsearchtextbox")).sendKeys(arg1);
            driver.findElement(By.id("nav-search-submit-button")).click();

        }

        @When("^click on search button$")
        public void click_on_search_button() throws Throwable {

            System.out.println("smitha");
        }

        @Then("^should be able to see all products related to that ProductType$")
        public void should_be_able_to_see_all_products_related_to_that_ProductType() throws Throwable {

        }



//        @Then("^user should able to see text \"([^\"]*)\"$")
//        public void user_should_able_to_see_text(String arg1) throws Throwable {
//            String A= driver.findElement(By.name("name")).getText();
           System.out.println(A);
            driver.close();
       }


    }


