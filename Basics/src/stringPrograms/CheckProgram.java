package stringPrograms;

public class CheckProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "malala got nobel price for peace, in swiz.";
		boolean flag=false;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'z') {
				flag=true;
			}}
		if(flag){
			System.out.println("z is present");
		}
		else{
				System.out.println("z is not present");
			}
		}
	}

