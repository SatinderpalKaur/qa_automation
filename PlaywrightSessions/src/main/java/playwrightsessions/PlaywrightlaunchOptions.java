package playwrightsessions;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;

public class PlaywrightlaunchOptions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Playwright playwright = Playwright.create();
		
		Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
		BrowserContext context= browser.newContext();
		Page page=context.newPage();
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
		
	//	 page.getByTestId("user-menu").click();
	//      page.getByRole(AriaRole.MENUITEM, new Page.GetByRoleOptions().setName("Logout")).click();
	//      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Confirm")).click();
		//page.close();
	//	browser.close();
		//playwright.close();
	}

}
