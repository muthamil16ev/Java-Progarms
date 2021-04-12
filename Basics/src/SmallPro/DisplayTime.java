package SmallPro;

public class DisplayTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hour = 10;
		for (int j = 30; j <= 59; j++) {
			System.out.println(hour + ":" + j);
		}
		hour += 1;
		for (int j = 0; j <= 30; j++) {
			if (j <= 9) {
				System.out.println(hour + ":0" + j);
			}
			else{
				System.out.println(hour+":"+j);
			}
		}
	}

}
