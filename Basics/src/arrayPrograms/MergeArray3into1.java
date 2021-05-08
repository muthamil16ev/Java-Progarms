package arrayPrograms;

public class MergeArray3into1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[] = { 5, 7, 3, 8, 4 };
		int y[] = { 2, 1, 12, 21, 9 };
		int z[] = { 17, 6, 10 };
		int a[] = new int[x.length + y.length + z.length];
		for(int i=0;i<x.length;i++){
			a[i]=x[i];
			System.out.println(a[i]);
		}
		for(int i=0;i<y.length;i++){
			a[x.length+i]=y[i];
			System.out.println(a[x.length+i]);
		}
		for(int i=0;i<z.length;i++){
			a[x.length+y.length+i]=z[i];
			System.out.println(a[x.length+y.length+i]);
		}
	}
}
