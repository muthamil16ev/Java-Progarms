package smallPrograms;

public class Passwordvalidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a = false, b = false, c = false, d = false;
		String pass = "India@123";
		if (pass.length() >= 8) {
			a = true;
		}
		char ch[] = pass.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'A' && ch[i] <= 'Z') {
				b = true;
			}
			if (!pass.contains(" ")) {
				c = true;
			}
			if (ch[i] >= '0' && ch[i] <= '9') {
				d = true;
			}
		}
		if (a && b && c && d) {
			System.out.println("valid password");
		} else {
			System.out.println("invalid password");
		}
	}

}
