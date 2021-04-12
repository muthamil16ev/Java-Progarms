package stringPrograms;

public class JavaPatterdiagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "java";
		char c[] = new char[s.length()];
		for (int i = 0; i < c.length; i++) {
			c[i] = s.charAt(i);
		}
		for (int i = 0; i <c.length; i++) {
			for (int j = 0; j<=i; j++) {
				if(i==j){
				System.out.print(c[j]+" ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
