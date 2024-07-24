package LogicalPrograms;

public class Example4_StringPalindrome2 
{
    public static void main(String[] args) 
    {
		String org="madam";      //4
        String rev="";            //
     
        
                //       4-1=3
         for(int i = org.length()-1; i>=0;i--)
         {              //     0
      	    rev=rev+org.charAt(i);   //
         }
     
         System.out.println(rev);
         
         if(org.equals(rev))
         {
      	   System.out.println("Given number is palindrome");
         }
         else
         {
      	   System.out.println("Given number is not a palindrome");
         }
     }
} 
    
    
    
    
    
    
    
    









