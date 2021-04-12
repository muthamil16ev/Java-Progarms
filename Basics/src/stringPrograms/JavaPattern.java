package stringPrograms;

public class JavaPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "java";
		char c[] = new char[s.length()];
		for (int i = 0; i < c.length; i++) {
			c[i] = s.charAt(i);
		}
		for (int i = 0; i <c.length; i++) {
			for (int j = c.length-1; j>= i; j--) {
				System.out.print(c[c.length-1-j]+" ");
			}
			System.out.println();
		}
	}

}
