package arrayPrograms;

public class Merge2RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[] = { 7, 3, 4 };
		int y[] = { 4, 5, 1, 9, 7 };
		int a[]=new int[x.length+y.length];
		for(int i=0;i<x.length;i++){
			a[i]=x[i];
			System.out.print(a[i]+" ");
		}
		for(int i=0;i<y.length;i++){
			a[x.length+i]=y[i];
			System.out.print(a[x.length+i]+" ");
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					a[j] = 0;
				}
			}
		}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
