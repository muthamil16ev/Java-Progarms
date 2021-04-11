package stringPrograms;

public class SearchAndReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "payilagam";
		char c[] = new char[s.length()];
		char search = 'a', replace = '@';
		for (int i = 0; i < c.length; i++) {
			c[i]=s.charAt(i);
			if(c[i]==search){
				c[i]=replace;
			}
			System.out.println(c[i]);
		}
	}

}
