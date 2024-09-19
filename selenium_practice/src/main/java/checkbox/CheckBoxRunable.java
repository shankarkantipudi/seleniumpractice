package checkbox;

import org.testng.annotations.Test;

@Test
public class CheckBoxRunable {
	
	public void CheckRun() throws InterruptedException {
		Checkbox cb= new Checkbox();
		cb.launchURL();
		cb.handleSingleCheckBox();
		cb.handleMultipleCheckBoxes();
		cb.SpclSelectCheckBoxes();
		cb.selectFirstThreeCheckBoxes();
		cb.unselectCheckBoxes();
		cb.closeBrowser();
		
	}
	
	
	
	
	

}
