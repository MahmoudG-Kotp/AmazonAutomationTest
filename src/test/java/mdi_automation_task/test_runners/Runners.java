package mdi_automation_task.test_runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/main/resources/Features",
        glue = "mdi_automation_task",
        tags = "@SmokeTest",
        plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json", "junit:target/cukes.xml", "rerun:target/rerun.xml"}
)
class Runners extends AbstractTestNGCucumberTests {

}
