package com.abn.selcucumber.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by aswathyn on 07/01/17.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        features= {"src/test/resources/cucumber/"},
        glue= {"com/abn/selcucumber/steps/"},
        tags = "@Exp",
        monochrome = true,
        plugin= {"com.cucumber.listener.ExtentCucumberFormatter:target/output/Exp_report.html"})
public class RunExpCukesTest {
}
