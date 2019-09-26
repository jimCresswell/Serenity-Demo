package serenity_demo.interactions.navigation;

import net.thucydides.core.annotations.Step;

public class NavigateToSteps {

    SearchHomePage searchHomePage;

    @Step("Open the search home page")
    public void searchHomePage() {
        searchHomePage.open();
    }
}
