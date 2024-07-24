package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import jdk.internal.org.jline.terminal.TerminalBuilder.SystemOutput;

public class Example1B_ArrayList 

{
    public static void main(String[] args)
    {
    	//ArrayList al=new ArrayList();     //initial/default capacity=10 
    	  ArrayList al=new ArrayList(15);     //initial/default capacity=15 
    	  al.add("Rahul");       //0 
    	  al.add(2);             //1 
    	  al.add(65.5f);         //2 
    	  al.add('A');           //3 
    	  al.add(null);          //4 
    	  al.add(2);             //5 
    	  al.add(null);          //6
	
    	  System.out.println("---Print Arraylist data using for loop---- ");
           
           for(int i=0; i<=al.size()-1; i++) 
           { 
            System.out.println(al.get(i));
           }
    
         System.out.println("----Print Arraylist data using foreach loop----");
        		      
           for(Object s1: al) 
           {	     
               System.out.println(s1);
           }
           System.out.println("----Print Arraylist data using IteRator cursor----");   
            Iterator  itr=  al.iterator();
          while(itr.hasNext())
          {  
               System.out.println(itr.next());
          }
          
          
          System.out.println("----Print Arraylist data using ListIteRator Cursor---------");
          
          ListIterator  litr= al.listIterator();
          while(litr.hasNext())
          {  
        	  System.out.println(litr.next());
          }
    
         // For each loop example using ArrayList 
          
            int[] ar= {50,30,20,70,60,70,75};  //size=4 
          
             //print array data using foreach loop 
                 for(Object s1:ar) 
                  { 
                       System.out.println(s1);
                  }

               //print specific index data from    //0 to 3 
                
                 int index=0;
                 for(Object s1:ar)
                	 if(index<4)
                		 {
                		   System.out.println(s1);
                		 }
                            index ++;
    
    
    
    }

}




