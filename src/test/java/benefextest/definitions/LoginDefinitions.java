package benefextest.definitions;

import benefextest.steps.LoginSteps;
import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class LoginDefinitions {

    @Steps
    LoginSteps loginSteps;

    @Given("I am a logged in employee")
    public void loggedInEmployee(){
        loginSteps.loginEmployee();
    }
}
