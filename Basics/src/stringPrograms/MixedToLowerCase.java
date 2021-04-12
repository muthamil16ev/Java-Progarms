package stringPrograms;

public class MixedToLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "MuThAmIlSeLvan";
		char c[] = new char[s.length()];
		for (int i = 0; i < c.length; i++) {
			c[i] = s.charAt(i);
		}
		for (int i = 0; i < c.length; i++) {
			if (c[i] >= 'A' && c[i] <= 'Z') {
				System.out.print((char) (c[i] + 32));
			}
			else {
				System.out.print(c[i]);
			}
		}
	}

}
