

1) install dependencies forcefully from Command prompt

You can always try mvn -U clean install

-U forces a check for updated releases and snapshots on remote repositories.

2) To update project : 

Select project and Right click 

Maven -> update project



Run Command from command prompt:

mvn test

* smoke tags  execution

mvn test -Dcucumber.options=”–tags @smoke”

** feature file run

mvn test -Dcucumber.options=”src/test/resources/functionalTests/End2End_Tests.feature"

******Passing multiple Parameter at once

mvn test -Dcucumber.options=”src/test/resources/functionalTests/End2End_Tests.feature” -Dcucumber.options=”–tags @Smoke”

