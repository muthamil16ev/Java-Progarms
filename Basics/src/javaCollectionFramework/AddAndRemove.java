package javaCollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class AddAndRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList cities=new ArrayList();
cities.add("chennai");
cities.add("mumbai");
cities.add("chennai");
cities.add("bangalore");
cities.add("hydrabad");
System.out.println(cities);
cities.remove(2);
System.out.println(cities);
cities.add(2, "Dehli");
System.out.println(cities);
	}

}
