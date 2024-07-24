package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example6_Sample1 
{
      @Test
      public void TC1()
      {
    	  Reporter.log("--runningTC1--", true);
      }


       @Test
      public void TC2()
      {
    	  Reporter.log("--runningT2--", true);
      }


      @Test
      public void TC3()
      {
    	  Reporter.log("--runningTC3--", true);
      }

}


















