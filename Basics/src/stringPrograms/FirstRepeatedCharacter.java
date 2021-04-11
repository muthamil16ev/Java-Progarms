package stringPrograms;

public class FirstRepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "malala got nobel price for peace, in swiz.";
		char c[] = new char[s.length()];
		int k=0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
					if (s.charAt(i) == s.charAt(j)) {
						c[k] = s.charAt(i);
						k++;
					}
				}
			}
		}
		System.out.println(c[0]);
	}

}
