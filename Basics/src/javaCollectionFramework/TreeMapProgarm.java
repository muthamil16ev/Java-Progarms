package javaCollectionFramework;

import java.util.TreeMap;

public class TreeMapProgarm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap<Integer,Integer> tm=new TreeMap<Integer,Integer>();
tm.put(1, 297309753);
tm.put(4, 293553453);
tm.put(2, 293253653);
tm.put(6, 297343354);
for(Integer key:tm.keySet()){//using keySet() for iteration over keys
	System.out.println(key);
}
for(Integer value:tm.values()){//using values() for iteration over values
	System.out.println(value);//here values are objects of integer class
}
	}

}
