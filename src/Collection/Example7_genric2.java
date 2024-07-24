package Collection;

import java.util.TreeSet;

public class Example7_genric2 
{   
	public static void main(String[] args) 
	{
		
	
     TreeSet<Integer>  tr=new  TreeSet<Integer>();
     tr.add(200);
     tr.add(500);
     tr.add(400);
    // tr.add("abc");

	for(Integer s1:tr)
	{
		System.out.println(s1);
	}
	
	
	
	}

}
