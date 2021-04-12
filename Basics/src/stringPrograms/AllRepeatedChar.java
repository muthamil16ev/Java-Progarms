package stringPrograms;

public class AllRepeatedChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "be intellectually inspiring by ignoring others innocence but not ignorance";
		char c[] = new char[s.length()];
		for (int i = 0; i < c.length; i++) {
			c[i] = s.charAt(i);
		}
		for (int i = 0; i < c.length; i++) {
			int count = 1;
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] == c[j]) {
					count = count + 1;
					c[j] = '0';
				}
			}
			if (count > 1 && c[i] != '0') {
				System.out.println("Repeated character : "+c[i] + "---->" + count);
			}
		}
	}

}
