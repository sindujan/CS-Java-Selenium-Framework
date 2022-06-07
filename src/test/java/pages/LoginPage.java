package pages;

import com.cs.framework.base.BasePage;
import com.cs.framework.controls.elements.Button;
import com.cs.framework.controls.elements.TextBox;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Karthik-PC on 11/24/2018.
 */
public class LoginPage extends BasePage {

    @FindBy(how = How.NAME, using = "UserName")
    public TextBox txtUserName;

    @FindBy(how = How.NAME, using = "Password")
    public WebElement txtPassword;

    @FindBy(how = How.CSS, using = "[class*='btn-default']")
    public Button btnLogin;

    public void Login(String userName, String password) {
        txtUserName.EnterText(userName);
        txtPassword.sendKeys(password);
    }

    public HomePage ClickLogin() {
        btnLogin.WaitForVisible().Click();
        return GetInstance(HomePage.class);
    }


}
