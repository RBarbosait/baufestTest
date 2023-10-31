package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.Test;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)


@CucumberOptions(  monochrome = true,
                         //tags = "@tags",
                     features = "src/test/resources/demoBlazeTest.feature",
                      //format = { "pretty","html: cucumber-html-reports",
                                 // "json: cucumber-html-reports/cucumber.json" },*/
                        //dryRun = false,
                     publish =true,
                        glue={"stepsDefinition"})
//@CucumberOptions(features="src/test/resources/demoBlazeTest.feature",glue={"stepsDefinition"})

public class testRunnerFile {

}
