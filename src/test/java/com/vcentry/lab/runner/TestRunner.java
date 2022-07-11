package com.vcentry.lab.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class) //junit main method
@CucumberOptions(
features="src/test/java/com/vcentry/lab/features",	
glue="com.vcentry.lab.stepDefinition",	//package name of step definition	
plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
monochrome=true, //for readable console  //by default monochrome is false
dryRun=false, //dry run used to check feature file steps were implemented in test steps 
//tags="@validlogin or @sanity"
tags= "@sanity"  

		)

public class TestRunner
{

}
