package stringPrograms;

public class UpperToLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "MUTHAMILSELVAN";
		char c[] = new char[s.length()];
		for(int i=0;i<c.length;i++){
			c[i]=s.charAt(i);
		}
		for (int i = 0; i < c.length; i++) {
			System.out.print((char)(c[i]+32));
		}
	}
}
