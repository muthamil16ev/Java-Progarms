package stringPrograms;

public class ComputerPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "computer";
		char c[] = new char[s.length()];
		for (int i = 0; i < c.length; i++) {
			c[i] = s.charAt(i);
		}
		for (int i = 0; i <c.length; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(c[j]+" ");
			}
			System.out.println();
		}
	}

}
