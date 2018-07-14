package benefextest.steps;

import benefextest.pages.HomePage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ChildcareBenefitsSteps {

    private HomePage homePage;

    @Step
    public void increaseChildcareVoucherMonthlyPayment(){
        homePage.waitFor();
        assertThat(homePage.isPresent(), is(true));
        homePage.navigateToBenefits();
        System.out.println("here");
    }
}
