package arrayPrograms;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 4, 2, 1, 9, 5, 3, 7,8 ,6};//
		Arrays.sort(a);
		int search = 6;
		boolean flag=false;
		if (a[a.length / 2] <= search) {
			for (int i = a.length / 2; i < a.length; i++) {
				if (a[i] == search) {
					flag=true;
					System.out.println("The value "+search+" is present index of "+i+" an array");
				}
			}
		} 
		else {
			for (int i = a.length / 2-1; i>=0; i--) {
				if (a[i] == search) {
					flag=true;
					System.out.println("The value "+search+" is present index of "+i+" an array");
				}
		}}
		if(!flag){
				System.out.println("Search value is not present an array");
		}

	}}
