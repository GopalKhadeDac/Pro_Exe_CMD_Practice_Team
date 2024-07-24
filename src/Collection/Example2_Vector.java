package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Example2_Vector 
{
	public static void main(String[] args) 
	{
		Vector<Comparable> V=new  Vector<Comparable>();     //initial/default capacity=10 
		//Vector V=new Vector(15);    //initial/default capacity=15
		V.add("Rahul");       //0 
	     V.add(2);             //1 
	     V.add(65.5f);         //2 
	     V.add('A');           //3 
	     V.add(null);          //4 
	     V.add(2);             //5 
	     V.add(null);          //6
	
	    System.out.println(V.capacity());
	
	    System.out.println(V);
	    System.out.println(V.get(3));
	    System.out.println(V.size());   //7
	    System.out.println(V.contains("Rahul"));
	    V.set(0, "RAHUL");   //update data
	    System.out.println(V);
	
	     V.add(3,"Mahesh");    //add data in between Vector  --> right shift 
	     System.out.println(V);
	
	     V.remove(3);             //remove data in between Vector -> left shift  
	     System.out.println(V);  
	     
	     System.out.println("----Print Vector data using for loop-----"); 
	
	     for(int i=0; i<=V.size()-1;  i++)
	     {
	    	 System.out.println(V.get(i));
	     }
	
	     System.out.println("----Print Vector data using foreach loop-----"); 
	
	     for(Object s1:V)
	     {
	    	 System.out.println(s1);
	     }
	     
	     System.out.println("----Print Vector data using IteRator cursor-----");
	     Iterator  itr= V.iterator();
	     while(itr.hasNext())
	     {
	    	 System.out.println(itr.next());
	     }
	
	     System.out.println("----Print Vector data using ListIteRator cursor-----");
	     
	     ListIterator litr=    V.listIterator();
	     while(litr.hasNext())
	     {
	    	 System.out.println(litr.next());
	     }
	
	     System.out.println("----Print Vector data using Enumeration cursor-----");  
	     Enumeration enu=V.elements();
	      while(enu.hasMoreElements())
	      {
	    	  System.out.println(enu.nextElement());
	      }
	}
}






