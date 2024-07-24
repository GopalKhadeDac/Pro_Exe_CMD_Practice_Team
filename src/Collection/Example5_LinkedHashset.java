package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Example5_LinkedHashset 

{
	public static void main(String[] args) 
	
	{
		LinkedHashSet  lhs=new LinkedHashSet();
		lhs.add("rahul");
		lhs.add(100);
		lhs.add(65.5f);
		lhs.add('A');
		lhs.add(null);
		lhs.add(100);
		lhs.add(null);
		
		System.out.println(lhs);
		System.out.println(lhs.size());     
		System.out.println(lhs.contains(100));   //true 
	    lhs.remove(100);
	    System.out.println(lhs);
	
	    System.out.println("-------print data using foreach loop----------"); 
	    for(  Object s1:lhs)
	    {
	    	System.out.println(s1);
	    }
	    System.out.println("-------print data using iterator cursor----------");
	    Iterator  itr =  lhs.iterator();
	    while(itr.hasNext())
	    {
	    	System.out.println(itr.next());
	    }
	    
	    System.out.println(lhs.isEmpty());//false
	    lhs.clear();
	    System.out.println(lhs.isEmpty());   //true
	    
	    System.out.println("---size---"+lhs.size());
	     
	     
	}


}
