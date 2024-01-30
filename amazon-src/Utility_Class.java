package amazon;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class Utility_Class
{
	WebDriver driver;
	public void switch_control_to_childwindow_(WebDriver driver)
	{
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> pid_cid = ids.iterator();
		String parent_id = pid_cid.next();
		String child_id = pid_cid.next();
		driver.switchTo().window(child_id);
	}
}
