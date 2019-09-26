# Serenity Demo

End-to-end type testing demo, using the JVM based Serenity-BDD framework with Cucumber, Webdriver and Gradle (Groovy DSL).

## Note on Webdriver Binaries

I've included the binaries for Chromedriver 77 [\src\test\resources\webdriver]. I wouldn't normally put binaries in Git but in my experience this saves a lot of time, especially with teams of mixed experience levels. These binaries will only work with Chrome/Chromium 77 and will be out of date quickly, they can be replaced with up to date versions here [https://sites.google.com/a/chromium.org/chromedriver/downloads].

For decoupling and scalability it is better to operate the tests against a [Selenium Grid](https://github.com/SeleniumHQ/selenium/wiki/Grid2) set up. Container based solutions [are available](https://opensource.zalando.com/zalenium/). 
 