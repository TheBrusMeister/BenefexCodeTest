package benefextest.definitions;

import benefextest.steps.ChildcareBenefitsSteps;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class BenefitsDefinitions {

    @Steps
    private ChildcareBenefitsSteps childcareBenefitsSteps;

    @When("I increase my existing childcare benefit monthly payment")
    public void increaseChildcareVoucherMonthlyPayment(){
        childcareBenefitsSteps.increaseChildcareVoucherMonthlyPayment();
    }
}
