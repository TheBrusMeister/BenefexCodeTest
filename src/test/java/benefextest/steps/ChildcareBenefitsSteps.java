package benefextest.steps;

import benefextest.pages.BenefitsPage;
import benefextest.pages.ChildcareVouchersPage;
import benefextest.pages.EditChildcareVoucherPage;
import benefextest.pages.HomePage;
import models.Employee;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ChildcareBenefitsSteps {

    private HomePage homePage;
    private BenefitsPage benefitsPage;
    private ChildcareVouchersPage childcareVouchersPage;
    private EditChildcareVoucherPage editChildcareVoucherPage;

    @Step
    public void increaseChildcareVoucherMonthlyPayment(){
        Employee employee = Employee.getSessionEmployee();
        homePage.waitFor();
        assertThat(homePage.isPresent(), is(true));
        homePage.navigateToBenefits();
        benefitsPage.waitFor();
        assertThat(benefitsPage.isPresent(), is(true));
        benefitsPage.navigateToChildCareVouchers();
        childcareVouchersPage.waitFor();
        assertThat(childcareVouchersPage.isPresent(), is(true));
        childcareVouchersPage.clickMakeChanges();
        editChildcareVoucherPage.waitFor();
        assertThat(editChildcareVoucherPage.isPresent(), is(true));
        //do not like this, can be further improved.
        employee.getBenefits().getBenefits().get(0).setCurrentContribution(124);
        editChildcareVoucherPage.increaseChildcareVoucherMonthlyPayment(employee.getBenefits().getBenefits().get(0));
        System.out.println("here");
    }
}
