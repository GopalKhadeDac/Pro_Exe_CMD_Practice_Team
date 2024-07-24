package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example5_Keyword5_dependsOnMethod1 
{
       @Test
	   public void login()
       {
    	   Reporter.log("--running Login TC--", true);
       }

        
       @Test(dependsOnMethods= {"login"})
       public void logout()
       {
           Reporter.log("--running logout TC--",true);
       }

}






