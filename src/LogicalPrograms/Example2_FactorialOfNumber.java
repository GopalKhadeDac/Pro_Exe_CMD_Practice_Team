package LogicalPrograms;

public class Example2_FactorialOfNumber 
{
	public static void main(String[] args) 
	{
		  int num=4;  //4*3*2*1
          int fact=1; //4
                         
           //            2>=1;   2
          //             3>=1;
          //      4      4>=1  3
          for(int i=num; i>=1; i--)
         {
    	    fact=fact*i;  //1*4=4
         }                //4*3=12
                          //12*2=24

        System.out.println(fact);




	}
}
