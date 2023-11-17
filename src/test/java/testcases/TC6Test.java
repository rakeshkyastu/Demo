package testcases;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC6Test {
@Test
public void conflict()
{
	System.out.println("dummy");
	Reporter.log("hello",true);
}
}
