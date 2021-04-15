package stringArray;

public class WordsReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "mala and kamala are friends";
		String ss[] = s.split(" ");
		for (int i = 0; i < ss.length; i++) {
			for (int j = ss[i].length() - 1; j >= 0; j--) {
				System.out.print(ss[i].charAt(j));
			}
			System.out.print(" ");
		}
	}

}
