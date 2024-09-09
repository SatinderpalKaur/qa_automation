package playwrightsessions;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PlaywrightBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Playwright playwright = Playwright.create();
Browser browser=playwright.webkit().launch(new BrowserType.LaunchOptions().setHeadless(false));
Page page=browser.newPage();

page.navigate("https://www.saucedemo.com/inventory.html");
  page.navigate("https://www.saucedemo.com/?/inventory.html");
  page.navigate("https://www.saucedemo.com/inventory.html");
  page.navigate("https://www.saucedemo.com/");
  page.locator("[data-test=\"login-credentials\"]").click();
  page.locator("[data-test=\"login-credentials\"]").click();
  page.locator("[data-test=\"login-credentials\"]").click();
  page.locator("[data-test=\"username\"]").click();
  page.locator("[data-test=\"username\"]").fill("standard_user");
  page.locator("[data-test=\"password\"]").click();
  page.locator("[data-test=\"password\"]").fill("secret_sauce");
  page.locator("[data-test=\"login-button\"]").click();

	String title = page.title();
System.out.println("page title is : " + title);
//page.close();
browser.close();
//playwright.close();
	}

}
