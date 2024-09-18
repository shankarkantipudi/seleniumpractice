package org.checkbox.elements;

import org.testng.annotations.Test;

@Test
public class CheckBoxRunable {
	
	public void CheckRun() {
		Checkbox cb= new Checkbox();
		cb.launchURL();
		//cb.handleSingleCheckBox();
		cb.handleMultipleCheckBoxes();
		cb.closeBrowser();
		
	}
	
	
	
	
	

}
