package benefextest.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class ChildcareVouchersPage extends PageObject {

    @FindBy(id = "editBenefit")
    private WebElementFacade makeChangesButton;

    private WebElementFacade childcareVouchersTitle(){
        return findAll(By.cssSelector("h1")).get(1);
    }

    public void waitFor(){
        childcareVouchersTitle().waitUntilVisible();
    }

    public boolean isPresent(){
        return childcareVouchersTitle().getText().equals("Childcare Vouchers");
    }

    public void clickMakeChanges() {
        makeChangesButton.click();
    }
}
