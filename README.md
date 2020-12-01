# saucedemo-e2e

## Running The Tests
Google Chrome & Chrome Driver must both be installed to run the Front-End Selenium Tests. It will need to be added to a directory called 'chromedriver', which should be located in the Project Root.

Chrome Driver can be downloaded here: https://sites.google.com/a/chromium.org/chromedriver/downloads. The Chrome Driver which matches the User's current Chrome version should be downloaded.

The Tests can be run in two ways:

### IDE
The first is through the IDE; in Intellij, this can be done by many ways, such as pressing the Green Arrow next to the Test, or right clicking the Test in the Project Structure.

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
