package arrayPrograms;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {6,98,56,7,32,45,53,86,17,34,56,23,47};
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print(a[i]+" ");
		}
		System.out.println();
		int search =33;
		int first=0;
		int last=a.length;
		int mid=(first+last)/2;
		while(first<=last){
			if(a[mid]==search){
				System.out.println("sēarch value "+a[mid]+" is present in index of "+mid+" in array");
			break;
			}
			else if(search<a[mid]){
				last=mid-1;
				mid=(first+last)/2;
				}
			else if(search>a[mid]){
					first=mid+1;
				mid=(first+last)/2;
				}
			else{
				System.out.println("search value is not present in array");
			}
		}
	}
}

