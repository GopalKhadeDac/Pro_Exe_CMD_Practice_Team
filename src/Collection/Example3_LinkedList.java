package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Example3_LinkedList 
{
    public static void main(String[] args) 
    {
		
    	LinkedList  ll=new LinkedList();
    	 
    	  ll.add("rahul");      //0 
    	  ll.add(100);          //1 
    	  ll.add(65.5f);    //2 
    	  ll.add('A');          //3 
    	  ll.add(null);         //4 
    	  ll.add(100);          //5 
    	  ll.add(null);         //6 
    
        System.out.println(ll);
        System.out.println(ll.size());
        System.out.println(ll.get(1));   //100
        System.out.println(ll.contains("ABC"));   //false
        
        ll.set(3, 'B');              //update/modify data
        System.out.println(ll);
       
        //add data in between linkList
        //remove data in between linkList
    
        System.out.println("---print data using for loop----"); 
         for(int i=0; i<=ll.size()-1;i++)
         {
        	 System.out.println(ll.get(i));
         }
        System.out.println("---print data using foreach loop----"); 
         for (   Object s1:ll)
         {
        	 System.out.println(s1);
         }
         System.out.println("---print data using IteRator cursor----");
         Iterator itr=ll.iterator();
         while(itr.hasNext())
         {	 
            System.out.println(itr.next());
         }
        System.out.println("---print data using ListIteRator cursor----");
        ListIterator   litr=ll.listIterator();
         while(litr.hasNext())
         {
        	 System.out.println(litr.next());
         }
    
    }
}
