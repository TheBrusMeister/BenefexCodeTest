package benefextest.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePage extends PageObject {

    @FindBy(className = "signout-link")
    private WebElementFacade signOutLink;

    @FindBy(id ="flexibleBenefits")
    private WebElementFacade benefitsTile;

    public void waitFor(){
        signOutLink.waitUntilVisible();
    }

    public boolean isPresent(){
        return signOutLink.isCurrentlyVisible();
    }

    public void navigateToBenefits(){
        benefitsTile.click();
    }
}
