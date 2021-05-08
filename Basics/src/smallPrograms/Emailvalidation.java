package smallPrograms;

public class Emailvalidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a = false, b = false, c = false;
		String email = "ar.ramaiah@gmail.com";
		if (email.length() > 8) {
			a = true;
		}
		if (email.contains("@")) {
			b = true;
		}
		if (email.lastIndexOf('.') >= email.length() - 4) {
			c = true;
		}
		if (a && b && c) {
			System.out.println("valid email");
		}
		else{
			System.out.println("invalid email");
		}
	}

}
