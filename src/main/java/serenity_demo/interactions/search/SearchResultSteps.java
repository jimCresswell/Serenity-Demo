package serenity_demo.interactions.search;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

import java.util.List;
import java.util.stream.Collectors;

public class SearchResultSteps extends UIInteractionSteps {

    @Step("Get the search results")
    public List<String> getTitles() {
        return findAll(ResultListPageElements.RESULT_TITLES)
                .stream()
                .map(WebElementFacade::getTextContent)
                .collect(Collectors.toList());
    }
}
