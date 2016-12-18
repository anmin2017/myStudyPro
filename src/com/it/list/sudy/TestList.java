package com.it.list.sudy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
	   List list = new ArrayList();
       
       list.add(1);
       list.add("zs");
       list.add("ls");
       list.add(true);
       
       
       LinkedList linkedList = new LinkedList();
       linkedList.add("1");
       linkedList.add("2");
       linkedList.add("2");
       
       //linkedList.get(2);
       
       
      
       
       
       
       for(int i = 0; i < linkedList.size(); i++){
    	   System.out.println(linkedList.get(i));
       }
       
       
       Set set = new HashSet();
       set.add(1);
       set.add("zs");
       set.add(true);
       set.add(1);
       
       Iterator iterator = set.iterator();
       while(iterator.hasNext()){
    	   System.out.println(iterator.next());
       }
       
       MySet mySet = new MySet();
       mySet.add(11);
       mySet.add("zss");
       
       MyIterator itr  = mySet.interator();
       while(itr.hasMoreElements()){
    	   System.out.println("--" + itr.nextElement());
       }
       
//       for(int i = 0; i < mySet.size(); i++){
//    	   System.out.println(mySet.get(i));
//       }
       
       
       
//       for(int i =0; i < set.size(); i++){
//    	   System.out.println(set[i]);
//       }
       
//       for(Object temp: set){
//    	   System.out.println("==" + temp);
//       }
       
       
       Set<Integer> s = new HashSet<Integer>();
       s.add( 5 );
       s.add( 8 );
       s.add( 16 );
       
       
       Map map1 = new TreeMap();
       map1.put(10, "zs");
       map1.put(16,"boy");
       
       Set set1 = map1.keySet();
       for(Object tmkey: set1){
    	   System.out.println(map1.get(tmkey));
       }
       
       
      for ( Integer i : s ) System.out.println( i );

	}
	
	

}
