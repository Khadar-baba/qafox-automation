package com.auto.learn.testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class TestRunner {
	@CucumberOptions(features = { "src\\test\\resources\\qafox" }, glue = { "com\\auto\\learn\\StepDefination",
			"com\\auto\\hooks" }, tags = "@Tablet", plugin = {
					"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })
	public class TestRunnner extends AbstractTestNGCucumberTests {

	}
}
