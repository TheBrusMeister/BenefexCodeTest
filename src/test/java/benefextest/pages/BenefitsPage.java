package benefextest.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class BenefitsPage extends PageObject {

    @FindBy(id = "CurrentBenefitsButton")
    private WebElementFacade yourBenefitsButton;

    @FindBy(id = "CurrentCCVAllSave")
    private WebElementFacade childcareVoucherTile;

    public void waitFor(){
        yourBenefitsButton.waitUntilVisible();
    }

    public boolean isPresent(){
        return yourBenefitsButton.isCurrentlyVisible();
    }

    public void navigateToChildCareVouchers(){
        childcareVoucherTile.click();
    }
}
