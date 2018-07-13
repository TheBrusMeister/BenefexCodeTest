package benefextest.pages;

import models.Employee;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject {

    @FindBy(id = "username")
    private WebElementFacade usernameInput;

    @FindBy(id = "password")
    private WebElementFacade passwordInput;

    @FindBy(css = ".btn.action")
    private WebElementFacade signInButton;

    public void loginEmployee(Employee employee){
        usernameInput.waitUntilVisible();
        usernameInput.type(employee.getUsername());
        usernameInput.type(employee.getPassword());
        signInButton.click();
    }
}
