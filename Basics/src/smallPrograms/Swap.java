package smallPrograms;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5,b=7;
		int temp=a;
		a=b;
		b=temp;
		System.out.println("After Swap "+a+"  "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swap "+a+"  "+b);
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("After Swap "+a+"  "+b);
	}
}