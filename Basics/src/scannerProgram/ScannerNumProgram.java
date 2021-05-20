package scannerProgram;

import java.util.Scanner;

public class ScannerNumProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a : ");
		int a = sc.nextInt();
		System.out.println("Enter b : ");
		int b = sc.nextInt();
		int c = a + b;
		sc.nextLine();
		System.out.println("Sum value : " + c);
		System.out.println("Enter a sentence : ");
		String s = sc.nextLine();
		System.out.println(s);
		String s1=sc.next();
		System.out.println(s1);
		char s2=sc.next().charAt(0);
		System.out.println(s2);
		sc.close();
	}

}
