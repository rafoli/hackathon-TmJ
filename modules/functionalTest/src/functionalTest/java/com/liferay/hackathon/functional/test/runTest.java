package com.liferay.hackathon.functional.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/functionalTest/resources",
        glue = {"com/liferay/hackathon/functional/test/steps"},
        plugin = {"pretty", "html:reports/cucumber"},
        tags = {})
public class runTest {}