package stringPrograms;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "malala got nobel price for peace, in swiz.";
		char c[]=new char[s.length()];
		char search = 'a', replace = '@';
		for(int i=0;i<c.length;i++){
			c[i]=s.charAt(i);
			if(c[i]==search){
				c[i]=replace;
			}
			System.out.print(c[i]);
		}
		//System.out.println(s.replace('a', '@'));
	}

}
