package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Example8_CollectionsClass 
{

  public static void main(String[] args) 
  {
	  ArrayList<String>  al=new ArrayList<String>();
	  al.add("mahesh"); 
	  al.add("ramesh"); 
	  al.add("ganesh"); 
	  al.add("suresh"); 
	   
	  System.out.println(al); 
	   
	//  Collections.sort(al);
	//  System.out.println(al); 
	  
	//  TreeSet<String>  tr=new TreeSet<String>(al);
    //  System.out.println(tr);
  
     Collections.reverse(al); 
     System.out.println(al);  
  }






}
