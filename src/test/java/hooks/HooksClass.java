package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass {
	
	@Before
	public void start() {
		
		System.out.println("Process has been Started");
		
	}
	
	@After
	public void end() {
		
		System.out.println("Process has been Completed");
	}

}
