
package Collection;

import java.util.ArrayList;

public class Example1_ArrayList 
{
public static void main(String[] args) 
{
	  ArrayList al=new ArrayList();    //initial/default capacity=10
	
      al.add("Rahul");   //0
      al.add(2);         //1
      al.add(65.5f);     //2
      al.add('A');       //3
      al.add(null);      //4
      al.add(2);         //5
      al.add(null);      //6

      System.out.println(al);
      System.out.println(al.get(3));
      System.out.println(al.size());    //7
      System.out.println(al.contains("Rahul"));
      al.set(0, "RAHUL");      // update data
      System.out.println(al);
    
      al.add(3,"Mahesh");      //add data in between arraylist--> right 
      System.out.println(al);
  
      al.remove(3);            //remove data in between arraylist -> left
    
       System.out.println(al);
}
}