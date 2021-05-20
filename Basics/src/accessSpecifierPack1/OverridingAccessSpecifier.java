package accessSpecifierPack1;
class B {
	protected void msg(){
		System.out.println("hello");
	}
}
public class OverridingAccessSpecifier extends B{
	// void msg(){
		//System.out.println("hello");
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverridingAccessSpecifier a=new OverridingAccessSpecifier();
		a.msg();
	}

}
