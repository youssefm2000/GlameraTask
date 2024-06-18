package GlameraTest;
import GlameraPages.LoginPage;
import data.DataReader;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.json.simple.parser.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import java.io.IOException;

public class LoginTest extends TestBase {

    private static final Logger log = LoggerFactory.getLogger(LoginTest.class);
    public LoginPage loginPage;

    @Feature("Login Test")
    @Description("Test Description: Login test with invalid credentials")
    @Test(description="Invalid Login Scenario with invalid Phone Number and Password")
    public void goToSignInPage() throws IOException, ParseException {

        DataReader dataReader = new DataReader();
        dataReader.Reader();

        loginPage = new LoginPage(driver);
        loginPage.userSignin(dataReader.phonenum,dataReader.password);

    }

}
