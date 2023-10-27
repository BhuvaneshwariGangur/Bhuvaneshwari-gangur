package com.xworkz.array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class RiverName {
	
	    public static void main(String[] args) {
	       
	       
	        
	        Collection<String> collection= new ArrayList(); 
	        collection.add("ganga");
	        collection.add("badra");
	        collection.add("narmada");
	        collection.add("krishna");
	        collection.add("kaveri");
//for each, for each mehod*, iterator,stream.....abstraction in java
            System.out.println("total elements:"+collection.size());

	        //Iterator itr=collection.iterator();....is a interface
	        
	        Iterator<String> itr=collection.iterator();
	        while(itr.hasNext())
        {
	       String ref= itr.next();
	       
	       itr.remove();
	        
	            System.out.println(collection);
	       }
	        
	     Collections.addAll(collection,"godhavari");
	     Iterator<String>itr2=collection.iterator();
	     while(itr2.hasNext()) {
	    	 String value=itr2.next();
	    	 System.out.println(value);
	     }
	      
	     
	     boolean result=collection.contains(itr2);
	     System.out.println("is godhavari pressent in collection:"+result);
        }
	        
	    }







































// boolean exist=While(itr.hasNext())
//{
	//Integer ref=itr.next();....addAll,remove,contains,isempty,clear,removeAll,containsAll.....homework
//}


