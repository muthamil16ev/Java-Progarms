package stringPrograms;

public class TotalNoOfSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "malala got nobel price for peace, in swiz.";
		int count =0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==' '){
				count=count+1;
			}
		}
		System.out.println("Total number of space "+count);

	}

}
