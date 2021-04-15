package stringArray;

public class WordsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Narayanaswamy resigns as pudhuchery cm after losing majority in assembly";
		String ss[] = s.split(" ");
		for (String i : ss) {
			System.out.println(i);
		}
		int counter = 0;
		for (int i = 0; i < ss.length; i++) {
			if (ss[i].contains("a")) {
				counter = counter + 1;
			}
		}
		System.out.println(counter);
	}
}
