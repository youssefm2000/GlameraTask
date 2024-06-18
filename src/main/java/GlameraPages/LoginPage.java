package GlameraPages;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.time.Duration;

public class LoginPage {

    public WebDriver driver;

    // create constructor to initiliaze elements
    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    // locate elements use By way
    private final By phonefield = By.id("mat-input-0");
    private final By passwordfield = By.id("mat-input-1");
    private final By signinbutton = By.xpath("//span[@class='mdc-button__label']");
    private final By errormessage = By.xpath("//div[contains(text(),'Invaild user name or password')]");



    // method for enter invalid credentials and check error message
    public void userSignin(String phone,String pass){

        // find element and take actions to it
        driver.findElement(phonefield).sendKeys(phone);
        driver.findElement(passwordfield).sendKeys(pass);
        driver.findElement(signinbutton).click();

        // wait until alert message is present
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

       // to check error message that can not log in
        WebElement error = driver.findElement(errormessage);
        Assert.assertEquals(error.getText(),"Invaild user name or password" );

    }

}
