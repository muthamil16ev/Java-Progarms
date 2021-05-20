package accessSpecifierPack1;
class A{
	private int data =40;
	private void msg(){
		System.out.println("Hello java");
	}
	//private A(){}
}
public class PrivateAccessSpecifier {
	private int num =20;
	private void msg1(){
		System.out.println("Hello muthu");
	}
	private PrivateAccessSpecifier(){}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj=new A();
		PrivateAccessSpecifier a=new  PrivateAccessSpecifier();
		//System.out.println(obj.data);//compile time error because data is private variable
		System.out.println(a.num);
		//obj.msg();
		a.msg1();
	}

}
