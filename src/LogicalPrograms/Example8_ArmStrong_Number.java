package LogicalPrograms;

public class Example8_ArmStrong_Number 
{
     public static void main(String[] args) 
     {
		  int OrgNum = 120;     //1+ 8+ 0 = 9
	     
		  int sum = 0;          //9
     
		  
		           // 120       0>0     120/10
		  for(int i = OrgNum;  i > 0;  i = i / 10)
		  {
			  int rem = i % 10;    //1 % 10 = 1
			  sum = sum + (rem * rem * rem);
		  }
     
         if(OrgNum==sum)
         {
        	 System.out.println("given number " + OrgNum + " is an armstrong number"); 
         }
         else
         {
        	 System.out.println("given number " + OrgNum + " is not an armstrong number");
        	 		       			                                                    
         }
     
     
     
     }
}











