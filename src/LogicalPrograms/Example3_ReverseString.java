package LogicalPrograms;

public class Example3_ReverseString 
{

    public static void main(String[] args) 
    {
		String org="abcd";// 0 to 3      dcba
	    String rev="";    //      dcba
    
        
	                 //           2>=0
	             //4-1=3          3>=0
	    for(int i=org.length()-1; i>=0; i--)
        {
             //             2
	    	//             3
	    	rev=rev+org.charAt(i);	//""+d=d
        }                              
         System.out.println(rev);
    }
    
}








