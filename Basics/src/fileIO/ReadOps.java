package fileIO;

import java.io.FileReader;
import java.io.IOException;

public class ReadOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "";
		try {
			FileReader fr = new FileReader("C://Users//ELCOT//OneDrive//Desktop//html learning//javaIo.txt");
			int i;
			while ((i = fr.read()) != -1) {
				// System.out.print((char)i);
				s = s + (char) i;
			}
			fr.close();
		} catch (IOException e) {
			// System.out.println(e);
			e.printStackTrace();
		}
		System.out.println(s);
	}

}
