package com.June2021;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/Resources", tags = "@search", plugin = { "html: target/cucumber-html-report"})
public class RunCukeTest {
}
