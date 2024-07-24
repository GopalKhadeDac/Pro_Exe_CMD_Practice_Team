package Collection;

import java.util.Arrays;

import java.util.List;

public class Example10_convert_Array_to_Collection 
{
   public static void main(String[] args) 
   
   {
	  String[] ar= {"mahesh", "ganesh","ramesh"};
	  
	  List<String> al =  Arrays.asList(ar);

      System.out.println(al.get(1));   //ganesh
   
   }     







}
