package benefextest.steps;

import benefextest.pages.LoginPage;
import models.Employee;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginSteps {

    private LoginPage loginPage;

    @Step
    public void loginEmployee(){
        Employee employee = new Employee();
        loginPage.waitFor(ExpectedConditions.titleIs("Login"));
        loginPage.loginEmployee(employee);
    }
}