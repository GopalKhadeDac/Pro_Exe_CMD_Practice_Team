package Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class Example9_ListIterator_BidirectionalCursor 
{
   public static void main(String[] args) 
   {
	
         ArrayList<String>  al=new ArrayList<String>();
         al.add("mahesh"); 
         al.add("ramesh"); 
         al.add("ganesh"); 
         al.add("suresh");
         ListIterator<String> litr = al.listIterator(); 
         System.out.println("----forward direction---"); 
         while(litr.hasNext())
         {
        	 System.out.println(litr.next());
         }
         System.out.println("----reverse direction---");
         while(litr.hasPrevious())
         {
        	 System.out.println(litr.previous());
         }
   
   }








}
