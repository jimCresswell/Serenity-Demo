package serenity_demo.interactions.navigation;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

/**
 *  This is the "lean page object" approach.
 *  Page objects contain mostly URLs and identifiers, and actions are delegated to the Serenity steps.
 *
 * The default URL is overridden according to the `environments` values in `serenity.conf`.
 */
@DefaultUrl("https://duckduckgo.com")
class SearchHomePage extends PageObject {
}

