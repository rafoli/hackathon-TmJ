package com.liferay.hackathon.functional.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.liferay.gs.testFramework.UtilsKeys;
import com.liferay.gs.testFramework.WaitUtils;

public class WelcomePage {

	public boolean usernameIsDisplayed(String usernameAcronym) {
		By usernameAcronymLocator = By
				.xpath(".//*[contains(@id, 'p_p_id_com_liferay_product_navigation_user_personal_bar_web_portlet_ProductNavigationUserPersonalBarPortlet_')]//*[contains(text(), '"
						+ usernameAcronym + "')]");

		WaitUtils.getWaitDriver().until(ExpectedConditions.visibilityOfElementLocated(usernameAcronymLocator));

		return UtilsKeys.DRIVER.findElement(usernameAcronymLocator).isDisplayed();
	}


}
