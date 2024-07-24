package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Example6_TreeSet 
{
    public static void main(String[] args) 
    {
		
	   TreeSet  tr=new TreeSet();
       tr.add(400); 
       tr.add(200);
       tr.add(100); 
       tr.add(700); 
       tr.add(500); 
       tr.add(600);
       tr.add(300);
       tr.add(300);
       //tr.add(null);
       
       System.out.println(tr);
       
       System.out.println(tr.size());
       System.out.println(tr.contains(400));
       tr.remove(400);
       System.out.println(tr);
    
       System.out.println(tr.first());    //100   //get 1st position data
       System.out.println(tr.last());      //700  //get last position data
    
       tr.pollFirst();   //delete 1st position data 
       System.out.println(tr);
    
       tr.pollLast();
       System.out.println(tr);  //delete last position data 
    
       System.out.println("-----print data using for each loop------");
       for( Object s1:tr)
      {
    	  System.out.println(s1);
      }
      System.out.println("-----print data using iterator cursor------");
      Iterator  itr= tr.iterator();
      while(itr.hasNext())
      {
    	  System.out.println(itr.next());
      }
      System.out.println("-----print data using descending iterator cursor-");
    
     Iterator   ditr=tr.descendingIterator();
     while(ditr.hasNext())
     {
    	 System.out.println(ditr.next());
     }
    }






}
