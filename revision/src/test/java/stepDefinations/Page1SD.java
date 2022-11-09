package stepDefinations;

import io.cucumber.java.en.*;

public class Page1SD {
	
	
	@Given("user is on {string} page")
	public void user_is_on_page(String string) {
	    System.out.println(System.getProperty("user.dir"));
	}
	@When("click on {string} link")
	public void click_on_link(String string) {
	    System.out.println("when");
	}
	@Then("system will display {string} page")
	public void system_will_display_page(String string) {
	  System.out.println("then");
	}


}
