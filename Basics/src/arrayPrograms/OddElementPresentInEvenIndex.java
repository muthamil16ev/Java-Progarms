package arrayPrograms;

public class OddElementPresentInEvenIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 19, 12, 8, 9, 4, 15, 7,10 };
		for(int i=0;i<a.length;i++){
			if(i%2==0&&a[i]%2==1){
				System.out.println("Odd Element "+a[i]+" In Even Index "+i);
			}
		}
	}

}
