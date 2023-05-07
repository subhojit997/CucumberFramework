package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"html:target/cucu104.html"},
                 features= "src/test/resources/features",
                 glue ={"stepdefinations","hooks"})
public class TestJrunner {

}
