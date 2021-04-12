package stringPrograms;

public class FirstRepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "malala got nobel price for peace, in swiz.";
		char c[] = new char[s.length()];
		for (int i = 0; i < c.length; i++) {
			c[i] = s.charAt(i);
		}
		abc: for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				int count = 0;
				if (c[i] == c[j]) {
					count = count + 1;
					c[j] = ' ';
				}
				if (count == 1 && c[i] != ' ') {
					System.out.println(c[i] + "---->" + count);
					break abc;
				}
			}
		}
	}

}
