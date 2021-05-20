package javaControlStm;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		boolean flag=false;
		for(int i=2;i<num;i++){
			if(num%i==0){
			flag=true;
			}}
			if(flag){
				System.out.println("not prime number");
			}
			else{
				System.out.println("prime number");
			}
	}
}
