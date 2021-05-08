package patternPrograms;

public class CrossDiagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				if(i==j)
				       System.out.print(i+" ");
				else
					System.out.print("  ");
				
			}
			System.out.println();
		}
	}

}
