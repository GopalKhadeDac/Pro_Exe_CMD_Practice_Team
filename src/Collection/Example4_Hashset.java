package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class Example4_Hashset 
{
   public static void main(String[] args) 
   {
	  HashSet hs=new HashSet();
	  hs.add("rahul"); 
	  hs.add(100); 
	  hs.add(65.5f); 
	  hs.add('A'); 
	  hs.add(null); 
	  hs.add(100); 
	  hs.add(null);
	  
	  System.out.println(hs);
      System.out.println(hs.size());
      System.out.println(hs.contains(100));
     
      System.out.println("--------print data using foreach loop---");
      for(Object s1:hs)
      {
    	  System.out.println(s1);
      }
      System.out.println("-------print data using iterator cursor-------");
      Iterator itr = hs.iterator();
      while(itr.hasNext())
      {
    	  System.out.println(itr.next());
      }
   
   }







}
