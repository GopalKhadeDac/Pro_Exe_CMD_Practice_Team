package Collection;

import java.util.ArrayList;

public class Example7_genric1 
{
  public static void main(String[] args) 
  {
	    ArrayList<String>  al=new ArrayList();
	    al.add("mahesh"); 
	    al.add("ramesh"); 
	    al.add("ganesh"); 
	    al.add("suresh"); 
	   // al.add(100); 
	  //  al.add('A');
  
      System.out.println(al);
  
      for(String s1:al)
      {
    	  System.out.println(s1);
      }
  
  
  
  
  }






}
