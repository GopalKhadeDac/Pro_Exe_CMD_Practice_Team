package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example5_Keyword2_EnableFalse 
{
    @Test
    public void TC1()
    {
    	
    	Reporter.log("----runningTC1---", true);
    }

     
    @Test(enabled=false)
    public void TC2()
    {
    	Reporter.log("---runningTC2---", true);
    }

    
    @Test(enabled=false)
    public void TC3()
    {
    	Reporter.log("---runningTC3----", true);
    }






}
