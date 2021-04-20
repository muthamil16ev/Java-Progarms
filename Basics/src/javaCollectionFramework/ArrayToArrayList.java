package javaCollectionFramework;

import java.util.ArrayList;

public class ArrayToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 5, 8, 2, 3, 11, 7, 16 };
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			al.add(a[i]);
		}
		System.out.println(al);
	}

}
