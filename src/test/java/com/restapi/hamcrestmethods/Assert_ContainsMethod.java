package com.restapi.hamcrestmethods;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;

import java.util.ArrayList;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Assert_ContainsMethod {
	
	
	
		@Test
		public void ContainsStringmethod()
		{
			
			 given()
			.baseUri("https://api.github.com")
			.header("Authorization","Bearer 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")
			.when()
			   .get("/user/repos")
			.then()
			
			.assertThat().statusCode(200)
			.body("name", containsString("16SepAppium"));
			
			// ContainsString is a method in hacrest used for assertion
			// this method expect all the values for the variable name of repo
			// we are passing only 1 value in actual result
			//so it will fail with assertion
		//	Expected: a string containing "16SepAppium"
			//  Actual: <[16SepAppium, 18Oct-SeleniumTestScripts, 18Oct-SeleniumTraining, 18OCTTestNG-SL, 7AMGITDEMO, 8PMAugMavenProject, 8PMCucumberDemo, 8PMGridSetup, 8PMJulyBatchJava-SeleniumPrograms, 8PMSepDemo, AnsibleDockerdemo, ansible_playbooks_roles, appium16sep, Appium30May, AppiumInstructor, AppiumMarch, AppiumNotes-Scripts, appiumtests, BDDCucumberExtentReport, BDD_CUCUMBER_Edureka, capstoneProject, Continoutesting25Oct, CucumberFramework8PM, CucumberSeleniumFramework, DecSeleniumTestNGScripts, DevOps, DevOpsClassCodes, DevOps_ClassNotes, devops_kube, dockerdemo]>

			
		
			
		}

}
