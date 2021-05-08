package smallPrograms;

public class PerformanceTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
long startTime=System.currentTimeMillis();
StringBuffer sb=new StringBuffer("java");
for(int i=1;i<100000;i++){
	sb.append("progarmming");
}
long endTime=System.currentTimeMillis();
System.out.println(endTime-startTime+"ms");
long startTime1=System.currentTimeMillis();
StringBuilder sb1=new StringBuilder("java");
for(int i=1;i<100000;i++){
	sb1.append("progarmming");
}
long endTime1=System.currentTimeMillis();
System.out.println(endTime1-startTime1+"ms");
	}

}
