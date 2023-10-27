package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(glue="steps",
                                      tags="@rdj417",
                                      stepNotifications=true,
                                      dryRun=false,
                                       features=
                                   {
                                		   
                                   "src\\test\\resources\\Features\\regression\\"})

public class RegRunner2 {

}
