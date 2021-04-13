package stringPrograms;

public class AnagramsProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "silent";
		char c[] = new char[s.length()];
		for (int i = 0; i < c.length; i++) {
			c[i] = s.charAt(i);
		}
		String a = "";
		for (int i = 0; i < c.length; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] > c[j]) {
					char temp = c[i];
					c[i] = c[j];
					c[j] = temp;
				}
			}
			a = a + c[i];
		}
		String s1 = "listen";
		char c1[] = new char[s.length()];
		for (int i = 0; i < c1.length; i++) {
			c1[i] = s1.charAt(i);
		}
		String b = "";
		for (int i = 0; i < c.length; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (c1[i] > c1[j]) {
					char temp = c1[i];
					c1[i] = c1[j];
					c1[j] = temp;
				}
			}
			b = b + c1[i];
		}
		if (a.equals(b)) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not Anagram");
		}

	}

}
