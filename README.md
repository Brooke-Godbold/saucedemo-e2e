# saucedemo-e2e

## Running The Tests
Google Chrome & Chrome Driver must both be installed to run the Front-End Selenium Tests. It will need to be added to a directory called 'chromedriver', which should be located in the Project Root.

Chrome Driver can be downloaded here: https://sites.google.com/a/chromium.org/chromedriver/downloads. The Chrome Driver which matches the User's current Chrome version should be downloaded.

The Tests can be run in two ways:

### IDE
The first is through the IDE. This will vary based on your personal IDE.

For example, in Intellij, this can be done by right clicking the Feature/Scenario you wish to run and selecting 'Run Test', or right clicking the Test in the Project Structure.

For specifics on your IDE, please see it's Documentation.

### Command Line
The second way of running is via the Command Line; If you don't have Maven Installed, this needs to be installed on your machine, and the location set as an Environment Variable on your machine. In addition, you must be using a JDK (as opposed to JRE), and have your JAVA_HOME Environment Variable pointing to that location.

Once done, the tests can be run simply via the following command from the Project Root Directory:

```shell script
mvn test
```

To generate the Cluecumber Report, the following command should be used after the Maven Test is run:

```shell script
mvn cluecumber-report:reporting
```

The Report can be found in target/generated-report/index.html, and can be opened as a Webpage.

## Candidate Comments

The Framework used is Cucumber. This allows for writing reusable steps, in Scenarios which follow BDD format. This will allow for a link between the functionality as defined by the Product Owner and the Tests which Developers will develop their code against. This in turn will minimise scope creep, and make it easier to write tests before development starts, ensuring that the test feedback loop is much faster and more efficient.

Features and Scenarios follow BDD Principles, with Given conditions denoting prior state, When conditions denoting a specific action, and Then conditions denoting an expected result. The steps have been divided between Action Steps (When) and Assertion Steps (Then), although as this test suite is expanded upon this will likely need to be subdivided further; the framework is flexible enough to allow for this to be done easily with minimal risk.

AssertJ has been used as an Assertion Framework. This presents assertions in a very easy to read format, and has a huge amount of options to choose from when writing assertions.