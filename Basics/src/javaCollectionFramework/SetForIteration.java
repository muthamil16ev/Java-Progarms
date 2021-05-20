package javaCollectionFramework;

import java.util.HashSet;
import java.util.Iterator;

public class SetForIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<String> hs=new HashSet<String>();
hs.add("rr");
hs.add("ksps");
hs.add("srh");
hs.add("csk");
Iterator<String> itr=hs.iterator();
for(;itr.hasNext();){
	System.out.println(itr.next()); 
}
	}

}
