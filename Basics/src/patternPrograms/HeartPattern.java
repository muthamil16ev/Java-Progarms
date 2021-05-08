package patternPrograms;

public class HeartPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=5;
for(int i=1; i<=n;i++){
	System.out.print("  ");
	for (int j = 1; j <=n*2; j++) {
		
		if(j==1&&i>1||j==10&&i>1||i==2&&j==5||i==1&&j==2||i==1&&j==3||i==1&&j==6||i==1&&j==7){
			System.out.print("* ");}
		else{
			System.out.print(j+" ");
		}
		}
	System.out.println();
}
for(int i=1; i<=n;i++){
	System.out.print("  ");
	for (int j = 1; j <=n*2; j++) {
		if(j==i||i+j==n*2){
			System.out.print("  ");
		}else{
			System.out.print(j+" ");
		}}
	System.out.println();
}
	}

}
