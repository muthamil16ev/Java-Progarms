package javaCollectionFramework;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchInCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList cars=new ArrayList();
cars.add("Valvo");
cars.add("BMW");
cars.add("Ford");
cars.add("Mazda");
System.out.println(cars);
ArrayList c=new ArrayList();
for(int i=0;i<cars.size();i++){
	c.add(cars.get(i).toString().toLowerCase());
}
System.out.println(c);
Scanner sc=new Scanner(System.in);
System.out.println("Enter your favourite car ");
String s=sc.nextLine();
s=s.toLowerCase();
	System.out.println(c.contains(s));//Search an element in an Inventory
	System.out.println(c.remove(s));//Remove an element in an Inventory
	c.add(s);//Add an element in an Inventory
	System.out.println(c);
	
	}

}
