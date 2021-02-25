package com.qa.selenuimtests.runner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
glue = "com.qa.selenuimdemositests.stepdefs",
tags ="not @smoke")
public class CukeRunner {

}
