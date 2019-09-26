package serenity_demo.interactions.search;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class SearchForSteps extends UIInteractionSteps {

    @Step("Search for term {0}")
    public void term(String term) {
        $(SearchFormPageElements.SEARCH_FIELD)
                .waitUntilClickable()
                .clear();
        $(SearchFormPageElements.SEARCH_FIELD).type(term);
        $(SearchFormPageElements.SEARCH_BUTTON).click();
    }
}
