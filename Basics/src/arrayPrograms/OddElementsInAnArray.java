package arrayPrograms;

public class OddElementsInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 5, 2, 4, 7, 6 ,14,21};
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2==1){
				System.out.println(a[i]);
			}
		}
	}

}
