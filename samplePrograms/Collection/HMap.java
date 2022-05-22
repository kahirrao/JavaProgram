package samplePrograms.Collection;

import java.util.HashMap;
import java.util.Map;

public class HMap {
	
	public static void main(String args[]){  
		  Map<Integer,String> map=new HashMap<Integer,String>();  
		  map.put(100,"Amit");  
		  map.put(101,"Vijay");  
		  map.put(102,"Rahul");  
		  map.replace(102, "Monika");
		  map.remove(101, "Vijay");
		  //Elements can traverse in any order  
		  for(Map.Entry m:map.entrySet()){  
		   System.out.println("Entry Before:" + m.getKey()+" "+m.getValue());  
		   
		 
		   
		  }  
		 }  

}
