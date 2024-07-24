package Collection;

import java.util.ArrayList;
import java.util.HashSet;

public class Example4_HashSet2 
{
   public static void main(String[] args) 
   {
	   ArrayList al=new ArrayList();    
	   al.add("Rahul");        
	   al.add(2);            
	   al.add(65.5f);         
	   al.add('A');            
	   al.add(null);           
	   al.add(2);              
	   al.add(null);  
	   al.add(2);    
	   System.out.println(al); 
       
	   
	   HashSet  hs=new HashSet(al);
        System.out.println(hs);
   
   
   
   
   }







}
