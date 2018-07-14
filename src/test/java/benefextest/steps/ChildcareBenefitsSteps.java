package benefextest.steps;

import benefextest.pages.BenefitsPage;
import benefextest.pages.ChildcareVouchersPage;
import benefextest.pages.HomePage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ChildcareBenefitsSteps {

    private HomePage homePage;
    private BenefitsPage benefitsPage;
    private ChildcareVouchersPage childcareVouchersPage;

    @Step
    public void increaseChildcareVoucherMonthlyPayment(){
        homePage.waitFor();
        assertThat(homePage.isPresent(), is(true));
        homePage.navigateToBenefits();
        benefitsPage.waitFor();
        assertThat(benefitsPage.isPresent(), is(true));
        benefitsPage.navigateToChildCareVouchers();
        childcareVouchersPage.waitFor();
        assertThat(childcareVouchersPage.isPresent(), is(true));
        childcareVouchersPage.clickMakeChanges();
        
        System.out.println("here");
    }
}
