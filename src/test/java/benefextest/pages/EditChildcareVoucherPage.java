package benefextest.pages;

import models.Benefit;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class EditChildcareVoucherPage extends PageObject {

    @FindBy(css = ".button.shop.selected")
    private WebElementFacade shopForBenefitsButton;

    @FindBy(css = ".ccvallsave_c_employeemonthlycost")
    private WebElementFacade makeYourChangesInput;

    @FindBy(id = "AddToBasket")
    private WebElementFacade addToBasketButton;

    public void waitFor(){
        shopForBenefitsButton.waitUntilVisible();
    }

    public boolean isPresent(){
        return shopForBenefitsButton.isCurrentlyVisible();
    }

    public void increaseChildcareVoucherMonthlyPayment(Benefit benefit) {
        makeYourChangesInput.type(String.valueOf(benefit.getCurrentContribution()));
        addToBasketButton.click();

    }
}
