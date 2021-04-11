package stringPrograms;

public class TotalNoOfVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "malala got nobel price for peace, in swiz.";
		s=s.toLowerCase();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				count = count + 1;
			}
		}
		System.out.println("Total number of vowels "+count);
	}

}
