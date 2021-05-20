package doubleForLoop;

public class DoubleForPN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int num = 1; num <= 1000; num++) {
        int counter=0;
        for(int i=0;i<=num;i++){
        	if(num%i==0){
        		counter+=1;
        	}
        }
        if(counter==2){
        	System.out.println("PN "+num);
        }
        else{
        	System.out.println("NPN "+num);
        }
		}
	}

}
