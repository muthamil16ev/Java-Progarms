package arrayPrograms;

public class EventElementsPresentInOddIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 19, 12, 8, 9, 4, 15, 7,10 };
		for(int i=0;i<a.length;i++){
			if(i%2==1&&a[i]%2==0){
				System.out.println("Even Element "+a[i]+" In Odd Index "+i);
			}
		}
	}

}
