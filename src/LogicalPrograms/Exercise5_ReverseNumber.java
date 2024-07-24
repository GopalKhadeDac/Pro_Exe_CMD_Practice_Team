package LogicalPrograms;

public class Exercise5_ReverseNumber 
{
     public static void main(String[] args) 
     {
			
		 int orgNum=1234;      //4321
		 int revNum=0;    //4
		 
		 
		//                          1/10=0
		  //                        12/10
		   //                       123/10
		 //    1234        1234>    1234/10=123.4
		 for(int i=orgNum;  i>0;   i=i/10)
		 {
			 int rem = i % 10;  //1234%10 = 4
		     revNum=revNum*10+rem;//0*10+4 = 4
		 }
		 
		  System.out.println(revNum);
		 
		 //logic1:get last digit from org num
		 // int rem=orgNum%10;  // 1234 % 10=4
         // System.out.println(rem);
     
        //logic2:remove last digit from org num
        //  orgNum=orgNum/10;  //1234/10=123.4->123
        //  System.out.println(orgNum);
     
     
     
     //rem=reminder
      //org=orignal
	 //rev=reverse	  
     
     
     
     
     
     
     
     }























}
