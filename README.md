# Serenity Demo

```
This branch is concerned with packaging the tests as a distributable application.
Don't base test code on this branch unless for that specific scenario.
```

End-to-end type (black-box, out-of-process, over network) testing demo, using the JVM based [Serenity-BDD](http://www.thucydides.info/#/) framework with [Cucumber](https://cucumber.io/), Selenium [Webdriver](https://www.seleniumhq.org/docs/03_webdriver.jsp) and [Gradle](https://gradle.org/) (with the Groovy DSL).

The checks (we know what the outcomes should be so they are checks rather than tests) are driven from user-experience level specifications contained in ["feature files"](src/main/resources/features/search/search.feature) using Cucumber's [Gherkin](https://cucumber.io/docs/gherkin/reference/) syntax.

The checks evaluate a basic search operation against [DuckDuckGo](https://duckduckgo.com/).

The "app" in `main/java/..` doesn't do anything useful, it's a placeholder to represent application code.  

## Use

### As an Application
`gradlew run` will run the checks and generate a Serenity test report at `target/site/serenity/index.html`.

### As Part of the Check Lifecycle Task
`gradlew check` will run the checks and generate a Serenity test report at `target/site/serenity/index.html`.

## Note on Webdriver Binaries

I've included the binaries for Chromedriver 77 [src\main\resources\webdriver]. I wouldn't normally put binaries in Git but in my experience this saves a lot of time, especially with teams of mixed experience levels. These binaries will only work with Chrome/Chromium 77 and will be out of date quickly, they can be replaced with up to date versions at the [Chromdriver site](https://sites.google.com/a/chromium.org/chromedriver/downloads).

For decoupling and scalability it is better to operate the tests against a [Selenium Grid](https://github.com/SeleniumHQ/selenium/wiki/Grid2) set up. [Container-based solutions](https://opensource.zalando.com/zalenium/) are available. 
