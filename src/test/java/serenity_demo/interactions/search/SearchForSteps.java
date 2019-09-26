package serenity_demo.interactions.search;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class SearchForSteps extends UIInteractionSteps {

    @Step("Search for term {0}")
    public void term(String term) {
        $(SearchFormPageElement.SEARCH_FIELD)
                .waitUntilClickable()
                .clear();
        $(SearchFormPageElement.SEARCH_FIELD).type(term);
        $(SearchFormPageElement.SEARCH_BUTTON).click();
    }
}
