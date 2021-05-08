package arrayPrograms;

public class SecondMinWithoutSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 4,5,6,874,4335,456,765913,57,99,84};
		int min1=Integer.MAX_VALUE;
		int min2=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++){
			if(a[i]<min1){
				min2=min1;
				min1=a[i];
			}
			else if(a[i]<min2){
				min2=a[i];
			}
		}
		System.out.println("Second minimum value "+min2);
	}

}
