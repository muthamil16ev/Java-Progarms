package stringArray;

public class SearchAndReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "she sells sea shells on the sea shore. she sells in marina beach";
		String ss[] = s.split(" ");
		String search="she",replace="mala";
		for (int i = 0; i < ss.length; i++) {
			if (ss[i].contains(search)) {
				ss[i]=replace;
			}		
			System.out.println(ss[i]);
		}
	}

}
