package Collection;

import java.util.ArrayList;

public class Example10_convert_Collection_to_Array 
{
    public static void main(String[] args) 
    {
		
    	ArrayList<String> al=new ArrayList<String>(); 
    	  al.add("mahesh"); 
    	  al.add("ramesh"); 
    	  al.add("ganesh"); 
    	  al.add("suresh");
         
    	  Object[]  ar=al.toArray();
         
    	  System.out.println(ar[3]);
    }









}
