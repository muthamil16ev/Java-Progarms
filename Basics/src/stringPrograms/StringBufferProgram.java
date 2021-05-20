package stringPrograms;

public class StringBufferProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("java");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		//sb.reverse();
		sb.append("check");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		
		String s="python";
		System.out.println(s);
		System.out.println(s.hashCode());
		s=s.concat("check");
		System.out.println(s);
		System.out.println(s.hashCode());
		
	}

}