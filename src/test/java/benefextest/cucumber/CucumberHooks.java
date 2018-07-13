package benefextest.cucumber;

import cucumber.api.java.Before;
import utilities.TestConfiguration;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class CucumberHooks {

    @Before
    public void setup() {
        if (getDriver().getCurrentUrl().equals("data:,")) {
            getDriver().get(TestConfiguration.DEFAULT_URL);
        }
        getDriver().manage().window().maximize();
    }
}
