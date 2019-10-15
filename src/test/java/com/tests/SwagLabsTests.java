package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SwagLabsTests {

	@Test(description = "Launch and Login")
	public void launchApp() throws Exception {

		System.out.println("Launch and Login - Done");

		Thread.sleep(10000);

	}

	@Test(description = "Sort the Products", dependsOnMethods = "launchApp")
	public void sort() throws Exception {

		System.out.println("Sort the Products - Done");

		Thread.sleep(10000);

	}

	@Test(description = "Select a Product", dependsOnMethods = "sort")
	public void selectAProduct() throws Exception {

		System.out.println("Select a Product - Done");

		Assert.assertEquals("Sauce Labs Backpack", "Sauce Lbs Backpack");

		Thread.sleep(10000);

	}

	@Test(description = "Go to About Page", dependsOnMethods = "selectAProduct")
	public void goToAboutPage() throws Exception {

		System.out.println("Go to About Page - Done");

		Thread.sleep(10000);

	}

	@Test(description = "Logout", dependsOnMethods = "goToAboutPage")
	public void logout() throws Exception {

		System.out.println("Logout - Done");

		Thread.sleep(10000);

	}

}