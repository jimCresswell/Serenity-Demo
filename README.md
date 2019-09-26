# Serenity Demo

End-to-end type testing demo, using the JVM based Serenity-BDD framework with Cucumber, Webdriver and Gradle (Groovy DSL).

The checks (we know what the outcomes should be so they are checks rather than tests) are driven from user-experience level specifications contained in ["feature files"](src/test/resources/features/search/search.feature) using [Cucumber](https://cucumber.io/)'s [Gherkin](https://cucumber.io/docs/gherkin/reference/) syntax.

The checks evaluate a basic search operation against [DuckDuckGo](https://duckduckgo.com/).  

## Note on Webdriver Binaries

I've included the binaries for Chromedriver 77 [src\test\resources\webdriver]. I wouldn't normally put binaries in Git but in my experience this saves a lot of time, especially with teams of mixed experience levels. These binaries will only work with Chrome/Chromium 77 and will be out of date quickly, they can be replaced with up to date versions at the [Chromdriver site](https://sites.google.com/a/chromium.org/chromedriver/downloads).

For decoupling and scalability it is better to operate the tests against a [Selenium Grid](https://github.com/SeleniumHQ/selenium/wiki/Grid2) set up. [Container-based solutions](https://opensource.zalando.com/zalenium/) are available. 
 