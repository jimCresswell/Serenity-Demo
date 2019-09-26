package serenity_demo.step_definitions;

        import cucumber.api.java.en.Given;
        import cucumber.api.java.en.Then;
        import cucumber.api.java.en.When;
        import net.thucydides.core.annotations.Steps;
        import serenity_demo.interactions.navigation.NavigateToSteps;
        import serenity_demo.interactions.search.SearchForSteps;
        import serenity_demo.interactions.search.SearchResultSteps;

        import static org.assertj.core.api.Assertions.assertThat;
        import static serenity_demo.utilities.matchers.TextMatcher.textOf;

public class SearchStepDefinitions {

    @Steps
    NavigateToSteps navigateTo;

    @Steps
    SearchForSteps searchFor;

    @Steps
    SearchResultSteps searchResult;

    @Given("I want to search for a term")
    public void i_am_on_the_DuckDuckGo_home_page() {
        navigateTo.searchHomePage();
    }

    @When("I search for \"(.*)\"")
    public void i_search_for(String term) {
        searchFor.term(term);
    }

    @Then("there should be results containing the word \"(.*)\"")
    public void all_the_result_titles_should_contain_the_word(String term) {
        assertThat(searchResult.getTitles())
                .matches(results -> results.size() > 0)
                .allMatch(title -> textOf(title).containsIgnoringCase(term));
    }
}