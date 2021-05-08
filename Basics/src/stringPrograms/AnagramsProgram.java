package stringPrograms;

public class AnagramsProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "silent";
		String s2 = "listen";
		char c1[] = new char[s1.length()];
		for (int i = 0; i < c1.length; i++) {
			c1[i] = s1.charAt(i);
		}
		char c2[] = new char[s2.length()];
		for (int i = 0; i < c2.length; i++) {
			c2[i] = s2.charAt(i);
		}
		if (c1.length == c2.length) {
			for (int i = 0; i < c1.length; i++) {
				for (int j = i + 1; j < c1.length; j++) {
					if (c1[i] > c1[j]) {
						char temp = c1[i];
						c1[i] = c1[j];
						c1[j] = temp;
					}
					if (c2[i] > c2[j]) {
						char temp = c2[i];
						c2[i] = c2[j];
						c2[j] = temp;
					}
				}
			}
			String x = String.valueOf(c1);
			String y = String.valueOf(c2);
			if (x.equals(y)) {
				System.out.println("Anagram");
			} else {
				System.out.println("Not an Anagram");
			}

		} else {
			System.out.println("Not an Anagram");
		}

	}

}
