package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example5_Keyword4_Timeout 
{
       @Test(timeOut=5000)
       public void TC1() throws InterruptedException
       {
    	   Thread.sleep(4000);
    	   Reporter.log("--runningTC1--",true);
       }

}









