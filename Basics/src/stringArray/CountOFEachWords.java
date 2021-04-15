package stringArray;

public class CountOFEachWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "mala and kamala are friends";
		String ss[] = s.split(" ");
		for (int i = 0; i < ss.length; i++) {
			System.out.print(ss[i]+"----->"+ss[i].length());
			System.out.println();
		}
	}

}
