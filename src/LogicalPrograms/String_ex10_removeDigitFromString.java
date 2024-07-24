package LogicalPrograms;

import jdk.internal.org.jline.terminal.TerminalBuilder.SystemOutput;

public class String_ex10_removeDigitFromString 

{   
	public static void main(String[] args)
	{	
           String str="5abcd123xyz #";   // out  -> abcdxyz # 
	       String str1="";  //ab 


           for(int i = 0;  i<=str.length()-1; i++)
           {
    	      char s1 = str.charAt(i);   //c
         
    	       if(!Character.isDigit(s1))  //c )
    	       {
    		      str1=str1+s1;  // ab + c = abc
    	       }
          }    
          System.out.println(str1);
    }
}